package dao;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import dao.generic.GenericDao;

import database.Quotation;

@Repository
public class DaoQuotation extends GenericDao<Quotation> {

    private Properties properties;

    @Autowired
    public DaoQuotation(SessionFactory sessionFactory) {
	super(sessionFactory);
	properties = new Properties();
	try {
	    properties.load(this.getClass().getClassLoader().getResourceAsStream("/configuration/numeration.properties"));
	} catch (IOException e) {
	    System.out.println("The properties wasn't loaded.");
	}
    }

    @Transactional(readOnly = true)
    public Quotation findById(Quotation quotation) {
	getCurrentSession().beginTransaction();
	Criteria criteria = getCurrentSession().createCriteria(Quotation.class);
	criteria.add(Restrictions.eq("idQuotation", quotation.getIdQuotation()));
	Object obj = criteria.uniqueResult();
	getCurrentSession().evict(obj);
	return obj == null ? null : (Quotation) obj;
    }

    @Transactional(readOnly = true)
    public List<Quotation> listByString(String field, String value) {
	getCurrentSession().beginTransaction();
	Criteria criteria = getCurrentSession().createCriteria(Quotation.class);
	criteria.add(Restrictions.eq(field, value).ignoreCase());
	List<Quotation> list = criteria.list();
	return list;
    }

    @Transactional(readOnly = true)
    public List<Quotation> listByInt(String field, int value) {
	getCurrentSession().beginTransaction();
	Criteria criteria = getCurrentSession().createCriteria(Quotation.class);
	criteria.add(Restrictions.eq(field, value));
	criteria.addOrder(Order.desc("date"));
	List<Quotation> list = criteria.list();
	return list;
    }

    @Transactional(readOnly = true)
    public List<Quotation> listQuotationOrderByField(String field) {
	getCurrentSession().beginTransaction();
	Criteria criteria = getCurrentSession().createCriteria(Quotation.class);
	criteria.addOrder(Order.asc(field).ignoreCase());
	criteria.addOrder(Order.desc("date"));
	List<Quotation> list = criteria.list();
	return list;
    }

    @Transactional(readOnly = true)
    public List<String> listStringByFields(String field) {
	getCurrentSession().beginTransaction();
	Criteria criteria = getCurrentSession().createCriteria(Quotation.class);
	criteria.setProjection(Projections.distinct(Projections.property(field)));
	criteria.addOrder(Order.asc(field));
	List<String> list = criteria.list();
	return list;
    }

    /**
     * @param field
     *            The Field that is looking for max value.
     * @return The integer max value in this field db.
     */
    @Transactional(readOnly = true)
    public Integer getMaxNumber(String field) {
	getCurrentSession().beginTransaction();
	Criteria criteria = getCurrentSession().createCriteria(Quotation.class);
	criteria.setProjection(Projections.max(field));
	Integer number = (Integer) criteria.uniqueResult();
	if (number == null || number == -1) {
	    if (field.compareTo("newNumber") == 0)
		number = Integer.valueOf(properties.getProperty("quotation_new_number"));
	    else
		number = Integer.valueOf(properties.getProperty("quotation_modernization_number"));
	}
	return number;
    }

    @Transactional(readOnly = true)
    public Short getVersionQuotation(Quotation quotation) {
	getCurrentSession().beginTransaction();
	Criteria criteria = getCurrentSession().createCriteria(Quotation.class);
	if (quotation.isType())
	    criteria.add(Restrictions.eq("newNumber", quotation.getNewNumber()));
	else
	    criteria.add(Restrictions.eq("modernizationNumber", quotation.getModernizationNumber()));
	criteria.setProjection(Projections.max("versionNumber"));
	Short version = (Short) criteria.uniqueResult();
	return version == null ? null : version;
    }

    /**
     * @param quotation
     *            Object to save in database.
     * @param update
     *            Boolean for generate version number of quotation (Only change the price, not more).
     * @return true if saved / false if not saved
     */
    @Transactional
    @Override
    public Boolean save(Quotation quotation) {
	quotation.setDate(new Date());
	try {
	    getCurrentSession().beginTransaction();
	    List<Quotation> list = listByInt("budgetNumber", quotation.getBudgetNumber());
	    if (list.size() > 0) {
		getCurrentSession().evict(quotation);
		quotation.setIdQuotation(0);
		quotation.setVersionNumber((short) (getVersionQuotation(list.get(0)) + 1));
	    } else if (quotation.isType()) {
		Integer number = getMaxNumber("newNumber");
		quotation.setNewNumber(number == null ? 0 : number + 1);
		quotation.setModernizationNumber(-1);
	    } else {
		Integer number = getMaxNumber("modernizationNumber");
		quotation.setModernizationNumber(number == null ? 0 : number + 1);
		quotation.setNewNumber(-1);
	    }
	    /* Se utiliza el merge por un error no solucionado con los estados de los objetos de hibernate */
	    getCurrentSession().merge(quotation);
	    getCurrentSession().getTransaction().commit();
	    return true;
	} catch (HibernateException e) {
	    getCurrentSession().getTransaction().rollback();
	    e.printStackTrace();
	    return false;
	}
    }

    /**
     * @param field
     *            field for which it ordered the list.
     * @return list of Quotation approved ordered by field.
     */
    @Transactional(readOnly = true)
    public List<Quotation> listActiveOrderAscByField(String field) {
	getCurrentSession().beginTransaction();
	Criteria criteria = getCurrentSession().createCriteria(Quotation.class);
	criteria.add(Restrictions.eq("status", 'A'));
	criteria.addOrder(Order.asc(field).ignoreCase());
	List<Quotation> list = criteria.list();
	return list;
    }

    /**
     * @param field
     *            field for which it ordered the list.
     * @return list of Quotation approved ordered by field.
     */
    @Transactional(readOnly = true)
    public List<Quotation> listActiveOrderDescByField(String field) {
	getCurrentSession().beginTransaction();
	Criteria criteria = getCurrentSession().createCriteria(Quotation.class);
	criteria.add(Restrictions.eq("status", 'A'));
	criteria.addOrder(Order.desc(field).ignoreCase());
	List<Quotation> list = criteria.list();
	return list;
    }
}