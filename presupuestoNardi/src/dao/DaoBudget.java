package dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import database.Budget;
import hibernateConnections.GenericDao;

@Repository
public class DaoBudget extends GenericDao<Budget> {

    @Autowired
    public DaoBudget(SessionFactory sessionFactory) {
	super(sessionFactory);
    }

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
	criteria.addOrder(Order.desc("date"));
	List<Budget> list = criteria.list();
	return list;
    }

    public List<Budget> listByString(String field, String value) {
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

    public List<Integer> listByIntFields(String field) {
	currentSession().beginTransaction();
	Criteria criteria = currentSession().createCriteria(Budget.class);
	criteria.setProjection(Projections.distinct(Projections.property(field)));
	criteria.addOrder(Order.asc(field));
	List<Integer> list = criteria.list();
	return list;
    }

    public List<String> listStringByFields(String field) {
	currentSession().beginTransaction();
	Criteria criteria = currentSession().createCriteria(Budget.class);
	criteria.setProjection(Projections.distinct(Projections.property(field)));
	criteria.addOrder(Order.asc(field));
	List<String> list = criteria.list();
	return list;
    }
}