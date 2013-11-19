package model.dao;

import java.util.List;
import java.util.Set;

import model.database.SaleSummary;
import model.database.SecurityUser;

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
public class DaoSaleSummary {

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
	public Boolean save(SaleSummary saleSummary) {
		Session session = getCurrentSession();
		try {
			saleSummary.setVersion(getVersion(saleSummary) + 1);
			session.save(saleSummary);
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
	public Boolean update(SaleSummary saleSummary) {
		Session session = getCurrentSession();
		try {
			session.merge(saleSummary);
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
	public Boolean delete(SaleSummary saleSummary) {
		Session session = getCurrentSession();
		try {
			session.delete(saleSummary);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	public SaleSummary findByField(String field, Object value) {
		Session session = getCurrentSession();
		Criteria criteria = session.createCriteria(SaleSummary.class);
		criteria.add(Restrictions.eq(field, value));
		Object obj = criteria.uniqueResult();
		return obj == null ? null : (SaleSummary) obj;
	}

	@SuppressWarnings("unchecked")
	public List<SaleSummary> listByField(String field, Object value, Set<SecurityUser> listUser) {
		Session session = getCurrentSession();
		Criteria criteria = session.createCriteria(SaleSummary.class);
		criteria.createCriteria("quotation", "quotation");
		criteria.createCriteria("quotation.budget", "budget");
		criteria.add(Restrictions.in("budget.securityUser", listUser));
		criteria.add(Restrictions.eq(field, value));
		criteria.addOrder(Order.asc(field));
		criteria.addOrder(Order.desc("date"));
		return criteria.list();
	}

	@SuppressWarnings("unchecked")
	public List<SaleSummary> listByQuotationField(String field, Object value, Set<SecurityUser> listUser) {
		Session session = getCurrentSession();
		Criteria criteria = session.createCriteria(SaleSummary.class);
		criteria.createCriteria("quotation", "quotation");
		criteria.createCriteria("quotation.budget", "budget");
		criteria.add(Restrictions.in("budget.securityUser", listUser));
		criteria.add(Restrictions.eq("quotation." + field, value));
		criteria.add(Restrictions.eq("status", 'A'));
		criteria.addOrder(Order.asc("quotation." + field));
		criteria.addOrder(Order.desc("date"));
		return criteria.list();
	}

	@SuppressWarnings("unchecked")
	public List<String> listStringByField(String field, Set<SecurityUser> listUser) {
		Session session = getCurrentSession();
		Criteria criteria = session.createCriteria(SaleSummary.class);
		criteria.createCriteria("quotation", "quotation");
		criteria.createCriteria("quotation.budget", "budget");
		criteria.add(Restrictions.in("budget.securityUser", listUser));
		criteria.setProjection(Projections.distinct(Projections.property(field)));
		criteria.addOrder(Order.asc(field));
		return criteria.list();
	}

	@SuppressWarnings("unchecked")
	public List<String> listStringByQuotationField(String field, Set<SecurityUser> listUser) {
		Session session = getCurrentSession();
		Criteria criteria = session.createCriteria(SaleSummary.class);
		criteria.createCriteria("quotation", "quotation");
		criteria.createCriteria("quotation.budget", "budget");
		criteria.add(Restrictions.in("budget.securityUser", listUser));
		criteria.setProjection(Projections.distinct(Projections.property("quotation." + field)));
		criteria.addOrder(Order.asc("quotation." + field));
		return criteria.list();
	}

	public Integer getVersion(SaleSummary saleSummary) {
		Session session = getCurrentSession();
		Criteria criteria = session.createCriteria(SaleSummary.class);
		criteria.add(Restrictions.eq("number", saleSummary.getNumber()));
		criteria.setProjection(Projections.max("version"));
		Object obj = criteria.uniqueResult();
		return obj == null ? 0 : (Integer) obj;
	}

	public Integer getLastConstructionNumber() {
		Session session = getCurrentSession();
		Criteria criteria = session.createCriteria(SaleSummary.class);
		criteria.setProjection(Projections.max("lastConstructionNumber"));
		Object obj = criteria.uniqueResult();
		return obj == null ? 0 : (Integer) obj;
	}
}