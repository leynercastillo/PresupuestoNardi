package dao;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import database.SecurityGroup;

@Repository
public class DaoSecurityGroup /* extends GenericDao<SecurityGroup> */{

    /*
     * @Autowired public DaoSecurityGroup(SessionFactory sessionFactory) { super(sessionFactory); }
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
    public Boolean save(SecurityGroup securityGroup) {
	Session session = getCurrentSession();
	try {
	    session.save(securityGroup);
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
    public Boolean update(SecurityGroup securityGroup) {
	Session session = getCurrentSession();
	try {
	    session.merge(securityGroup);
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
    public Boolean delete(SecurityGroup securityGroup) {
	Session session = getCurrentSession();
	try {
	    session.delete(securityGroup);
	    return true;
	} catch (HibernateException e) {
	    e.printStackTrace();
	    return false;
	}
    }

    @Transactional(readOnly = true)
    public SecurityGroup listByField(String field, Object value) {
	Session session = getCurrentSession();
	Criteria criteria = session.createCriteria(SecurityGroup.class);
	criteria.add(Restrictions.eq(field, value));
	Object obj = criteria.uniqueResult();
	return obj == null ? null : (SecurityGroup) obj;
    }
}
