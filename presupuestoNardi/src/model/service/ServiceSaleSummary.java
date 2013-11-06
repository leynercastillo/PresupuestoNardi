package model.service;

import model.dao.DaoSaleSummary;
import model.database.SaleSummary;

import org.springframework.beans.factory.annotation.Autowired;

public class ServiceSaleSummary {

	@Autowired
	private DaoSaleSummary daoSaleSummary;

	public Boolean save(SaleSummary saleSummary) {
		return true;
	}
}