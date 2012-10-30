package controller;

import java.util.Date;

import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.Button;
import org.zkoss.zul.Checkbox;
import org.zkoss.zul.Combobox;
import org.zkoss.zul.Datebox;
import org.zkoss.zul.Intbox;
import org.zkoss.zul.Radiogroup;
import org.zkoss.zul.Spinner;
import org.zkoss.zul.Textbox;
import org.zkoss.zul.Window;

import dao.DaoBudget;
import database.Budget;

/**
 * @author leyner.castillo
 *
 */
public class FrmIndexCtrl extends SelectorComposer<Window> {

	@Wire
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
	private Intbox intBNumber;

	/**
	 *
	 *
	 */
	@Override
	public void doAfterCompose(Window comp) throws Exception {
		super.doAfterCompose(comp);
		dtbBDate.setValue(new Date());
		
	}
	
	@Listen("onClick=#btnSave")
	public void clickSave(){
		Budget budget = new Budget();
		DaoBudget daoBudget = new DaoBudget();
		budget.setIdbudget(0);
		budget.setPartnername("leyner");
		budget.setConstruction("casa");
		budget.setConstructionnumber("153-5");
		budget.setConstructionaddress("Plaza caribe");
		budget.setConstructioncity("Barquisimeto");
		budget.setContactname("Jesus");
		budget.setContactphone("0414-3534887");
		budget.setEmail("asdf@mail.com");
		budget.setSeller("yo mismo");
		budget.setType(true);
		budget.setDate(new Date());
		daoBudget.save(budget);
	}

}
