package model.dao;

import java.util.List;

import model.database.BudgetDetailOtherCostumers;

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
public class DaoBudgetDetailOtherCostumers {


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
	public Boolean save(BudgetDetailOtherCostumers budgetDetailOtherCostumers) {
		Session session = getCurrentSession();
		try {
			session.save(budgetDetailOtherCostumers);
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
	public Boolean update(BudgetDetailOtherCostumers budgetDetailOtherCostumers) {
		Session session = getCurrentSession();
		try {
			session.merge(budgetDetailOtherCostumers);
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
	public Boolean delete(BudgetDetailOtherCostumers budgetDetailOtherCostumers) {
		Session session = getCurrentSession();
		try {
			session.delete(budgetDetailOtherCostumers);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	public BudgetDetailOtherCostumers findByField(String field, Object value) {
		Session session = getCurrentSession();
		Criteria criteria = session.createCriteria(BudgetDetailOtherCostumers.class);
		criteria.add(Restrictions.eq(field, value));
		Object obj = criteria.uniqueResult();
		return obj == null ? null : (BudgetDetailOtherCostumers) obj;
	}

	@SuppressWarnings("unchecked")
	public List<BudgetDetailOtherCostumers> listByField(String field, String value) {
		Session session = getCurrentSession();
		Criteria criteria = session.createCriteria(BudgetDetailOtherCostumers.class);
		criteria.add(Restrictions.eq(field, value).ignoreCase());
		criteria.addOrder(Order.desc("idBudgetDetail"));
		return criteria.list();
	}

	@SuppressWarnings("unchecked")
	public List<BudgetDetailOtherCostumers> listAll() {
		Session session = getCurrentSession();
		Criteria criteria = session.createCriteria(BudgetDetailOtherCostumers.class);
		criteria.addOrder(Order.asc("number"));
		return criteria.list();
	}
	


	@SuppressWarnings("unchecked")
	public List<Integer> listIntegerByFields(String field) {
		Session session = getCurrentSession();
		Criteria criteria = session.createCriteria(BudgetDetailOtherCostumers.class);
		criteria.setProjection(Projections.distinct(Projections.property(field)));
		criteria.addOrder(Order.asc(field));
		return criteria.list();
	}

	@SuppressWarnings("unchecked")
	public List<String> listStringByFields(String field) {
		Session session = getCurrentSession();
		Criteria criteria = session.createCriteria(BudgetDetailOtherCostumers.class);
		criteria.setProjection(Projections.distinct(Projections.property(field)));
		criteria.addOrder(Order.asc(field));
		return criteria.list();
	}
	
	@SuppressWarnings("unchecked")
	public List<BudgetDetailOtherCostumers> listByString(String field, String value) {
		Session session = getCurrentSession();
		Criteria criteria = session.createCriteria(BudgetDetailOtherCostumers.class);
		criteria.add(Restrictions.eq(field, value).ignoreCase());
		return criteria.list();
	}

}
	



