package model.service;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import model.dao.DaoContact;
import model.database.Contact;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Entity
@Service
public class ServiceContact {

	@ManyToOne
	@Autowired
	private DaoContact daoContact;

	@Transactional
	public boolean save(Contact contact) {
		if (contact.getIdContact() == 0)
			return daoContact.save(contact);
		else
			return daoContact.update(contact);
	}
}