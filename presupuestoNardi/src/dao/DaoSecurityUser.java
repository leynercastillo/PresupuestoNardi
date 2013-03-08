package dao;

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
		criteria.add(Restrictions.eq("status", (byte)1));
		Object su = criteria.uniqueResult();
		return su != null ? (SecurityUser)su : null;
	}
}