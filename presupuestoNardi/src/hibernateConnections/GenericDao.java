package hibernateConnections;

import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.logging.Logger;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.zkoss.util.logging.Log;

public class GenericDao<Model> {
	
	public Class<Model> domainClass = getDomainClass();	

	protected Session currentSession(){
		return StoreHibernateUtil.openSession();
	}
	
	protected Class<Model> getDomainClass(){
		if(domainClass == null){
			ParameterizedType type = (ParameterizedType) getClass().getGenericSuperclass();
			domainClass = (Class<Model>) type.getActualTypeArguments()[0];
		}
		return domainClass;
	}
	
	@SuppressWarnings("unchecked")
	public Model load(Long id){
		Transaction transaction = currentSession().beginTransaction();
		Model returnvalue = (Model) currentSession().load(domainClass, id);
		transaction.commit();
		currentSession().close();
		return returnvalue;
	}

	public void save(Model model){
		Transaction transaction = null;
		try {
			transaction = currentSession().beginTransaction();
			currentSession().save(model);
			transaction.commit();
		} catch (HibernateException e) {
			try {
				transaction.rollback();
			} catch (RuntimeException e2) {
				System.out.println("No se pudo guardar ni realizar el rollback: "+e2);
			}
		}
	}
	
	public void update(Model model){
		Transaction transaction = null;
		try {
			transaction = currentSession().beginTransaction();
			currentSession().update(model);
			transaction.commit();
		} catch (HibernateException e) {
			try {
				transaction.rollback();
			} catch (RuntimeException e2) {
				System.out.println("No se pudo guardar ni realizar el rollback: "+e2);
			}
		}
	}
	
	public void delete(Model model){
		Transaction transaction = null;
		try {
			transaction = currentSession().beginTransaction();
			currentSession().delete(model);
			transaction.commit();
		} catch (HibernateException e) {
			try {
				transaction.rollback();
			} catch (RuntimeException e2) {
				System.out.println("No se pudo guardar ni realizar el rollback: "+e2);
			}
		}
	}
	
	public Model findById(Long id){
		Transaction transaction = currentSession().beginTransaction();
		Model model = (Model) currentSession().load(domainClass, id);
		transaction.commit();		
		currentSession().close();
		return model;
	}
	
	public List<Model> list(Class c){
		Transaction transaction = currentSession().beginTransaction();
		Criteria criteria = currentSession().createCriteria(c);
		return criteria.list();
	}
	
	public List<Model> listActive(Class c){
		Transaction transaction = currentSession().beginTransaction();
		Criteria criteria = currentSession().createCriteria(c);
		criteria.add(Restrictions.eq("status", 'A'));
		return criteria.list();
	}
}