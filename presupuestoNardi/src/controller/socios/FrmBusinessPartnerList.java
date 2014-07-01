package controller.socios;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.database.BusinessPartner;
import model.service.ServiceBusinessPartner;

import org.zkoss.bind.BindUtils;
import org.zkoss.bind.annotation.BindingParam;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.Init;
import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.select.annotation.WireVariable;

public class FrmBusinessPartnerList {

	@WireVariable
	private ServiceBusinessPartner serviceBusinessPartner;
	
	
	private List<BusinessPartner> listBusinessPartner;
	private BusinessPartner selectedBP;
	private BusinessPartnerFilter partnerFilter;

	public BusinessPartnerFilter getPartnerFilter() {
		return partnerFilter;
	}

	public void setPartnerFilter(BusinessPartnerFilter partnerFilter) {
		this.partnerFilter = partnerFilter;
	}

	public BusinessPartner getSelectedBP() {
		return selectedBP;
	}

	public void setSelectedBP(BusinessPartner selectedBP) {
		this.selectedBP = selectedBP;
	}

	public List<BusinessPartner> getListBusinessPartner() {
		return listBusinessPartner;
	}

	public void setListBusinessPartner(List<BusinessPartner> listBusinessPartner) {
		this.listBusinessPartner = listBusinessPartner;
	}

	@Init
	public void init() {
		restartForm();
	}

	@NotifyChange("*")
	@Command
	public void restartForm() {
		listBusinessPartner = serviceBusinessPartner.listAll();
		selectedBP = new BusinessPartner();
		partnerFilter = new BusinessPartnerFilter();
	}

	@NotifyChange({ "selectedBP" })
	@Command
	public void viewFrmBusinessPartner(@BindingParam("newPartner") Boolean newPartner) {
		if (newPartner)
			selectedBP = null;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("businessPartner", selectedBP);
		Executions.createComponents("system/socios/frmBusinessPartner.zul", null, map);
	}

	public String getRif(BusinessPartner bp) {
		BusinessPartner auxBP = serviceBusinessPartner.findById(bp.getIdBusinessPartner());
		return auxBP.getBasicData().getName() + "-" + auxBP.getRif();
	}

	@Command
	public void close() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("page", "");
		BindUtils.postGlobalCommand(null, null, "selectedPage", map);
	}

	@NotifyChange({ "listBusinessPartner" })
	@Command
	public void dataFilter() {
		listBusinessPartner = partnerFilter.getFilter(partnerFilter);
	}
}