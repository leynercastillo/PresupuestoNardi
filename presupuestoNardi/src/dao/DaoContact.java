package dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import dao.generic.GenericDao;
import database.Contact;

@Repository
public class DaoContact extends GenericDao<Contact> {

    @Autowired
    public DaoContact(SessionFactory sessionFactory) {
	super(sessionFactory);
    }

}