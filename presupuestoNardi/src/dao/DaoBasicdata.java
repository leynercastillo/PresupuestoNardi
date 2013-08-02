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

import database.BasicData;

@Repository
public class DaoBasicdata /* extends GenericDao<BasicData> */{

    /*
     * public DaoBasicdata(SessionFactory sessionFactory) { super(sessionFactory); }
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
    public Boolean save(BasicData basicData) {
	Session session = getCurrentSession();
	try {
	    session.save(basicData);
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
    public Boolean update(BasicData basicData) {
	Session session = getCurrentSession();
	try {
	    session.merge(basicData);
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
    public Boolean delete(BasicData basicData) {
	Session session = getCurrentSession();
	try {
	    session.delete(basicData);
	    return true;
	} catch (HibernateException e) {
	    e.printStackTrace();
	    return false;
	}
    }

    @Transactional(readOnly = true)
    public List<BasicData> listByField(String table, String field) {
	Session session = getCurrentSession();
	Criteria criteria = session.createCriteria(BasicData.class);
	criteria.add(Restrictions.eq("status", 'A'));
	criteria.add(Restrictions.eq("editable", false));
	criteria.add(Restrictions.eq("field", field).ignoreCase());
	criteria.add(Restrictions.eq("dataBaseName", table));
	criteria.addOrder(Order.asc("priority"));
	List<BasicData> list = criteria.list();
	return list;
    }

    @Transactional(readOnly = true)
    public BasicData findByName(String table, String field, String name) {
	Session session = getCurrentSession();
	Criteria criteria = session.createCriteria(BasicData.class);
	criteria.add(Restrictions.eq("status", 'A'));
	criteria.add(Restrictions.eq("editable", false));
	criteria.add(Restrictions.eq("field", field).ignoreCase());
	criteria.add(Restrictions.eq("name", name).ignoreCase());
	criteria.add(Restrictions.eq("dataBaseName", table));
	criteria.addOrder(Order.asc("priority"));
	Object obj = criteria.uniqueResult();
	return obj == null ? null : (BasicData) obj;
    }

    @Transactional(readOnly = true)
    public List<BasicData> listByParent(BasicData parent) {
	Session session = getCurrentSession();
	Criteria criteria = session.createCriteria(BasicData.class);
	criteria.add(Restrictions.eq("basicData", parent));
	criteria.addOrder(Order.asc("priority"));
	List<BasicData> list = criteria.list();
	return list;
    }

    @Transactional(readOnly = true)
    public List<String> listStringByFields(String field) {
	Session session = getCurrentSession();
	Criteria criteria = session.createCriteria(BasicData.class);
	criteria.setProjection(Projections.distinct(Projections.property("name")));
	criteria.add(Restrictions.eq("dataBaseName", field));
	criteria.addOrder(Order.asc("name"));
	List<String> list = criteria.list();
	return list;
    }

    @Transactional(readOnly = true)
    public List<BasicData> listByString(String field, String value) {
	Session session = getCurrentSession();
	Criteria criteria = session.createCriteria(BasicData.class);
	criteria.add(Restrictions.eq(field, value).ignoreCase());
	List<BasicData> list = criteria.list();
	return list;
    }
}