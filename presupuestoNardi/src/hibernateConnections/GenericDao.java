package hibernateConnections;

import java.lang.reflect.ParameterizedType;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class GenericDao<Model> {

	public Class<Model> domainClass = getDomainClass();

	protected Session currentSession() {
		return StoreHibernateUtil.openSession();
	}

	protected Class<Model> getDomainClass() {
		if (domainClass == null) {
			ParameterizedType type = (ParameterizedType) getClass()
					.getGenericSuperclass();
			domainClass = (Class<Model>) type.getActualTypeArguments()[0];
		}
		return domainClass;
	}

	@SuppressWarnings("unchecked")
	public Model load(Long id) {
		currentSession().beginTransaction();
		Model returnvalue = (Model) currentSession().load(domainClass, id);
		currentSession().getTransaction().commit();
		return returnvalue;
	}

	public Boolean save(Model model) {
		try {
			currentSession().beginTransaction();
			currentSession().saveOrUpdate(model);
			currentSession().getTransaction().commit();
			return true;
		} catch (HibernateException e) {
			currentSession().getTransaction().rollback();
			e.printStackTrace();
			return false;
		}
	}

	public Boolean delete(Model model) {
		Transaction transaction = null;
		try {
			transaction = currentSession().beginTransaction();
			currentSession().delete(model);
			transaction.commit();
			return true;
		} catch (HibernateException e) {
			if (transaction != null)
				transaction.rollback();
			e.printStackTrace();
			return false;
		}
	}
}