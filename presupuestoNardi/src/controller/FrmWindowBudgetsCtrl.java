package controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.zkoss.bind.BindUtils;
import org.zkoss.bind.annotation.BindingParam;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.ContextParam;
import org.zkoss.bind.annotation.ContextType;
import org.zkoss.bind.annotation.ExecutionArgParam;
import org.zkoss.bind.annotation.Init;
import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.select.Selectors;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.Window;

import database.Budget;

public class FrmWindowBudgetsCtrl {
	
	@Wire("#windowBudgets")
	private Window windowBudgets;
	
	private List<Budget> listBudget;
	private Budget selectedBudget;

	public Budget getSelectedBudget() {
		return selectedBudget;
	}

	public void setSelectedBudget(Budget selectedBudget) {
		this.selectedBudget = selectedBudget;
	}

	public List<Budget> getListBudget() {
		return listBudget;
	}

	public void setListBudget(List<Budget> listBudget) {
		this.listBudget = listBudget;
	}

	@Init
	public void init(@ExecutionArgParam("listBudget") List<Budget> listBudget, @ContextParam(ContextType.VIEW) Component view){
		this.listBudget = listBudget;
		Selectors.wireComponents(view, this, false);
	}
	
	@NotifyChange("selectedBudget")
	@Command
	public void sendBudget(@BindingParam("Budget") Budget budget){
		Map map = new HashMap();
		map.put("Budget", budget);
		windowBudgets.detach();
		BindUtils.postGlobalCommand(null, null, "selectedBudget", map);
	}
}
