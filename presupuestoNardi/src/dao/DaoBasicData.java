package dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import database.Basicdata;
import hibernateConnections.GenericDao;

public class DaoBasicData extends GenericDao<Basicdata> {

	public List<Basicdata> findByDescription(String table, String field) {
		Transaction transaction = currentSession().beginTransaction();
		Criteria criteria = currentSession().createCriteria(Basicdata.class);
		criteria.add(Restrictions.eq("status", 'A'));
		criteria.add(Restrictions.eq("editable", false));
		criteria.add(Restrictions.eq("description", field));
		criteria.add(Restrictions.eq("database", table));
		criteria.addOrder(Order.asc("priority"));
		return criteria.list();
	}
}
