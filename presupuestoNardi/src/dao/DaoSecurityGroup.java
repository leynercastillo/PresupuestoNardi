package dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import database.SecurityGroup;
import hibernateConnections.GenericDao;

@Repository
public class DaoSecurityGroup extends GenericDao<SecurityGroup> {

    @Autowired
    public DaoSecurityGroup(SessionFactory sessionFactory) {
	super(sessionFactory);
    }
}
