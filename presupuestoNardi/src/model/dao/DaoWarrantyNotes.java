package model.dao;

import java.util.List;

import javax.persistence.Entity;


import model.database.WarrantyNotes;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;

import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Entity
@Repository
public class DaoWarrantyNotes {

	@Autowired
	private SessionFactory sessionFactory;

	protected final Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	/**
	 * @param warrantyNotes
	 *                Object to save in database
	 * @return true if saved / false if not saved
	 */
	public Boolean save(WarrantyNotes warrantyNotes) {
		Session session = getCurrentSession();
		try {
			session.save(warrantyNotes);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	/**
	 * @param warrantyNotes
	 *                Object to update in database
	 * @return true if updated / false if not updated
	 */
	public Boolean update(WarrantyNotes warrantyNotes) {
		Session session = getCurrentSession();
		try {
			session.merge(warrantyNotes);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	/**
	 * @param warrantyNotes
	 *                Object to delete in database
	 * @return true if deleted / false if not deleted
	 */
	public Boolean delete(WarrantyNotes warrantyNotes) {
		Session session = getCurrentSession();
		try {
			session.delete(warrantyNotes);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	
	
	public WarrantyNotes findByWarranty(String field){
		Session session = getCurrentSession();
		Criteria criteria = session.createCriteria(WarrantyNotes.class);
		criteria.add(Restrictions.eq("status", 'A'));
		criteria.add(Restrictions.eq("field", field).ignoreCase());
		Object obj = criteria.uniqueResult();
		return obj == null ? null : (WarrantyNotes) obj;
	}
	
	@SuppressWarnings("unchecked")
	public List<WarrantyNotes> listByFieldWarranty(String field) {
		Session session = getCurrentSession();
		Criteria criteria = session.createCriteria(WarrantyNotes.class);
		criteria.add(Restrictions.eq("field", field).ignoreCase());
		criteria.addOrder(Order.asc("idWarranty"));
		return criteria.list();
	}
	

	
}