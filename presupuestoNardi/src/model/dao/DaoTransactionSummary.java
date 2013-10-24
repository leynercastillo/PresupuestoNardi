package model.dao;

import model.database.TransactionSummary;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DaoTransactionSummary {

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
	public Boolean save(TransactionSummary transactionSummary) {
		Session session = getCurrentSession();
		try {
			session.save(transactionSummary);
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
	public Boolean update(TransactionSummary transactionSummary) {
		Session session = getCurrentSession();
		try {
			session.merge(transactionSummary);
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
	public Boolean delete(TransactionSummary transactionSummary) {
		Session session = getCurrentSession();
		try {
			session.delete(transactionSummary);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	public TransactionSummary findByField(String field, Object value) {
		Session session = getCurrentSession();
		Criteria criteria = session.createCriteria(TransactionSummary.class);
		criteria.add(Restrictions.eq(field, value));
		Object obj = criteria.uniqueResult();
		return obj == null ? null : (TransactionSummary) obj;
	}
}