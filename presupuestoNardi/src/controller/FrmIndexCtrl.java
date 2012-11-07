package controller;

import general.Validate;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.zkoss.bind.Validator;
import org.zkoss.bind.annotation.BindingParam;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.Init;
import org.zkoss.zhtml.Messagebox;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.Checkbox;
import org.zkoss.zul.Spinner;
import org.zkoss.zul.Textbox;
import org.zkoss.zul.impl.InputElement;

import dao.DaoBasicData;
import dao.DaoBudget;
import dao.DaoDataBasicManyToMany;
import database.Basicdata;
import database.Budget;
import database.Databasicmanytomany;
import database.Hallbuttontype;

/**
 * @author leyner.castillo
 * 
 */
public class FrmIndexCtrl {

	@Wire
	private Checkbox chbxBStopSequenceContinuous, chbxBStopSequencePar,
			chbxBStopSequenceOdd, chbxBStainlessSteel, chbxBHammeredGray,
			chbxBHammeredBrown;
	@Wire
	private Textbox txtStopSequenceContinuous, txtStopSequencePar,
			txtStopSequenceOdd, txtBStainlessSteel, txtBHammeredGray,
			txtBHammeredBrown;
	@Wire
	private Spinner spnBSistelWDisplay, spnBSistelWDisplayPB, spnBSistelWDisplayFloor,
			spnBSistelWArrow, spnBSistelWArrowPB, spnBSistelWArrowFloor,
			spnBBraile37, spnBBraile37PB, spnBBraile37Floor,
			spnBAntivandalism, spnBAntivandalismPB, spnBAntivandalismFloor;
	
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
	private Databasicmanytomany databasicmanytomany;
	private Hallbuttontype hallbuttontype;
	private Budget budget;

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
	 * Metodo que inicializa la pantalla frmIndex. Se ejecuta antes de
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
			budget.setNumber(daoBudget.list(Budget.class)
					.get(daoBudget.list(Budget.class).size() - 1).getNumber() + 1);
		budget.setDate(new Date());
		listBType = daoBasicData.listByField("BUDGET", "BUILDING TYPE");
		listElevatorType = daoBasicData.listByField("BUDGET", "ELEVATOR TYPE");
		listElevatorCapa = daoBasicData.listByField("BUDGET",
				"ELEVATOR CAPACITANCE");
		listMachineType = daoBasicData.listByField("BUDGET", "MACHINE TYPE");
		listBEmbarque = daoBasicData.listByField("BUDGET", "BUILDING EMBARQUE");
		listElectricityType = daoBasicData.listByField("BUDGET",
				"ELECTRICITY TYPE");
		listSpeed = daoBasicData.listByField("BUDGET", "SPEED");
		listFrequency = daoBasicData.listByField("BUDGET", "FREQUENCY");
		listVoltageLighting = daoBasicData.listByField("BUDGET",
				"VOLTAGE LIGHTING");
		listHourMachine = daoBasicData.listByField("BUDGET", "HOUR MACHINE");
		listManeuverType = daoBasicData.listByField("BUDGET", "MANEUVER TYPE");
		listDesign1357 = daoBasicData.listByField("BUDGET", "DESIGN 1357");
		listDesignP26 = daoBasicData.listByField("BUDGET", "DESIGN P26");
		listRoofType = daoBasicData.listByField("BUDGET", "ROOF TYPE");
		listButtonType = daoBasicData.listByField("BUDGET", "BUTTON TYPE");
		listRailing = daoBasicData.listByField("BUDGET", "RAILING");
		listMirror = daoBasicData.listByField("BUDGET", "MIRROR");
		listFloorType = daoBasicData.listByField("BUDGET", "FLOOR TYPE");
		listFan = daoBasicData.listByField("BUDGET", "FAN");
		listDoorType = daoBasicData.listByField("BUDGET", "DOOR TYPE");
		listDoorSystem = daoBasicData.listByField("BUDGET", "DOOR SYSTEM");
		listDoorframeType = daoBasicData.listByField("BUDGET",
				"DOOR FRAME TYPE");
		listFreeAdmission = daoBasicData
				.listByField("BUDGET", "FREE ADMISSION");
		listHeight = daoBasicData.listByField("BUDGET", "HEIGHT");
		listControlType = daoBasicData.listByField("BUDGET", "CONTROL TYPE");
		listBoothButton = daoBasicData.listByField("BUDGET", "BOOTH BUTTON");
		listBoothDisplay = daoBasicData.listByField("BUDGET", "BOOTH DISPLAY");
		listFloorDisplay = daoBasicData.listByField("BUDGET", "FLOOR DISPLAY");
		listMotorTraction = daoBasicData
				.listByField("BUDGET", "MOTOR TRACTION");
	}

	@Command
	public void clickToEnableToDisable(
			@BindingParam("Component") InputElement element) {
		if (element.isDisabled())
			element.setDisabled(false);
		else
			element.setDisabled(true);
	}

	@Command
	public void save() {
		List<Databasicmanytomany> listDatabasicmanytomany = new ArrayList<Databasicmanytomany>();
		List<Hallbuttontype> listHallbuttontype = new ArrayList<Hallbuttontype>();
		DaoBudget daoBudget = new DaoBudget();
		DaoBasicData daoBasicData = new DaoBasicData();
		DaoDataBasicManyToMany daoDataBasicManyToMany = new DaoDataBasicManyToMany();
		daoBudget.save(budget);
		if (chbxBStopSequenceContinuous.isChecked()){
			databasicmanytomany = new Databasicmanytomany();
			databasicmanytomany.setDescription(txtStopSequenceContinuous.getValue());
			databasicmanytomany.setBasicdata(daoBasicData.findByName("BUDGET","STOP SEQUENCE","CONTINUA"));
			databasicmanytomany.setBudget(budget);
			listDatabasicmanytomany.add(databasicmanytomany);
		}
		if (chbxBStopSequenceOdd.isChecked()){
			databasicmanytomany = new Databasicmanytomany();
			databasicmanytomany.setDescription(txtStopSequenceOdd.getValue());
			databasicmanytomany.setBasicdata(daoBasicData.findByName("BUDGET","STOP SEQUENCE","IMPAR"));
			databasicmanytomany.setBudget(budget);
			listDatabasicmanytomany.add(databasicmanytomany);
		}
		if (chbxBStopSequencePar.isChecked()){
			databasicmanytomany = new Databasicmanytomany();
			databasicmanytomany.setDescription(txtStopSequencePar.getValue());
			databasicmanytomany.setBasicdata(daoBasicData.findByName("BUDGET","STOP SEQUENCE","PAR"));
			databasicmanytomany.setBudget(budget);
			listDatabasicmanytomany.add(databasicmanytomany);
		}
		if (chbxBStainlessSteel.isChecked()){
			databasicmanytomany = new Databasicmanytomany();
			databasicmanytomany.setDescription(txtBStainlessSteel.getValue());
			databasicmanytomany.setBasicdata(daoBasicData.findByName("BUDGET","DOOR FRAME","ACERO INOX."));
			databasicmanytomany.setBudget(budget);
			listDatabasicmanytomany.add(databasicmanytomany);
		}
		if (chbxBHammeredBrown.isChecked()){
			databasicmanytomany = new Databasicmanytomany();
			databasicmanytomany.setDescription(txtBHammeredBrown.getValue());
			databasicmanytomany.setBasicdata(daoBasicData.findByName("BUDGET","DOOR FRAME","MARTILLADO MARRON"));
			databasicmanytomany.setBudget(budget);
			listDatabasicmanytomany.add(databasicmanytomany);
		}
		if (chbxBHammeredGray.isChecked()){
			databasicmanytomany = new Databasicmanytomany();
			databasicmanytomany.setDescription(txtBHammeredGray.getValue());
			databasicmanytomany.setBasicdata(daoBasicData.findByName("BUDGET","DOOR FRAME","MARTILLADO GRIS"));
			databasicmanytomany.setBudget(budget);
			listDatabasicmanytomany.add(databasicmanytomany);
		}
		for (Databasicmanytomany databasic : listDatabasicmanytomany)
			daoDataBasicManyToMany.save(databasic);
		if (!spnBSistelWDisplay.getValue().equals(0)){
			hallbuttontype = new Hallbuttontype();
			hallbuttontype.setBudget(budget);
			hallbuttontype.setQuantitybuttonfloor(spnBSistelWDisplayFloor.getValue());
			hallbuttontype.setQuantitybuttonpb(spnBSistelWDisplayPB.getValue());
			hallbuttontype.setTotalbuttons(spnBSistelWDisplay.getValue());
			listHallbuttontype.add(hallbuttontype);
		}
		if (!spnBSistelWArrow.getValue().equals(0)){
			hallbuttontype = new Hallbuttontype();
			hallbuttontype.setBudget(budget);
			hallbuttontype.setQuantitybuttonfloor(spnBSistelWArrowFloor.getValue());
			hallbuttontype.setQuantitybuttonpb(spnBSistelWArrowPB.getValue());
			hallbuttontype.setTotalbuttons(spnBSistelWArrow.getValue());
			listHallbuttontype.add(hallbuttontype);
		}
		if (!spnBBraile37.getValue().equals(0)){
			hallbuttontype = new Hallbuttontype();
			hallbuttontype.setBudget(budget);
			hallbuttontype.setQuantitybuttonfloor(spnBBraile37Floor.getValue());
			hallbuttontype.setQuantitybuttonpb(spnBBraile37PB.getValue());
			hallbuttontype.setTotalbuttons(spnBBraile37.getValue());
			listHallbuttontype.add(hallbuttontype);
		}
		if (!spnBAntivandalism.getValue().equals(0)){
			hallbuttontype = new Hallbuttontype();
			hallbuttontype.setBudget(budget);
			hallbuttontype.setQuantitybuttonfloor(spnBAntivandalismFloor.getValue());
			hallbuttontype.setQuantitybuttonpb(spnBAntivandalismPB.getValue());
			hallbuttontype.setTotalbuttons(spnBAntivandalism.getValue());
			listHallbuttontype.add(hallbuttontype);
		}
		Messagebox.show("Guardado");
	}
}