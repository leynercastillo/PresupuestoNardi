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
import org.zkoss.bind.Validator;
import org.zkoss.bind.annotation.BindingParam;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.GlobalCommand;
import org.zkoss.bind.annotation.Init;
import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.zhtml.Messagebox;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.Sessions;
import org.zkoss.zk.ui.WrongValueException;
import org.zkoss.zul.Window;
import org.zkoss.zul.impl.InputElement;

import dao.DaoBasicdata;
import dao.DaoBudget;
import dao.DaoSecurityUser;
import database.Basicdata;
import database.Budget;

/**
 * @author leyner.castillo
 * 
 */
public class FrmBudgetCtrl {

	private String seleccione = new String("--Seleccione--");
	private static final String vacio = new String(" ");
	private List<Basicdata> listBType;
	private List<Basicdata> listElevatorType;
	private List<Basicdata> listElevatorCapa;
	private List<Basicdata> listMachineType;
	private List<Basicdata> listBEmbarque;
	private List<Basicdata> listElectricityType;
	private List<Basicdata> listSpeed;
	private List<Basicdata> listFrequency;
	private List<Basicdata> listVoltageLighting;
	private List<Basicdata> listHourMachine;
	private List<Basicdata> listManeuverType;
	private List<Basicdata> listDesign;
	private List<Basicdata> listRoofType;
	private List<Basicdata> listButtonType;
	private List<Basicdata> listRailing;
	private List<Basicdata> listMirror;
	private List<Basicdata> listFloorType;
	private List<Basicdata> listFan;
	private List<Basicdata> listDoorType;
	private List<Basicdata> listDoorSystem;
	private List<Basicdata> listDoorframeType;
	private List<Basicdata> listDoorframeHammered;
	private List<Basicdata> listFreeAdmission;
	private List<Basicdata> listHeight;
	private List<Basicdata> listControlType;
	private List<Basicdata> listBoothButton;
	private List<Basicdata> listBoothDisplay;
	private List<Basicdata> listFloorDisplay;
	private List<Basicdata> listMotorTraction;
	private List<Basicdata> listCabinModel;
	private List<Basicdata> listHallButton;
	private List<Basicdata> listHallButtonType;
	private List<Budget> listBudget;
	private Basicdata cabinModel;
	private Boolean stainlessSteel;
	private Boolean hammeredGray;
	private Boolean hammeredBrown;
	private Boolean disabledAll;
	private Boolean disableAfterSearch;
	private Boolean disabledNumber;
	private Boolean disabledModel;
	private Boolean disableSeller;
	private Boolean isSpecial;
	private Integer sistelWDisplayFloor;
	private Integer sistelWDisplayPB;
	private Integer sistelWArrowFloor;
	private Integer sistelWArrowPB;
	private Budget budget;

	public Boolean getDisableSeller() {
		return disableSeller;
	}

	public void setDisableSeller(Boolean disableSeller) {
		this.disableSeller = disableSeller;
	}

	public List<Basicdata> getListHallButton() {
		return listHallButton;
	}

	public void setListHallButton(List<Basicdata> listHallButton) {
		this.listHallButton = listHallButton;
	}

	public List<Basicdata> getListHallButtonType() {
		return listHallButtonType;
	}

	public void setListHallButtonType(List<Basicdata> listHallButtonType) {
		this.listHallButtonType = listHallButtonType;
	}

	public List<Basicdata> getListDoorframeHammered() {
		return listDoorframeHammered;
	}

	public void setListDoorframeHammered(List<Basicdata> listDoorframeHammered) {
		this.listDoorframeHammered = listDoorframeHammered;
	}

	public Boolean getIsSpecial() {
		return isSpecial;
	}

	public void setIsSpecial(Boolean isSpecial) {
		this.isSpecial = isSpecial;
	}

	public Boolean getDisabledModel() {
		return disabledModel;
	}

	public void setDisabledModel(Boolean disabledModel) {
		this.disabledModel = disabledModel;
	}

	public List<Basicdata> getListDesign() {
		return listDesign;
	}

	public void setListDesign(List<Basicdata> listDesign) {
		this.listDesign = listDesign;
	}

	public Basicdata getCabinModel() {
		return cabinModel;
	}

	public void setCabinModel(Basicdata cabinModel) {
		this.cabinModel = cabinModel;
	}

	public List<Basicdata> getListCabinModel() {
		return listCabinModel;
	}

	public void setListCabinModel(List<Basicdata> listCabinModel) {
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

	public List<Basicdata> getListMotorTraction() {
		return listMotorTraction;
	}

	public void setListMotorTraction(List<Basicdata> listMotorTraction) {
		this.listMotorTraction = listMotorTraction;
	}

	public List<Basicdata> getListFloorDisplay() {
		return listFloorDisplay;
	}

	public void setListFloorDisplay(List<Basicdata> listFloorDisplay) {
		this.listFloorDisplay = listFloorDisplay;
	}

	public List<Basicdata> getListBoothDisplay() {
		return listBoothDisplay;
	}

	public void setListBoothDisplay(List<Basicdata> listBoothDisplay) {
		this.listBoothDisplay = listBoothDisplay;
	}

	public List<Basicdata> getListBoothButton() {
		return listBoothButton;
	}

	public void setListBoothButton(List<Basicdata> listBoothButton) {
		this.listBoothButton = listBoothButton;
	}

	public List<Basicdata> getListControlType() {
		return listControlType;
	}

	public void setListControlType(List<Basicdata> listControlType) {
		this.listControlType = listControlType;
	}

	public List<Basicdata> getListHeight() {
		return listHeight;
	}

	public void setListHeight(List<Basicdata> listHeight) {
		this.listHeight = listHeight;
	}

	public List<Basicdata> getListFreeAdmission() {
		return listFreeAdmission;
	}

	public void setListFreeAdmission(List<Basicdata> listFreeAdmission) {
		this.listFreeAdmission = listFreeAdmission;
	}

	public List<Basicdata> getListDoorframeType() {
		return listDoorframeType;
	}

	public void setListDoorframeType(List<Basicdata> listDoorframeType) {
		this.listDoorframeType = listDoorframeType;
	}

	public List<Basicdata> getListDoorSystem() {
		return listDoorSystem;
	}

	public void setListDoorSystem(List<Basicdata> listDoorSystem) {
		this.listDoorSystem = listDoorSystem;
	}

	public List<Basicdata> getListDoorType() {
		return listDoorType;
	}

	public void setListDoorType(List<Basicdata> listDoorType) {
		this.listDoorType = listDoorType;
	}

	public List<Basicdata> getListFan() {
		return listFan;
	}

	public void setListFan(List<Basicdata> listFan) {
		this.listFan = listFan;
	}

	public List<Basicdata> getListFloorType() {
		return listFloorType;
	}

	public void setListFloorType(List<Basicdata> listFloorType) {
		this.listFloorType = listFloorType;
	}

	public List<Basicdata> getListMirror() {
		return listMirror;
	}

	public void setListMirror(List<Basicdata> listMirror) {
		this.listMirror = listMirror;
	}

	public List<Basicdata> getListRailing() {
		return listRailing;
	}

	public void setListRailing(List<Basicdata> listRailing) {
		this.listRailing = listRailing;
	}

	public List<Basicdata> getListButtonType() {
		return listButtonType;
	}

	public void setListButtonType(List<Basicdata> listButtonType) {
		this.listButtonType = listButtonType;
	}

	public List<Basicdata> getListRoofType() {
		return listRoofType;
	}

	public void setListRoofType(List<Basicdata> listRoofType) {
		this.listRoofType = listRoofType;
	}

	public List<Basicdata> getListManeuverType() {
		return listManeuverType;
	}

	public void setListManeuverType(List<Basicdata> listManeuverType) {
		this.listManeuverType = listManeuverType;
	}

	public List<Basicdata> getListHourMachine() {
		return listHourMachine;
	}

	public void setListHourMachine(List<Basicdata> listHourMachine) {
		this.listHourMachine = listHourMachine;
	}

	public List<Basicdata> getListVoltageLighting() {
		return listVoltageLighting;
	}

	public void setListVoltageLighting(List<Basicdata> listVoltageLighting) {
		this.listVoltageLighting = listVoltageLighting;
	}

	public List<Basicdata> getListFrequency() {
		return listFrequency;
	}

	public void setListFrequency(List<Basicdata> listFrequency) {
		this.listFrequency = listFrequency;
	}

	public List<Basicdata> getListSpeed() {
		return listSpeed;
	}

	public void setListSpeed(List<Basicdata> listSpeed) {
		this.listSpeed = listSpeed;
	}

	public List<Basicdata> getListElectricityType() {
		return listElectricityType;
	}

	public void setListElectricityType(List<Basicdata> listElectricityType) {
		this.listElectricityType = listElectricityType;
	}

	public List<Basicdata> getListBEmbarque() {
		return listBEmbarque;
	}

	public void setListBEmbarque(List<Basicdata> listBEmbarque) {
		this.listBEmbarque = listBEmbarque;
	}

	public List<Basicdata> getListMachineType() {
		return listMachineType;
	}

	public void setListMachineType(List<Basicdata> listMachineType) {
		this.listMachineType = listMachineType;
	}

	public List<Basicdata> getListElevatorCapa() {
		return listElevatorCapa;
	}

	public void setListElevatorCapa(List<Basicdata> listElevatorCapa) {
		this.listElevatorCapa = listElevatorCapa;
	}

	public List<Basicdata> getListElevatorType() {
		return listElevatorType;
	}

	public void setListElevatorType(List<Basicdata> listElevatorType) {
		this.listElevatorType = listElevatorType;
	}

	public List<Basicdata> getListBType() {
		return listBType;
	}

	public void setListBType(List<Basicdata> listBType) {
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
		if (daoBudget.listOrderBudgetbyField("status").isEmpty())
			budget.setNumber(1);
		else
			budget.setNumber(daoBudget.listOrderBudgetbyField("status")
					.get(daoBudget.listOrderBudgetbyField("status").size() - 1)
					.getNumber() + 1);
		disabledAll = new Boolean(false);
		disableAfterSearch = new Boolean(false);
		disabledNumber = new Boolean(true);
		disabledModel = new Boolean(false);
		disableSeller = new Boolean(true);
		isSpecial = new Boolean(false);
		cabinModel = new Basicdata();
		User user = (User) SecurityContextHolder.getContext()
				.getAuthentication().getPrincipal();
		/*
		 * Se busca por nombre, porque el objeto "auxUser" tipo "User" no
		 * almacena email
		 */
		budget.setSeller(new DaoSecurityUser().findByString("name",
				user.getUsername()).getName());
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
		listBType = daoBasicdata.listByField("BUDGET", "BUILDING TYPE");
		listElevatorType = daoBasicdata.listByField("BUDGET", "ELEVATOR TYPE");
		listElevatorCapa = daoBasicdata.listByField("BUDGET",
				"ELEVATOR CAPACITANCE");
		listMachineType = daoBasicdata.listByField("BUDGET", "MACHINE TYPE");
		listBEmbarque = daoBasicdata.listByField("BUDGET", "BUILDING EMBARQUE");
		listElectricityType = daoBasicdata.listByField("BUDGET",
				"ELECTRICITY TYPE");
		listSpeed = daoBasicdata.listByField("BUDGET", "SPEED");
		listFrequency = daoBasicdata.listByField("BUDGET", "FREQUENCY");
		listVoltageLighting = daoBasicdata.listByField("BUDGET",
				"VOLTAGE LIGHTING");
		listHourMachine = daoBasicdata.listByField("BUDGET", "HOUR MACHINE");
		listManeuverType = daoBasicdata.listByField("BUDGET", "MANEUVER TYPE");
		listDesign = new ArrayList<Basicdata>();
		listRoofType = daoBasicdata.listByField("BUDGET", "ROOF TYPE");
		listButtonType = daoBasicdata.listByField("BUDGET", "BUTTON TYPE");
		listRailing = daoBasicdata.listByField("BUDGET", "RAILING");
		listMirror = daoBasicdata.listByField("BUDGET", "MIRROR");
		listFloorType = daoBasicdata.listByField("BUDGET", "FLOOR TYPE");
		listFan = daoBasicdata.listByField("BUDGET", "FAN");
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
		listBoothDisplay = daoBasicdata.listByField("BUDGET", "BOOTH DISPLAY");
		listFloorDisplay = daoBasicdata.listByField("BUDGET", "FLOOR DISPLAY");
		listMotorTraction = daoBasicdata
				.listByField("BUDGET", "MOTOR TRACTION");
		listCabinModel = daoBasicdata.listByField("BUDGET", "CABIN MODEL");
		listBudget = new ArrayList<Budget>();
		budget.setSistelWarrowFloor(0);
		budget.setSistelWdisplayPb(new Boolean(false));
		budget.setSistelWdisplayFloor(0);
		budget.setSistelWarrowPb(new Boolean(false));
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

	public String message() {
		String seller = new String(budget.getSeller());
		String message = new String();
		message = "Presupuesto enviado por " + seller + "\n\nCliente: "
				+ budget.getPartnerName() + "\n\nCantidad ascensores: "
				+ budget.getElevatorQuantity() + "\n\nCiudad: "
				+ budget.getConstructionCity();
		return message;
	}

	public List<File> adjuntos(){
		List<File> listAttach = new ArrayList<File>();
		createPdf();
		File file = new File(Sessions.getCurrent().getWebApp().getRealPath("/resource/reports/presupuesto"+budget.getNumber()+".pdf"));
		listAttach.add(file);
		return listAttach;
	}

	public void sendMail(){
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
		checkboxChecking();
		if (budget.getBasicdataByDoorframeType() != null
				&& budget.getBasicdataByDoorframeType().getName()
						.compareTo("RECTO - 30X150") == 0
				&& (budget.getHallButtonPlace().compareTo("MARCO") == 0)) {
			throw new WrongValueException(component,
					"Chequee el tipo de marco.");
		} else {
			DaoBudget daoBudget = new DaoBudget();
			if (daoBudget.listOrderBudgetbyField("status").isEmpty())
				budget.setNumber(1);
			else
				budget.setNumber(daoBudget
						.listOrderBudgetbyField("status")
						.get(daoBudget.listOrderBudgetbyField("status").size() - 1)
						.getNumber() + 1);
			if (!daoBudget.save(budget)) {
				Messagebox.show("Fallo Guardado Budget", "Error",
						Messagebox.OK, Messagebox.ERROR);
				return;
			}
			Messagebox.show("Presupuesto enviado", "Information",
					Messagebox.OK, Messagebox.INFORMATION);
			sendMail();
			restartForm();
		}
	}

	@NotifyChange({ "disabledAll", "budgetNumber", "budget",
			"disableAfterSearch", "disabledNumber", "stopSequenceContinuous" })
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
		} else if (listSize == 0) {
			Messagebox.show("Ningun registro coincide");
		} else {
			Map map = new HashMap();
			map.put("listBudget", listBudget2);
			Window win = (Window) Executions.createComponents(
					"frmWindowBudgets.zul", null, map);
			listBudget = listBudget2;
		}
	}

	@NotifyChange("*")
	@Command
	public void searchBudgetId(@BindingParam("field") String field,
			@BindingParam("val") String value) {
		DaoBudget daoBudget = new DaoBudget();
		Integer budgetId = Integer.parseInt(value);
		List<Budget> listBudget2 = daoBudget.findByInteger(field, budgetId);
		budget = listBudget2.get(0);
		disableAfterSearch = new Boolean(true);
		disabledNumber = new Boolean(true);
		disableSeller = new Boolean(true);
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
		Map map = new HashMap();
		map.put("page", "");
		BindUtils.postGlobalCommand(null, null, "selectedPage", map);
	}

	public void checkboxChecking() {
		if (!budget.getStopSequenceContinuous())
			budget.setStopSequenceContinuousQ(vacio);
		if (!budget.getStopSequenceEven())
			budget.setStopSequenceEvenQ(vacio);
		if (!budget.getStopSequenceOdd())
			budget.setStopSequenceOddQ(vacio);
		if (!budget.getDesignSpecial())
			budget.setDesignSpecialComment(vacio);
		if (!budget.getDoorFrameStainless())
			budget.setDoorFrameStainlessDescrip(vacio);
	}

	@Command
	public void isStopSequenceContinuous() {
		budget.setStopSequenceEven(false);
		budget.setStopSequenceOdd(false);
		budget.setStopSequenceEvenQ(new String());
		budget.setStopSequenceOddQ(new String());
		if (!budget.getStopSequenceContinuous())
			budget.setStopSequenceContinuousQ(vacio);
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
		Map parameters = new HashMap();
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
		File file = new File(string+"/presupuesto" + budget.getNumber() + ".pdf");
		/*Eliminamos el pdf si ya existia, puesto que no se sobreescribe.*/
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
		Map map = new HashMap();
		map.put("reportPath", report);
		map.put("reportTitle", "Presupuesto Nardi");
		map.put("absolutePath", Sessions.getCurrent().getWebApp()
				.getRealPath("/resource/reports") + "/presupuesto" + budget.getNumber()
				+ ".pdf");
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
		budget.setBasicdataByCabinDesign(null);
	}

	@NotifyChange({ "disabledModel", "listDesign", "cabinModel" })
	@Command
	public void disableModel() {
		disabledModel = !disabledModel;
		cabinModel = new Basicdata();
		listDesign = new ArrayList<Basicdata>();
		/*
		 * No asigno un nuevo OBJETO en lugar de "null" puesto que me da error
		 * al guardar el objeto budget
		 */
		budget.setBasicdataByCabinDesign(null);
	}

	@NotifyChange({ "isSpecial" })
	@Command
	public void isSpecial() {
		if (budget.getBasicdataByDoorframeType() != null)
			if (budget.getBasicdataByDoorframeType().getName()
					.compareTo("ESPECIAL") == 0)
				isSpecial = new Boolean(true);
			else {
				isSpecial = new Boolean(false);
				budget.setDoorframeTypeComment(vacio);
			}
	}

	@Command
	public void checkWidthDoorFrame(
			@BindingParam("component") InputElement component) {
		if (budget.getBasicdataByDoorframeType() != null
				&& budget.getBasicdataByDoorframeType().getName()
						.compareTo("RECTO - 30X150") == 0
				&& (budget.getHallButtonPlace().compareTo("MARCO") == 0)) {
			throw new WrongValueException(component,
					"Chequee el tipo de marco.");
		}
	}
}