package controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.Init;
import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.Button;
import org.zkoss.zul.Checkbox;
import org.zkoss.zul.Combobox;
import org.zkoss.zul.Datebox;
import org.zkoss.zul.Intbox;
import org.zkoss.zul.Messagebox;
import org.zkoss.zul.Radiogroup;
import org.zkoss.zul.Spinner;
import org.zkoss.zul.Textbox;
import org.zkoss.zul.Window;

import dao.DaoBasicData;
import dao.DaoBudget;
import database.Basicdata;
import database.Budget;

/**
 * @author leyner.castillo
 *
 */
public class FrmIndexCtrl{

/*	@Wire
	private Button btnCancel;
	@Wire
	private Button btnPrint;
	@Wire
	private Button btnSave;
	@Wire
	private Button btnSend;
	@Wire
	private Textbox txtBComment;
	@Wire
	private Radiogroup radBFirefighterKeychain;
	@Wire
	private Radiogroup radBAccessSytem;
	@Wire
	private Radiogroup radBPhone;
	@Wire
	private Radiogroup radBIntercom;
	@Wire
	private Radiogroup radBGomSystem;
	@Wire
	private Radiogroup radBSpeechSynthesizer;
	@Wire
	private Radiogroup radBLoadLimiter;
	@Wire
	private Radiogroup radBLightCurtain;
	@Wire
	private Radiogroup radBDisplayPlaceFloor;
	@Wire
	private Combobox cmbBFloorDisplay;
	@Wire
	private Combobox cmbBBoothDisplay;
	@Wire
	private Spinner spnBAntivandalismFloor;
	@Wire
	private Spinner spnBAntivandalismPB;
	@Wire
	private Spinner spnBAntivandalism;
	@Wire
	private Spinner spnBBraile37Floor;
	@Wire
	private Spinner spnBBraile37PB;
	@Wire
	private Spinner spnBBraile37;
	@Wire
	private Spinner spnBSistelWArrowFloor;
	@Wire
	private Spinner spnBSistelWArrowPB;
	@Wire
	private Spinner spnBSistelWArrow;
	@Wire
	private Spinner spnBSistelWDisplayFloor;
	@Wire
	private Spinner spnBSistelWDisplayPB;
	@Wire
	private Spinner spnBSistelWDisplay;
	@Wire
	private Radiogroup radBHallButton;
	@Wire
	private Combobox cmbBBoothButton;
	@Wire	
	private Combobox cmbBControlType;
	@Wire
	private Textbox txtBHammeredBrown;
	@Wire
	private Textbox txtBHammeredGray;
	@Wire
	private Checkbox chbxBHammeredGray;
	@Wire
	private Textbox txtBStainlessSteel;
	@Wire
	private Checkbox chbxBStainlessSteel;
	@Wire
	private Button btnNewHeight;
	@Wire
	private Combobox cmbBHeight;
	@Wire
	private Button btnNewFreeAdmission;
	@Wire
	private Combobox cmbBFreeAdmission;
	@Wire
	private Combobox cmbBDoorframeType;
	@Wire
	private Combobox spnBDoorSystem;
	@Wire
	private Combobox spnBDoorType;
	@Wire
	private Spinner spnBDoorOfNumber;
	@Wire
	private Combobox cmbBFan;
	@Wire
	private Combobox cmbBFloorType;
	@Wire
	private Combobox cmbBMirror;
	@Wire
	private Combobox cmbBRailing;
	@Wire
	private Textbox txtBDesignSpecialComment;
	@Wire
	private Combobox cmbBButtonType;
	@Wire
	private Combobox cmbBRoofType;
	@Wire
	private Checkbox chbxBDesignSpecial;
	@Wire
	private Combobox cmbBDesignP26;
	@Wire
	private Combobox cmbBDesign1357;
	@Wire
	private Spinner spnBBottomHole;
	@Wire
	private Spinner spnBFossa;
	@Wire
	private Spinner spnBWidthHole;
	@Wire
	private Spinner spnBOnTour;
	@Wire
	private Spinner spnBTour;
	@Wire
	private Checkbox chbxBStopSequenceOdd;
	@Wire
	private Spinner spnBStopNumber;
	@Wire
	private Checkbox chbxBStopSequencePar;
	@Wire
	private Combobox cmbBManeuverType;
	@Wire
	private Checkbox chbxBStopSequenceContinuous;
	@Wire
	private Combobox cmbBHourMachine;
	@Wire
	private Combobox cmbBVoltageLighting;
	@Wire
	private Combobox cmbBFrequency;
	@Wire
	private Button btnNewSpeed;
	@Wire
	private Combobox cmbBSpeed;
	@Wire
	private Combobox cmbBElectricityType;
	@Wire
	private Combobox cmbBEmbarque;
	@Wire
	private Combobox cmbBMachineType;
	@Wire
	private Radiogroup radBMotorTraction;
	@Wire
	private Button btnNewElevatorCapacitance;
	@Wire
	private Combobox cmbBElevatorCapacitance;
	@Wire
	private Spinner cmbBMotorQuantity;
	@Wire
	private Combobox cmbBElevatorType;
	@Wire
	private Spinner spnBElevatorQuantity;
	@Wire
	private Combobox cmbBBuildingType;
	@Wire
	private Radiogroup radPlaneP;
	@Wire
	private Radiogroup radPlaneC;
	@Wire
	private Textbox txtBContactName;
	@Wire
	private Textbox txtBEmail;
	@Wire
	private Textbox txtBcontactPhone;
	@Wire
	private Textbox txtBConstructionCity;
	@Wire
	private Textbox txtBConstructionAddress;
	@Wire
	private Textbox txtBSeller;
	@Wire
	private Textbox txtBConstructionNumber;
	@Wire
	private Radiogroup radBType;
	@Wire
	private Textbox txtBConstruction;
	@Wire
	private Datebox dtbBDate;
	@Wire
	private Textbox txtBPartnerName;
	@Wire
	private Intbox intBNumber;*/
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

	@Init
	public void init(){
		DaoBasicData daoBasicData = new DaoBasicData();
		listBType = daoBasicData.findByDescription("BUDGET", "BUILDING TYPE");
		listElevatorType = daoBasicData.findByDescription("BUDGET", "ELEVATOR TYPE");
		listElevatorCapa = daoBasicData.findByDescription("BUDGET", "ELEVATOR CAPACITANCE");
		listMachineType = daoBasicData.findByDescription("BUDGET", "MACHINE TYPE");
		listBEmbarque = daoBasicData.findByDescription("BUDGET", "BUILDING EMBARQUE");
		listElectricityType = daoBasicData.findByDescription("BUDGET", "ELECTRICITY TYPE");
		listSpeed = daoBasicData.findByDescription("BUDGET", "SPEED");
		listFrequency = daoBasicData.findByDescription("BUDGET", "FREQUENCY");
		listVoltageLighting = daoBasicData.findByDescription("BUDGET", "VOLTAGE LIGHTING");
		listHourMachine = daoBasicData.findByDescription("BUDGET", "HOUR MACHINE");
		listManeuverType = daoBasicData.findByDescription("BUDGET", "MANEUVER TYPE");
		listDesign1357 = daoBasicData.findByDescription("BUDGET", "DESIGN 1357");
		listDesignP26 = daoBasicData.findByDescription("BUDGET", "DESIGN P26");
	}
	
	@Command
	public void clickBuildinType(){
	}
}