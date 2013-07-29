package dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import dao.generic.GenericDao;
import database.BasicData;

@Repository
public class DaoBasicdata extends GenericDao<BasicData> {

    @Autowired
    public DaoBasicdata(SessionFactory sessionFactory) {
	super(sessionFactory);
    }

    @Transactional(readOnly = true)
    public List<BasicData> listByField(String table, String field) {
	getCurrentSession().beginTransaction();
	Criteria criteria = getCurrentSession().createCriteria(BasicData.class);
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
	getCurrentSession().beginTransaction();
	Criteria criteria = getCurrentSession().createCriteria(BasicData.class);
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
	getCurrentSession().beginTransaction();
	Criteria criteria = getCurrentSession().createCriteria(BasicData.class);
	criteria.add(Restrictions.eq("basicData", parent));
	criteria.addOrder(Order.asc("priority"));
	List<BasicData> list = criteria.list();
	return list;
    }

    @Transactional(readOnly = true)
    public List<String> listStringByFields(String field) {
	getCurrentSession().beginTransaction();
	Criteria criteria = getCurrentSession().createCriteria(BasicData.class);
	criteria.setProjection(Projections.distinct(Projections.property("name")));
	criteria.add(Restrictions.eq("dataBaseName", field));
	criteria.addOrder(Order.asc("name"));
	List<String> list = criteria.list();
	return list;
    }

    @Transactional(readOnly = true)
    public List<BasicData> listByString(String field, String value) {
	getCurrentSession().beginTransaction();
	Criteria criteria = getCurrentSession().createCriteria(BasicData.class);
	criteria.add(Restrictions.eq(field, value).ignoreCase());
	List<BasicData> list = criteria.list();
	return list;
    }
}