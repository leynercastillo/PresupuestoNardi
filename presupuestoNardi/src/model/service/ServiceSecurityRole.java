package model.service;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import model.dao.DaoSecurityRole;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Entity
@Service
public class ServiceSecurityRole {

	@ManyToOne
	@Autowired
	private DaoSecurityRole daoSecurityRole;
}
