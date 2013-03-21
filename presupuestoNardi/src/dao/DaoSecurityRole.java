package dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import database.SecurityRole;
import hibernateConnections.GenericDao;

public class DaoSecurityRole extends GenericDao<SecurityRole> {

	public List<SecurityRole> listRoles() {
		Transaction transaction = currentSession().beginTransaction();
		Criteria criteria = currentSession().createCriteria(SecurityRole.class);
		return criteria.list();
	}

	public SecurityRole findRoleById(Integer id) {
		Transaction transaction = currentSession().beginTransaction();
		Criteria criteria = currentSession().createCriteria(SecurityRole.class);
		criteria.add(Restrictions.eq("idSecurityRole", id));
		Object bp = criteria.uniqueResult();
		return bp != null ? (SecurityRole)bp : null;
	}
}
