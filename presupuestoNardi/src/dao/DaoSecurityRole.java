package dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import dao.generic.GenericDao;
import database.SecurityRole;

@Repository
public class DaoSecurityRole extends GenericDao<SecurityRole> {

    @Autowired
    public DaoSecurityRole(SessionFactory sessionFactory) {
	super(sessionFactory);
    }

    @Transactional(readOnly = true)
    public List<SecurityRole> listRoles() {
	getCurrentSession().beginTransaction();
	Criteria criteria = getCurrentSession().createCriteria(SecurityRole.class);
	List<SecurityRole> list = criteria.list();
	return list;
    }

    @Transactional(readOnly = true)
    public SecurityRole findRoleById(Integer id) {
	getCurrentSession().beginTransaction();
	Criteria criteria = getCurrentSession().createCriteria(SecurityRole.class);
	criteria.add(Restrictions.eq("idSecurityRole", id));
	Object bp = criteria.uniqueResult();
	return bp != null ? (SecurityRole) bp : null;
    }
}
