package dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import dao.generic.GenericDao;
import database.SecurityRole;

@Repository
public class DaoSecurityRole extends GenericDao<SecurityRole> {

    @Autowired
    public DaoSecurityRole(SessionFactory sessionFactory) {
	super(sessionFactory);
    }

    public List<SecurityRole> listRoles() {
	currentSession().beginTransaction();
	Criteria criteria = currentSession().createCriteria(SecurityRole.class);
	List<SecurityRole> list = criteria.list();
	return list;
    }

    public SecurityRole findRoleById(Integer id) {
	currentSession().beginTransaction();
	Criteria criteria = currentSession().createCriteria(SecurityRole.class);
	criteria.add(Restrictions.eq("idSecurityRole", id));
	Object bp = criteria.uniqueResult();
	return bp != null ? (SecurityRole) bp : null;
    }
}
