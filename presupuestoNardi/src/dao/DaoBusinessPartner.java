package dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import dao.generic.GenericDao;
import database.BusinessPartner;

@Repository
public class DaoBusinessPartner extends GenericDao<BusinessPartner> {

    @Autowired
    public DaoBusinessPartner(SessionFactory sessionFactory) {
	super(sessionFactory);
    }
    
    public List<BusinessPartner> listActiveOrderByField(String field) {
	getCurrentSession().beginTransaction();
	Criteria criteria = getCurrentSession().createCriteria(BusinessPartner.class);
	criteria.add(Restrictions.eq("status", 'A'));
	criteria.addOrder(Order.asc(field));
	List<BusinessPartner> list = criteria.list();
	return list;
    }

    public BusinessPartner findByRif(String rif) {
	getCurrentSession().beginTransaction();
	Criteria criteria = getCurrentSession().createCriteria(BusinessPartner.class);
	criteria.add(Restrictions.eq("rif", rif));
	Object object = criteria.uniqueResult();
	return object != null ? (BusinessPartner) object : null;
    }

    public BusinessPartner findActiveByRif(String rif) {
	getCurrentSession().beginTransaction();
	Criteria criteria = getCurrentSession().createCriteria(BusinessPartner.class);
	criteria.add(Restrictions.eq("rif", rif));
	criteria.add(Restrictions.eq("status", 'A'));
	Object object = criteria.uniqueResult();
	return object != null ? (BusinessPartner) object : null;
    }

    public List<String> listStringByFields(String field) {
	getCurrentSession().beginTransaction();
	Criteria criteria = getCurrentSession().createCriteria(BusinessPartner.class);
	criteria.setProjection(Projections.distinct(Projections.property(field)));
	criteria.addOrder(Order.asc(field));
	List<String> list = criteria.list();
	return list;
    }
}