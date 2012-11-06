package controller;

import general.Validate;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.zkoss.bind.Validator;
import org.zkoss.bind.annotation.BindingParam;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.Init;
import org.zkoss.zhtml.Messagebox;
import org.zkoss.zul.impl.InputElement;

import dao.DaoBasicData;
import dao.DaoBudget;
import database.Basicdata;
import database.Budget;

/**
 * @author leyner.castillo
 * 
 */
public class FrmIndexCtrl {

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
	private List<Basicdata> listDesign1357;
	private List<Basicdata> listDesignP26;
	private List<Basicdata> listRoofType;
	private List<Basicdata> listButtonType;
	private List<Basicdata> listRailing;
	private List<Basicdata> listMirror;
	private List<Basicdata> listFloorType;
	private List<Basicdata> listFan;
	private List<Basicdata> listDoorType;
	private List<Basicdata> listDoorSystem;
	private List<Basicdata> listDoorframeType;
	private List<Basicdata> listFreeAdmission;
	private List<Basicdata> listHeight;
	private List<Basicdata> listControlType;
	private List<Basicdata> listBoothButton;
	private List<Basicdata> listBoothDisplay;
	private List<Basicdata> listFloorDisplay;
	private List<Basicdata> listMotorTraction;
	private Budget budget;

	public List<Basicdata> getListMotorTraction() {
		return listMotorTraction;
	}

	public void setListMotorTraction(List<Basicdata> listMotorTraction) {
		this.listMotorTraction = listMotorTraction;
	}

	public Budget getBudget() {
		return budget;
	}

	public void setBudget(Budget budget) {
		this.budget = budget;
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

	public List<Basicdata> getListDesignP26() {
		return listDesignP26;
	}

	public void setListDesignP26(List<Basicdata> listDesignP26) {
		this.listDesignP26 = listDesignP26;
	}

	public List<Basicdata> getListDesign1357() {
		return listDesign1357;
	}

	public void setListDesign1357(List<Basicdata> listDesign1357) {
		this.listDesign1357 = listDesign1357;
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
	 * Método que inicializa la pantalla frmIndex. Se ejecuta antes de
	 * finalizar la carga del archivo DOM que muestra el navegador.
	 * 
	 * Inicializa cada una de la variables insertadas en zul.
	 */
	@Init
	public void init() {
		DaoBasicData daoBasicData = new DaoBasicData();
		DaoBudget daoBudget = new DaoBudget();
		budget = new Budget();
		int budgetSizes = daoBudget.list(Budget.class).size();
		if (budgetSizes == 0)
			budget.setNumber(1);
		else
			budget.setNumber(daoBudget.list(Budget.class).get(daoBudget.list(Budget.class).size()-1).getNumber()+1);
		budget.setDate(new Date());
		listBType = daoBasicData.findByDescription("BUDGET", "BUILDING TYPE");
		listElevatorType = daoBasicData.findByDescription("BUDGET","ELEVATOR TYPE");
		listElevatorCapa = daoBasicData.findByDescription("BUDGET","ELEVATOR CAPACITANCE");
		listMachineType = daoBasicData.findByDescription("BUDGET","MACHINE TYPE");
		listBEmbarque = daoBasicData.findByDescription("BUDGET","BUILDING EMBARQUE");
		listElectricityType = daoBasicData.findByDescription("BUDGET","ELECTRICITY TYPE");
		listSpeed = daoBasicData.findByDescription("BUDGET", "SPEED");
		listFrequency = daoBasicData.findByDescription("BUDGET", "FREQUENCY");
		listVoltageLighting = daoBasicData.findByDescription("BUDGET","VOLTAGE LIGHTING");
		listHourMachine = daoBasicData.findByDescription("BUDGET","HOUR MACHINE");
		listManeuverType = daoBasicData.findByDescription("BUDGET","MANEUVER TYPE");
		listDesign1357 = daoBasicData.findByDescription("BUDGET", "DESIGN 1357");
		listDesignP26 = daoBasicData.findByDescription("BUDGET", "DESIGN P26");
		listRoofType = daoBasicData.findByDescription("BUDGET", "ROOF TYPE");
		listButtonType = daoBasicData.findByDescription("BUDGET", "BUTTON TYPE");
		listRailing = daoBasicData.findByDescription("BUDGET", "RAILING");
		listMirror = daoBasicData.findByDescription("BUDGET", "MIRROR");
		listFloorType = daoBasicData.findByDescription("BUDGET", "FLOOR TYPE");
		listFan = daoBasicData.findByDescription("BUDGET", "FAN");
		listDoorType = daoBasicData.findByDescription("BUDGET", "DOOR TYPE");
		listDoorSystem = daoBasicData.findByDescription("BUDGET", "DOOR SYSTEM");
		listDoorframeType = daoBasicData.findByDescription("BUDGET","DOOR FRAME TYPE");
		listFreeAdmission = daoBasicData.findByDescription("BUDGET","FREE ADMISSION");
		listHeight = daoBasicData.findByDescription("BUDGET", "HEIGHT");
		listControlType = daoBasicData.findByDescription("BUDGET","CONTROL TYPE");
		listBoothButton = daoBasicData.findByDescription("BUDGET","BOOTH BUTTON");
		listBoothDisplay = daoBasicData.findByDescription("BUDGET","BOOTH DISPLAY");
		listFloorDisplay = daoBasicData.findByDescription("BUDGET","FLOOR DISPLAY");
		listMotorTraction = daoBasicData.findByDescription("BUDGET","MOTOR TRACTION");
	}

	@Command
	public void clickToEnableToDisable(@BindingParam("Component") InputElement element) {
		if(element.isDisabled())
			element.setDisabled(false);
		else
			element.setDisabled(true);
	}

	@Command
	public void save(){
		DaoBudget daoBudget = new DaoBudget();
		System.out.println(budget);
		daoBudget.save(budget);
		Messagebox.show("Guardado");
	}
}