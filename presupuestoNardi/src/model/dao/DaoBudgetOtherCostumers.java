package model.dao;

import java.util.List;



import model.database.BudgetOtherCostumers;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;


@Repository
public class DaoBudgetOtherCostumers {


	@Autowired
	private SessionFactory sessionFactory;

	protected final Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	/**
	 * @param model
	 *                Object to save in database
	 * @return true if saved / false if not saved
	 */
	
	public Boolean save(BudgetOtherCostumers budgetOtherCostumers) {
		Session session = getCurrentSession();
		try {
			session.save(budgetOtherCostumers);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	/**
	 * @param model
	 *                Object to update in database
	 * @return true if updated / false if not updated
	 */
	public Boolean update(BudgetOtherCostumers budgetOtherCostumers) {
		Session session = getCurrentSession();
		try {
			session.merge(budgetOtherCostumers);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	/**
	 * @param model
	 *                Object to delete in database
	 * @return true if deleted / false if not deleted
	 */
	public Boolean delete(BudgetOtherCostumers budgetOtherCostumers) {
		Session session = getCurrentSession();
		try {
			session.delete(budgetOtherCostumers);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	public BudgetOtherCostumers findByField(String field, Object value) {
		Session session = getCurrentSession();
		Criteria criteria = session.createCriteria(BudgetOtherCostumers.class);
		criteria.add(Restrictions.eq(field, value));
		Object obj = criteria.uniqueResult();
		return obj == null ? null : (BudgetOtherCostumers) obj;
	}

	@SuppressWarnings("unchecked")
	public List<BudgetOtherCostumers> listByField(String field, String value) {
		Session session = getCurrentSession();
		Criteria criteria = session.createCriteria(BudgetOtherCostumers.class);
		criteria.add(Restrictions.eq(field, value).ignoreCase());
		criteria.addOrder(Order.desc("idBudgetOtherCostumers"));
		return criteria.list();
	}

	@SuppressWarnings("unchecked")
	public List<BudgetOtherCostumers> listAll() {
		Session session = getCurrentSession();
		Criteria criteria = session.createCriteria(BudgetOtherCostumers.class);
		criteria.addOrder(Order.asc("number"));
		return criteria.list();
	}
	


	@SuppressWarnings("unchecked")
	public List<Integer> listIntegerByFields(String field) {
		Session session = getCurrentSession();
		Criteria criteria = session.createCriteria(BudgetOtherCostumers.class);
		criteria.setProjection(Projections.distinct(Projections.property(field)));
		criteria.addOrder(Order.asc(field));
		return criteria.list();
	}

	@SuppressWarnings("unchecked")
	public List<String> listStringByFields(String field) {
		Session session = getCurrentSession();
		Criteria criteria = session.createCriteria(BudgetOtherCostumers.class);
		criteria.setProjection(Projections.distinct(Projections.property(field)));
		criteria.addOrder(Order.asc(field));
		return criteria.list();
	}
	
	
}
	



