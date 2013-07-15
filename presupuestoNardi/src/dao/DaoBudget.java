package dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import dao.generic.GenericDao;
import database.Budget;

@Repository
public class DaoBudget extends GenericDao<Budget> {

    @Autowired
    public DaoBudget(SessionFactory sessionFactory) {
	super(sessionFactory);
    }

    @Transactional(readOnly = true)
    public Budget findByNumber(int number) {
	getCurrentSession().beginTransaction();
	Criteria criteria = getCurrentSession().createCriteria(Budget.class);
	criteria.add(Restrictions.eq("number", number));
	Object obj = criteria.uniqueResult();
	return obj == null ? null : (Budget) obj;
    }

    @Transactional(readOnly = true)
    public List<Budget> listOrderBudgetbyField(String field) {
	getCurrentSession().beginTransaction();
	Criteria criteria = getCurrentSession().createCriteria(Budget.class);
	criteria.addOrder(Order.asc(field).ignoreCase());
	criteria.addOrder(Order.desc("date"));
	List<Budget> list = criteria.list();
	return list;
    }

    @Transactional(readOnly = true)
    public List<Budget> listByString(String field, String value) {
	getCurrentSession().beginTransaction();
	Criteria criteria = getCurrentSession().createCriteria(Budget.class);
	criteria.add(Restrictions.eq(field, value).ignoreCase());
	criteria.addOrder(Order.desc("idBudget"));
	List<Budget> list = criteria.list();
	return list;
    }

    @Transactional(readOnly = true)
    public Budget findByInteger(String field, Integer value) {
	getCurrentSession().beginTransaction();
	Criteria criteria = getCurrentSession().createCriteria(Budget.class);
	criteria.add(Restrictions.eq(field, value));
	Object obj = criteria.uniqueResult();
	getCurrentSession().evict(obj);
	return obj == null ? null : (Budget) obj;
    }

    @Transactional(readOnly = true)
    public List<Budget> listAll() {
	getCurrentSession().beginTransaction();
	Criteria criteria = getCurrentSession().createCriteria(Budget.class);
	criteria.addOrder(Order.asc("number"));
	List<Budget> list = criteria.list();
	return list;
    }

    @Transactional(readOnly = true)
    public List<Integer> listByIntFields(String field) {
	getCurrentSession().beginTransaction();
	Criteria criteria = getCurrentSession().createCriteria(Budget.class);
	criteria.setProjection(Projections.distinct(Projections.property(field)));
	criteria.addOrder(Order.asc(field));
	List<Integer> list = criteria.list();
	return list;
    }

    @Transactional(readOnly = true)
    public List<String> listStringByFields(String field) {
	getCurrentSession().beginTransaction();
	Criteria criteria = getCurrentSession().createCriteria(Budget.class);
	criteria.setProjection(Projections.distinct(Projections.property(field)));
	criteria.addOrder(Order.asc(field));
	List<String> list = criteria.list();
	return list;
    }
}