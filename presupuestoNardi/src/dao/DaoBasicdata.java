package dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import dao.generic.GenericDao;
import database.BasicData;

@Repository
public class DaoBasicdata extends GenericDao<BasicData> {

    @Autowired
    public DaoBasicdata(SessionFactory sessionFactory) {
	super(sessionFactory);
    }
    
    public List<BasicData> listByField(String table, String field) {
	currentSession().beginTransaction();
	Criteria criteria = currentSession().createCriteria(BasicData.class);
	criteria.add(Restrictions.eq("status", 'A'));
	criteria.add(Restrictions.eq("editable", false));
	criteria.add(Restrictions.eq("field", field).ignoreCase());
	criteria.add(Restrictions.eq("dataBaseName", table));
	criteria.addOrder(Order.asc("priority"));
	List<BasicData> list = criteria.list();
	return list;
    }

    public BasicData findByName(String table, String field, String name) {
	currentSession().beginTransaction();
	Criteria criteria = currentSession().createCriteria(BasicData.class);
	criteria.add(Restrictions.eq("status", 'A'));
	criteria.add(Restrictions.eq("editable", false));
	criteria.add(Restrictions.eq("field", field).ignoreCase());
	criteria.add(Restrictions.eq("name", name).ignoreCase());
	criteria.add(Restrictions.eq("dataBaseName", table));
	criteria.addOrder(Order.asc("priority"));
	Object obj = criteria.uniqueResult();
	return obj == null ? null : (BasicData) obj;
    }

    public List<BasicData> listByParent(BasicData parent) {
	currentSession().beginTransaction();
	Criteria criteria = currentSession().createCriteria(BasicData.class);
	criteria.add(Restrictions.eq("basicData", parent));
	criteria.addOrder(Order.asc("priority"));
	List<BasicData> list = criteria.list();
	return list;
    }
}