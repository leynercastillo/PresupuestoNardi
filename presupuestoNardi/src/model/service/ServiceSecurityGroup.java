package model.service;

import java.util.List;

import model.dao.DaoSecurityGroup;
import model.database.SecurityGroup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ServiceSecurityGroup {

	@Autowired
	private DaoSecurityGroup daoSecurityGroup;

	@Transactional(readOnly = true)
	public SecurityGroup findById(int id) {
		return daoSecurityGroup.findByField("idSecurityGroup", id);
	}

	@Transactional(readOnly = true)
	public SecurityGroup findGroupSeller() {
		return daoSecurityGroup.findByField("name", "SELLER");
	}

	@Transactional(readOnly = true)
	public SecurityGroup findGroupSalesCoordinator() {
		return daoSecurityGroup.findByField("name", "SALES COORDINATOR");
	}
	
	//Prueba para que salga el Sr. Roberto Nardi
	@Transactional(readOnly = true)
	public SecurityGroup findGroupOwner() {
		return daoSecurityGroup.findByField("name", "OWNER");
	}
	//

	@Transactional(readOnly = true)
	public List<SecurityGroup> listActive() {
		return daoSecurityGroup.listActive();
	}
}