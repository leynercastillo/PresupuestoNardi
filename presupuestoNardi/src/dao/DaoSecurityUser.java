package dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import database.SecurityUser;
import hibernateConnections.GenericDao;

public class DaoSecurityUser extends GenericDao<SecurityUser> {

	public SecurityUser findByString(String field, String value) {		
		Transaction transaction = currentSession().beginTransaction();
		Criteria criteria = currentSession().createCriteria(SecurityUser.class);
		criteria.add(Restrictions.eq(field, value).ignoreCase());
		Object su = criteria.uniqueResult();
		return su != null ? (SecurityUser) su : null;
	}

	public List<SecurityUser> listAll() {
		Transaction transaction = currentSession().beginTransaction();
		Criteria criteria = currentSession().createCriteria(SecurityUser.class);
		return criteria.list();
	}
}