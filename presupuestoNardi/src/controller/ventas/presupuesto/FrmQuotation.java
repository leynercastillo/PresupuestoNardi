package controller.ventas.presupuesto;

import general.ValidateZK;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRExporter;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.engine.util.JRLoader;

import org.hibernate.HibernateException;
import org.zkoss.bind.BindUtils;
import org.zkoss.bind.ValidationContext;
import org.zkoss.bind.Validator;
import org.zkoss.bind.annotation.BindingParam;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.GlobalCommand;
import org.zkoss.bind.annotation.Init;
import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.bind.validator.AbstractValidator;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.Sessions;
import org.zkoss.zk.ui.WrongValueException;
import org.zkoss.zk.ui.select.annotation.WireVariable;
import org.zkoss.zk.ui.util.Clients;
import org.zkoss.zul.ListModel;
import org.zkoss.zul.ListModelList;
import org.zkoss.zul.Radiogroup;
import org.zkoss.zul.SimpleListModel;
import org.zkoss.zul.Window;
import org.zkoss.zul.impl.InputElement;

import dao.DaoBasicdata;
import dao.DaoBudget;
import dao.DaoQuotation;
import database.BasicData;
import database.Budget;
import database.Quotation;

public class FrmQuotation {

    @WireVariable
    private DaoBasicdata daoBasicdata;
    @WireVariable
    private DaoQuotation daoQuotation;
    @WireVariable
    private DaoBudget daoBudget;

    private final String seleccione = new String("--Seleccione--");
    private final String dash = new String("-");
    private Properties properties;

    private Quotation quotation;
    private Budget budget;
    private Boolean disableBeforeSearch;
    private Boolean disabledBudgetNumber;
    private Boolean disabledPrint;
    private Boolean disabledEdit;
    private BasicData cabinModel;
    private List<BasicData> listRifType;
    private List<BasicData> listElevatorType;
    private List<BasicData> listElevatorCapa;
    private List<BasicData> listSpeed;
    private List<BasicData> listManeuverType;
    private List<BasicData> listBoothDisplay;
    private List<BasicData> listFloorDisplay;
    private List<BasicData> listHallButtonType;
    private List<BasicData> listHallButton;
    private List<BasicData> listMachineType;
    private List<BasicData> listElectricityType;
    private List<BasicData> listCabinModel;
    private List<BasicData> listDesign;
    private List<BasicData> listRailing;
    private List<BasicData> listFloorType;
    private List<BasicData> listDoorType;
    private List<BasicData> listFreeAdmission;
    private List<BasicData> listHeight;
    private List<BasicData> listDoorframeHammered;
    private List<BasicData> listControlType;
    private List<BasicData> listRoofType;
    private ListModel<String> listQuotationNumber;
    private ListModel<String> listRifPartner;
    private ListModel<String> listBudgetNumber;
    private ListModel<String> listPartnerName;
    private ListModel<String> listConstruction;
    private ListModel<String> listSeller;

    public Boolean getDisabledEdit() {
	return disabledEdit;
    }

    public void setDisabledEdit(Boolean disabledEdit) {
	this.disabledEdit = disabledEdit;
    }

    public List<BasicData> getListRoofType() {
	return listRoofType;
    }

    public void setListRoofType(List<BasicData> listRoofType) {
	this.listRoofType = listRoofType;
    }

    public Boolean getDisabledPrint() {
	return disabledPrint;
    }

    public void setDisabledPrint(Boolean disabledPrint) {
	this.disabledPrint = disabledPrint;
    }

    public ListModel<String> getListSeller() {
	return listSeller;
    }

    public void setListSeller(ListModel<String> listSeller) {
	this.listSeller = listSeller;
    }

    public ListModel<String> getListConstruction() {
	return listConstruction;
    }

    public void setListConstruction(ListModel<String> listConstruction) {
	this.listConstruction = listConstruction;
    }

    public ListModel<String> getListPartnerName() {
	return listPartnerName;
    }

    public void setListPartnerName(ListModel<String> listPartnerName) {
	this.listPartnerName = listPartnerName;
    }

    public ListModel<String> getListBudgetNumber() {
	return listBudgetNumber;
    }

    public void setListBudgetNumber(ListModel<String> listBudgetNumber) {
	this.listBudgetNumber = listBudgetNumber;
    }

    public ListModel<String> getListRifPartner() {
	return listRifPartner;
    }

    public void setListRifPartner(ListModel<String> listRifPartner) {
	this.listRifPartner = listRifPartner;
    }

    public Boolean getDisabledBudgetNumber() {
	return disabledBudgetNumber;
    }

    public void setDisabledBudgetNumber(Boolean disabledBudgetNumber) {
	this.disabledBudgetNumber = disabledBudgetNumber;
    }

    public List<BasicData> getListControlType() {
	return listControlType;
    }

    public void setListControlType(List<BasicData> listControlType) {
	this.listControlType = listControlType;
    }

    public List<BasicData> getListDoorframeHammered() {
	return listDoorframeHammered;
    }

    public void setListDoorframeHammered(List<BasicData> listDoorframeHammered) {
	this.listDoorframeHammered = listDoorframeHammered;
    }

    public List<BasicData> getListHeight() {
	return listHeight;
    }

    public void setListHeight(List<BasicData> listHeight) {
	this.listHeight = listHeight;
    }

    public List<BasicData> getListFreeAdmission() {
	return listFreeAdmission;
    }

    public void setListFreeAdmission(List<BasicData> listFreeAdmission) {
	this.listFreeAdmission = listFreeAdmission;
    }

    public List<BasicData> getListDoorType() {
	return listDoorType;
    }

    public void setListDoorType(List<BasicData> listDoorType) {
	this.listDoorType = listDoorType;
    }

    public List<BasicData> getListRailing() {
	return listRailing;
    }

    public void setListRailing(List<BasicData> listRailing) {
	this.listRailing = listRailing;
    }

    public List<BasicData> getListFloorType() {
	return listFloorType;
    }

    public void setListFloorType(List<BasicData> listFloorType) {
	this.listFloorType = listFloorType;
    }

    public List<BasicData> getListDesign() {
	return listDesign;
    }

    public void setListDesign(List<BasicData> listDesign) {
	this.listDesign = listDesign;
    }

    public List<BasicData> getListCabinModel() {
	return listCabinModel;
    }

    public void setListCabinModel(List<BasicData> listCabinModel) {
	this.listCabinModel = listCabinModel;
    }

    public BasicData getCabinModel() {
	return cabinModel;
    }

    public void setCabinModel(BasicData cabinModel) {
	this.cabinModel = cabinModel;
    }

    public List<BasicData> getListElectricityType() {
	return listElectricityType;
    }

    public void setListElectricityType(List<BasicData> listElectricityType) {
	this.listElectricityType = listElectricityType;
    }

    public List<BasicData> getListMachineType() {
	return listMachineType;
    }

    public void setListMachineType(List<BasicData> listMachineType) {
	this.listMachineType = listMachineType;
    }

    public List<BasicData> getListHallButton() {
	return listHallButton;
    }

    public void setListHallButton(List<BasicData> listHallButton) {
	this.listHallButton = listHallButton;
    }

    public List<BasicData> getListHallButtonType() {
	return listHallButtonType;
    }

    public void setListHallButtonType(List<BasicData> listHallButtonType) {
	this.listHallButtonType = listHallButtonType;
    }

    public List<BasicData> getListFloorDisplay() {
	return listFloorDisplay;
    }

    public void setListFloorDisplay(List<BasicData> listFloorDisplay) {
	this.listFloorDisplay = listFloorDisplay;
    }

    public List<BasicData> getListBoothDisplay() {
	return listBoothDisplay;
    }

    public void setListBoothDisplay(List<BasicData> listBoothDisplay) {
	this.listBoothDisplay = listBoothDisplay;
    }

    public List<BasicData> getListManeuverType() {
	return listManeuverType;
    }

    public void setListManeuverType(List<BasicData> listManeuverType) {
	this.listManeuverType = listManeuverType;
    }

    public List<BasicData> getListSpeed() {
	return listSpeed;
    }

    public void setListSpeed(List<BasicData> listSpeed) {
	this.listSpeed = listSpeed;
    }

    public List<BasicData> getListElevatorCapa() {
	return listElevatorCapa;
    }

    public void setListElevatorCapa(List<BasicData> listElevatorCapa) {
	this.listElevatorCapa = listElevatorCapa;
    }

    public String getDash() {
	return dash;
    }

    public String getSeleccione() {
	return seleccione;
    }

    public ListModel<String> getListQuotationNumber() {
	return listQuotationNumber;
    }

    public void setListQuotationNumber(ListModel<String> listQuotationNumber) {
	this.listQuotationNumber = listQuotationNumber;
    }

    public Boolean getDisableBeforeSearch() {
	return disableBeforeSearch;
    }

    public void setDisableBeforeSearch(Boolean disableBeforeSearch) {
	this.disableBeforeSearch = disableBeforeSearch;
    }

    public Quotation getQuotation() {
	return quotation;
    }

    public void setQuotation(Quotation quotation) {
	this.quotation = quotation;
    }

    public List<BasicData> getListRifType() {
	return listRifType;
    }

    public void setListRifType(List<BasicData> listRifType) {
	this.listRifType = listRifType;
    }

    public List<BasicData> getListElevatorType() {
	return listElevatorType;
    }

    public void setListElevatorType(List<BasicData> listElevatorType) {
	this.listElevatorType = listElevatorType;
    }

    public Validator getNoDash() {
	return new ValidateZK().getNoDash();
    }

    public Validator getNoEmpty() {
	return new ValidateZK().getNoEmpty();
    }

    public Validator getNoZero() {
	return new ValidateZK().getNoZero();
    }

    public Validator getNoEmptyForFormica() {
	return new AbstractValidator() {
	    @Override
	    public void validate(ValidationContext ctx) {
		InputElement inputElement = (InputElement) ctx.getBindContext().getValidatorArg("component");
		String str = inputElement.getText();
		if (quotation.getBasicDataByCabinDesign() != null && quotation.getBasicDataByCabinDesign().getName().indexOf("FORMICA") != -1 && str.trim().isEmpty())
		    throw new WrongValueException(inputElement, "Debe ingresar una descripción para fórmica.");
		if (quotation.getBasicDataByFloorType() != null && quotation.getBasicDataByFloorType().getName().indexOf("OTROS") != -1 && str.trim().isEmpty())
		    throw new WrongValueException(inputElement, "Debe ingresar una descripción acabados de piso OTROS.");
	    }
	};
    }

    public Validator getNoElevatorQuantity() {
	return new AbstractValidator() {
	    @Override
	    public void validate(ValidationContext ctx) {
		InputElement inputElement = (InputElement) ctx.getBindContext().getValidatorArg("component");
		Integer quantity = Integer.parseInt(inputElement.getText());
		if (quotation.isType() && (quantity < 1))
		    throw new WrongValueException(inputElement, "Debe ingresar al menos un ascensor.");
	    }
	};
    }

    public Validator getWasApproved() {
	return new AbstractValidator() {
	    @Override
	    public void validate(ValidationContext ctx) {
		Radiogroup radiogroup = (Radiogroup) ctx.getBindContext().getValidatorArg("component");
		if (radiogroup.getSelectedItem().getValue().charAt(0) == 'A') {
		    List<Quotation> list = daoQuotation.listByInt("budgetNumber", quotation.getBudgetNumber());
		    for (Quotation q : list) {
			if (q.getStatus() == 'A') {
			    quotation.setStatus('E');
			    BindUtils.postNotifyChange(null, null, quotation, "status");
			    throw new WrongValueException(radiogroup, "Esta solicitud ya tiene presupuesto aprobado.");
			}
		    }
		}
	    }
	};
    }

    @Init
    public void init() {
	properties = new Properties();
	try {
	    properties.load(new FileInputStream(Sessions.getCurrent().getWebApp().getRealPath("/resource/config/numeration.properties")));
	} catch (IOException e) {
	    System.out.println("The properties wasn't loaded.");
	}
	restartForm();
    }

    @NotifyChange("*")
    @Command
    public void restartForm() {
	quotation = new Quotation();
	quotation.setRifType(new Character('Z'));
	quotation.setDate(new Date());
	quotation.setType(true);
	quotation.setStopSequenceContinuous(false);
	quotation.setStopSequenceEven(false);
	quotation.setStopSequenceOdd(false);
	quotation.setType(true);
	quotation.setDesignSpecial(false);
	quotation.setDoorFrameStainless(false);
	quotation.setStatus('E');
	quotation.setLightCurtain(false);
	quotation.setLoadLimiter(false);
	quotation.setSpeechSynthesizer(false);
	quotation.setGomSystem(false);
	quotation.setIntercom(false);
	quotation.setPhone(false);
	quotation.setAccessSytem(false);
	quotation.setFirefighterKeychain(false);
	quotation.setTotalPrice(0);
	quotation.setVersionNumber(new Short("1"));
	/* Numero improbable */
	updateQuotationNumber(-1);
	budget = new Budget();
	cabinModel = new BasicData();
	disableBeforeSearch = new Boolean(true);
	disabledBudgetNumber = new Boolean(false);
	disabledPrint = new Boolean(true);
	disabledEdit = new Boolean(true);
	listQuotationNumber = new ListModelList<String>();
	listRifPartner = new ListModelList<String>();
	listBudgetNumber = new ListModelList<String>();
	listPartnerName = new ListModelList<String>();
	listConstruction = new ListModelList<String>();
	listSeller = new ListModelList<String>();
	listDesign = new ArrayList<BasicData>();
	listRifType = daoBasicdata.listByField("BUSINESS PARTNER", "RIF TYPE");
	listRoofType = daoBasicdata.listByField("", "");
	listElevatorCapa = daoBasicdata.listByField("BUDGET", "ELEVATOR CAPACITANCE");
	listSpeed = daoBasicdata.listByField("BUDGET", "SPEED");
	listManeuverType = daoBasicdata.listByField("BUDGET", "MANEUVER TYPE");
	listHallButton = daoBasicdata.listByField("BUDGET", "HALL BUTTON");
	listMachineType = daoBasicdata.listByField("BUDGET", "MACHINE TYPE");
	listElectricityType = daoBasicdata.listByField("BUDGET", "ELECTRICITY TYPE");
	listCabinModel = daoBasicdata.listByField("BUDGET", "CABIN MODEL");
	listRailing = daoBasicdata.listByField("BUDGET", "RAILING");
	listFloorType = daoBasicdata.listByField("BUDGET", "FLOOR TYPE");
	listDoorType = daoBasicdata.listByField("BUDGET", "DOOR TYPE");
	listFreeAdmission = daoBasicdata.listByField("BUDGET", "FREE ADMISSION");
	listHeight = daoBasicdata.listByField("BUDGET", "HEIGHT");
	listDoorframeHammered = daoBasicdata.listByField("BUDGET", "DOOR FRAME HAMMERED");
	listElevatorType = daoBasicdata.listByField("BUDGET", "ELEVATOR TYPE");
	listHallButtonType = daoBasicdata.listByField("BUDGET", "HALL BUTTON TYPE");
	listControlType = daoBasicdata.listByField("BUDGET", "CONTROL TYPE");
	listBoothDisplay = new ArrayList<BasicData>();
	listFloorDisplay = new ArrayList<BasicData>();
    }

    public void budgetToQuotation(Budget budget) {
	quotation.setBudget(budget);
	quotation.setBusinessPartner(budget.getBusinessPartner());
	quotation.setRifType(budget.getRifType());
	quotation.setRifPartner(budget.getRifPartner());
	quotation.setBudgetNumber(budget.getIdBudget());
	quotation.setPartnerName(budget.getPartnerName());
	quotation.setConstruction(budget.getConstruction());
	quotation.setContactName(budget.getContactName());
	quotation.setSeller(budget.getSeller());
	quotation.setType(budget.isType());
	quotation.setElevatorQuantity(budget.getElevatorQuantity());
	quotation.setBasicDataByElevatorType(budget.getBasicDataByElevatorType());
	quotation.setBasicDataByElevatorCapacitance(budget.getBasicDataByElevatorCapacitance());
	quotation.setTour(budget.getTour());
	quotation.setBasicDataBySpeed(budget.getBasicDataBySpeed());
	quotation.setStopNumber(budget.getStopNumber());
	quotation.setStopSequenceContinuous(budget.getStopSequenceContinuous());
	quotation.setStopSequenceContinuousNumber(budget.getStopSequenceContinuousNumber());
	quotation.setStopSequenceContinuousQ(budget.getStopSequenceContinuousQ());
	quotation.setStopSequenceEven(budget.getStopSequenceEven());
	quotation.setStopSequenceEvenNumber(budget.getStopSequenceEvenNumber());
	quotation.setStopSequenceEvenQ(budget.getStopSequenceEvenQ());
	quotation.setStopSequenceOdd(budget.getStopSequenceOdd());
	quotation.setStopSequenceOddNumber(budget.getStopSequenceOddNumber());
	quotation.setStopSequenceOddQ(budget.getStopSequenceOddQ());
	quotation.setBasicDataByManeuverType(budget.getBasicDataByManeuverType());
	quotation.setBasicDataByControlType(budget.getBasicDataByControlType());
	quotation.setBasicDataByHallButtonType(budget.getBasicDataByHallButtonType());
	quotation.setBasicDataByHallButton(budget.getBasicDataByHallButton());
	quotation.setBasicDataByMachineType(budget.getBasicDataByMachineType());
	quotation.setBasicDataByElectricityType(budget.getBasicDataByElectricityType());
	quotation.setWidthHole(budget.getWidthHole());
	quotation.setBottomHole(budget.getBottomHole());
	quotation.setOnTour(budget.getOnTour());
	quotation.setFossa(budget.getFossa());
	quotation.setBasicDataByCabinDesign(budget.getBasicDataByCabinDesign());
	quotation.setDesignSpecial(budget.getDesignSpecial());
	quotation.setDesignSpecialComment(budget.getDesignSpecialComment());
	quotation.setBasicDataByRailing(budget.getBasicDataByRailing());
	quotation.setBasicDataByFloorType(budget.getBasicDataByFloorType());
	quotation.setBasicDataByDoorType(budget.getBasicDataByDoorType());
	quotation.setBasicDataByFreeAdmission(budget.getBasicDataByFreeAdmission());
	quotation.setBasicDataByHeight(budget.getBasicDataByHeight());
	quotation.setDoorFrameStainless(budget.getDoorFrameStainless());
	quotation.setDoorFrameStainlessDescrip(budget.getDoorFrameStainlessDescrip());
	quotation.setBasicDataByDoorFrameHammered(budget.getBasicDataByDoorFrameHammered());
	quotation.setDoorFrameHammeredDesc(budget.getDoorFrameHammeredDesc());
	loadBoothFloorDisplay();
	quotation.setBasicDataByBoothDisplay(budget.getBasicDataByBoothDisplay());
	quotation.setBasicDataByFloorDisplay(budget.getBasicDataByFloorDisplay());
	quotation.setLightCurtain(budget.getLightCurtain());
	quotation.setLoadLimiter(budget.getLoadLimiter());
	quotation.setSpeechSynthesizer(budget.getSpeechSynthesizer());
	quotation.setGomSystem(budget.getGomSystem());
	quotation.setIntercom(budget.getIntercom());
	quotation.setPhone(budget.getPhone());
	quotation.setAccessSytem(budget.getAccessSytem());
	quotation.setFirefighterKeychain(budget.getFirefighterKeychain());
	quotation.setComment(budget.getComment());
    }

    @Command
    public void updateQuotationNumber(Integer num) {
	List<Quotation> lisQuotations = daoQuotation.listByInt("budgetNumber", num);
	if (lisQuotations.size() == 0)
	    if (quotation.isType()) {
		Integer number = daoQuotation.getMaxNumber("newNumber");
		quotation.setNewNumber(number + 1);
	    } else {
		Integer number = daoQuotation.getMaxNumber("modernizationNumber");
		quotation.setModernizationNumber(number + 1);
		BindUtils.postNotifyChange(null, null, quotation, "modernizationNumber");
	    }
	else {
	    quotation.setNewNumber(lisQuotations.get(0).getNewNumber());
	    quotation.setModernizationNumber(lisQuotations.get(0).getModernizationNumber());
	}
    }

    @NotifyChange({ "disableBeforeSearch", "cabinModel", "quotation", "listBoothDisplay", "listFloorDisplay", "listDesign", "disabledBudgetNumber", "disabledEdit" })
    @Command
    public void loadBudgetId(@BindingParam("val") String value) {
	for (int i = 0; i < value.length(); i++) {
	    if (!Character.isDigit(value.charAt(i))) {
		value = "0";
		break;
	    }
	}
	Integer budgetId = Integer.parseInt(value);
	budget = daoBudget.findByInteger("idBudget", budgetId);
	if (budget != null) {
	    disableBeforeSearch = new Boolean(true);
	    disabledBudgetNumber = new Boolean(true);
	    disabledEdit = new Boolean(false);
	    budgetToQuotation(budget);
	    if (quotation.getBasicDataByCabinDesign() != null) {
		cabinModel = quotation.getBasicDataByCabinDesign().getBasicData();
		listDesign = daoBasicdata.listByParent(cabinModel);
	    }
	    updateQuotationNumber(budgetId);
	    loadPayment();
	} else
	    Clients.showNotification("Ningun registro coincide", "info", null, "top_center", 2000);
    }

    public void loadPayment() {
	quotation.setPayment("45% de Inicial pagadera a la firma del contrato de venta.\n" + "15% a los 30 días.\n" + "15% a los 60 días.\n" + "10% a los 90 días.\n" + "10% a los 120 días.\n" + "10% para el despacho del equipo a la obra.\n" + "05% para la entrega del equipo.");
	quotation.setWarranty("3");
	quotation.setExtendedWarranty("9");
	quotation.setDeliveryEstimate("8");
	quotation.setQuotationValidity("07");
	quotation.setNotes("- Los precios están sujetos a cambio sin previo aviso.\n" + "- Los precios señalados no incluyen el IVA.\n" + "- El equipo se comenzará a fabricar luego de cancelado el 80% del precio de venta.\n" + "- Las cuotas del material importado han sido calculadas al tipo de cambio del momento, por lo tanto, cualquier variación que exista en el tipo de cambio sera calculado al momento de efectuarse el pago.\n" + "- El plazo de instalación no debe exceder de más de " + quotation.getDeliveryEstimate() + " meses contados a partir de la firma del contrato, de lo contrario esto afecta directamente los costos del montaje del equipo.\n" + "- El incumplimiento en el pago de las cuotas genera intereses de mora.");
    }

    @NotifyChange({ "listRifPartner", "listBudgetNumber", "listPartnerName", "listQuotationNumber", "listSeller", "listConstruction" })
    @Command
    public void searchQuotationByField(@BindingParam("field") String field) {
	if (field.compareTo("rifPartner") == 0) {
	    listRifPartner = new SimpleListModel<String>(daoQuotation.listStringByFields(field));
	    return;
	} else if (field.compareTo("number") == 0) {
	    /*
	     * Se cambia el nombre del field, ya que en el zul, se debe enviar una variable obligatoriamente y se
	     * utilizan dos metodos.
	     */
	    listBudgetNumber = new SimpleListModel<String>(daoQuotation.listStringByFields("budgetNumber"));
	    return;
	} else if (field.compareTo("partnerName") == 0) {
	    listPartnerName = new SimpleListModel<String>(daoQuotation.listStringByFields(field));
	    return;
	} else if (field.compareTo("quotationNumber") == 0) {
	    List<String> list = daoQuotation.listStringByFields("newNumber");
	    list.addAll(daoQuotation.listStringByFields("modernizationNumber"));
	    listQuotationNumber = new SimpleListModel<String>(list);
	} else if (field.compareTo("construction") == 0) {
	    listConstruction = new SimpleListModel<String>(daoQuotation.listStringByFields(field));
	    return;
	} else if (field.compareTo("seller") == 0) {
	    listSeller = new SimpleListModel<String>(daoQuotation.listStringByFields(field));
	    return;
	}
    }

    @NotifyChange({ "disableBeforeSearch", "cabinModel", "quotation", "disabledBudgetNumber", "disabledPrint", "disabledEdit" })
    @Command
    public void loadQuotationByField(@BindingParam("field") String field, @BindingParam("val") String value) {
	List<Quotation> list = new ArrayList<Quotation>();
	if (field.compareTo("budgetNumber") == 0) {
	    for (int i = 0; i < value.length(); i++) {
		if (!Character.isDigit(value.charAt(i))) {
		    value = "0";
		    break;
		}
	    }
	    list = daoQuotation.listByInt(field, Integer.parseInt(value));
	} else if (field.compareTo("quotationNumber") == 0) {
	    if (value.isEmpty())
		value = "0";
	    for (int i = 0; i < value.length(); i++) {
		if (!Character.isDigit(value.charAt(i))) {
		    value = "0";
		    break;
		}
	    }
	    list = daoQuotation.listByInt("newNumber", Integer.parseInt(value));
	    list.addAll(daoQuotation.listByInt("modernizationNumber", Integer.parseInt(value)));
	} else
	    list = daoQuotation.listByString(field, value);
	int listSize = list.size();
	if (listSize == 1) {
	    quotation = list.get(0);
	    disableBeforeSearch = new Boolean(true);
	    disabledBudgetNumber = new Boolean(true);
	    disabledPrint = new Boolean(false);
	    disabledEdit = new Boolean(true);
	    if (quotation.getBasicDataByCabinDesign() != null)
		cabinModel = quotation.getBasicDataByCabinDesign().getBasicData();
	} else if (listSize == 0) {
	    Clients.showNotification("Ningun registro coincide", "info", null, "top_center", 2000);
	} else {
	    Map<String, Object> map = new HashMap<String, Object>();
	    map.put("listQuotations", list);
	    Window win = (Window) Executions.createComponents("ventas/presupuesto/frmWindowQuotations.zul", null, map);
	}
    }

    @NotifyChange({ "listBudgetNumber" })
    @Command
    public void searchBudgetByField(@BindingParam("field") String field) {
	List<Integer> list = daoBudget.listByIntFields(field);

	List<String> list2 = new ArrayList<String>();
	for (Integer number : list) {
	    list2.add(number.toString());
	}
	listBudgetNumber = new SimpleListModel<String>(list2);
    }

    @Command
    public void isStopSequenceContinuous() {
	quotation.setStopSequenceEven(false);
	quotation.setStopSequenceOdd(false);
	quotation.setStopSequenceEvenNumber(0);
	quotation.setStopSequenceOddNumber(0);
	quotation.setStopSequenceEvenQ(new String());
	quotation.setStopSequenceOddQ(new String());
	if (!quotation.getStopSequenceContinuous()) {
	    quotation.setStopSequenceContinuousQ(new String());
	    quotation.setStopSequenceContinuousNumber(0);
	}
    }

    @NotifyChange({ "listDesign" })
    @Command
    public void loadCabinDesign() {
	listDesign = daoBasicdata.listByParent(cabinModel);
	/*
	 * No asigno un nuevo OBJETO en lugar de "null" puesto que me da error al guardar el objeto budget
	 */
	quotation.setBasicDataByCabinDesign(null);
    }

    @Command
    public void activeDesignComment() {
	String cabinDesign = new String();
	String floorType = new String();
	if (quotation.getBasicDataByCabinDesign() != null)
	    cabinDesign = quotation.getBasicDataByCabinDesign().getName();
	if (quotation.getBasicDataByFloorType() != null)
	    floorType = quotation.getBasicDataByFloorType().getName();
	if (cabinDesign.indexOf("FORMICA") != -1 || floorType.indexOf("OTROS") != -1)
	    quotation.setDesignSpecial(true);
	/*
	 * IMPORTANTE Solo actualizo una propiedad del objeto BUDGET, mas no todo el objeto
	 */
	BindUtils.postNotifyChange(null, null, quotation, "designSpecial");
    }

    @Command
    public void isDesignSpecial() {
	quotation.setDesignSpecialComment(" ");
    }

    @NotifyChange({ "listBoothDisplay", "listFloorDisplay" })
    @Command
    public void loadBoothFloorDisplay() {
	if (quotation.getBasicDataByControlType() != null) {
	    String controlType = quotation.getBasicDataByControlType().getName();
	    if (controlType.indexOf("SISTEL") != -1) {
		listBoothDisplay = daoBasicdata.listByField("BUDGET", "BOOTH DISPLAY SISTEL");
		listFloorDisplay = daoBasicdata.listByField("BUDGET", "FLOOR DISPLAY SISTEL");
	    } else if (controlType.indexOf("CF CONTROL") != -1) {
		listBoothDisplay = daoBasicdata.listByField("BUDGET", "BOOTH DISPLAY CF");
		listFloorDisplay = daoBasicdata.listByField("BUDGET", "FLOOR DISPLAY CF");
	    } else {
		listBoothDisplay = new ArrayList<BasicData>();
		listFloorDisplay = new ArrayList<BasicData>();
	    }
	    quotation.setBasicDataByBoothDisplay(null);
	    quotation.setBasicDataByFloorDisplay(null);
	}
    }

    @Command
    public void priceUnit(@BindingParam("val") Double value) {
	Double price = value;
	quotation.setPriceImportedMaterial(price * 0.6);
	quotation.setPriceNationalMaterial(price * 0.4);
	BindUtils.postNotifyChange(null, null, quotation, "priceImportedMaterial");
	BindUtils.postNotifyChange(null, null, quotation, "priceNationalMaterial");
    }

    @NotifyChange({ "quotation", "disabledPrint", "disableBeforeSearch", "disabledBudgetNumber" })
    @GlobalCommand
    public void selectedQuotation(@BindingParam("quotation") Quotation quotation) {
	this.quotation = quotation;
	disableBeforeSearch = new Boolean(true);
	disabledBudgetNumber = new Boolean(true);
	disabledPrint = new Boolean(false);
	disabledEdit = new Boolean(true);
    }

    @NotifyChange({ "quotation", "disableBeforeSearch", "disabledBudgetNumber", "disabledEdit" })
    @Command
    public void search() {
	restartForm();
	quotation.setNewNumber(0);
	quotation.setModernizationNumber(0);
	disableBeforeSearch = new Boolean(false);
	disabledBudgetNumber = new Boolean(false);
	disabledEdit = new Boolean(true);
    }

    @Command
    public void createPdf(String quotationNumber) throws SQLException {
	/* Se debe tomar la sesion a partir de Hibernate CORREGIR */
	try {
	    Class.forName("org.postgresql.Driver");
	} catch (ClassNotFoundException e2) {
	    e2.printStackTrace();
	}
	Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/ascensor_nardi", "ascensor_admin", "leyner.18654277");
	String string = Sessions.getCurrent().getWebApp().getRealPath("/resource/reports");
	JasperReport jasperReport;
	try {
	    jasperReport = (JasperReport) JRLoader.loadObjectFromFile(string + "/quotation.jasper");
	} catch (JRException e) {
	    jasperReport = null;
	    e.printStackTrace();
	}
	Map<String, Object> parameters = new HashMap<String, Object>();
	parameters.put("type", quotation.isType());
	parameters.put("new", quotation.getNewNumber());
	parameters.put("modernization", quotation.getModernizationNumber());
	parameters.put("version", quotation.getVersionNumber());
	/*
	 * Enviamos por parametro a ireport la ruta de la ubicacion de los subreportes e imagenes.
	 */
	parameters.put("IMAGES_DIR", "../../resource/images/");
	parameters.put("SUBREPORT_DIR", "../../resource/reports/");
	JasperPrint jasperPrint;
	try {
	    jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, connection);
	} catch (HibernateException e1) {
	    jasperPrint = null;
	    e1.printStackTrace();
	} catch (JRException e1) {
	    jasperPrint = null;
	    e1.printStackTrace();
	}
	JRExporter jrExporter = new JRPdfExporter();
	jrExporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
	jrExporter.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, string + "/quotation" + quotationNumber + ".pdf");
	File file = new File(string + "/quotation" + quotationNumber + ".pdf");
	/* Eliminamos el pdf si ya existia, puesto que no se sobreescribe. */
	if (file.isFile())
	    file.delete();
	try {
	    jrExporter.exportReport();
	} catch (JRException e) {
	    System.out.println("Report wasn't export.");
	}
	connection.close();
    }

    @NotifyChange("*")
    @Command
    public void save() {
	Quotation auxQuotation = daoQuotation.findById(quotation);
	System.out.println("cambiad: "+quotation.getStatus()+"; actual: "+auxQuotation.getStatus());
	if (quotation.getIdQuotation() == 0 || quotation.getTotalPrice() != auxQuotation.getTotalPrice()) {
	    if (!daoQuotation.save(quotation)) {
		Clients.showNotification("No se pudo guardar.", "error", null, "bottom_center", 2000);
		return;
	    }
	} else if (quotation.getStatus() != auxQuotation.getStatus()) {
	    if (!daoQuotation.update(quotation)) {
		Clients.showNotification("No se pudo actualizar.", "error", null, "bottom_center", 2000);
		return;
	    }
	}
	/* PREGUNTAR si enviará email */
	Clients.showNotification("Presupuesto guardado", "info", null, "bottom_center", 2000);
	restartForm();
    }

    @NotifyChange({ "disabledEdit" })
    @Command
    public void edit() {
	disabledEdit = new Boolean(false);
    }

    @Command
    public void print() throws SQLException {
	String quotationNumber = new String();
	if (quotation.isType())
	    quotationNumber = "1-" + quotation.getNewNumber() + quotation.getVersionNumber();
	else
	    quotationNumber = "2-" + quotation.getModernizationNumber() + quotation.getVersionNumber();
	createPdf(quotationNumber);
	String report = new String("/resource/reports/quotation" + quotationNumber + ".pdf");
	Map<String, Object> map = new HashMap<String, Object>();
	map.put("reportPath", report);
	map.put("reportTitle", "Presupuesto");
	map.put("absolutePath", Sessions.getCurrent().getWebApp().getRealPath("/resource/reports") + "/quotation" + quotationNumber + ".pdf");
	Window win = (Window) Executions.createComponents("frmReport.zul", null, map);
    }

    @Command
    public void close() {
	Map<String, Object> map = new HashMap<String, Object>();
	map.put("page", "");
	BindUtils.postGlobalCommand(null, null, "selectedPage", map);
    }
}