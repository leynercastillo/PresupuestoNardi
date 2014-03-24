package controller.ventas.resumen_negociacion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import general.GenericReport;
import general.SimpleListModelCustom;
import general.ValidateZK;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import model.database.Quotation;
import model.database.TransactionSummary;
import model.service.ServiceQuotation;
import model.service.ServiceTransactionSummary;

import org.zkoss.bind.BindUtils;
import org.zkoss.bind.Validator;
import org.zkoss.bind.annotation.BindingParam;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.GlobalCommand;
import org.zkoss.bind.annotation.Init;
import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.select.annotation.WireVariable;
import org.zkoss.zk.ui.util.Clients;
import org.zkoss.zul.ListModel;
import org.zkoss.zul.ListModelList;

@Entity
public class FrmTransactionSummary {

	@ManyToOne
	@WireVariable
	private ServiceQuotation serviceQuotation;
	@ManyToOne
	@WireVariable
	private ServiceTransactionSummary serviceTransactionSummary;
	@ManyToOne
	private TransactionSummary transactionSummary;
	private Boolean disableAll;
	private ListModel<Object> listRif;
	private ListModel<Object> listQuotationNumber;
	private ListModel<Object> listPartnerName;
	private ListModel<Object> listBudgetNumber;
	private ListModel<Object> listConstruction;
	private ListModel<Object> listSeller;

	public ListModel<Object> getListSeller() {
		return listSeller;
	}

	public void setListSeller(ListModel<Object> listSeller) {
		this.listSeller = listSeller;
	}

	public ListModel<Object> getListConstruction() {
		return listConstruction;
	}

	public void setListConstruction(ListModel<Object> listConstruction) {
		this.listConstruction = listConstruction;
	}

	public ListModel<Object> getListBudgetNumber() {
		return listBudgetNumber;
	}

	public void setListBudgetNumber(ListModel<Object> listBudgetNumber) {
		this.listBudgetNumber = listBudgetNumber;
	}

	public ListModel<Object> getListPartnerName() {
		return listPartnerName;
	}

	public void setListPartnerName(ListModel<Object> listPartnerName) {
		this.listPartnerName = listPartnerName;
	}

	public ListModel<Object> getListQuotationNumber() {
		return listQuotationNumber;
	}

	public void setListQuotationNumber(ListModel<Object> listQuotationNumber) {
		this.listQuotationNumber = listQuotationNumber;
	}

	public ListModel<Object> getListRif() {
		return listRif;
	}

	public void setListRif(ListModel<Object> listRif) {
		this.listRif = listRif;
	}

	public Boolean getDisableAll() {
		return disableAll;
	}

	public void setDisableAll(Boolean disableAll) {
		this.disableAll = disableAll;
	}

	public TransactionSummary getTransactionSummary() {
		return transactionSummary;
	}

	public void setTransactionSummary(TransactionSummary transactionSummary) {
		this.transactionSummary = transactionSummary;
	}

	public Validator getNoEmpty() {
		return new ValidateZK().getNoEmpty();
	}

	public String getElevatorType(String str) {
		return (this.transactionSummary.getQuotation().getElevatorQuantity() > 1 ? "ASCENSORES " : "ASCENSOR ") + str;
	}

	@Init
	public void init() {
		restartForm();
	}

	@NotifyChange("*")
	@Command
	public void restartForm() {
		transactionSummary = new TransactionSummary();
		transactionSummary.setStatus('A');
		disableAll = true;
		listRif = new ListModelList<Object>();
		listQuotationNumber = new ListModelList<Object>();
		listPartnerName = new ListModelList<Object>();
		listBudgetNumber = new ListModelList<Object>();
		listConstruction = new ListModelList<Object>();
		listSeller = new ListModelList<Object>();
	}

	@NotifyChange({ "listRif", "listQuotationNumber", "listPartnerName", "listBudgetNumber", "listConstruction", "listSeller" })
	@Command
	public void searchQuotationByField(@BindingParam("field") String field) {
		if (field.contains("rif")) {
			listRif = new SimpleListModelCustom<Object>(serviceQuotation.listRifPartner());
		} else if (field.contains("quotationNumber")) {
			List<String> list = serviceQuotation.listNewNumber();
			list.addAll(serviceQuotation.listModernizationNumber());
			listQuotationNumber = new SimpleListModelCustom<Object>(list);
		} else if (field.contains("partnerName")) {
			listPartnerName = new SimpleListModelCustom<Object>(serviceQuotation.listPartnerName());
		} else if (field.contains("budgetNumber")) {
			listBudgetNumber = new SimpleListModelCustom<Object>(serviceQuotation.listBudgetNumber());
		} else if (field.contains("construction")) {
			listConstruction = new SimpleListModelCustom<Object>(serviceQuotation.listConstruction());
		} else if (field.contains("seller")) {
			listSeller = new SimpleListModelCustom<Object>(serviceQuotation.listSeller());
		}
	}

	@NotifyChange({ "transactionSummary", "disableAll" })
	@Command
	public void loadQuotationByField(@BindingParam("field") String field, @BindingParam("val") String value) {
		List<Quotation> listQuotations = new ArrayList<Quotation>();
		if (field.contains("rif")) {
			listQuotations = serviceQuotation.listByRifPartner(value);
		} else if (field.compareTo("budgetNumber") == 0) {
			if (value.isEmpty())
				value = "0";
			for (int i = 0; i < value.length(); i++) {
				if (!Character.isDigit(value.charAt(i))) {
					value = "0";
					break;
				}
			}
			listQuotations = serviceQuotation.listByBudget(Integer.parseInt(value));
		} else if (field.contains("quotationNumber")) {
			if (value.isEmpty())
				value = "0";
			for (int i = 0; i < value.length(); i++) {
				if (!Character.isDigit(value.charAt(i))) {
					value = "0";
					break;
				}
			}
			listQuotations = serviceQuotation.listByNewNumber(Integer.parseInt(value));
			listQuotations.addAll(serviceQuotation.listByModernizationNumber(Integer.parseInt(value)));
		} else if (field.compareTo("partnerName") == 0) {
			listQuotations = serviceQuotation.listByPartnerName(value);
		} else if (field.compareTo("construction") == 0) {
			listQuotations = serviceQuotation.listByConstruction(value);
		} else if (field.compareTo("seller") == 0) {
			listQuotations = serviceQuotation.listBySeller(value);
		}
		int listSize = listQuotations.size();
		if (listSize == 1) {
			this.transactionSummary = serviceTransactionSummary.findByQuotation(listQuotations.get(0));
			if (this.transactionSummary == null) {
				this.transactionSummary = new TransactionSummary();
				this.transactionSummary.setStatus('A');
				this.transactionSummary.setQuotation(listQuotations.get(0));
			}
			disableAll = false;
		} else if (listSize == 0) {
			Clients.showNotification("Ningun registro coincide", "info", null, "top_center", 2000);
		} else {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("listQuotations", listQuotations);
			Executions.createComponents("system/ventas/presupuesto/frmWindowQuotations.zul", null, map);
		}
	}

	@NotifyChange({ "transactionSummary", "disableAll" })
	@GlobalCommand
	public void selectedQuotation(@BindingParam("quotation") Quotation quotation) {
		this.transactionSummary = serviceTransactionSummary.findByQuotation(quotation);
		if (this.transactionSummary == null) {
			this.transactionSummary = new TransactionSummary();
			this.transactionSummary.setStatus('A');
			this.transactionSummary.setQuotation(serviceQuotation.findById(quotation.getIdQuotation()));
		}
		disableAll = false;
	}

	@Command
	public void close() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("page", "");
		BindUtils.postGlobalCommand(null, null, "selectedPage", map);
	}

	@NotifyChange("*")
	@Command
	public void save() {
		if (!serviceTransactionSummary.save(transactionSummary)) {
			Clients.showNotification("No se pudo guardar el presupuesto", "error", null, "bottom_center", 2000);
			return;
		}
		Clients.showNotification("Resumen de negociacion guardado", "info", null, "bottom_center", 2000);
		restartForm();
	}

	@Command
	public void print() {
		GenericReport report = new GenericReport();
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("IMAGES_DIR", "../../resource/images/system/reports/");
		parameters.put("ID", this.transactionSummary.getIdTransactionSummary());
		report.createPdf("/resource/reports/ventas/resumen_negociacion", "transaction_summary.jasper", parameters, "resumen_negociacion" + this.transactionSummary.getIdTransactionSummary() + ".pdf");
		report.viewPdf("/resource/reports/ventas/resumen_negociacion/resumen_negociacion" + this.transactionSummary.getIdTransactionSummary() + ".pdf", "Resumen de negociacion");
	}
}