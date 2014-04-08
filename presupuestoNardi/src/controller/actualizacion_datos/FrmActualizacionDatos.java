package controller.actualizacion_datos;

import general.ValidateZK;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.database.BasicData;
import model.database.Budget;
import model.database.Quotation;
import model.service.ServiceBasicData;
import model.service.ServiceBudget;
import model.service.ServiceQuotation;
import model.service.ServiceSaleSummary;
import model.service.ServiceTransactionSummary;

import org.zkoss.bind.BindUtils;
import org.zkoss.bind.Validator;
import org.zkoss.bind.annotation.BindingParam;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.Init;
import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.zk.ui.select.annotation.WireVariable;
import org.zkoss.zk.ui.util.Clients;
import org.zkoss.zul.Datebox;
import org.zkoss.zul.Radiogroup;



public class FrmActualizacionDatos {
	
	@WireVariable
	private ServiceBasicData serviceBasicData;
	@WireVariable
	private ServiceQuotation serviceQuotation;
	@WireVariable
	private ServiceBudget serviceBudget;
	@WireVariable
	private ServiceSaleSummary serviceSaleSummary;
	@WireVariable
	private ServiceTransactionSummary serviceTransactionSummary;
	private final String seleccione = new String("--Seleccione--");
	

	private final String dash = new String("-");

	
	private Quotation quotation;
	private Budget budget;
	
	private Boolean disableBeforeSearch;
	private Boolean disabledPrint;
	private Boolean disabledEdit;
	private String modalMessage;
	private String printMessage;
	
	private Boolean disabledBudgetNumber;	
	public Boolean tipoPresupuesto;
	private BasicData basicData;
	private BasicData basicDataPayment;
	private BasicData basicDataPaymentForeign;
	private BasicData basicDataWarranty;
	private BasicData basicDataW;
	private BasicData basicDataExtendedWarranty;
	private BasicData basicDataDeliveryEstimate;
	private BasicData basicDataValidity;
	private BasicData basicDataTipoPresupuesto;
	
	private List<BasicData> listQuotationType;
	
	public BasicData getBasicDataW() {
		return basicDataW;
	}

	public void setBasicDataW(BasicData basicDataW) {
		this.basicDataW = basicDataW;
	}
	
	public String getSeleccione() {
		return seleccione;
	}

	public BasicData getBasicDataWarranty() {
		return basicDataWarranty;
	}
	public void setBasicDataWarranty(BasicData basicDataWarranty) {
		this.basicDataWarranty = basicDataWarranty;
	}
	public BasicData getBasicDataExtendedWarranty() {
		return basicDataExtendedWarranty;
	}
	public void setBasicDataExtendedWarranty(BasicData basicDataExtendedWarranty) {
		this.basicDataExtendedWarranty = basicDataExtendedWarranty;
	}
	public BasicData getBasicDataDeliveryEstimate() {
		return basicDataDeliveryEstimate;
	}
	public void setBasicDataDeliveryEstimate(BasicData basicDataDeliveryEstimate) {
		this.basicDataDeliveryEstimate = basicDataDeliveryEstimate;
	}
	public BasicData getBasicDataValidity() {
		return basicDataValidity;
	}
	public void setBasicDataValidity(BasicData basicDataValidity) {
		this.basicDataValidity = basicDataValidity;
	}
	public BasicData getBasicDataPayment() {
		return basicDataPayment;
	}
	public void setBasicDataPayment(BasicData basicDataPayment) {
		this.basicDataPayment = basicDataPayment;
	}
	public BasicData getBasicDataPaymentForeign() {
		return basicDataPaymentForeign;
	}
	public void setBasicDataPaymentForeign(BasicData basicDataPaymentForeign) {
		this.basicDataPaymentForeign = basicDataPaymentForeign;
	}
	public Boolean getTipoPresupuesto() {
		return tipoPresupuesto;
	}
	public BasicData getBasicDataTipoPresupuesto() {
		return basicDataTipoPresupuesto;
	}
	public void setBasicDataTipoPresupuesto(BasicData basicDataTipoPresupuesto) {
		this.basicDataTipoPresupuesto = basicDataTipoPresupuesto;
	}
	public void setTipoPresupuesto(Boolean tipoPresupuesto) {
		this.tipoPresupuesto = tipoPresupuesto;
	}

	
	public Quotation getQuotation() {
		return quotation;
	}
	public void setQuotation(Quotation quotation) {
		this.quotation = quotation;
	}
	public Budget getBudget() {
		return budget;
	}
	public void setBudget(Budget budget) {
		this.budget = budget;
	}
	public BasicData getBasicData() {
		return basicData;
	}
	public void setBasicData(BasicData basicData) {
		this.basicData = basicData;
	}
	public Boolean getDisableBeforeSearch() {
		return disableBeforeSearch;
	}
	public void setDisableBeforeSearch(Boolean disableBeforeSearch) {
		this.disableBeforeSearch = disableBeforeSearch;
	}
	public Boolean getDisabledPrint() {
		return disabledPrint;
	}
	public void setDisabledPrint(Boolean disabledPrint) {
		this.disabledPrint = disabledPrint;
	}
	public Boolean getDisabledEdit() {
		return disabledEdit;
	}
	public void setDisabledEdit(Boolean disabledEdit) {
		this.disabledEdit = disabledEdit;
	}
	public String getModalMessage() {
		return modalMessage;
	}
	public void setModalMessage(String modalMessage) {
		this.modalMessage = modalMessage;
	}
	public String getPrintMessage() {
		return printMessage;
	}
	public void setPrintMessage(String printMessage) {
		this.printMessage = printMessage;
	}
	
	public List<BasicData> getListQuotationType() {
		return listQuotationType;
	}
	public void setListQuotationType(List<BasicData> listQuotationType) {
		this.listQuotationType = listQuotationType;
	}
	public String getDash() {
		return dash;
	}
	
	public Boolean getDisabledBudgetNumber() {
		return disabledBudgetNumber;
	}

	public void setDisabledBudgetNumber(Boolean disabledBudgetNumber) {
		this.disabledBudgetNumber = disabledBudgetNumber;
	}

	public Validator getNoSelect() {
		return new ValidateZK().getNoSelect();
	}
	
	public ServiceBasicData getServiceBasicData() {
		return serviceBasicData;
	}
	public void setServiceBasicData(ServiceBasicData serviceBasicData) {
		this.serviceBasicData = serviceBasicData;
	}
	
	@Init
	public void init() {
		restartForm();
	}
	

	@NotifyChange("*")
	@Command
	public void restartForm() {
		
		
		basicData  = new BasicData();
		basicDataPayment = new BasicData();
		basicDataPaymentForeign = new BasicData();
		basicDataWarranty = new BasicData();
		basicDataExtendedWarranty = new BasicData();
		basicDataDeliveryEstimate = new BasicData();
		basicDataValidity = new BasicData();
		basicDataTipoPresupuesto = new BasicData();
		disableBeforeSearch = new Boolean(true);
		disabledPrint = new Boolean(true);
		disabledEdit = new Boolean(false);
		tipoPresupuesto = new Boolean(true);
		
		modalMessage = null;
		printMessage = null;
		
		
		listQuotationType = serviceBasicData.listQuotationTypeMoney();
	}
	
	@NotifyChange({"tipoPresupuesto", "basicDataTipoPresupuesto", "basicDataWarranty","basicDataExtendedWarranty", "basicDataDeliveryEstimate", "basicDataValidity", "basicData", "basicDataPayment", "basicDataPaymentForeign" })
	@Command
	public void loadPayment() {
	
		if (tipoPresupuesto.equals(true) && basicDataTipoPresupuesto.getName().contains("MONEDA NACIONAL")) {
		
			
			this.basicDataWarranty = serviceBasicData.findByWarrantyNNW();
			basicDataWarranty.setName(basicDataWarranty.getName());
			
			this.basicDataExtendedWarranty = serviceBasicData.findByWarrantyNNEW();
			basicDataExtendedWarranty.setName(basicDataExtendedWarranty.getName());
			
			this.basicDataDeliveryEstimate = serviceBasicData.findByWarrantyNNDE();
			basicDataDeliveryEstimate.setName(basicDataDeliveryEstimate.getName());
			
			this.basicDataValidity = serviceBasicData.findByWarrantyNNV();
			basicDataValidity.setName(basicDataValidity.getName());
			
			this.basicData = serviceBasicData.findByWarrantyNN();
			basicData.setName(basicData.getName()); 
			
			this.basicDataPayment = serviceBasicData.findByWarrantyNNP();
			basicDataPayment.setName(basicDataPayment.getName());
			
			
		}
			
		 else if (tipoPresupuesto.equals(false) && basicDataTipoPresupuesto.getName().contains("MONEDA NACIONAL")) {
			 
			
			this.basicDataWarranty = serviceBasicData.findByWarrantyNMW();
			basicDataWarranty.setName(basicDataWarranty.getName());
			
			this.basicDataExtendedWarranty = serviceBasicData.findByWarrantyNMEW();
			basicDataExtendedWarranty.setName(basicDataExtendedWarranty.getName());
			
			this.basicDataDeliveryEstimate = serviceBasicData.findByWarrantyNMDE();
			basicDataDeliveryEstimate.setName(basicDataDeliveryEstimate.getName());
			
			this.basicDataValidity = serviceBasicData.findByWarrantyNMV();
			basicDataValidity.setName(basicDataValidity.getName());
			
			this.basicData = serviceBasicData.findByWarrantyNM();
			basicData.setName(basicData.getName());
			
			this.basicDataPayment = serviceBasicData.findByWarrantyNMP();
			basicDataPayment.setName(basicDataPayment.getName());
			
			
		} else if (tipoPresupuesto.equals(true) && basicDataTipoPresupuesto.getName().contains("MONEDA EXTRANJERA")) {
			
			
			this.basicDataWarranty = serviceBasicData.findByWarrantyENW();
			basicDataWarranty.setName(basicDataWarranty.getName());
			
			this.basicDataExtendedWarranty = serviceBasicData.findByWarrantyENEW();
			basicDataExtendedWarranty.setName(basicDataExtendedWarranty.getName());
			
			this.basicDataDeliveryEstimate = serviceBasicData.findByWarrantyENDE();
			basicDataDeliveryEstimate.setName(basicDataDeliveryEstimate.getName());
			
			this.basicDataValidity = serviceBasicData.findByWarrantyENV();
			basicDataValidity.setName(basicDataValidity.getName());
			
			this.basicData = serviceBasicData.findByWarrantyEN();
			basicData.setName(basicData.getName()); 
			
			this.basicDataPayment = serviceBasicData.findByWarrantyENP();
			basicDataPayment.setName(basicDataPayment.getName());
			
			this.basicDataPaymentForeign = serviceBasicData.findByWarrantyENPF();
			basicDataPaymentForeign.setName(basicDataPaymentForeign.getName());
			
		} else if (tipoPresupuesto.equals(false) && basicDataTipoPresupuesto.getName().contains("MONEDA EXTRANJERA")) {
			
			
			this.basicDataWarranty = serviceBasicData.findByWarrantyEMW();
			basicDataWarranty.setName(basicDataWarranty.getName());
			
			this.basicDataExtendedWarranty = serviceBasicData.findByWarrantyEMEW();
			basicDataExtendedWarranty.setName(basicDataExtendedWarranty.getName());
			
			this.basicDataDeliveryEstimate = serviceBasicData.findByWarrantyEMDE();
			basicDataDeliveryEstimate.setName(basicDataDeliveryEstimate.getName());
			
			this.basicDataValidity = serviceBasicData.findByWarrantyEMV();
			basicDataValidity.setName(basicDataValidity.getName());
			
			this.basicData = serviceBasicData.findByWarrantyEM();
			basicData.setName(basicData.getName());
			
			this.basicDataPayment = serviceBasicData.findByWarrantyEMP();
			basicDataPayment.setName(basicDataPayment.getName());
			
			this.basicDataPaymentForeign = serviceBasicData.findByWarrantyEMPF();
			basicDataPaymentForeign.setName(basicDataPaymentForeign.getName());
		}
		
	}
	
	@NotifyChange("*")
	@Command
	public void save() {
		if (basicDataTipoPresupuesto.getName().contains("MONEDA NACIONAL")) 
		{
			System.out.println("nacional");
			if (!(serviceBasicData.save(basicData) && serviceBasicData.save(basicDataPayment) && serviceBasicData.save(basicDataWarranty) && serviceBasicData.save(basicDataExtendedWarranty) && serviceBasicData.save(basicDataDeliveryEstimate) && serviceBasicData.save(basicDataValidity))) {
			Clients.showNotification("No se pudo guardar los cambios", "error", null, "bottom_center", 2000);
			return;			
			}
			
			else{
				//(serviceBasicData.save(basicData) && serviceBasicData.save(basicDataPayment) && serviceBasicData.save(basicDataPaymentForeign) && serviceBasicData.save(basicDataWarranty) && serviceBasicData.save(basicDataExtendedWarranty) && serviceBasicData.save(basicDataDeliveryEstimate) && serviceBasicData.save(basicDataValidity))
				Clients.showNotification("Cambios guardados", "info", null, "bottom_center", 2000);
				//selectPrintTemplate();
		
				restartForm();}
		
		}
		
		else if (basicDataTipoPresupuesto.getName().contains("MONEDA EXTRANJERA")) 
		{
			System.out.println("extranjera");
			if (!(serviceBasicData.save(basicData) && serviceBasicData.save(basicDataPayment) && serviceBasicData.save(basicDataPaymentForeign) && serviceBasicData.save(basicDataWarranty) && serviceBasicData.save(basicDataExtendedWarranty) && serviceBasicData.save(basicDataDeliveryEstimate) && serviceBasicData.save(basicDataValidity))) {
			Clients.showNotification("No se pudo guardar los cambios", "error", null, "bottom_center", 2000);
			return;			
			}
			
			else{
				//(serviceBasicData.save(basicData) && serviceBasicData.save(basicDataPayment) && serviceBasicData.save(basicDataPaymentForeign) && serviceBasicData.save(basicDataWarranty) && serviceBasicData.save(basicDataExtendedWarranty) && serviceBasicData.save(basicDataDeliveryEstimate) && serviceBasicData.save(basicDataValidity))
				Clients.showNotification("Cambios guardados", "info", null, "bottom_center", 2000);
				//selectPrintTemplate();
		
				restartForm();}
		
		}
	
	}

	@NotifyChange("modalMessage")
	@Command
	public void confirmSave(@BindingParam("radioGroup") Radiogroup radiogroup, @BindingParam("datebox") Datebox datebox) {
		modalMessage = "El proceso de guardado es irreversible. ¿Esta seguro de guardar el presupuesto?";
		//selectStatus(radiogroup);
	}
	
	

	@NotifyChange("*")
	@Command
	public void cancelModal() {
		if (modalMessage != null)
			modalMessage = null;
		if (printMessage != null) {
			printMessage = null;
			restartForm();
		}
	}

	@NotifyChange({ "disabledEdit" })
	@Command
	public void edit() {
		disabledEdit = new Boolean(false);
	}

	@Command
	public void close() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("page", "");
		BindUtils.postGlobalCommand(null, null, "selectedPage", map);
	}

}
