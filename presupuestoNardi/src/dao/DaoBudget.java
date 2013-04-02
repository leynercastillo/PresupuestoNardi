package dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import database.Budget;
import hibernateConnections.GenericDao;

public class DaoBudget extends GenericDao<Budget> {

	public Budget findByNumber(int number) {
		currentSession().beginTransaction();
		Criteria criteria = currentSession().createCriteria(Budget.class);
		criteria.add(Restrictions.eq("number", number));
		Object obj = criteria.uniqueResult();
		return obj == null ? null : (Budget) obj;
	}

	public List<Budget> listOrderBudgetbyField(String field) {
		currentSession().beginTransaction();
		Criteria criteria = currentSession().createCriteria(Budget.class);
		criteria.addOrder(Order.asc(field).ignoreCase());
		List<Budget> list = criteria.list();
		return list;
	}

	public List<Budget> findByString(String field, String value) {
		currentSession().beginTransaction();
		Criteria criteria = currentSession().createCriteria(Budget.class);
		criteria.add(Restrictions.eq(field, value).ignoreCase());
		List<Budget> list = criteria.list();
		return list;
	}

	public Budget findByInteger(String field, Integer value) {
		currentSession().beginTransaction();
		Criteria criteria = currentSession().createCriteria(Budget.class);
		criteria.add(Restrictions.eq(field, value));
		Object obj = criteria.uniqueResult();
		return obj == null ? null : (Budget) obj;
	}

	public List<Budget> listAll() {
		currentSession().beginTransaction();
		Criteria criteria = currentSession().createCriteria(Budget.class);
		criteria.addOrder(Order.asc("number"));
		List<Budget> list = criteria.list();
		return list;
	}

	/*
	 * @Override public Boolean save(Budget budget) { Session session =
	 * currentSession(); try { session.beginTransaction(); if
	 * (listAll().isEmpty()) budget.setNumber(1); else
	 * budget.setNumber(listAll().get(listAll().size() - 1) .getNumber() + 1);
	 * session.save(budget); session.getTransaction().commit(); return true; }
	 * catch (HibernateException e) { session.getTransaction().rollback();
	 * e.printStackTrace(); return false; } }
	 */
}