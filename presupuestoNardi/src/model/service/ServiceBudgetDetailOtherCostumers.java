package model.service;


import java.util.List;

import model.dao.DaoBudgetDetailOtherCostumers;
import model.database.BudgetDetailOtherCostumers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ServiceBudgetDetailOtherCostumers {
	@Autowired
	private DaoBudgetDetailOtherCostumers daoBudgetDetailOtherCostumers;

	@Transactional
	public Boolean save(BudgetDetailOtherCostumers budgetDetailOtherCostumers) {
		if (budgetDetailOtherCostumers.getIdBudgetDetail() == 0)
			return daoBudgetDetailOtherCostumers.save(budgetDetailOtherCostumers);
		else
			return daoBudgetDetailOtherCostumers.update(budgetDetailOtherCostumers);
	}

	@Transactional(readOnly = true)
	public BudgetDetailOtherCostumers findById(int id) {
		return daoBudgetDetailOtherCostumers.findByField("idBudgetDetail", id);
	}

	@Transactional(readOnly = true)
	public List<BudgetDetailOtherCostumers> listByCodes(String code) {
		return daoBudgetDetailOtherCostumers.listByString("code", code);
	}

	@Transactional(readOnly = true)
	public List<BudgetDetailOtherCostumers> listByName(String name) {
		return daoBudgetDetailOtherCostumers.listByString("name", name);
	}
	

	@Transactional(readOnly = true)
	public List<String> listCodes() {
		return daoBudgetDetailOtherCostumers.listStringByFields("code");
	}

	@Transactional(readOnly = true)
	public List<String> listNames() {
		return daoBudgetDetailOtherCostumers.listStringByFields("name");
	}
	
	@Transactional(readOnly = true)
	public List<BudgetDetailOtherCostumers> listByNumber(String number) {
		return daoBudgetDetailOtherCostumers.listByField("number", number);
	}
}
