package model.dao;

import model.database.SaleSummary;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

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
}
