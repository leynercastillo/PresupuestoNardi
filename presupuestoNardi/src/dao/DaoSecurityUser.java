package dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import database.SecurityUser;

@Repository
public class DaoSecurityUser /* extends GenericDao<SecurityUser> */{

    /*
     * @Autowired public DaoSecurityUser(SessionFactory sessionFactory) { super(sessionFactory); }
     */
    @Autowired
    private SessionFactory sessionFactory;

    protected final Session getCurrentSession() {
	return sessionFactory.getCurrentSession();
    }

    /**
     * @param model
     *            Object to save in database
     * @return true if saved / false if not saved
     */
    @Transactional
    public Boolean save(SecurityUser securityUser) {
	Session session = getCurrentSession();
	try {
	    session.save(securityUser);
	    return true;
	} catch (HibernateException e) {
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
    public Boolean update(SecurityUser securityUser) {
	Session session = getCurrentSession();
	try {
	    session.merge(securityUser);
	    return true;
	} catch (HibernateException e) {
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
    public Boolean delete(SecurityUser securityUser) {
	Session session = getCurrentSession();
	try {
	    session.delete(securityUser);
	    return true;
	} catch (HibernateException e) {
	    e.printStackTrace();
	    return false;
	}
    }

    @Transactional(readOnly = true)
    public SecurityUser findByString(String field, String value) {
	Session session = getCurrentSession();
	Criteria criteria = session.createCriteria(SecurityUser.class);
	criteria.add(Restrictions.eq(field, value).ignoreCase());
	Object su = criteria.uniqueResult();
	return su != null ? (SecurityUser) su : null;
    }

    @Transactional(readOnly = true)
    public List<SecurityUser> listAll() {
	Session session = getCurrentSession();
	Criteria criteria = session.createCriteria(SecurityUser.class);
	List<SecurityUser> list = criteria.list();
	return list;
    }
}