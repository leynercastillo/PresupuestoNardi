package controller;

import general.Emails;
import general.ValidateZK;
import hibernateConnections.StoreHibernateUtil;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.mail.MessagingException;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRExporter;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.engine.util.JRLoader;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.zkoss.bind.BindUtils;
import org.zkoss.bind.ValidationContext;
import org.zkoss.bind.Validator;
import org.zkoss.bind.annotation.BindingParam;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.ContextParam;
import org.zkoss.bind.annotation.ContextType;
import org.zkoss.bind.annotation.GlobalCommand;
import org.zkoss.bind.annotation.Init;
import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.bind.validator.AbstractValidator;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.Sessions;
import org.zkoss.zk.ui.WrongValueException;
import org.zkoss.zk.ui.event.InputEvent;
import org.zkoss.zk.ui.util.Clients;
import org.zkoss.zul.Window;
import org.zkoss.zul.impl.InputElement;

import dao.DaoBasicdata;
import dao.DaoBudget;
import dao.DaoBusinessPartner;
import dao.DaoSecurityUser;
import database.BasicData;
import database.Budget;
import database.BusinessPartner;
import database.SecurityUser;

/**
 * @author leyner.castillo
 * 
 */
public class FrmBudgetCtrl {

	private String seleccione = new String("--Seleccione--");
	private static final String vacio = new String(" ");
	private List<BasicData> listBType;
	private List<BasicData> listElevatorType;
	private List<BasicData> listElevatorCapa;
	private List<BasicData> listMachineType;
	private List<BasicData> listMachineBase;
	private List<BasicData> listBEmbarque;
	private List<BasicData> listElectricityType;
	private List<BasicData> listSpeed;
	private List<BasicData> listFrequency;
	private List<BasicData> listVoltageLighting;
	private List<BasicData> listHourMachine;
	private List<BasicData> listManeuverType;
	private List<BasicData> listDesign;
	private List<BasicData> listRoofType;
	private List<BasicData> listButtonType;
	private List<BasicData> listRailing;
	private List<BasicData> listMirror;
	private List<BasicData> listFloorType;
	private List<BasicData> listFan;
	private List<BasicData> listDoorType;
	private List<BasicData> listDoorSystem;
	private List<BasicData> listDoorframeType;
	private List<BasicData> listDoorframeHammered;
	private List<BasicData> listFreeAdmission;
	private List<BasicData> listHeight;
	private List<BasicData> listControlType;
	private List<BasicData> listBoothButton;
	private List<BasicData> listBoothDisplay;
	private List<BasicData> listFloorDisplay;
	private List<BasicData> listMotorTraction;
	private List<BasicData> listCabinModel;
	private List<BasicData> listHallButton;
	private List<BasicData> listHallButtonType;
	private List<BasicData> listRifType;
	private List<Budget> listBudget;
	private List<BusinessPartner> listBusinessPartner;
	private BasicData cabinModel;
	private Boolean stainlessSteel;
	private Boolean hammeredGray;
	private Boolean hammeredBrown;
	private Boolean disabledAll;
	private Boolean disableAfterSearch;
	private Boolean disabledNumber;
	private Boolean disableSeller;
	private Boolean disableSistelHall;
	private Boolean isSpecial;
	private Integer sistelWDisplayFloor;
	private Integer sistelWDisplayPB;
	private Integer sistelWArrowFloor;
	private Integer sistelWArrowPB;
	private Budget budget;
	private BusinessPartner businessPartner;

	public List<BasicData> getListMachineBase() {
		return listMachineBase;
	}

	public void setListMachineBase(List<BasicData> listMachineBase) {
		this.listMachineBase = listMachineBase;
	}

	public List<BusinessPartner> getListBusinessPartner() {
		return listBusinessPartner;
	}

	public void setListBusinessPartner(
			List<BusinessPartner> listBusinessPartner) {
		this.listBusinessPartner = listBusinessPartner;
	}

	public List<BasicData> getListRifType() {
		return listRifType;
	}

	public void setListRifType(List<BasicData> listRifType) {
		this.listRifType = listRifType;
	}

	public Boolean getDisableSistelHall() {
		return disableSistelHall;
	}

	public void setDisableSistelHall(Boolean disableSistelHall) {
		this.disableSistelHall = disableSistelHall;
	}

	public Boolean getDisableSeller() {
		return disableSeller;
	}

	public void setDisableSeller(Boolean disableSeller) {
		this.disableSeller = disableSeller;
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

	public List<BasicData> getListDoorframeHammered() {
		return listDoorframeHammered;
	}

	public void setListDoorframeHammered(List<BasicData> listDoorframeHammered) {
		this.listDoorframeHammered = listDoorframeHammered;
	}

	public Boolean getIsSpecial() {
		return isSpecial;
	}

	public void setIsSpecial(Boolean isSpecial) {
		this.isSpecial = isSpecial;
	}

	public List<BasicData> getListDesign() {
		return listDesign;
	}

	public void setListDesign(List<BasicData> listDesign) {
		this.listDesign = listDesign;
	}

	public BasicData getCabinModel() {
		return cabinModel;
	}

	public void setCabinModel(BasicData cabinModel) {
		this.cabinModel = cabinModel;
	}

	public List<BasicData> getListCabinModel() {
		return listCabinModel;
	}

	public void setListCabinModel(List<BasicData> listCabinModel) {
		this.listCabinModel = listCabinModel;
	}

	public Boolean getDisabledNumber() {
		return disabledNumber;
	}

	public void setDisabledNumber(Boolean disabledNumber) {
		this.disabledNumber = disabledNumber;
	}

	public Boolean getDisableAfterSearch() {
		return disableAfterSearch;
	}

	public void setDisableAfterSearch(Boolean disableAfterSearch) {
		this.disableAfterSearch = disableAfterSearch;
	}

	public List<Budget> getListBudget() {
		return listBudget;
	}

	public void setListBudget(List<Budget> listBudget) {
		this.listBudget = listBudget;
	}

	public Boolean getDisabledAll() {
		return disabledAll;
	}

	public void setDisabledAll(Boolean disabledAll) {
		this.disabledAll = disabledAll;
	}

	public String getSeleccione() {
		return seleccione;
	}

	public void setSeleccione(String seleccione) {
		this.seleccione = seleccione;
	}

	public Boolean getStainlessSteel() {
		return stainlessSteel;
	}

	public void setStainlessSteel(Boolean stainlessSteel) {
		this.stainlessSteel = stainlessSteel;
	}

	public Boolean getHammeredGray() {
		return hammeredGray;
	}

	public void setHammeredGray(Boolean hammeredGray) {
		this.hammeredGray = hammeredGray;
	}

	public Boolean getHammeredBrown() {
		return hammeredBrown;
	}

	public void setHammeredBrown(Boolean hammeredBrown) {
		this.hammeredBrown = hammeredBrown;
	}

	public Integer getSistelWDisplayFloor() {
		return sistelWDisplayFloor;
	}

	public void setSistelWDisplayFloor(Integer sistelWDisplayFloor) {
		this.sistelWDisplayFloor = sistelWDisplayFloor;
	}

	public Integer getSistelWDisplayPB() {
		return sistelWDisplayPB;
	}

	public void setSistelWDisplayPB(Integer sistelWDisplayPB) {
		this.sistelWDisplayPB = sistelWDisplayPB;
	}

	public Integer getSistelWArrowFloor() {
		return sistelWArrowFloor;
	}

	public void setSistelWArrowFloor(Integer sistelWArrowFloor) {
		this.sistelWArrowFloor = sistelWArrowFloor;
	}

	public Integer getSistelWArrowPB() {
		return sistelWArrowPB;
	}

	public void setSistelWArrowPB(Integer sistelWArrowPB) {
		this.sistelWArrowPB = sistelWArrowPB;
	}

	public Budget getBudget() {
		return budget;
	}

	public void setBudget(Budget budget) {
		this.budget = budget;
	}

	public List<BasicData> getListMotorTraction() {
		return listMotorTraction;
	}

	public void setListMotorTraction(List<BasicData> listMotorTraction) {
		this.listMotorTraction = listMotorTraction;
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

	public List<BasicData> getListBoothButton() {
		return listBoothButton;
	}

	public void setListBoothButton(List<BasicData> listBoothButton) {
		this.listBoothButton = listBoothButton;
	}

	public List<BasicData> getListControlType() {
		return listControlType;
	}

	public void setListControlType(List<BasicData> listControlType) {
		this.listControlType = listControlType;
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

	public List<BasicData> getListDoorframeType() {
		return listDoorframeType;
	}

	public void setListDoorframeType(List<BasicData> listDoorframeType) {
		this.listDoorframeType = listDoorframeType;
	}

	public List<BasicData> getListDoorSystem() {
		return listDoorSystem;
	}

	public void setListDoorSystem(List<BasicData> listDoorSystem) {
		this.listDoorSystem = listDoorSystem;
	}

	public List<BasicData> getListDoorType() {
		return listDoorType;
	}

	public void setListDoorType(List<BasicData> listDoorType) {
		this.listDoorType = listDoorType;
	}

	public List<BasicData> getListFan() {
		return listFan;
	}

	public void setListFan(List<BasicData> listFan) {
		this.listFan = listFan;
	}

	public List<BasicData> getListFloorType() {
		return listFloorType;
	}

	public void setListFloorType(List<BasicData> listFloorType) {
		this.listFloorType = listFloorType;
	}

	public List<BasicData> getListMirror() {
		return listMirror;
	}

	public void setListMirror(List<BasicData> listMirror) {
		this.listMirror = listMirror;
	}

	public List<BasicData> getListRailing() {
		return listRailing;
	}

	public void setListRailing(List<BasicData> listRailing) {
		this.listRailing = listRailing;
	}

	public List<BasicData> getListButtonType() {
		return listButtonType;
	}

	public void setListButtonType(List<BasicData> listButtonType) {
		this.listButtonType = listButtonType;
	}

	public List<BasicData> getListRoofType() {
		return listRoofType;
	}

	public void setListRoofType(List<BasicData> listRoofType) {
		this.listRoofType = listRoofType;
	}

	public List<BasicData> getListManeuverType() {
		return listManeuverType;
	}

	public void setListManeuverType(List<BasicData> listManeuverType) {
		this.listManeuverType = listManeuverType;
	}

	public List<BasicData> getListHourMachine() {
		return listHourMachine;
	}

	public void setListHourMachine(List<BasicData> listHourMachine) {
		this.listHourMachine = listHourMachine;
	}

	public List<BasicData> getListVoltageLighting() {
		return listVoltageLighting;
	}

	public void setListVoltageLighting(List<BasicData> listVoltageLighting) {
		this.listVoltageLighting = listVoltageLighting;
	}

	public List<BasicData> getListFrequency() {
		return listFrequency;
	}

	public void setListFrequency(List<BasicData> listFrequency) {
		this.listFrequency = listFrequency;
	}

	public List<BasicData> getListSpeed() {
		return listSpeed;
	}

	public void setListSpeed(List<BasicData> listSpeed) {
		this.listSpeed = listSpeed;
	}

	public List<BasicData> getListElectricityType() {
		return listElectricityType;
	}

	public void setListElectricityType(List<BasicData> listElectricityType) {
		this.listElectricityType = listElectricityType;
	}

	public List<BasicData> getListBEmbarque() {
		return listBEmbarque;
	}

	public void setListBEmbarque(List<BasicData> listBEmbarque) {
		this.listBEmbarque = listBEmbarque;
	}

	public List<BasicData> getListMachineType() {
		return listMachineType;
	}

	public void setListMachineType(List<BasicData> listMachineType) {
		this.listMachineType = listMachineType;
	}

	public List<BasicData> getListElevatorCapa() {
		return listElevatorCapa;
	}

	public void setListElevatorCapa(List<BasicData> listElevatorCapa) {
		this.listElevatorCapa = listElevatorCapa;
	}

	public List<BasicData> getListElevatorType() {
		return listElevatorType;
	}

	public void setListElevatorType(List<BasicData> listElevatorType) {
		this.listElevatorType = listElevatorType;
	}

	public List<BasicData> getListBType() {
		return listBType;
	}

	public void setListBType(List<BasicData> listBType) {
		this.listBType = listBType;
	}

	/**
	 * Metodo que inicializa la pantalla frmIndex. Se ejecuta antes de finalizar
	 * la carga del archivo DOM que muestra el navegador.
	 * 
	 * Inicializa cada una de la variables insertadas en zul.
	 */
	@Init
	public void init() {
		restartForm();
	}

	@NotifyChange("*")
	@Command
	public void restartForm() {
		DaoBasicdata daoBasicdata = new DaoBasicdata();
		DaoBudget daoBudget = new DaoBudget();
		budget = new Budget();
		businessPartner = new BusinessPartner();
		if (daoBudget.listAll().isEmpty())
			budget.setNumber(1);
		else
			budget.setNumber(daoBudget.listAll()
					.get(daoBudget.listAll().size() - 1).getNumber() + 1);
		disabledAll = new Boolean(false);
		disableAfterSearch = new Boolean(false);
		disabledNumber = new Boolean(true);
		disableSeller = new Boolean(true);
		disableSistelHall = new Boolean(true);
		isSpecial = new Boolean(false);
		cabinModel = new BasicData();
		User auxUser = (User) SecurityContextHolder.getContext()
				.getAuthentication().getPrincipal();
		/*
		 * Se busca por nombre, porque el objeto "auxUser" tipo "User" no
		 * almacena email
		 */
		SecurityUser user = new DaoSecurityUser().findByString("name",
				auxUser.getUsername());
		budget.setSeller(user.getName());
		budget.setSecurityUser(user);
		budget.setDate(new Date());
		budget.setType(true);
		budget.setPlaneC(false);
		budget.setPlaneP(false);
		budget.setLightCurtain(false);
		budget.setLoadLimiter(false);
		budget.setSpeechSynthesizer(false);
		budget.setGomSystem(false);
		budget.setIntercom(false);
		budget.setPhone(false);
		budget.setAccessSytem(false);
		budget.setFirefighterKeychain(false);
		budget.setDesignSpecial(false);
		budget.setMotorTraction(vacio);
		budget.setHallButtonPlace(vacio);
		budget.setDisplayPlaceFloor(vacio);
		budget.setStatus('A');
		budget.setStopSequenceContinuous(false);
		budget.setStopSequenceEven(false);
		budget.setStopSequenceOdd(false);
		budget.setDoorFrameStainless(false);
		budget.setSistelWarrowFloor(0);
		budget.setElevatorQuantity(0);
		budget.setMotorQuantity(0);
		budget.setStopSequenceContinuousNumber(0);
		budget.setStopSequenceEvenNumber(0);
		budget.setStopSequenceOddNumber(0);
		budget.setSistelWdisplayPb(new Boolean(false));
		budget.setSistelWdisplayFloor(0);
		budget.setSistelWarrowPb(new Boolean(false));
		budget.setRifType('-');
		budget.setRifPartner(new String());
		listBudget = new ArrayList<Budget>();
		listDesign = new ArrayList<BasicData>();
		listFan = new ArrayList<BasicData>();
		listBoothDisplay = new ArrayList<BasicData>();
		listFloorDisplay = new ArrayList<BasicData>();
		listRoofType = new ArrayList<BasicData>();
		listBusinessPartner = new DaoBusinessPartner().listActiveOrderByField("rif");
		listRifType = daoBasicdata.listByField("BUSINESS PARTNER", "RIF TYPE");
		listBType = daoBasicdata.listByField("BUDGET", "BUILDING TYPE");
		listElevatorType = daoBasicdata.listByField("BUDGET", "ELEVATOR TYPE");
		listElevatorCapa = daoBasicdata.listByField("BUDGET",
				"ELEVATOR CAPACITANCE");
		listMachineType = daoBasicdata.listByField("BUDGET", "MACHINE TYPE");
		listMachineBase = daoBasicdata.listByField("BUDGET", "MACHINE BASE");
		listBEmbarque = daoBasicdata.listByField("BUDGET", "BUILDING EMBARQUE");
		listElectricityType = daoBasicdata.listByField("BUDGET",
				"ELECTRICITY TYPE");
		listSpeed = daoBasicdata.listByField("BUDGET", "SPEED");
		listFrequency = daoBasicdata.listByField("BUDGET", "FREQUENCY");
		listVoltageLighting = daoBasicdata.listByField("BUDGET",
				"VOLTAGE LIGHTING");
		listHourMachine = daoBasicdata.listByField("BUDGET", "HOUR MACHINE");
		listManeuverType = daoBasicdata.listByField("BUDGET", "MANEUVER TYPE");
		listButtonType = daoBasicdata.listByField("BUDGET", "BUTTON TYPE");
		listRailing = daoBasicdata.listByField("BUDGET", "RAILING");
		listMirror = daoBasicdata.listByField("BUDGET", "MIRROR");
		listFloorType = daoBasicdata.listByField("BUDGET", "FLOOR TYPE");
		listDoorType = daoBasicdata.listByField("BUDGET", "DOOR TYPE");
		listDoorSystem = daoBasicdata.listByField("BUDGET", "DOOR SYSTEM");
		listDoorframeType = daoBasicdata.listByField("BUDGET",
				"DOOR FRAME TYPE");
		listDoorframeHammered = daoBasicdata.listByField("BUDGET",
				"DOOR FRAME HAMMERED");
		listHallButton = daoBasicdata.listByField("BUDGET", "HALL BUTTON");
		listHallButtonType = daoBasicdata.listByField("BUDGET",
				"HALL BUTTON TYPE");
		listFreeAdmission = daoBasicdata
				.listByField("BUDGET", "FREE ADMISSION");
		listHeight = daoBasicdata.listByField("BUDGET", "HEIGHT");
		listControlType = daoBasicdata.listByField("BUDGET", "CONTROL TYPE");
		listBoothButton = daoBasicdata.listByField("BUDGET", "BOOTH BUTTON");
		listMotorTraction = daoBasicdata
				.listByField("BUDGET", "MOTOR TRACTION");
		listCabinModel = daoBasicdata.listByField("BUDGET", "CABIN MODEL");
	}

	/**
	 * Metodo que valida que un componente ZK no este vacio.
	 * 
	 * @return {@link Validator}
	 */
	public Validator getNoEmpty() {
		return new ValidateZK().getNoEmpty();
	}

	/**
	 * Metodo que valida que un string sea un Email valido. Solo aplica para
	 * componentes ZK
	 * 
	 * @return {@link Validator}
	 */
	public Validator getNoEmail() {
		return new ValidateZK().getNoEmail();
	}

	public Validator getNoElevatorQuantity() {
		return new AbstractValidator() {
			@Override
			public void validate(ValidationContext ctx) {
				InputElement inputElement = (InputElement) ctx.getBindContext()
						.getValidatorArg("component");
				Integer quantity = Integer.parseInt(inputElement.getText());
				if (budget.isType() && (quantity < 1))
					throw new WrongValueException(inputElement,
							"Debe ingresar al menos un ascensor.");
			}
		};
	}

	public Validator getNoDash() {
		return new AbstractValidator() {
			@Override
			public void validate(ValidationContext ctx) {
				InputElement inputElement = (InputElement) ctx.getBindContext()
						.getValidatorArg("component");
				String string = inputElement.getText();
				if (string.trim().isEmpty() || string.equals("-")) {
					throw new WrongValueException(inputElement,
							"Seleccione una opcion valida.");
				}
			}
		};
	}

	public Validator getNoEmptyForFormica() {
		return new AbstractValidator() {
			@Override
			public void validate(ValidationContext ctx) {
				InputElement inputElement = (InputElement) ctx.getBindContext()
						.getValidatorArg("component");
				String str = inputElement.getText();
				if (budget.getBasicDataByCabinDesign() != null
						&& budget.getBasicDataByCabinDesign().getName()
								.indexOf("FORMICA") != -1
						&& str.trim().isEmpty())
					throw new WrongValueException(inputElement,
							"Debe ingresar una descripci�n para f�rmica.");
				if (budget.getBasicDataByFloorType() != null
						&& budget.getBasicDataByFloorType().getName()
								.indexOf("OTROS") != -1 && str.trim().isEmpty())
					throw new WrongValueException(inputElement,
							"Debe ingresar una descripci�n acabados de piso OTROS.");
			}
		};
	}

	public String message() {
		String seller = new String(budget.getSeller());
		String message = new String();
		message = "Presupuesto enviado por " + seller + "\n\nCliente: "
				+ budget.getPartnerName() + "\n\nCantidad ascensores: "
				+ budget.getElevatorQuantity() + "\n\nCiudad: "
				+ budget.getConstructionCity();
		return message;
	}

	public List<File> adjuntos() {
		List<File> listAttach = new ArrayList<File>();
		createPdf();
		File file = new File(Sessions
				.getCurrent()
				.getWebApp()
				.getRealPath(
						"/resource/reports/presupuesto" + budget.getNumber()
								+ ".pdf"));
		listAttach.add(file);
		return listAttach;
	}

	public void sendMail() {
		Emails emails = new Emails();
		emails.loadProperties("/resource/config/mail.properties");
		List<String> listRecipient = new ArrayList<String>();
		listRecipient.add("ventas@ascensoresnardi.com");
		listRecipient.add("sistemas@ascensoresnardi.com");
		try {
			emails.sendMail("Presupuesto nro" + budget.getNumber(),
					listRecipient, message(), adjuntos());
		} catch (MessagingException e) {
			System.out.println("Properties wasn't loaded.");
		}
	}

	@NotifyChange({ "*" })
	@Command
	public void save(@BindingParam("component") InputElement component) {
		budget.setBusinessPartner(businessPartner);
		/* Cambiar if a metodo de validacion tradicional */
		if (budget.getBasicDataByDoorframeType() != null
				&& budget.getBasicDataByDoorframeType().getName()
						.indexOf("RECTO - 30X150") != -1
				&& (budget.getHallButtonPlace().indexOf("MARCO") != -1)) {
			throw new WrongValueException(component,
					"Este tipo no puede ser ubicado en el Marco.");
		} else {
			DaoBudget daoBudget = new DaoBudget();
			if (!daoBudget.save(budget)) {
				Clients.showNotification("No se pudo guardar.", "error", null,
						"bottom_center", 2000);
				return;
			}
			sendMail();
			Clients.showNotification("Presupuesto enviado", "info", null,
					"bottom_center", 2000);
			restartForm();
		}
	}

	@NotifyChange({ "disabledAll", "budgetNumber", "budget",
			"disableAfterSearch", "disabledNumber" })
	@Command
	public void search() {
		restartForm();
		budget.setNumber(0);
		budget.setSeller(vacio);
		disabledAll = new Boolean(true);
		disableAfterSearch = new Boolean(false);
		disabledNumber = new Boolean(false);
		disableSeller = new Boolean(false);
	}

	@NotifyChange({ "listBudget" })
	@Command
	public void loadBudgetByField(@BindingParam("field") String field) {
		DaoBudget daoBudget = new DaoBudget();
		listBudget = daoBudget.listOrderBudgetbyField(field);
	}

	@NotifyChange("*")
	@Command
	public void searchBudget(@BindingParam("field") String field,
			@BindingParam("val") String value) {
		DaoBudget daoBudget = new DaoBudget();
		List<Budget> listBudget2 = daoBudget.findByString(field, value);
		int listSize = listBudget2.size();
		if (listSize == 1) {
			budget = listBudget2.get(0);
			disableAfterSearch = new Boolean(true);
			disabledNumber = new Boolean(true);
			disableSeller = new Boolean(true);
			if (budget.getBasicDataByCabinDesign() != null)
				cabinModel = budget.getBasicDataByCabinDesign().getBasicData();
		} else if (listSize == 0) {
			Clients.showNotification("Ningun registro coincide", "info", null,
					"top_center", 2000);
		} else {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("listBudget", listBudget2);
			Window win = (Window) Executions.createComponents(
					"frmWindowBudgets.zul", null, map);
		}
	}

	@NotifyChange("*")
	@Command
	public void searchBudgetId(@BindingParam("field") String field,
			@BindingParam("val") String value) {
		DaoBudget daoBudget = new DaoBudget();
		Integer budgetId = Integer.parseInt(value);
		Budget auxBudget = daoBudget.findByInteger(field, budgetId);
		if (auxBudget != null) {
			budget = auxBudget;
			disableAfterSearch = new Boolean(true);
			disabledNumber = new Boolean(true);
			disableSeller = new Boolean(true);
			if (budget.getBasicDataByCabinDesign() != null)
				cabinModel = budget.getBasicDataByCabinDesign().getBasicData();
		} else
			Clients.showNotification("Ningun registro coincide", "info", null,
					"top_center", 2000);
	}

	@NotifyChange("*")
	@Command
	public void searchBudgetBusinessPartner(@BindingParam("rif") String rif,
			@BindingParam("rifType") String rifType) {
		DaoBudget daoBudget = new DaoBudget();
		List<Budget> listBudget2 = daoBudget.findByString("rifPartner", rif);
		int listSize = listBudget2.size();
		if (listSize == 1) {
			budget = listBudget2.get(0);
			disableAfterSearch = new Boolean(true);
			disabledNumber = new Boolean(true);
			disableSeller = new Boolean(true);
			if (budget.getBasicDataByCabinDesign() != null)
				cabinModel = budget.getBasicDataByCabinDesign().getBasicData();
		} else if (listSize == 0) {
			Clients.showNotification("Ningun registro coincide", "info", null,
					"top_center", 2000);
		} else {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("listBudget", listBudget2);
			Window win = (Window) Executions.createComponents(
					"frmWindowBudgets.zul", null, map);
		}
	}

	@NotifyChange({ "budget", "disabledAll", "budgetNumber",
			"disableAfterSearch", "disabledNumber" })
	@GlobalCommand
	public void selectedBudget(@BindingParam("Budget") Budget budget) {
		this.budget = budget;
		disableAfterSearch = new Boolean(true);
		disabledNumber = new Boolean(true);
		disableSeller = new Boolean(true);
	}

	@Command
	public void close() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("page", "");
		BindUtils.postGlobalCommand(null, null, "selectedPage", map);
	}

	@Command
	public void isStopSequenceContinuous() {
		budget.setStopSequenceEven(false);
		budget.setStopSequenceOdd(false);
		budget.setStopSequenceEvenNumber(0);
		budget.setStopSequenceOddNumber(0);
		budget.setStopSequenceEvenQ(new String());
		budget.setStopSequenceOddQ(new String());
		if (!budget.getStopSequenceContinuous()) {
			budget.setStopSequenceContinuousQ(vacio);
			budget.setStopSequenceContinuousNumber(0);
		}
	}

	@Command
	public void createPdf() {
		/* Tomo la sesion actual de hibernate */
		Session session = StoreHibernateUtil.openSession();
		/* Antes de abrir la conexion se debe iniciar una transaccion */
		session.beginTransaction();
		String string = Sessions.getCurrent().getWebApp()
				.getRealPath("/resource/reports");
		JasperReport jasperReport;
		try {
			jasperReport = (JasperReport) JRLoader.loadObject(string
					+ "/budget.jasper");
		} catch (JRException e) {
			jasperReport = null;
			System.out.println("budget.jasper didn't find");
		}
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("number", budget.getNumber());
		/*
		 * Enviamos por parametro a ireport la ruta de la ubicacion de los
		 * subreportes e imagenes.
		 */
		parameters.put("IMAGES_DIR", "../../resource/images/");
		parameters.put("SUBREPORT_DIR", "../../resource/reports/");
		JasperPrint jasperPrint;
		try {
			jasperPrint = JasperFillManager.fillReport(jasperReport,
					parameters, session.connection());
		} catch (HibernateException e1) {
			jasperPrint = null;
			System.out.println("Connection wasn't obtained.");
		} catch (JRException e1) {
			jasperPrint = null;
			e1.printStackTrace();
		}
		JRExporter jrExporter = new JRPdfExporter();
		jrExporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
		jrExporter.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, string
				+ "/presupuesto" + budget.getNumber() + ".pdf");
		File file = new File(string + "/presupuesto" + budget.getNumber()
				+ ".pdf");
		/* Eliminamos el pdf si ya existia, puesto que no se sobreescribe. */
		if (file.isFile())
			file.delete();
		try {
			jrExporter.exportReport();
		} catch (JRException e) {
			System.out.println("Report wasn't export.");
		}
		session.close();
	}

	@Command
	public void print() throws JRException, IOException,
			ClassNotFoundException, SQLException {
		createPdf();
		String report = new String("/resource/reports/presupuesto"
				+ budget.getNumber() + ".pdf");
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("reportPath", report);
		map.put("reportTitle", "Presupuesto Nardi");
		map.put("absolutePath",
				Sessions.getCurrent().getWebApp()
						.getRealPath("/resource/reports")
						+ "/presupuesto" + budget.getNumber() + ".pdf");
		Window win = (Window) Executions.createComponents("frmReport.zul",
				null, map);
	}

	@NotifyChange({ "listDesign" })
	@Command
	public void loadCabinDesign() {
		listDesign = new DaoBasicdata().listByParent(cabinModel);
		/*
		 * No asigno un nuevo OBJETO en lugar de "null" puesto que me da error
		 * al guardar el objeto budget
		 */
		budget.setBasicDataByCabinDesign(null);
	}

	@NotifyChange({ "listFan", "listRoofType" })
	@Command
	public void loadFans() {
		String elevatorCapacitance = new String(budget
				.getBasicDataByElevatorCapacitance().getName());
		DaoBasicdata daoBasicdata = new DaoBasicdata();
		if (elevatorCapacitance.indexOf("320 - 4") != -1
				|| elevatorCapacitance.indexOf("450 - 6") != -1
				|| elevatorCapacitance.indexOf("600 - 8") != -1) {
			listFan = daoBasicdata.listByField("BUDGET", "FAN 1");
			listRoofType = daoBasicdata.listByParent(budget
					.getBasicDataByElevatorCapacitance());
		} else if (elevatorCapacitance.indexOf("OTRA") != -1) {
			listFan = daoBasicdata.listByField("BUDGET", "FAN 1");
			listFan.addAll(daoBasicdata.listByField("BUDGET", "FAN 2"));
			/*
			 * Escogemos el basicdata con name "450-6" puesto que es el que
			 * tiene todos los roofType asignados. Esto se hace porque no se
			 * sabra que tipo de Capacidad se a�adira.
			 */
			listRoofType = daoBasicdata.listByParent(daoBasicdata.findByName(
					"BUDGET", "ELEVATOR CAPACITANCE", "450 - 6"));
		} else {
			listFan = daoBasicdata.listByField("BUDGET", "FAN 2");
			listRoofType = daoBasicdata.listByParent(budget
					.getBasicDataByElevatorCapacitance());
		}
		/*
		 * No asigno un nuevo OBJETO en lugar de "null" puesto que me da error
		 * al guardar el objeto budget
		 */
		budget.setBasicDataByRoofType(null);
		budget.setBasicDataByFan(null);
		BindUtils.postNotifyChange(null, null, budget, "fan");
		BindUtils.postNotifyChange(null, null, budget, "roofType");
	}

	@NotifyChange({ "listBoothDisplay", "listFloorDisplay" })
	@Command
	public void loadBoothFloorDisplay() {
		String controlType = budget.getBasicDataByControlType().getName();
		if (controlType.indexOf("SISTEL") != -1) {
			listBoothDisplay = new DaoBasicdata().listByField("BUDGET",
					"BOOTH DISPLAY SISTEL");
			listFloorDisplay = new DaoBasicdata().listByField("BUDGET",
					"FLOOR DISPLAY SISTEL");
		} else if (controlType.indexOf("CF CONTROL") != -1) {
			listBoothDisplay = new DaoBasicdata().listByField("BUDGET",
					"BOOTH DISPLAY CF");
			listFloorDisplay = new DaoBasicdata().listByField("BUDGET",
					"FLOOR DISPLAY CF");
		} else {
			listBoothDisplay = new ArrayList<BasicData>();
			listFloorDisplay = new ArrayList<BasicData>();
		}
		budget.setBasicDataByBoothDisplay(null);
		budget.setBasicDataByFloorDisplay(null);
	}

	@NotifyChange({ "isSpecial" })
	@Command
	public void isSpecial() {
		if (budget.getBasicDataByDoorframeType() != null)
			if (budget.getBasicDataByDoorframeType().getName()
					.indexOf("ESPECIAL") != -1)
				isSpecial = new Boolean(true);
			else {
				isSpecial = new Boolean(false);
				budget.setDoorframeTypeComment(vacio);
			}
	}

	@Command
	public void checkWidthDoorFrame(
			@BindingParam("component") InputElement component) {
		if (budget.getBasicDataByDoorframeType() != null
				&& budget.getBasicDataByDoorframeType().getName()
						.indexOf("RECTO - 30X150") != -1
				&& budget.getHallButtonPlace().indexOf("MARCO") != -1) {
			throw new WrongValueException(component,
					"Este tipo no puede ser ubicado en el Marco.");
		}
	}

	@NotifyChange("disableSistelHall")
	@Command
	public void disabledSistelsHall() {
		if (budget.getBasicDataByHallButtonType().getName().indexOf("SISTEL") != -1)
			disableSistelHall = false;
		else {
			disableSistelHall = true;
			budget.setSistelWarrowPb(false);
			budget.setSistelWarrowFloor(0);
			budget.setSistelWdisplayPb(false);
			budget.setSistelWdisplayFloor(0);
		}
	}

	@Command
	public void updateMotorQuantity(
			@ContextParam(ContextType.TRIGGER_EVENT) InputEvent event) {
		/*
		 * Con la linea superior enlazo el evento sobre el input con el
		 * controlador Ver: http://forum.zkoss
		 * .org/question/79590/textbox-onchanging-event-doesnt-work-properly/
		 */
		if (budget.isType()) {
			budget.setMotorQuantity(Integer.parseInt(event.getValue()));
			BindUtils.postNotifyChange(null, null, budget, "motorQuantity");
		}
	}

	@Command
	public void activeDesignComment() {
		String cabinDesign = new String();
		String floorType = new String();
		if (budget.getBasicDataByCabinDesign() != null)
			cabinDesign = budget.getBasicDataByCabinDesign().getName();
		if (budget.getBasicDataByFloorType() != null)
			floorType = budget.getBasicDataByFloorType().getName();
		if (cabinDesign.indexOf("FORMICA") != -1
				|| floorType.indexOf("OTROS") != -1)
			budget.setDesignSpecial(true);
		/*
		 * IMPORTANTE Solo actualizao una propiedad del objeto BUDGET, mas no
		 * todo el objeto
		 */
		BindUtils.postNotifyChange(null, null, budget, "designSpecial");
	}

	@Command
	public void isDesignSpecial() {
		budget.setDesignSpecialComment(vacio);
	}

	@Command
	public void searchBusinessPartner(@BindingParam("rif") String rif) {
		DaoBusinessPartner daoBusinessPartner = new DaoBusinessPartner();
		businessPartner = daoBusinessPartner.findActiveByRif(rif);
		if (businessPartner == null) {
			Window win = (Window) Executions.createComponents(
					"frmBusinessPartner.zul", null, null);
		} else {
			budget.setPartnerName(businessPartner.getName());
			budget.setRifPartner(businessPartner.getRif());
			budget.setRifType(businessPartner.getBasicData().getName()
					.charAt(0));
			BindUtils.postNotifyChange(null, null, budget, "partnerName");
			BindUtils.postNotifyChange(null, null, budget, "rifType");
			BindUtils.postNotifyChange(null, null, budget, "rifPartner");
		}
	}

	@GlobalCommand
	public void selectedBusinessPartner(
			@BindingParam("BusinessPartner") BusinessPartner businessPartner) {
		if (businessPartner != null) {
			this.businessPartner = businessPartner;
			budget.setPartnerName(businessPartner.getName());
			budget.setRifPartner(businessPartner.getRif());
			budget.setRifType(businessPartner.getBasicData().getName()
					.charAt(0));
		} else {
			budget.setPartnerName(null);
			budget.setRifPartner("");
			budget.setRifType('-');
		}
		BindUtils.postNotifyChange(null, null, budget, "partnerName");
		BindUtils.postNotifyChange(null, null, budget, "rifType");
		BindUtils.postNotifyChange(null, null, budget, "rifPartner");
	}
}