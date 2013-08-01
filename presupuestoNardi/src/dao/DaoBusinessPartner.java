package dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import database.BusinessPartner;

@Repository
public class DaoBusinessPartner /*extends GenericDao<BusinessPartner>*/ {

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
    public Boolean save(BusinessPartner businessPartner) {
	Session session = getCurrentSession();
	try {
	    session.beginTransaction();
	    session.save(businessPartner);
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
    public Boolean update(BusinessPartner businessPartner) {
	Session session = getCurrentSession();
	try {
	    session.beginTransaction();
	    session.merge(businessPartner);
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
    public Boolean delete(BusinessPartner businessPartner) {
	Session session = getCurrentSession();
	try {
	    session.beginTransaction();
	    session.delete(businessPartner);
	    session.getTransaction().commit();
	    return true;
	} catch (HibernateException e) {
	    session.getTransaction().rollback();
	    e.printStackTrace();
	    return false;
	}
    }

    /*
     * @Autowired public DaoBusinessPartner(SessionFactory sessionFactory) { super(sessionFactory); }
     */

    @Transactional(readOnly = true)
    public List<BusinessPartner> listActiveOrderByField(String field) {
	getCurrentSession().beginTransaction();
	Criteria criteria = getCurrentSession().createCriteria(BusinessPartner.class);
	criteria.add(Restrictions.eq("status", 'A'));
	criteria.addOrder(Order.asc(field));
	List<BusinessPartner> list = criteria.list();
	return list;
    }

    @Transactional(readOnly = true)
    public BusinessPartner findByRif(String rif) {
	getCurrentSession().beginTransaction();
	Criteria criteria = getCurrentSession().createCriteria(BusinessPartner.class);
	criteria.add(Restrictions.eq("rif", rif));
	Object object = criteria.uniqueResult();
	return object != null ? (BusinessPartner) object : null;
    }

    @Transactional(readOnly = true)
    public BusinessPartner findActiveByRif(String rif) {
	getCurrentSession().beginTransaction();
	Criteria criteria = getCurrentSession().createCriteria(BusinessPartner.class);
	criteria.add(Restrictions.eq("rif", rif));
	criteria.add(Restrictions.eq("status", 'A'));
	Object object = criteria.uniqueResult();
	return object != null ? (BusinessPartner) object : null;
    }

    @Transactional(readOnly = true)
    public List<String> listStringByFields(String field) {
	getCurrentSession().beginTransaction();
	Criteria criteria = getCurrentSession().createCriteria(BusinessPartner.class);
	criteria.setProjection(Projections.distinct(Projections.property(field)));
	criteria.addOrder(Order.asc(field));
	List<String> list = criteria.list();
	return list;
    }
}