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

import database.SecurityRole;

@Repository
public class DaoSecurityRole /* extends GenericDao<SecurityRole> */{

    /*
     * @Autowired public DaoSecurityRole(SessionFactory sessionFactory) { super(sessionFactory); }
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
    public Boolean save(SecurityRole securityRole) {
	Session session = getCurrentSession();
	try {
	    session.save(securityRole);
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
    public Boolean update(SecurityRole securityRole) {
	Session session = getCurrentSession();
	try {
	    session.merge(securityRole);
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
    public Boolean delete(SecurityRole securityRole) {
	Session session = getCurrentSession();
	try {
	    session.delete(securityRole);
	    return true;
	} catch (HibernateException e) {
	    e.printStackTrace();
	    return false;
	}
    }

    @Transactional(readOnly = true)
    public List<SecurityRole> listRoles() {
	Session session = getCurrentSession();
	Criteria criteria = session.createCriteria(SecurityRole.class);
	List<SecurityRole> list = criteria.list();
	return list;
    }

    @Transactional(readOnly = true)
    public SecurityRole findRoleById(Integer id) {
	Session session = getCurrentSession();
	Criteria criteria = session.createCriteria(SecurityRole.class);
	criteria.add(Restrictions.eq("idSecurityRole", id));
	Object bp = criteria.uniqueResult();
	return bp != null ? (SecurityRole) bp : null;
    }
}
