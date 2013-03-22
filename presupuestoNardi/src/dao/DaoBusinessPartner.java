package dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import database.BusinessPartner;
import hibernateConnections.GenericDao;

public class DaoBusinessPartner extends GenericDao<BusinessPartner> {

	public List<BusinessPartner> listActiveOrderByField(String field) {
		currentSession().beginTransaction();
		Criteria criteria = currentSession().createCriteria(BusinessPartner.class);
		criteria.add(Restrictions.eq("status", 'A'));
		criteria.addOrder(Order.asc(field));
		return criteria.list();
	}

	public BusinessPartner findByRif(String rif){
		currentSession().beginTransaction();
		Criteria criteria = currentSession().createCriteria(BusinessPartner.class);
		criteria.add(Restrictions.eq("rif", rif));
		Object object = criteria.uniqueResult();
		return object != null ? (BusinessPartner)object : null;
	}

	public BusinessPartner findActiveByRif(String rif){
		currentSession().beginTransaction();
		Criteria criteria = currentSession().createCriteria(BusinessPartner.class);
		criteria.add(Restrictions.eq("rif", rif));
		criteria.add(Restrictions.eq("status", 'A'));
		Object object = criteria.uniqueResult();
		return object != null ? (BusinessPartner)object : null;
	}
}