package dao.generic;

import java.lang.reflect.ParameterizedType;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

public class GenericDao<Model> {

    @Autowired
    private SessionFactory sessionFactory;
    public Class<Model> domainClass = getDomainClass();

    public GenericDao(SessionFactory sessionFactory) {
	this.sessionFactory = sessionFactory;
    }

    protected Session getCurrentSession() {
	return sessionFactory.getCurrentSession();
    }

    protected Class<Model> getDomainClass() {
	if (domainClass == null) {
	    ParameterizedType type = (ParameterizedType) getClass().getGenericSuperclass();
	    domainClass = (Class<Model>) type.getActualTypeArguments()[0];
	}
	return domainClass;
    }

    /**
     * @param model
     *            Object to save in database
     * @return true if saved / false if not saved
     */
    @Transactional
    public Boolean save(Model model) {
	Session session = getCurrentSession();
	try {
	    session.beginTransaction();
	    session.save(model);
	    session.getTransaction().commit();
	    return true;
	} catch (HibernateException e) {
	    session.getTransaction().rollback();
	    e.printStackTrace();
	    return false;
	}
    }

    /**
     * @param model
     *            Object to update in database
     * @return true if updated / false if not updated
     */
    @Transactional
    public Boolean update(Model model) {
	Session session = getCurrentSession();
	try {
	    session.beginTransaction();
	    session.merge(model);
	    session.getTransaction().commit();
	    return true;
	} catch (HibernateException e) {
	    session.getTransaction().rollback();
	    e.printStackTrace();
	    return false;
	}
    }

    /**
     * @param model
     *            Object to delete in database
     * @return true if deleted / false if not deleted
     */
    @Transactional
    public Boolean delete(Model model) {
	Session session = getCurrentSession();
	try {
	    session.beginTransaction();
	    session.delete(model);
	    session.getTransaction().commit();
	    return true;
	} catch (HibernateException e) {
	    session.getTransaction().rollback();
	    e.printStackTrace();
	    return false;
	}
    }
}