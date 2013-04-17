package dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.zkoss.zk.ui.Sessions;

import database.Quotation;
import hibernateConnections.GenericDao;

public class DaoQuotation extends GenericDao<Quotation> {

    private Properties properties;

    public DaoQuotation() {
	properties = new Properties();
	try {
	    properties.load(new FileInputStream(Sessions.getCurrent().getWebApp().getRealPath("/resource/config/numeration.properties")));
	} catch (IOException e) {
	    System.out.println("The properties wasn't loaded.");
	}
    }

    public List<Quotation> listByString(String field, String value) {
	currentSession().beginTransaction();
	Criteria criteria = currentSession().createCriteria(Quotation.class);
	criteria.add(Restrictions.eq(field, value).ignoreCase());
	List<Quotation> list = criteria.list();
	return list;
    }

    public List<Quotation> listByInt(String field, int value) {
	currentSession().beginTransaction();
	Criteria criteria = currentSession().createCriteria(Quotation.class);
	criteria.add(Restrictions.eq(field, value));
	List<Quotation> list = criteria.list();
	return list;
    }

    public List<Quotation> listQuotationOrderByField(String field) {
	currentSession().beginTransaction();
	Criteria criteria = currentSession().createCriteria(Quotation.class);
	criteria.addOrder(Order.asc(field).ignoreCase());
	criteria.addOrder(Order.desc("date"));
	List<Quotation> list = criteria.list();
	return list;
    }

    public List<String> listStringByFields(String field) {
	currentSession().beginTransaction();
	Criteria criteria = currentSession().createCriteria(Quotation.class);
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
    public Integer getMaxNumber(String field) {
	currentSession().beginTransaction();
	Criteria criteria = currentSession().createCriteria(Quotation.class);
	criteria.setProjection(Projections.max(field));
	Integer number = (Integer)criteria.uniqueResult();
	return number == null || number == -1 ? null : number;
    }

    /* (non-Javadoc)
     * Method that @override method in hibernateConnections.GenericDao.save(java.lang.Object)
     * @param model Object to save in database
     * @return true if saved / false if not saved
     * @see hibernateConnections.GenericDao#save(java.lang.Object)
     */
    @Override
    public Boolean save(Quotation quotation) {
	Session session = currentSession();
	try {
	    session.beginTransaction();
	    if (quotation.isType()) {
		Integer number = getMaxNumber("newNumber");
		quotation.setNewNumber(number == null ? Integer.valueOf(properties.getProperty("quotation_new_number")) + 1 : number + 1);
		quotation.setModernizationNumber(-1);
		System.out.println(number);
	    } else {
		Integer number = getMaxNumber("modernizationNumber");
		quotation.setModernizationNumber(number == null ? Integer.valueOf(properties.getProperty("quotation_modernization_number")) + 1 : number + 1);
		quotation.setNewNumber(-1);
		System.out.println(number);
	    }
	    session.save(quotation);
	    session.getTransaction().commit();
	    properties.setProperty("quotation_new_number", quotation.getNewNumber().toString());
	    properties.setProperty("quotation_modernization_number", quotation.getModernizationNumber().toString());
	    return true;
	} catch (HibernateException e) {
	    session.getTransaction().rollback();
	    e.printStackTrace();
	    return false;
	}
    }
}