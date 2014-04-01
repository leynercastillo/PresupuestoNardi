package model.service;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import model.dao.DaoWarrantyNotes;
import model.database.WarrantyNotes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Entity
@Service
public class ServiceWarrantyNotes {

	@ManyToOne
	@Autowired
	private DaoWarrantyNotes daoWarrantyNotes;

	@Transactional(readOnly = true)
	public WarrantyNotes findByWarrantyNN() {
		return daoWarrantyNotes.findByWarranty("MONEDA NACIONAL Y NUEVO");
	}
	
	@Transactional(readOnly = true)
	public List<WarrantyNotes> listByFieldWarrantyNN() {
		return daoWarrantyNotes.listByFieldWarranty("MONEDA NACIONAL Y NUEVO");
	}

	@Transactional(readOnly = true)
	public WarrantyNotes findByWarrantyNM() {
		return daoWarrantyNotes.findByWarranty("MONEDA NACIONAL Y MODERNIZACION");
	}
	
	@Transactional(readOnly = true)
	public List<WarrantyNotes> listByFieldWarrantyNM() {
		return daoWarrantyNotes.listByFieldWarranty("MONEDA NACIONAL Y MODERNIZACION");
	}
	
	@Transactional(readOnly = true)
	public WarrantyNotes findByWarrantyEN() {
		return daoWarrantyNotes.findByWarranty("MONEDA EXTRANJERA Y NUEVO");
	}
	
	@Transactional(readOnly = true)
	public List<WarrantyNotes> listByFieldWarrantyEN() {
		return daoWarrantyNotes.listByFieldWarranty("MONEDA EXTRANJERA Y NUEVO");
	}
	
	@Transactional(readOnly = true)
	public WarrantyNotes findByWarrantyEM() {
		return daoWarrantyNotes.findByWarranty("MONEDA EXTRANJERA Y MODERNIZACION");
	}
	
	@Transactional(readOnly = true)
	public List<WarrantyNotes> listByFieldWarrantyEM() {
		return daoWarrantyNotes.listByFieldWarranty("MONEDA EXTRANJERA Y MODERNIZACION");
	}
		
	
}