package controller.ventas.presupuesto;

import general.GenericReport;
import general.SimpleListModelCustom;
import general.ValidateZK;

import java.io.File;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.database.BasicData;
import model.database.Budget;
import model.database.Quotation;
import model.service.ServiceBasicData;
import model.service.ServiceBudget;
import model.service.ServiceQuotation;

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
import org.zkoss.zul.Datebox;
import org.zkoss.zul.ListModel;
import org.zkoss.zul.ListModelList;
import org.zkoss.zul.Radiogroup;
import org.zkoss.zul.impl.InputElement;

import springBean.Emails;

public class FrmQuotation {

	@WireVariable
	private ServiceBasicData serviceBasicData;
	@WireVariable
	private ServiceQuotation serviceQuotation;
	@WireVariable
	private ServiceBudget serviceBudget;
	@WireVariable
	private Emails emails;

	private final String seleccione = new String("--Seleccione--");
	private final String dash = new String("-");

	private Quotation quotation;
	private Budget budget;
	private Boolean disableBeforeSearch;
	private Boolean disabledBudgetNumber;
	private Boolean disabledPrint;
	private Boolean disabledEdit;
	private String modalMessage;
	private String printMessage;
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
	private List<BasicData> listQuotationType;
	private ListModel<Object> listQuotationNumber;
	private ListModel<Object> listRifPartner;
	private ListModel<Object> listBudgetNumber;
	private ListModel<Object> listPartnerName;
	private ListModel<Object> listConstruction;
	private ListModel<Object> listSeller;

	public List<BasicData> getListQuotationType() {
		return listQuotationType;
	}

	public void setListQuotationType(List<BasicData> listQuotationType) {
		this.listQuotationType = listQuotationType;
	}

	public String getPrintMessage() {
		return printMessage;
	}

	public void setPrintMessage(String printMessage) {
		this.printMessage = printMessage;
	}

	public String getModalMessage() {
		return modalMessage;
	}

	public void setModalMessage(String modalMessage) {
		this.modalMessage = modalMessage;
	}

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

	public ListModel<Object> getListPartnerName() {
		return listPartnerName;
	}

	public void setListPartnerName(ListModel<Object> listPartnerName) {
		this.listPartnerName = listPartnerName;
	}

	public ListModel<Object> getListBudgetNumber() {
		return listBudgetNumber;
	}

	public void setListBudgetNumber(ListModel<Object> listBudgetNumber) {
		this.listBudgetNumber = listBudgetNumber;
	}

	public ListModel<Object> getListRifPartner() {
		return listRifPartner;
	}

	public void setListRifPartner(ListModel<Object> listRifPartner) {
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

	public ListModel<Object> getListQuotationNumber() {
		return listQuotationNumber;
	}

	public void setListQuotationNumber(ListModel<Object> listQuotationNumber) {
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

	public Validator getnoZeroDouble() {
		return new ValidateZK().getNoZeroDouble();
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

	public Validator getNoValidDate() {
		return new AbstractValidator() {
			@Override
			public void validate(ValidationContext ctx) {
				Datebox datebox = (Datebox) ctx.getBindContext().getValidatorArg("datebox");
				if (quotation.getStatus() == 'A' && datebox.getValue() == null)
					throw new WrongValueException(datebox, "Ingrese una fecha valida.");
			}
		};
	}

	@Command
	public void selectStatus(@BindingParam("radioGroup") Radiogroup radiogroup) {
		if (radiogroup.getSelectedItem().getValue().charAt(0) == 'A') {
			List<Quotation> list = serviceQuotation.listByBudget(quotation.getBudgetNumber());
			for (Quotation q : list) {
				if (q.getStatus() == 'A') {
					quotation.setStatus('E');
					BindUtils.postNotifyChange(null, null, quotation, "status");
					throw new WrongValueException(radiogroup, "Esta solicitud ya tiene presupuesto aprobado.");
				}
			}
		}
	}

	@Init
	public void init() {
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
		listQuotationNumber = new ListModelList<Object>();
		listRifPartner = new ListModelList<Object>();
		listBudgetNumber = new ListModelList<Object>();
		listPartnerName = new ListModelList<Object>();
		listConstruction = new ListModelList<Object>();
		listSeller = new ListModelList<Object>();
		listDesign = new ArrayList<BasicData>();
		listRifType = serviceBasicData.listRifType();
		listRoofType = serviceBasicData.listRoofType();
		listElevatorCapa = serviceBasicData.listElevatorCapacitance();
		listSpeed = serviceBasicData.listSpeed();
		listManeuverType = serviceBasicData.listManeuverType();
		listHallButton = serviceBasicData.listHallButton();
		listMachineType = serviceBasicData.listMachineType();
		listElectricityType = serviceBasicData.listElectricityType();
		listCabinModel = serviceBasicData.listCabinModel();
		listRailing = serviceBasicData.listRailing();
		listFloorType = serviceBasicData.listFloorType();
		listDoorType = serviceBasicData.listDoorType();
		listFreeAdmission = serviceBasicData.listFreeAdmission();
		listHeight = serviceBasicData.listHeight();
		listDoorframeHammered = serviceBasicData.listDoorframeHammered();
		listElevatorType = serviceBasicData.listElevatorType();
		listHallButtonType = serviceBasicData.listHallButtonType();
		listControlType = serviceBasicData.listControlType();
		listQuotationType = serviceBasicData.listQuotationTypeMoney();
		listBoothDisplay = new ArrayList<BasicData>();
		listFloorDisplay = new ArrayList<BasicData>();
		modalMessage = null;
		printMessage = null;
	}

	public void budgetToQuotation(Budget budget) {
		quotation.setBudget(budget);
		quotation.setBusinessPartner(budget.getBusinessPartner());
		quotation.setRifType(budget.getRifType());
		quotation.setRifPartner(budget.getRifPartner());
		quotation.setBudgetNumber(budget.getNumber());
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
		quotation.setBasicDataByRoofType(budget.getBasicDataByRoofType());
		quotation.setBasicDataByRailing(budget.getBasicDataByRailing());
		quotation.setBasicDataByFloorType(budget.getBasicDataByFloorType());
		quotation.setCabinWidth(budget.getCabinWidth());
		quotation.setCabinHeight(budget.getCabinHeight());
		quotation.setCabinBackground(budget.getCabinBackground());
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
		List<Quotation> lisQuotations = serviceQuotation.listByBudget(num);
		if (lisQuotations.size() == 0)
			if (quotation.isType()) {
				Integer number = serviceQuotation.findMaxNewNumber();
				quotation.setNewNumber(number + 1);
			} else {
				Integer number = serviceQuotation.findMaxModernizationNumber();
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
		Integer budgetNumber = Integer.parseInt(value);
		budget = serviceBudget.findByNumber(budgetNumber);
		if (budget != null) {
			disableBeforeSearch = new Boolean(true);
			disabledBudgetNumber = new Boolean(true);
			disabledEdit = new Boolean(false);
			budgetToQuotation(budget);
			if (quotation.getBasicDataByCabinDesign() != null) {
				cabinModel = quotation.getBasicDataByCabinDesign().getBasicData();
				listDesign = serviceBasicData.listDesignByModel(cabinModel);
			}
			updateQuotationNumber(budgetNumber);
		} else
			Clients.showNotification("Ningun registro coincide", "info", null, "top_center", 2000);
	}

	@NotifyChange({ "quotation" })
	@Command
	public void loadPayment() {
		if (quotation.isType() && quotation.getBasicDataByQuotationType().getName().contains("MONEDA NACIONAL")) {
			quotation.setPayment("80% de Inicial pagadera a la firma del contrato de venta.\n" + "20% a los 30 días.\n");
			quotation.setWarranty("3");
			quotation.setExtendedWarranty("12");
			quotation.setDeliveryEstimate("6");
			quotation.setQuotationValidity("07");
			quotation.setNotes("- Los precios señalados no incluyen el IVA.\n" + "- Este presupuesto NO incluye montaje, el mismo será presupuestado en el momento que se vaya a ejecutar.\n" + "- El equipo se comenzará a fabricar luego de cancelado el 80% del precio de venta.\n" + "- Las cuotas del material importado han sido calculadas al tipo de cambio oficial del momento, por lo tanto, cualquier variación que exista en el tipo de cambio sera calculado al momento de efectuarse el pago.\n" + "- El incumplimiento en el pago de las cuotas genera intereses de mora.\n" + "- La empresa no se hace responsable de la contribucion o pagos al sindicato de la construccion, ni a ningun otro sindicato.\n" + "- Este presupuesto no contempla gastos de fianzas de ninguna indole.");
			quotation.setPriceImportedMaterial(0);
			quotation.setPriceNationalMaterial(0);
			quotation.setTotalPrice(0);
		} else if (!quotation.isType() && quotation.getBasicDataByQuotationType().getName().contains("MONEDA NACIONAL")) {
			quotation.setPayment("60% de inicial al momento de la firma del contrato.\n" + "20% para el desarme  de los equipos en  la obra.\n" + "15% para el despacho de los equipos y comenzar el trabajo de armado.\n" + "5% para la entrega de los equipos funcionando.");
			quotation.setWarranty("3");
			quotation.setExtendedWarranty("6");
			quotation.setDeliveryEstimate("8");
			quotation.setQuotationValidity("07");
			quotation.setNotes("- Los precios señalados no incluyen el IVA.\n" + "- En caso de daño oculto será presupuestado el mismo al momento de ser detectado y por separado.\n" + "- Las cuotas del material importado han sido calculadas al tipo de cambio oficial del momento, por lo tanto, cualquier variación que exista en el tipo de cambio sera calculado al momento de efectuarse el pago.\n" + "-El precio por instalación del equipo, sera ajustado al momento de la ejecución y culminación del montaje.\n" + "- El incumplimiento en el pago de las cuotas genera intereses de mora.\n" + "- La empresa no se hace responsable de la contribucion o pagos al sindicato de la construccion, ni a ningun otro sindicato.\n" + "- Este presupuesto no contempla gastos de fianzas de ninguna indole.");
			quotation.setPriceImportedMaterial(0);
			quotation.setPriceNationalMaterial(0);
			quotation.setTotalPrice(0);
		} else if (quotation.isType() && quotation.getBasicDataByQuotationType().getName().contains("MONEDA EXTRANJERA")) {
			quotation.setPaymentForeign("100% para la orden produccion y firma del contrato.");
			quotation.setPayment("20% para la orden de produccion y firma del contrato.\n" + "80% para nacionalizar los equipos al llegar a puerto venezolano.\n");
			quotation.setWarranty("3");
			quotation.setExtendedWarranty("12");
			quotation.setDeliveryEstimate("6");
			quotation.setQuotationValidity("07");
			quotation.setNotes("- Los precios señalados no incluyen el IVA.\n" + "- El precio del equipo NO incluye montaje, el mismo sera calculado al momento de la instalacion.\n" + "- La empresa no se hace responsable de la contribucion o pagos al sindicato de la construccion, ni a ningun otro sindicato.\n" + "- Este presupuesto no contempla gastos de fianzas de ninguna indole.");
			quotation.setPriceImportedMaterial(0);
			quotation.setPriceNationalMaterial(0);
			quotation.setTotalPrice(0);
		} else if (!quotation.isType() && quotation.getBasicDataByQuotationType().getName().contains("MONEDA EXTRANJERA")) {

		}
	}

	@NotifyChange({ "listRifPartner", "listBudgetNumber", "listPartnerName", "listQuotationNumber", "listSeller", "listConstruction" })
	@Command
	public void searchQuotationByField(@BindingParam("field") String field) {
		if (field.compareTo("rifPartner") == 0) {
			listRifPartner = new SimpleListModelCustom<Object>(serviceQuotation.listRifPartner());
		} else if (field.compareTo("number") == 0) {
			listBudgetNumber = new SimpleListModelCustom<Object>(serviceQuotation.listBudgetNumber());
		} else if (field.compareTo("partnerName") == 0) {
			listPartnerName = new SimpleListModelCustom<Object>(serviceQuotation.listPartnerName());
		} else if (field.compareTo("quotationNumber") == 0) {
			List<String> list = serviceQuotation.listNewNumber();
			list.addAll(serviceQuotation.listModernizationNumber());
			listQuotationNumber = new SimpleListModelCustom<Object>(list);
		} else if (field.compareTo("construction") == 0) {
			listConstruction = new SimpleListModelCustom<Object>(serviceQuotation.listConstruction());
		} else if (field.compareTo("seller") == 0) {
			listSeller = new SimpleListModelCustom<Object>(serviceQuotation.listSeller());
		}
	}

	@NotifyChange({ "disableBeforeSearch", "cabinModel", "quotation", "disabledBudgetNumber", "disabledPrint", "disabledEdit" })
	@Command
	public void loadQuotationByField(@BindingParam("field") String field, @BindingParam("val") String value) {
		List<Quotation> list = new ArrayList<Quotation>();
		if (field.compareTo("budgetNumber") == 0) {
			if (value.isEmpty())
				value = "0";
			for (int i = 0; i < value.length(); i++) {
				if (!Character.isDigit(value.charAt(i))) {
					value = "0";
					break;
				}
			}
			list = serviceQuotation.listByBudget(Integer.parseInt(value));
		} else if (field.compareTo("quotationNumber") == 0) {
			if (value.isEmpty())
				value = "0";
			for (int i = 0; i < value.length(); i++) {
				if (!Character.isDigit(value.charAt(i))) {
					value = "0";
					break;
				}
			}
			list = serviceQuotation.listByNewNumber(Integer.parseInt(value));
			list.addAll(serviceQuotation.listByModernizationNumber(Integer.parseInt(value)));
		} else if (field.compareTo("rifPartner") == 0) {
			list = serviceQuotation.listByRifPartner(value);
		} else if (field.compareTo("partnerName") == 0) {
			list = serviceQuotation.listByPartnerName(value);
		} else if (field.compareTo("construction") == 0) {
			list = serviceQuotation.listByConstruction(value);
		} else if (field.compareTo("seller") == 0) {
			list = serviceQuotation.listBySeller(value);
		}
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
			Executions.createComponents("system/ventas/presupuesto/frmWindowQuotations.zul", null, map);
		}
	}

	@NotifyChange({ "listBudgetNumber" })
	@Command
	public void searchBudgetByField(@BindingParam("field") String field) {
		listBudgetNumber = new SimpleListModelCustom<Object>(serviceBudget.listNumber());
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
		listDesign = serviceBasicData.listDesignByModel(cabinModel);
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
				listBoothDisplay = serviceBasicData.listBoothDisplaySistel();
				listFloorDisplay = serviceBasicData.listFloorDisplaySistel();
			} else if (controlType.indexOf("CF CONTROL") != -1) {
				listBoothDisplay = serviceBasicData.listBoothDisplayCF();
				listFloorDisplay = serviceBasicData.listFloorDisplayCF();
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
		quotation.setPriceImportedMaterial(value * 0.6);
		quotation.setPriceNationalMaterial(value * 0.4);
		quotation.setTotalPrice(value);
		BindUtils.postNotifyChange(null, null, quotation, "priceImportedMaterial");
		BindUtils.postNotifyChange(null, null, quotation, "priceNationalMaterial");
		BindUtils.postNotifyChange(null, null, quotation, "totalPrice");
	}

	@Command
	public void setPrice(@BindingParam("price") Double value, @BindingParam("type") String type) {
		if (type.contains("national")) {
			quotation.setPriceNationalMaterial(value);
			BindUtils.postNotifyChange(null, null, quotation, "priceNationalMaterial");
		} else if (type.contains("foreign")) {
			quotation.setPriceImportedMaterial(value);
			BindUtils.postNotifyChange(null, null, quotation, "priceImportedMaterial");
		}
	}

	@NotifyChange({ "quotation", "disabledPrint", "disableBeforeSearch", "disabledBudgetNumber", "cabinModel" })
	@GlobalCommand
	public void selectedQuotation(@BindingParam("quotation") Quotation quotation) {
		this.quotation = serviceQuotation.findById(quotation.getIdQuotation());
		cabinModel = this.quotation.getBasicDataByCabinDesign().getBasicData();
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

	public String getElevatorType(String str) {
		return (quotation.getElevatorQuantity() > 1 ? "ASCENSORES " : "ASCENSOR ") + str;
	}

	public List<File> mailAttach() {
		List<File> listAttach = new ArrayList<File>();
		GenericReport report = new GenericReport();
		String quotationNumber = new String();
		if (quotation.isType())
			quotationNumber = "1-" + quotation.getNewNumber() + "-" + quotation.getVersionNumber();
		else
			quotationNumber = "2-" + quotation.getModernizationNumber() + "-" + quotation.getVersionNumber();
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("REPORT_TITLE", "Resumen de Venta");
		parameters.put("NUMBER", quotation.getBudgetNumber());
		parameters.put("IMAGES_DIR", "../../resource/images/system/reports/");
		parameters.put("SUBREPORT_DIR", "../../resource/reports/ventas/solicitud/");
		report.createPdf("/resource/reports/ventas/solicitud", "budget.jasper", parameters, "ppto_" + quotationNumber + ".pdf");
		File file = new File(Sessions.getCurrent().getWebApp().getRealPath("/resource/reports/ventas/solicitud/ppto_" + quotationNumber + ".pdf"));
		listAttach.add(file);
		return listAttach;
	}

	public String mailMessage() {
		Format formatter = new SimpleDateFormat("dd/MM/yyyy");
		String message = new String();
		message = "Presupuesto aprobado el dia " + formatter.format(quotation.getApprovedDate()) + "\n\nPresupuesto nro:" + (quotation.isType() ? "1" : "2") + "-" + (quotation.isType() ? quotation.getNewNumber() : quotation.getModernizationNumber()) + "-" + quotation.getVersionNumber() + "\n\nCliente: " + quotation.getPartnerName() + "\n\nCantidad ascensores: " + quotation.getElevatorQuantity() + "\n\nCiudad: " + quotation.getConstruction();
		return message;
	}

	public void sendMail() {
		List<String> listRecipient = new ArrayList<String>();
		listRecipient.add("ventas@ascensoresnardi.com");
		listRecipient.add("logistica@ascensoresnardi.com");
		listRecipient.add(serviceBudget.findByNumber(quotation.getBudget().getNumber()).getSecurityUser().getEmail());
		listRecipient.add("sistemas@ascensoresnardi.com");
		emails.sendMail("sistemas@ascensoresnardi.com", "Presupuesto nro" + (quotation.isType() ? "1" : "2") + "-" + (quotation.isType() ? quotation.getNewNumber() : quotation.getModernizationNumber()) + "-" + quotation.getVersionNumber(), listRecipient, mailMessage(), mailAttach());
	}

	@NotifyChange("*")
	@Command
	public void save() {
		if (!serviceQuotation.save(quotation)) {
			Clients.showNotification("No se pudo guardar el presupuesto", "error", null, "bottom_center", 2000);
			return;
		}
		if (quotation.getStatus() == 'A')
			sendMail();
		Clients.showNotification("Presupuesto guardado", "info", null, "bottom_center", 2000);
		selectPrintTemplate();
	}

	@NotifyChange("modalMessage")
	@Command
	public void confirmSave(@BindingParam("radioGroup") Radiogroup radiogroup, @BindingParam("datebox") Datebox datebox) {
		modalMessage = "El proceso de guardado es irreversible. ¿Esta seguro de guardar el presupuesto?";
		selectStatus(radiogroup);
	}

	@NotifyChange("printMessage")
	@Command
	public void selectPrintTemplate() {
		printMessage = "Escoja el formato para la impresion.";
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

	@NotifyChange("*")
	@Command
	public void print(@BindingParam("template") String template) {
		GenericReport report = new GenericReport();
		String quotationNumber = new String();
		if (quotation.isType())
			quotationNumber = "1-" + quotation.getNewNumber() + "-" + quotation.getVersionNumber();
		else
			quotationNumber = "2-" + quotation.getModernizationNumber() + "-" + quotation.getVersionNumber();
		if (template == null || template.compareTo("SI") == 0) {
			if (quotation.getBasicDataByQuotationType().getName().contains("MONEDA NACIONAL"))
				template = "quotation.jasper";
			else if (quotation.getBasicDataByQuotationType().getName().contains("MONEDA EXTRANJERA"))
				template = "quotation_foreign.jasper";
		} else if (template.contains("NO"))
			if (quotation.getBasicDataByQuotationType().getName().contains("MONEDA NACIONAL"))
				template = "quotation_without.jasper";
			else if (quotation.getBasicDataByQuotationType().getName().contains("MONEDA EXTRANJERA"))
				template = "quotation_foreign_without.jasper";
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("TYPE", quotation.isType());
		parameters.put("NEW", quotation.getNewNumber());
		parameters.put("MODERNIZATION", quotation.getModernizationNumber());
		parameters.put("VERSION", quotation.getVersionNumber());
		parameters.put("IMAGES_DIR", "../../resource/images/system/reports/");
		parameters.put("SUBREPORT_DIR", "../../resource/reports/ventas/presupuesto/");
		report.createPdf("/resource/reports/ventas/presupuesto", template, parameters, "ppto_" + quotationNumber + ".pdf");
		report.viewPdf("/resource/reports/ventas/presupuesto/ppto_" + quotationNumber + ".pdf", "Presupuesto");
		restartForm();
	}

	@Command
	public void close() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("page", "");
		BindUtils.postGlobalCommand(null, null, "selectedPage", map);
	}
}