package dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import database.BasicData;
import hibernateConnections.GenericDao;

public class DaoBasicdata extends GenericDao<BasicData> {

	public List<BasicData> listByField(String table, String field) {
		Transaction transaction = currentSession().beginTransaction();
		Criteria criteria = currentSession().createCriteria(BasicData.class);
		criteria.add(Restrictions.eq("status", 'A'));
		criteria.add(Restrictions.eq("editable", false));
		criteria.add(Restrictions.eq("field", field).ignoreCase());
		criteria.add(Restrictions.eq("dataBaseName", table));
		criteria.addOrder(Order.asc("priority"));
		return criteria.list();
	}

	public BasicData findByName(String table, String field, String name) {
		Transaction transaction = currentSession().beginTransaction();
		Criteria criteria = currentSession().createCriteria(BasicData.class);
		criteria.add(Restrictions.eq("status", 'A'));
		criteria.add(Restrictions.eq("editable", false));
		criteria.add(Restrictions.eq("field", field).ignoreCase());
		criteria.add(Restrictions.eq("name", name).ignoreCase());
		criteria.add(Restrictions.eq("dataBaseName", table));
		criteria.addOrder(Order.asc("priority"));
		return (BasicData)criteria.uniqueResult();
	}

	public List<BasicData> listByParent(BasicData parent){
		Transaction transaction = currentSession().beginTransaction();
		Criteria criteria = currentSession().createCriteria(BasicData.class);
		criteria.add(Restrictions.eq("basicdata", parent));
		criteria.addOrder(Order.asc("priority"));
		return criteria.list();
	}
}