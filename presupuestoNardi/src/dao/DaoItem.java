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

import dao.generic.GenericDao;
import database.Item;

@Repository
public class DaoItem /* extends GenericDao<Item> */{

    /*
     * @Autowired public DaoItem(SessionFactory sessionFactory) { super(sessionFactory); }
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
    public Boolean save(Item item) {
	Session session = getCurrentSession();
	try {
	    session.beginTransaction();
	    session.save(item);
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
    public Boolean update(Item item) {
	Session session = getCurrentSession();
	try {
	    session.beginTransaction();
	    session.merge(item);
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
    public Boolean delete(Item item) {
	Session session = getCurrentSession();
	try {
	    session.beginTransaction();
	    session.delete(item);
	    session.getTransaction().commit();
	    return true;
	} catch (HibernateException e) {
	    session.getTransaction().rollback();
	    e.printStackTrace();
	    return false;
	}
    }

    @Transactional(readOnly = true)
    public Item findByCode(String code) {
	getCurrentSession().beginTransaction();
	Criteria criteria = getCurrentSession().createCriteria(Item.class);
	criteria.add(Restrictions.eq("code", code));
	Object bp = criteria.uniqueResult();
	return bp != null ? (Item) bp : null;
    }

    @Transactional(readOnly = true)
    public List<Item> listByString(String field, String value) {
	getCurrentSession().beginTransaction();
	Criteria criteria = getCurrentSession().createCriteria(Item.class);
	criteria.add(Restrictions.eq(field, value));
	return criteria.list();
    }

    @Transactional(readOnly = true)
    public List<String> listStringByFields(String field) {
	getCurrentSession().beginTransaction();
	Criteria criteria = getCurrentSession().createCriteria(Item.class);
	criteria.setProjection(Projections.distinct(Projections.property(field)));
	criteria.addOrder(Order.asc(field));
	List<String> list = criteria.list();
	return list;
    }
}