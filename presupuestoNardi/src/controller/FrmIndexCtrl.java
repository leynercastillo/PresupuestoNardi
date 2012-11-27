package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;

import org.zkoss.bind.ValidationContext;
import org.zkoss.bind.Validator;
import org.zkoss.bind.annotation.BindingParam;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.Init;
import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.bind.validator.AbstractValidator;
import org.zkoss.zhtml.Messagebox;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.WrongValueException;

import dao.DaoBasicData;
import dao.DaoBudget;
import dao.DaoDataBasicManyToMany;
import dao.DaoHallbuttontype;
import database.Basicdata;
import database.Budget;
import database.Databasicmanytomany;
import database.Hallbuttontype;

/**
 * @author leyner.castillo
 * 
 */
public class FrmIndexCtrl {

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
	private List<Budget> listBNumber;
	private Boolean stopSequenceContinuous;
	private Boolean stopSequencePar;
	private Boolean stopSequenceOdd;
	private Boolean stainlessSteel;
	private Boolean hammeredGray;
	private Boolean hammeredBrown;
	private Boolean disabledAll;
	private String txtStopSequenceContinuous;
	private String txtStopSequencePar;
	private String txtStopSequenceOdd;
	private String txtBStainlessSteel;
	private String txtBHammeredBrown;
	private String txtBHammeredGray;
	private Integer sistelWDisplayFloor;
	private Integer sistelWDisplayPB;
	private Integer sistelWArrowFloor;
	private Integer sistelWArrowPB;
	private Integer braile37Floor;
	private Integer braile37PB;
	private Integer antivandalismFloor;
	private Integer antivandalismPB;
	private Databasicmanytomany databasicmanytomany;
	private Hallbuttontype hallbuttontype;
	private Budget budget;
	private Integer budgetNumber;

	public List<Budget> getListBNumber() {
		return listBNumber;
	}

	public void setListBNumber(List<Budget> listBNumber) {
		this.listBNumber = listBNumber;
	}

	public Integer getBudgetNumber() {
		return budgetNumber;
	}

	public void setBudgetNumber(Integer budgetNumber) {
		this.budgetNumber = budgetNumber;
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

	public Boolean getStopSequenceContinuous() {
		return stopSequenceContinuous;
	}

	public void setStopSequenceContinuous(Boolean stopSequenceContinuous) {
		this.stopSequenceContinuous = stopSequenceContinuous;
	}

	public Boolean getStopSequencePar() {
		return stopSequencePar;
	}

	public void setStopSequencePar(Boolean stopSequencePar) {
		this.stopSequencePar = stopSequencePar;
	}

	public Boolean getStopSequenceOdd() {
		return stopSequenceOdd;
	}

	public void setStopSequenceOdd(Boolean stopSequenceOdd) {
		this.stopSequenceOdd = stopSequenceOdd;
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

	public Integer getBraile37Floor() {
		return braile37Floor;
	}

	public void setBraile37Floor(Integer braile37Floor) {
		this.braile37Floor = braile37Floor;
	}

	public Integer getBraile37PB() {
		return braile37PB;
	}

	public void setBraile37PB(Integer braile37pb) {
		braile37PB = braile37pb;
	}

	public Integer getAntivandalismFloor() {
		return antivandalismFloor;
	}

	public void setAntivandalismFloor(Integer antivandalismFloor) {
		this.antivandalismFloor = antivandalismFloor;
	}

	public Integer getAntivandalismPB() {
		return antivandalismPB;
	}

	public void setAntivandalismPB(Integer antivandalismPB) {
		this.antivandalismPB = antivandalismPB;
	}

	public String getTxtStopSequenceOdd() {
		return txtStopSequenceOdd;
	}

	public void setTxtStopSequenceOdd(String txtStopSequenceOdd) {
		this.txtStopSequenceOdd = txtStopSequenceOdd;
	}

	public String getTxtBStainlessSteel() {
		return txtBStainlessSteel;
	}

	public void setTxtBStainlessSteel(String txtBStainlessSteel) {
		this.txtBStainlessSteel = txtBStainlessSteel;
	}

	public String getTxtBHammeredBrown() {
		return txtBHammeredBrown;
	}

	public void setTxtBHammeredBrown(String txtBHammeredBrown) {
		this.txtBHammeredBrown = txtBHammeredBrown;
	}

	public String getTxtBHammeredGray() {
		return txtBHammeredGray;
	}

	public void setTxtBHammeredGray(String txtBHammeredGray) {
		this.txtBHammeredGray = txtBHammeredGray;
	}

	public String getTxtStopSequencePar() {
		return txtStopSequencePar;
	}

	public void setTxtStopSequencePar(String txtStopSequencePar) {
		this.txtStopSequencePar = txtStopSequencePar;
	}

	public String getTxtStopSequenceContinuous() {
		return txtStopSequenceContinuous;
	}

	public void setTxtStopSequenceContinuous(String txtStopSequenceContinuous) {
		this.txtStopSequenceContinuous = txtStopSequenceContinuous;
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
	public void init(){
		restartForm();
	}
	
	@NotifyChange({"*","budgetNumber"})
	@Command
	public void restartForm() {
		DaoBasicData daoBasicData = new DaoBasicData();
		DaoBudget daoBudget = new DaoBudget();
		budget = new Budget();
		if (daoBudget.list(Budget.class).isEmpty())
			budgetNumber = 1;
		else
			budgetNumber = daoBudget.list(Budget.class)
					.get(daoBudget.list(Budget.class).size() - 1).getNumber() + 1;
		disabledAll = false;
		budget.setDate(new Date());
		budget.setType(true);
		budget.setPlanec(false);
		budget.setPlanep(false);
		budget.setLightcurtain(false);
		budget.setLoadlimiter(false);
		budget.setSpeechsynthesizer(false);
		budget.setGomsystem(false);
		budget.setIntercom(false);
		budget.setPhone(false);
		budget.setAccesssytem(false);
		budget.setFirefighterkeychain(false);
		budget.setDesignspecial(false);
		budget.setMotortraction(vacio);
		budget.setHallbutton(vacio);
		budget.setDisplayplacefloor(vacio);
		budget.setBasicdataByStatus(daoBasicData.findByName("BUDGET", "STATUS", "A"));
		txtStopSequenceContinuous = new String();
		txtStopSequencePar = new String();
		txtStopSequenceOdd = new String();
		txtBStainlessSteel = new String();
		txtBHammeredGray = new String();
		txtBHammeredBrown = new String();
		stopSequenceContinuous = false;
		stopSequencePar = false;
		stopSequenceOdd = false;
		stainlessSteel = false;
		hammeredGray = false;
		hammeredBrown = false;
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
		listBNumber = new ArrayList<Budget>();
		sistelWDisplayPB = new Integer(0);
		sistelWDisplayFloor = new Integer(0);
		sistelWArrowPB = new Integer(0);
		sistelWArrowFloor = new Integer(0);
		braile37PB = new Integer(0);
		braile37Floor = new Integer(0);
		antivandalismPB = new Integer(0);
		antivandalismFloor = new Integer(0);
	}

	public void addDatabasicmanytomany(Boolean checked, String txt, String str,
			String str2, List<Databasicmanytomany> list,
			DaoBasicData daoBasicData) {
		if (checked != null && checked) {
			databasicmanytomany = new Databasicmanytomany();
			databasicmanytomany.setDescription(txt);
			databasicmanytomany.setBasicdata(daoBasicData.findByName("BUDGET",
					str2, str));
			databasicmanytomany.setBudget(budget);
			list.add(databasicmanytomany);
		}
	}

	public void addHallButtonType(Integer total, Integer intFloor,
			Integer intPB, List<Hallbuttontype> list,
			DaoBasicData daoBasicData, String name) {
		if (total != null && !total.equals(0)) {
			hallbuttontype = new Hallbuttontype();
			hallbuttontype.setBudget(budget);
			hallbuttontype.setQuantitybuttonfloor(intFloor);
			hallbuttontype.setBasicdata(daoBasicData.findByName("BUDGET",
					"HALL BUTTON TYPE", name));
			hallbuttontype.setQuantitybuttonpb(intPB);
			hallbuttontype.setTotalbuttons(total);
			list.add(hallbuttontype);
		}
	}

	/**
	 * Metodo que valida que un componente ZK no este vacio.
	 * 
	 * @return {@link Validator}
	 */
	public Validator getNoEmpty() {
		return new AbstractValidator() {
			@Override
			public void validate(ValidationContext ctx) {
				Component component = (Component) ctx.getBindContext()
						.getValidatorArg("component");
				String string = (String) ctx.getProperty().getValue();
				if (string.isEmpty()) {
					throw new WrongValueException(component,
							"Ingrese un dato valido.");
				}
			}
		};
	}

	/**
	 * Metodo que valida que un string sea un Email valido. Solo aplica para
	 * componentes ZK
	 * 
	 * @return {@link Validator}
	 */
	public Validator getNoEmail() {
		return new AbstractValidator() {
			@Override
			public void validate(ValidationContext ctx) {
				Component component = (Component) ctx.getBindContext()
						.getValidatorArg("component");
				String string = (String) ctx.getProperty().getValue();
				if (string.isEmpty() || !string.matches(".+@.+\\.[a-zA-Z]+")) {
					throw new WrongValueException(component,
							"Ingrese una direccion de correo valida.");
				}
			}
		};
	}

	@NotifyChange({ "*" })
	@Command
	public void save() {
		List<Databasicmanytomany> listDatabasicmanytomany = new ArrayList<Databasicmanytomany>();
		List<Hallbuttontype> listHallbuttontype = new ArrayList<Hallbuttontype>();
		DaoBudget daoBudget = new DaoBudget();
		DaoBasicData daoBasicData = new DaoBasicData();
		DaoHallbuttontype daoHallbuttontype = new DaoHallbuttontype();
		DaoDataBasicManyToMany daoDataBasicManyToMany = new DaoDataBasicManyToMany();
		if (!daoBudget.save(budget)) {
			Messagebox.show("Fallo Guardado Budget", "Error", Messagebox.OK,
					Messagebox.ERROR);
			return;
		}
		addDatabasicmanytomany(stopSequenceContinuous,
				txtStopSequenceContinuous, "CONTINUA", "STOP SEQUENCE",
				listDatabasicmanytomany, daoBasicData);
		addDatabasicmanytomany(stopSequenceOdd, txtStopSequenceOdd, "IMPAR",
				"STOP SEQUENCE", listDatabasicmanytomany, daoBasicData);
		addDatabasicmanytomany(stopSequencePar, txtStopSequencePar, "PAR",
				"STOP SEQUENCE", listDatabasicmanytomany, daoBasicData);
		addDatabasicmanytomany(stainlessSteel, txtBStainlessSteel,
				"ACERO INOX.", "DOOR FRAME", listDatabasicmanytomany,
				daoBasicData);
		addDatabasicmanytomany(hammeredBrown, txtBHammeredBrown,
				"MARTILLADO MARRON", "DOOR FRAME", listDatabasicmanytomany,
				daoBasicData);
		addDatabasicmanytomany(hammeredGray, txtBHammeredGray,
				"MARTILLADO GRIS", "DOOR FRAME", listDatabasicmanytomany,
				daoBasicData);
		for (Databasicmanytomany databasic : listDatabasicmanytomany) {
			if (!daoDataBasicManyToMany.save(databasic)) {
				Messagebox.show("Fallo Guardado Databasicmanytomany", "Error",
						Messagebox.OK, Messagebox.ERROR);
				return;
			}
		}
		addHallButtonType(sistelWDisplayFloor + sistelWDisplayPB,
				sistelWDisplayFloor, sistelWDisplayPB, listHallbuttontype,
				daoBasicData, "SISTEL CON DISPLAY");
		addHallButtonType(sistelWArrowFloor + sistelWArrowPB,
				sistelWArrowFloor, sistelWArrowPB, listHallbuttontype,
				daoBasicData, "SISTEL CON FLECHA");
		addHallButtonType(braile37Floor + braile37PB, braile37Floor,
				braile37PB, listHallbuttontype, daoBasicData,
				"CHAPA DE ACERO CON BOTON ACERO PLASTICO CON NOMENCLATURA Y BRAILLE DE 37mm");
		addHallButtonType(antivandalismFloor + antivandalismPB,
				antivandalismFloor, antivandalismPB, listHallbuttontype,
				daoBasicData, "CHAPA DE ACERO CON BOTON ANTI-VANDALICO DE 30mm");
		for (Hallbuttontype hallbuttontype : listHallbuttontype) {
			if (!daoHallbuttontype.save(hallbuttontype)){
				Messagebox.show("Fallo Guardado daoHallbuttontype", "Error",
						Messagebox.OK, Messagebox.ERROR);
				return;
			}
		}
		Messagebox.show("Presupuesto guardado", "Information", Messagebox.OK,
				Messagebox.INFORMATION);
		restartForm();
	}
	
	@NotifyChange({"disabledAll","budgetNumber","budget"})
	@Command
	public void search(){
		restartForm();
		budgetNumber = null;
		disabledAll = true;
	}

	@NotifyChange({"listBNumber"})
	@Command
	public void loadBudgetField(@BindingParam("field") String field){
		DaoBudget daoBudget = new DaoBudget();
		listBNumber = daoBudget.listOrderBudgetNumber(field);
	}
}