package dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import dao.generic.GenericDao;
import database.SecurityUser;

@Repository
public class DaoSecurityUser extends GenericDao<SecurityUser> {

    @Autowired
    public DaoSecurityUser(SessionFactory sessionFactory) {
	super(sessionFactory);
    }

    public SecurityUser findByString(String field, String value) {
	getCurrentSession().beginTransaction();
	Criteria criteria = getCurrentSession().createCriteria(SecurityUser.class);
	criteria.add(Restrictions.eq(field, value).ignoreCase());
	Object su = criteria.uniqueResult();
	return su != null ? (SecurityUser) su : null;
    }

    public List<SecurityUser> listAll() {
	getCurrentSession().beginTransaction();
	Criteria criteria = getCurrentSession().createCriteria(SecurityUser.class);
	List<SecurityUser> list = criteria.list();
	return list;
    }
}