package dao;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import dao.generic.GenericDao;
import database.SecurityGroup;

@Repository
public class DaoSecurityGroup extends GenericDao<SecurityGroup> {

    @Autowired
    public DaoSecurityGroup(SessionFactory sessionFactory) {
	super(sessionFactory);
    }

    @Transactional(readOnly = true)
    public SecurityGroup listByField(String field, Object value){
	getCurrentSession().beginTransaction();
	Criteria criteria = getCurrentSession().createCriteria(SecurityGroup.class);
	criteria.add(Restrictions.eq(field, value));
	Object obj = criteria.uniqueResult();
	return obj == null ? null : (SecurityGroup)obj;
    }
}
