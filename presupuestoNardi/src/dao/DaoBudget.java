package dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import database.Basicdata;
import database.Budget;
import hibernateConnections.GenericDao;

public class DaoBudget extends GenericDao<Budget> {

	public List<Budget> listOrderBudgetbyField(String field) {
		Transaction transaction = currentSession().beginTransaction();
		Criteria criteria = currentSession().createCriteria(Budget.class);
		criteria.addOrder(Order.asc(field));
		return criteria.list();
	}
	
	public List<Budget> findByString(String field, String value) {
		Transaction transaction = currentSession().beginTransaction();
		Criteria criteria = currentSession().createCriteria(Budget.class);
		criteria.add(Restrictions.eq(field, value));
		return criteria.list();
	}

	public List<Budget> findByInteger(String field, Integer value) {
		Transaction transaction = currentSession().beginTransaction();
		Criteria criteria = currentSession().createCriteria(Budget.class);
		criteria.add(Restrictions.eq(field, value));
		return criteria.list();
	}
}
