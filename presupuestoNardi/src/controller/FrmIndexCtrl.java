package controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
	private Checkbox chbxBStopSequenceContinuous, 
			chbxBStopSequencePar,
			chbxBStopSequenceOdd, 
			chbxBStainlessSteel, 
			chbxBHammeredGray,
			chbxBHammeredBrown;
	@Wire
	private Textbox txtStopSequenceContinuous, 
			txtStopSequencePar,
			txtStopSequenceOdd, 
			txtBStainlessSteel, 
			txtBHammeredGray,
			txtBHammeredBrown,
			txtBPartnerName,
			txtBConstruction,
			txtBConstructionNumber,
			txtBSeller,
			txtBConstructionAddress,
			txtBConstructionCity,
			txtBcontactPhone,
			txtBEmail,
			txtBContactName;
	@Wire
	private Spinner spnBSistelWDisplay, 
			spnBSistelWDisplayPB,
			spnBSistelWDisplayFloor, 
			spnBSistelWArrow, 
			spnBSistelWArrowPB,
			spnBSistelWArrowFloor, 
			spnBBraile37, 
			spnBBraile37PB,
			spnBBraile37Floor, 
			spnBAntivandalism, 
			spnBAntivandalismPB,
			spnBAntivandalismFloor;

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
	 * Metodo que inicializa la pantalla frmIndex. Se ejecuta antes de finalizar
	 * la carga del archivo DOM que muestra el navegador.
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

	public void addDatabasicmanytomany(Checkbox chbx, Textbox txt, String str,
			String str2, List<Databasicmanytomany> list, DaoBasicData daoBasicData) {
		if (chbx.isChecked()) {
			databasicmanytomany = new Databasicmanytomany();
			databasicmanytomany.setDescription(txt.getValue());
			databasicmanytomany.setBasicdata(daoBasicData.findByName("BUDGET",str2,str));
			databasicmanytomany.setBudget(budget);
			list.add(databasicmanytomany);
		}
	}
	
	public void addHallButtonType(Spinner spnTotal, Spinner spn1, Spinner spn2, List<Hallbuttontype> list){
		if (!spnTotal.getValue().equals(0)) {
			hallbuttontype = new Hallbuttontype();
			hallbuttontype.setBudget(budget);
			hallbuttontype.setQuantitybuttonfloor(spn1.getValue());
			hallbuttontype.setQuantitybuttonpb(spn2.getValue());
			hallbuttontype.setTotalbuttons(spnTotal.getValue());
			list.add(hallbuttontype);
		}
	}
	
	public void validate(){
		txtBPartnerName.setConstraint("no empty: No puede estar vacío.");
		txtBConstruction.setConstraint("no empty: No puede estar vacío.");
		txtBConstructionNumber.setConstraint("no empty: No puede estar vacío.");
		txtBSeller.setConstraint("no empty: No puede estar vacío.");
		txtBConstructionAddress.setConstraint("no empty: No puede estar vacío.");
		txtBConstructionCity.setConstraint("no empty: No puede estar vacío.");
		txtBcontactPhone.setConstraint("no empty: No puede estar vacío.");
		txtBEmail.setConstraint(".+@.+/.[a-z]+: Ingrese una dirección valida");
		txtBContactName.setConstraint("no empty: No puede estar vacío.");
	}

	@Command
	public void save() {
		validate();
		List<Databasicmanytomany> listDatabasicmanytomany = new ArrayList<Databasicmanytomany>();
		List<Hallbuttontype> listHallbuttontype = new ArrayList<Hallbuttontype>();
		DaoBudget daoBudget = new DaoBudget();
		DaoBasicData daoBasicData = new DaoBasicData();
		DaoDataBasicManyToMany daoDataBasicManyToMany = new DaoDataBasicManyToMany();
		daoBudget.save(budget);
		addDatabasicmanytomany(chbxBStopSequenceContinuous, txtStopSequenceContinuous, "CONTINUA","STOP SEQUENCE", listDatabasicmanytomany, daoBasicData);
		addDatabasicmanytomany(chbxBStopSequenceOdd, txtStopSequenceOdd, "IMPAR", "STOP SEQUENCE",listDatabasicmanytomany, daoBasicData);
		addDatabasicmanytomany(chbxBStopSequencePar, txtStopSequencePar, "PAR", "STOP SEQUENCE", listDatabasicmanytomany, daoBasicData);
		addDatabasicmanytomany(chbxBStainlessSteel, txtBStainlessSteel, "ACERO INOX", "DOOR FRAME", listDatabasicmanytomany, daoBasicData);
		addDatabasicmanytomany(chbxBStainlessSteel, txtBStainlessSteel, "ACERO INOX", "DOOR FRAME", listDatabasicmanytomany, daoBasicData);
		addDatabasicmanytomany(chbxBHammeredBrown, txtBHammeredBrown, "MARTILLADO MARRON", "DOOR FRAME", listDatabasicmanytomany, daoBasicData);
		addDatabasicmanytomany(chbxBHammeredGray, txtBHammeredGray, "MARTILLADO GRIS", "DOOR FRAME", listDatabasicmanytomany, daoBasicData);
		for (Databasicmanytomany databasic : listDatabasicmanytomany)
			daoDataBasicManyToMany.save(databasic);
		addHallButtonType(spnBSistelWDisplay, spnBSistelWDisplayFloor, spnBSistelWDisplayPB, listHallbuttontype);
		addHallButtonType(spnBSistelWArrow, spnBSistelWArrowFloor, spnBSistelWArrowPB, listHallbuttontype);
		addHallButtonType(spnBBraile37, spnBBraile37Floor, spnBBraile37PB, listHallbuttontype);
		addHallButtonType(spnBAntivandalism, spnBAntivandalismFloor, spnBAntivandalismPB, listHallbuttontype);
		Messagebox.show("Guardado");
	}
}