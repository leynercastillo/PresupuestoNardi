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

import database.Budget;

@Repository
public class DaoBudget /*extends GenericDao<Budget>*/ {

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
    public Boolean save(Budget budget) {
	Session session = getCurrentSession();
	try {
	    session.beginTransaction();
	    session.save(budget);
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
    public Boolean update(Budget budget) {
	Session session = getCurrentSession();
	try {
	    session.beginTransaction();
	    session.merge(budget);
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
    public Boolean delete(Budget budget) {
	Session session = getCurrentSession();
	try {
	    session.beginTransaction();
	    session.delete(budget);
	    session.getTransaction().commit();
	    return true;
	} catch (HibernateException e) {
	    session.getTransaction().rollback();
	    e.printStackTrace();
	    return false;
	}
    }
    /*
    @Autowired
    public DaoBudget(SessionFactory sessionFactory) {
	super(sessionFactory);
    }*/

    @Transactional(readOnly = true)
    public Budget findByNumber(int number) {
	Session session = getCurrentSession();
	session.beginTransaction();
	Criteria criteria = session.createCriteria(Budget.class);
	criteria.add(Restrictions.eq("number", number));
	Object obj = criteria.uniqueResult();
	return obj == null ? null : (Budget) obj;
    }

    @Transactional(readOnly = true)
    public List<Budget> listOrderBudgetbyField(String field) {
	Session session = getCurrentSession();
	session.beginTransaction();
	Criteria criteria = session.createCriteria(Budget.class);
	criteria.addOrder(Order.asc(field).ignoreCase());
	criteria.addOrder(Order.desc("date"));
	List<Budget> list = criteria.list();
	return list;
    }

    @Transactional(readOnly = true)
    public List<Budget> listByString(String field, String value) {
	Session session = getCurrentSession();
	session.beginTransaction();
	Criteria criteria = session.createCriteria(Budget.class);
	criteria.add(Restrictions.eq(field, value).ignoreCase());
	criteria.addOrder(Order.desc("idBudget"));
	List<Budget> list = criteria.list();
	return list;
    }

    @Transactional(readOnly = true)
    public Budget findByInteger(String field, Integer value) {
	Session session = getCurrentSession();
	session.beginTransaction();
	Criteria criteria = session.createCriteria(Budget.class);
	criteria.add(Restrictions.eq(field, value));
	Object obj = criteria.uniqueResult();
	return obj == null ? null : (Budget) obj;
    }

    @Transactional(readOnly = true)
    public List<Budget> listAll() {
	Session session = getCurrentSession();
	session.beginTransaction();
	Criteria criteria = session.createCriteria(Budget.class);
	criteria.addOrder(Order.asc("number"));
	List<Budget> list = criteria.list();
	return list;
    }

    @Transactional(readOnly = true)
    public List<Integer> listByIntFields(String field) {
	Session session = getCurrentSession();
	session.beginTransaction();
	Criteria criteria = session.createCriteria(Budget.class);
	criteria.setProjection(Projections.distinct(Projections.property(field)));
	criteria.addOrder(Order.asc(field));
	List<Integer> list = criteria.list();
	return list;
    }

    @Transactional(readOnly = true)
    public List<String> listStringByFields(String field) {
	Session session = getCurrentSession();
	session.beginTransaction();
	Criteria criteria = session.createCriteria(Budget.class);
	criteria.setProjection(Projections.distinct(Projections.property(field)));
	criteria.addOrder(Order.asc(field));
	List<String> list = criteria.list();
	return list;
    }
}