package controller;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRExporter;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.engine.util.JRLoader;

import org.zkoss.bind.BindUtils;
import org.zkoss.bind.ValidationContext;
import org.zkoss.bind.Validator;
import org.zkoss.bind.annotation.BindingParam;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.GlobalCommand;
import org.zkoss.bind.annotation.Init;
import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.bind.validator.AbstractValidator;
import org.zkoss.util.media.AMedia;
import org.zkoss.zhtml.Messagebox;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.Sessions;
import org.zkoss.zk.ui.WrongValueException;
import org.zkoss.zul.Iframe;
import org.zkoss.zul.Window;

import dao.DaoBasicData;
import dao.DaoBudget;
import database.BasicData;
import database.Budget;

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
	private List<BasicData> listBEmbarque;
	private List<BasicData> listElectricityType;
	private List<BasicData> listSpeed;
	private List<BasicData> listFrequency;
	private List<BasicData> listVoltageLighting;
	private List<BasicData> listHourMachine;
	private List<BasicData> listManeuverType;
	private List<BasicData> listDesign1357;
	private List<BasicData> listDesignP26;
	private List<BasicData> listRoofType;
	private List<BasicData> listButtonType;
	private List<BasicData> listRailing;
	private List<BasicData> listMirror;
	private List<BasicData> listFloorType;
	private List<BasicData> listFan;
	private List<BasicData> listDoorType;
	private List<BasicData> listDoorSystem;
	private List<BasicData> listDoorframeType;
	private List<BasicData> listFreeAdmission;
	private List<BasicData> listHeight;
	private List<BasicData> listControlType;
	private List<BasicData> listBoothButton;
	private List<BasicData> listBoothDisplay;
	private List<BasicData> listFloorDisplay;
	private List<BasicData> listMotorTraction;
	private List<Budget> listBudget;
	private Boolean stopSequenceContinuous;
	private Boolean stopSequencePar;
	private Boolean stopSequenceOdd;
	private Boolean stainlessSteel;
	private Boolean hammeredGray;
	private Boolean hammeredBrown;
	private Boolean disabledAll;
	private Boolean disableAfterSearch;
	private Boolean disabledNumber;
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
	private Budget budget;

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

	public List<BasicData> getListDesignP26() {
		return listDesignP26;
	}

	public void setListDesignP26(List<BasicData> listDesignP26) {
		this.listDesignP26 = listDesignP26;
	}

	public List<BasicData> getListDesign1357() {
		return listDesign1357;
	}

	public void setListDesign1357(List<BasicData> listDesign1357) {
		this.listDesign1357 = listDesign1357;
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
		DaoBasicData daoBasicData = new DaoBasicData();
		DaoBudget daoBudget = new DaoBudget();
		budget = new Budget();
		if (daoBudget.list(Budget.class).isEmpty())
			budget.setNumber(1);
		else
			budget.setNumber(daoBudget.list(Budget.class)
					.get(daoBudget.list(Budget.class).size() - 1).getNumber() + 1);
		disabledAll = new Boolean(false);
		disableAfterSearch = new Boolean(false);
		disabledNumber = new Boolean(true);
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
		budget.setHallButton(vacio);
		budget.setDisplayPlaceFloor(vacio);
		budget.setStatus('A');
		budget.setStopSequenceContinuous(false);
		budget.setStopSequenceEven(false);
		budget.setStopSequenceOdd(false);
		budget.setDoorFrameStainless(false);
		budget.setDoorFrameBrown(false);
		budget.setDoorFrameGray(false);
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
		listBudget = new ArrayList<Budget>();
		budget.setSistelWarrowFloor(0);
		budget.setSistelWdisplayPb(0);
		budget.setSistelWdisplayFloor(0);
		budget.setSistelWarrowPb(0);
		budget.setBraile37floor(0);
		budget.setBraile37pb(0);
		budget.setAntivandalismFloor(0);
		budget.setAntivandalismPb(0);
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
		DaoBudget daoBudget = new DaoBudget();
		if (daoBudget.list(Budget.class).isEmpty())
			budget.setNumber(1);
		else
			budget.setNumber(daoBudget.list(Budget.class)
					.get(daoBudget.list(Budget.class).size() - 1).getNumber() + 1);
		if (!daoBudget.save(budget)) {
			Messagebox.show("Fallo Guardado Budget", "Error", Messagebox.OK,
					Messagebox.ERROR);
			return;
		}
		Messagebox.show("Presupuesto guardado", "Information", Messagebox.OK,
				Messagebox.INFORMATION);
		restartForm();
	}

	@NotifyChange({ "disabledAll", "budgetNumber", "budget", "disableAfterSearch", "disabledNumber" })
	@Command
	public void search() {
		restartForm();
		budget.setNumber(0);
		disabledAll = new Boolean(true);
		disableAfterSearch = new Boolean(false);
		disabledNumber = new Boolean(false);
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
			/*
			 * disabledAll = new Boolean(false); disabledSave = new
			 * Boolean(false);
			 */
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
		/*
		 * disabledAll = new Boolean(false); disabledSave = new Boolean(false);
		 */
	}

	@NotifyChange({ "budget", "disabledAll", "budgetNumber", "disableAfterSearch", "disabledNumber" })
	@GlobalCommand
	public void selectedBudget(@BindingParam("Budget") Budget budget) {
		this.budget = budget;
		disableAfterSearch = new Boolean(true);
		disabledNumber = new Boolean(true);
		/*
		 * disabledAll = new Boolean(false); disabledSave = new Boolean(false);
		 */
	}

	@Command
	public void close() {
		Map map = new HashMap();
		map.put("page", "");
		BindUtils.postGlobalCommand(null, null, "selectedPage", map);
	}

	@NotifyChange({"report"})
	@Command
	public void print() throws JRException, IOException{
		List<Budget> listBudget = new ArrayList<Budget>(new DaoBudget().list(Budget.class));
		String string = Sessions.getCurrent().getWebApp().getRealPath("/reports");
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(string+"/test2.jasper");
		JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, null, new JRBeanCollectionDataSource(listBudget));
		JRExporter jrExporter = new JRPdfExporter();
		jrExporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
		jrExporter.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, string+"/reporte2.pdf");
		jrExporter.exportReport();
		String report = new String("reports/reporte2.pdf");
		Map map = new HashMap();
		map.put("reportPath", report);
		map.put("reportTitle", "Presupuesto Nardi");
		Window win = (Window) Executions.createComponents(
				"frmReport.zul", null, map);
	}
}