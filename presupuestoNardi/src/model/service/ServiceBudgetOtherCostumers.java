package model.service;

import java.util.ArrayList;
import java.util.List;

import model.dao.DaoBudgetOtherCostumers;
import model.database.BudgetOtherCostumers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ServiceBudgetOtherCostumers {

	@Autowired
	private DaoBudgetOtherCostumers daoBudgetOtherCostumers;

	@Transactional
	public Boolean save(BudgetOtherCostumers budgetOtherCostumers) {
		if (budgetOtherCostumers.getIdBudgetOtherCostumers() == 0)
			return daoBudgetOtherCostumers.save(budgetOtherCostumers);
		else
			return daoBudgetOtherCostumers.update(budgetOtherCostumers);
	}

	@Transactional(readOnly = true)
	public BudgetOtherCostumers findByNumber(String number) {
		return daoBudgetOtherCostumers.findByField("number", number);
	}

	@Transactional(readOnly = true)
	public List<BudgetOtherCostumers> listByConstruction(String construction) {
		return daoBudgetOtherCostumers.listByField("construction", construction);
	}

	@Transactional(readOnly = true)
	public List<BudgetOtherCostumers> listByPartnerName(String partnerName) {
		return daoBudgetOtherCostumers.listByField("partnerName", partnerName);
	}

	@Transactional(readOnly = true)
	public List<BudgetOtherCostumers> listByRifPartner(String rifPartner) {
		return daoBudgetOtherCostumers.listByField("rifPartner", rifPartner);
	}
	
	@Transactional(readOnly = true)
	public List<BudgetOtherCostumers> listBySeller(String seller) {
		return daoBudgetOtherCostumers.listByField("seller", seller);
	}

	@Transactional(readOnly = true)
	public List<BudgetOtherCostumers> listAll() {
		return daoBudgetOtherCostumers.listAll();
	}
	
	
	@Transactional(readOnly = true)
	public List<String> listSeller() {
		return daoBudgetOtherCostumers.listStringByFields("seller");
	}

	@Transactional(readOnly = true)
	public List<String> listConstruction() {
		return daoBudgetOtherCostumers.listStringByFields("construction");
	}

	@Transactional(readOnly = true)
	public List<String> listPartnerName() {
		return daoBudgetOtherCostumers.listStringByFields("partnerName");
	}

	@Transactional(readOnly = true)
	public List<String> listRifPartner() {
		return daoBudgetOtherCostumers.listStringByFields("rifPartner");
	}

	@Transactional(readOnly = true)
	public List<String> listNumber() {
		/* Chequear hacer esto mismo con un metodo mas generico */
		List<String> list = daoBudgetOtherCostumers.listStringByFields("number");
		List<String> list2 = new ArrayList<String>();
		for (String number : list) {
			list2.add(number);
		}
		return list2;
	}
}
