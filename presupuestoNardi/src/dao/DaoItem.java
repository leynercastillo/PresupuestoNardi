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
	    session.save(item);
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
    public Boolean update(Item item) {
	Session session = getCurrentSession();
	try {
	    session.merge(item);
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
    public Boolean delete(Item item) {
	Session session = getCurrentSession();
	try {
	    session.delete(item);
	    return true;
	} catch (HibernateException e) {
	    e.printStackTrace();
	    return false;
	}
    }

    @Transactional(readOnly = true)
    public Item findById(Item item) {
	Session session = getCurrentSession();
	Criteria criteria = session.createCriteria(Item.class);
	criteria.add(Restrictions.eq("idItem", item.getIdItem()));
	Object bp = criteria.uniqueResult();
	return bp != null ? (Item) bp : null;
    }

    @Transactional(readOnly = true)
    public Item findByCode(String code) {
	Session session = getCurrentSession();
	Criteria criteria = session.createCriteria(Item.class);
	criteria.add(Restrictions.eq("code", code));
	Object bp = criteria.uniqueResult();
	return bp != null ? (Item) bp : null;
    }

    @Transactional(readOnly = true)
    public List<Item> listByString(String field, String value) {
	Session session = getCurrentSession();
	Criteria criteria = session.createCriteria(Item.class);
	criteria.add(Restrictions.eq(field, value));
	return criteria.list();
    }

    @Transactional(readOnly = true)
    public List<String> listStringByFields(String field) {
	Session session = getCurrentSession();
	Criteria criteria = session.createCriteria(Item.class);
	criteria.setProjection(Projections.distinct(Projections.property(field)));
	criteria.addOrder(Order.asc(field));
	List<String> list = criteria.list();
	return list;
    }
}