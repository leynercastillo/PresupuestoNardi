package dao;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import dao.generic.GenericDao;
import database.SecurityGroup;

@Repository
public class DaoSecurityGroup extends GenericDao<SecurityGroup> {

    @Autowired
    public DaoSecurityGroup(SessionFactory sessionFactory) {
	super(sessionFactory);
    }

    public SecurityGroup listByField(String field, Object value){
	currentSession().beginTransaction();
	Criteria criteria = currentSession().createCriteria(SecurityGroup.class);
	criteria.add(Restrictions.eq(field, value));
	Object obj = criteria.uniqueResult();
	return obj == null ? null : (SecurityGroup)obj;
    }
}
