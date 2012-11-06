package controller;

import general.Validate;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.zkoss.bind.Validator;
import org.zkoss.bind.annotation.BindingParam;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.Init;
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
	private Basicdata selectedBType;
	private List<Basicdata> listElevatorType;
	private Basicdata selectedElevatorType;
	private List<Basicdata> listElevatorCapa;
	private Basicdata selectedElevatorCapa;
	private List<Basicdata> listMachineType;
	private Basicdata selectedMachineType;
	private List<Basicdata> listBEmbarque;
	private Basicdata selectedBEmbarque;
	private List<Basicdata> listElectricityType;
	private Basicdata selectedElectricityType;
	private List<Basicdata> listSpeed;
	private Basicdata selectedSpeed;
	private List<Basicdata> listFrequency;
	private Basicdata selectedFrequency;
	private List<Basicdata> listVoltageLighting;
	private Basicdata selectedVoltageLighting;
	private List<Basicdata> listHourMachine;
	private Basicdata selectedHourMachine;
	private List<Basicdata> listManeuverType;
	private Basicdata selectedManeuverType;
	private List<Basicdata> listDesign1357;
	private Basicdata selectedDesign1357;
	private List<Basicdata> listDesignP26;
	private Basicdata selectedDesignP26;
	private List<Basicdata> listRoofType;
	private Basicdata selectedRoofType;
	private List<Basicdata> listButtonType;
	private Basicdata selectedButtonType;
	private List<Basicdata> listRailing;
	private Basicdata selectedRailing;
	private List<Basicdata> listMirror;
	private Basicdata selectedMirror;
	private List<Basicdata> listFloorType;
	private Basicdata selectedFloorType;
	private List<Basicdata> listFan;
	private Basicdata selectedFan;
	private List<Basicdata> listDoorType;
	private Basicdata selectedDoorType;
	private List<Basicdata> listDoorSystem;
	private Basicdata selectedDoorSystem;
	private List<Basicdata> listDoorframeType;
	private Basicdata selectedDoorframeType;
	private List<Basicdata> listFreeAdmission;
	private Basicdata selectedFreeAdmission;
	private List<Basicdata> listHeight;
	private Basicdata selectedHeight;
	private List<Basicdata> listControlType;
	private Basicdata selectedControlType;
	private List<Basicdata> listBoothButton;
	private Basicdata selectedBoothButton;
	private List<Basicdata> listBoothDisplay;
	private Basicdata selectedBoothDisplay;
	private List<Basicdata> listFloorDisplay;
	private Basicdata selectedFloorDisplay;
	private Budget budget;

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

	public Basicdata getSelectedFloorDisplay() {
		return selectedFloorDisplay;
	}

	public void setSelectedFloorDisplay(Basicdata selectedFloorDisplay) {
		this.selectedFloorDisplay = selectedFloorDisplay;
	}

	public List<Basicdata> getListBoothDisplay() {
		return listBoothDisplay;
	}

	public void setListBoothDisplay(List<Basicdata> listBoothDisplay) {
		this.listBoothDisplay = listBoothDisplay;
	}

	public Basicdata getSelectedBoothDisplay() {
		return selectedBoothDisplay;
	}

	public void setSelectedBoothDisplay(Basicdata selectedBoothDisplay) {
		this.selectedBoothDisplay = selectedBoothDisplay;
	}

	public List<Basicdata> getListBoothButton() {
		return listBoothButton;
	}

	public void setListBoothButton(List<Basicdata> listBoothButton) {
		this.listBoothButton = listBoothButton;
	}

	public Basicdata getSelectedBoothButton() {
		return selectedBoothButton;
	}

	public void setSelectedBoothButton(Basicdata selectedBoothButton) {
		this.selectedBoothButton = selectedBoothButton;
	}

	public List<Basicdata> getListControlType() {
		return listControlType;
	}

	public void setListControlType(List<Basicdata> listControlType) {
		this.listControlType = listControlType;
	}

	public Basicdata getSelectedControlType() {
		return selectedControlType;
	}

	public void setSelectedControlType(Basicdata selectedControlType) {
		this.selectedControlType = selectedControlType;
	}

	public List<Basicdata> getListHeight() {
		return listHeight;
	}

	public void setListHeight(List<Basicdata> listHeight) {
		this.listHeight = listHeight;
	}

	public Basicdata getSelectedHeight() {
		return selectedHeight;
	}

	public void setSelectedHeight(Basicdata selectedHeight) {
		this.selectedHeight = selectedHeight;
	}

	public List<Basicdata> getListFreeAdmission() {
		return listFreeAdmission;
	}

	public void setListFreeAdmission(List<Basicdata> listFreeAdmission) {
		this.listFreeAdmission = listFreeAdmission;
	}

	public Basicdata getSelectedFreeAdmission() {
		return selectedFreeAdmission;
	}

	public void setSelectedFreeAdmission(Basicdata selectedFreeAdmission) {
		this.selectedFreeAdmission = selectedFreeAdmission;
	}

	public List<Basicdata> getListDoorframeType() {
		return listDoorframeType;
	}

	public void setListDoorframeType(List<Basicdata> listDoorframeType) {
		this.listDoorframeType = listDoorframeType;
	}

	public Basicdata getSelectedDoorframeType() {
		return selectedDoorframeType;
	}

	public void setSelectedDoorframeType(Basicdata selectedDoorframeType) {
		this.selectedDoorframeType = selectedDoorframeType;
	}

	public List<Basicdata> getListDoorSystem() {
		return listDoorSystem;
	}

	public void setListDoorSystem(List<Basicdata> listDoorSystem) {
		this.listDoorSystem = listDoorSystem;
	}

	public Basicdata getSelectedDoorSystem() {
		return selectedDoorSystem;
	}

	public void setSelectedDoorSystem(Basicdata selectedDoorSystem) {
		this.selectedDoorSystem = selectedDoorSystem;
	}

	public List<Basicdata> getListDoorType() {
		return listDoorType;
	}

	public void setListDoorType(List<Basicdata> listDoorType) {
		this.listDoorType = listDoorType;
	}

	public Basicdata getSelectedDoorType() {
		return selectedDoorType;
	}

	public void setSelectedDoorType(Basicdata selectedDoorType) {
		this.selectedDoorType = selectedDoorType;
	}

	public List<Basicdata> getListFan() {
		return listFan;
	}

	public void setListFan(List<Basicdata> listFan) {
		this.listFan = listFan;
	}

	public Basicdata getSelectedFan() {
		return selectedFan;
	}

	public void setSelectedFan(Basicdata selectedFan) {
		this.selectedFan = selectedFan;
	}

	public List<Basicdata> getListFloorType() {
		return listFloorType;
	}

	public void setListFloorType(List<Basicdata> listFloorType) {
		this.listFloorType = listFloorType;
	}

	public Basicdata getSelectedFloorType() {
		return selectedFloorType;
	}

	public void setSelectedFloorType(Basicdata selectedFloorType) {
		this.selectedFloorType = selectedFloorType;
	}

	public List<Basicdata> getListMirror() {
		return listMirror;
	}

	public void setListMirror(List<Basicdata> listMirror) {
		this.listMirror = listMirror;
	}

	public Basicdata getSelectedMirror() {
		return selectedMirror;
	}

	public void setSelectedMirror(Basicdata selectedMirror) {
		this.selectedMirror = selectedMirror;
	}

	public List<Basicdata> getListRailing() {
		return listRailing;
	}

	public void setListRailing(List<Basicdata> listRailing) {
		this.listRailing = listRailing;
	}

	public Basicdata getSelectedRailing() {
		return selectedRailing;
	}

	public void setSelectedRailing(Basicdata selectedRailing) {
		this.selectedRailing = selectedRailing;
	}

	public List<Basicdata> getListButtonType() {
		return listButtonType;
	}

	public void setListButtonType(List<Basicdata> listButtonType) {
		this.listButtonType = listButtonType;
	}

	public Basicdata getSelectedButtonType() {
		return selectedButtonType;
	}

	public void setSelectedButtonType(Basicdata selectedButtonType) {
		this.selectedButtonType = selectedButtonType;
	}

	public List<Basicdata> getListRoofType() {
		return listRoofType;
	}

	public void setListRoofType(List<Basicdata> listRoofType) {
		this.listRoofType = listRoofType;
	}

	public Basicdata getSelectedRoofType() {
		return selectedRoofType;
	}

	public void setSelectedRoofType(Basicdata selectedRoofType) {
		this.selectedRoofType = selectedRoofType;
	}

	public List<Basicdata> getListDesignP26() {
		return listDesignP26;
	}

	public void setListDesignP26(List<Basicdata> listDesignP26) {
		this.listDesignP26 = listDesignP26;
	}

	public Basicdata getSelectedDesignP26() {
		return selectedDesignP26;
	}

	public void setSelectedDesignP26(Basicdata selectedDesignP26) {
		this.selectedDesignP26 = selectedDesignP26;
	}

	public List<Basicdata> getListDesign1357() {
		return listDesign1357;
	}

	public void setListDesign1357(List<Basicdata> listDesign1357) {
		this.listDesign1357 = listDesign1357;
	}

	public Basicdata getSelectedDesign1357() {
		return selectedDesign1357;
	}

	public void setSelectedDesign1357(Basicdata selectedDesign1357) {
		this.selectedDesign1357 = selectedDesign1357;
	}

	public List<Basicdata> getListManeuverType() {
		return listManeuverType;
	}

	public void setListManeuverType(List<Basicdata> listManeuverType) {
		this.listManeuverType = listManeuverType;
	}

	public Basicdata getSelectedManeuverType() {
		return selectedManeuverType;
	}

	public void setSelectedManeuverType(Basicdata selectedManeuverType) {
		this.selectedManeuverType = selectedManeuverType;
	}

	public List<Basicdata> getListHourMachine() {
		return listHourMachine;
	}

	public void setListHourMachine(List<Basicdata> listHourMachine) {
		this.listHourMachine = listHourMachine;
	}

	public Basicdata getSelectedHourMachine() {
		return selectedHourMachine;
	}

	public void setSelectedHourMachine(Basicdata selectedHourMachine) {
		this.selectedHourMachine = selectedHourMachine;
	}

	public List<Basicdata> getListVoltageLighting() {
		return listVoltageLighting;
	}

	public void setListVoltageLighting(List<Basicdata> listVoltageLighting) {
		this.listVoltageLighting = listVoltageLighting;
	}

	public Basicdata getSelectedVoltageLighting() {
		return selectedVoltageLighting;
	}

	public void setSelectedVoltageLighting(Basicdata selectedVoltageLighting) {
		this.selectedVoltageLighting = selectedVoltageLighting;
	}

	public List<Basicdata> getListFrequency() {
		return listFrequency;
	}

	public void setListFrequency(List<Basicdata> listFrequency) {
		this.listFrequency = listFrequency;
	}

	public Basicdata getSelectedFrequency() {
		return selectedFrequency;
	}

	public void setSelectedFrequency(Basicdata selectedFrequency) {
		this.selectedFrequency = selectedFrequency;
	}

	public List<Basicdata> getListSpeed() {
		return listSpeed;
	}

	public void setListSpeed(List<Basicdata> listSpeed) {
		this.listSpeed = listSpeed;
	}

	public Basicdata getSelectedSpeed() {
		return selectedSpeed;
	}

	public void setSelectedSpeed(Basicdata selectedSpeed) {
		this.selectedSpeed = selectedSpeed;
	}

	public List<Basicdata> getListElectricityType() {
		return listElectricityType;
	}

	public void setListElectricityType(List<Basicdata> listElectricityType) {
		this.listElectricityType = listElectricityType;
	}

	public Basicdata getSelectedElectricityType() {
		return selectedElectricityType;
	}

	public void setSelectedElectricityType(Basicdata selectedElectricityType) {
		this.selectedElectricityType = selectedElectricityType;
	}

	public List<Basicdata> getListBEmbarque() {
		return listBEmbarque;
	}

	public void setListBEmbarque(List<Basicdata> listBEmbarque) {
		this.listBEmbarque = listBEmbarque;
	}

	public Basicdata getSelectedBEmbarque() {
		return selectedBEmbarque;
	}

	public void setSelectedBEmbarque(Basicdata selectedBEmbarque) {
		this.selectedBEmbarque = selectedBEmbarque;
	}

	public List<Basicdata> getListMachineType() {
		return listMachineType;
	}

	public void setListMachineType(List<Basicdata> listMachineType) {
		this.listMachineType = listMachineType;
	}

	public Basicdata getSelectedMachineType() {
		return selectedMachineType;
	}

	public void setSelectedMachineType(Basicdata selectedMachineType) {
		this.selectedMachineType = selectedMachineType;
	}

	public List<Basicdata> getListElevatorCapa() {
		return listElevatorCapa;
	}

	public void setListElevatorCapa(List<Basicdata> listElevatorCapa) {
		this.listElevatorCapa = listElevatorCapa;
	}

	public Basicdata getSelectedElevatorCapa() {
		return selectedElevatorCapa;
	}

	public void setSelectedElevatorCapa(Basicdata selectedElevatorCapa) {
		this.selectedElevatorCapa = selectedElevatorCapa;
	}

	public List<Basicdata> getListElevatorType() {
		return listElevatorType;
	}

	public void setListElevatorType(List<Basicdata> listElevatorType) {
		this.listElevatorType = listElevatorType;
	}

	public Basicdata getSelectedElevatorType() {
		return selectedElevatorType;
	}

	public void setSelectedElevatorType(Basicdata selectedElevatorType) {
		this.selectedElevatorType = selectedElevatorType;
	}

	public Basicdata getSelectedBType() {
		return selectedBType;
	}

	public void setSelectedBType(Basicdata selectedBType) {
		this.selectedBType = selectedBType;
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
	}

	@Command
	public void clickToEnableToDisable(@BindingParam("Component") InputElement element) {
		if(element.isDisabled())
			element.setDisabled(false);
		else
			element.setDisabled(true);
	}
	
	/*@Command
	public void save(){
		Validate validate = new Validate();
		if (budget.getPartnername().isEmpty())
	}*/
}