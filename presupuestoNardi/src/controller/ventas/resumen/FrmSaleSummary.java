package controller.ventas.resumen;

import general.GenericReport;
import general.SimpleListModelCustom;
import general.ValidateZK;

import java.io.File;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import model.database.BasicData;
import model.database.Quotation;
import model.database.SaleSummary;
import model.database.SecurityUser;
import model.service.ServiceBasicData;
import model.service.ServiceBusinessPartner;
import model.service.ServiceQuotation;
import model.service.ServiceSaleSummary;
import model.service.ServiceSecurityUser;

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
import org.zkoss.zk.ui.select.annotation.WireVariable;
import org.zkoss.zk.ui.util.Clients;
import org.zkoss.zul.Button;
import org.zkoss.zul.ListModel;
import org.zkoss.zul.impl.InputElement;

import springBean.Emails;

/**
 * @author leyner.castillo
 * 
 */
public class FrmSaleSummary {

	@WireVariable
	private ServiceBasicData serviceBasicData;
	@WireVariable
	private ServiceSaleSummary serviceSaleSummary;
	@WireVariable
	private ServiceSecurityUser serviceSecurityUser;
	@WireVariable
	private ServiceBusinessPartner serviceBusinessPartner;
	@WireVariable
	private ServiceQuotation serviceQuotation;
	@WireVariable
	private Emails emails;
	private String seleccione;
	private String modalMessage;
	private final String dash = new String("--");
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
	private ListModel<Object> listRifPartner;
	private ListModel<Object> listNumber;
	private ListModel<Object> listQuotationNumber;
	private ListModel<Object> listPartnerName;
	private ListModel<Object> listConstruction;
	private ListModel<Object> listSeller;
	private BasicData cabinModel;
	private Boolean stainlessSteel;
	private Boolean hammeredGray;
	private Boolean hammeredBrown;
	private Boolean searching;
	private Boolean editing;
	private Boolean disableSistelHall;
	private Integer sistelWDisplayFloor;
	private Integer sistelWDisplayPB;
	private Integer sistelWArrowFloor;
	private Integer sistelWArrowPB;
	private SaleSummary saleSummary;
	private SecurityUser user;

	public ListModel<Object> getListQuotationNumber() {
		return listQuotationNumber;
	}

	public void setListQuotationNumber(ListModel<Object> listQuotationNumber) {
		this.listQuotationNumber = listQuotationNumber;
	}

	public Boolean getEditing() {
		return editing;
	}

	public void setEditing(Boolean editing) {
		this.editing = editing;
	}

	public Boolean getSearching() {
		return searching;
	}

	public void setSearching(Boolean searching) {
		this.searching = searching;
	}

	public String getModalMessage() {
		return modalMessage;
	}

	public void setModalMessage(String modalMessage) {
		this.modalMessage = modalMessage;
	}

	public ListModel<Object> getListSeller() {
		return listSeller;
	}

	public void setListSeller(ListModel<Object> listSeller) {
		this.listSeller = listSeller;
	}

	public ListModel<Object> getListConstruction() {
		return listConstruction;
	}

	public void setListConstruction(ListModel<Object> listConstruction) {
		this.listConstruction = listConstruction;
	}

	public ListModel<Object> getListPartnerName() {
		return listPartnerName;
	}

	public void setListPartnerName(ListModel<Object> listPartnerName) {
		this.listPartnerName = listPartnerName;
	}

	public ListModel<Object> getListNumber() {
		return listNumber;
	}

	public void setListNumber(ListModel<Object> listNumber) {
		this.listNumber = listNumber;
	}

	public String getDash() {
		return dash;
	}

	public List<BasicData> getListMachineBase() {
		return listMachineBase;
	}

	public void setListMachineBase(List<BasicData> listMachineBase) {
		this.listMachineBase = listMachineBase;
	}

	public ListModel<Object> getListRifPartner() {
		return listRifPartner;
	}

	public void setListRifPartner(ListModel<Object> listRifPartner) {
		this.listRifPartner = listRifPartner;
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

	public SaleSummary getSaleSummary() {
		return saleSummary;
	}

	public void setSaleSummary(SaleSummary saleSummary) {
		this.saleSummary = saleSummary;
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
	 * Metodo que valida que un componente ZK no este vacio.
	 * 
	 * @return {@link Validator}
	 */
	public Validator getNoEmpty() {
		return new ValidateZK().getNoEmpty();
	}

	/**
	 * Metodo que valida que un string sea un Email valido. Solo aplica para componentes ZK
	 * 
	 * @return {@link Validator}
	 */
	public Validator getNoEmail() {
		return new ValidateZK().getNoEmail();
	}

	/**
	 * Metodo que valida que la cantidad de Ascensores sea por lo menos uno, si el resumen es Nuevo. Solo aplica
	 * para componentes ZK
	 * 
	 * @return {@link Validator}
	 */
	public Validator getNoElevatorQuantity() {
		return new AbstractValidator() {
			@Override
			public void validate(ValidationContext ctx) {
				InputElement inputElement = (InputElement) ctx.getBindContext().getValidatorArg("component");
				Integer quantity = Integer.parseInt(inputElement.getText());
				if (saleSummary.getQuotation().isType() && (quantity < 1))
					throw new WrongValueException(inputElement, "Debe ingresar al menos un ascensor.");
			}
		};
	}

	/**
	 * Metodo que valida que se anada una descripcion si se selecciona un diseno formica.
	 * 
	 * @return {@link Validator}
	 */
	public Validator getNoEmptyForFormica() {
		return new AbstractValidator() {
			@Override
			public void validate(ValidationContext ctx) {
				InputElement inputElement = (InputElement) ctx.getBindContext().getValidatorArg("component");
				String str = inputElement.getText();
				if (saleSummary.getBasicDataByCabinDesign() != null && saleSummary.getBasicDataByCabinDesign().getName().indexOf("FORMICA") != -1 && str.trim().isEmpty())
					throw new WrongValueException(inputElement, "Debe ingresar una descripcion para el diseño formica.");
				if (saleSummary.getBasicDataByCabinDesign() != null && saleSummary.getBasicDataByCabinDesign().getName().indexOf("OTRO") != -1 && str.trim().isEmpty())
					throw new WrongValueException(inputElement, "Debe ingresar una descripcion para el diseño OTRO.");
				if (saleSummary.getBasicDataByFloorType() != null && saleSummary.getBasicDataByFloorType().getName().indexOf("OTROS") != -1 && str.trim().isEmpty())
					throw new WrongValueException(inputElement, "Debe ingresar una descripcion acabados de piso OTROS.");
			}
		};
	}

	public Validator getNoZeroContinuous() {
		return new AbstractValidator() {
			@Override
			public void validate(ValidationContext ctx) {
				InputElement inputElement = (InputElement) ctx.getBindContext().getValidatorArg("component");
				Integer value = Integer.valueOf(inputElement.getText());
				if (saleSummary.getStopSequenceContinuous() && value <= 0)
					throw new WrongValueException(inputElement, "Debe ingresar cantidad de paradas.");
			}
		};
	}

	public Validator getNoZeroEven() {
		return new AbstractValidator() {
			@Override
			public void validate(ValidationContext ctx) {
				InputElement inputElement = (InputElement) ctx.getBindContext().getValidatorArg("component");
				Integer value = Integer.valueOf(inputElement.getText());
				if (saleSummary.getStopSequenceEven() && value <= 0)
					throw new WrongValueException(inputElement, "Debe ingresar cantidad de paradas.");
			}
		};
	}

	public Validator getNoZeroOdd() {
		return new AbstractValidator() {
			@Override
			public void validate(ValidationContext ctx) {
				InputElement inputElement = (InputElement) ctx.getBindContext().getValidatorArg("component");
				Integer value = Integer.valueOf(inputElement.getText());
				if (saleSummary.getStopSequenceOdd() && value <= 0)
					throw new WrongValueException(inputElement, "Debe ingresar cantidad de paradas.");
			}
		};
	}

	public Validator getValidateDoorframeType() {
		return new AbstractValidator() {
			@Override
			public void validate(ValidationContext ctx) {
				InputElement inputElement = (InputElement) ctx.getBindContext().getValidatorArg("component");
				String str = inputElement.getText();
				if (saleSummary.getBasicDataByDoorframeType() != null && (str.indexOf("RECTO - 30X150") != -1) && (saleSummary.getHallButtonPlace().indexOf("MARCO") != -1))
					throw new WrongValueException(inputElement, "Este tipo no puede ser ubicado en el Marco.");
			}
		};
	}

	public Validator getNoSelect() {
		return new ValidateZK().getNoSelect();
	}

	public Validator getNoZero() {
		return new ValidateZK().getNoZero();
	}

	public Validator getNoZeroDouble() {
		return new AbstractValidator() {
			@Override
			public void validate(ValidationContext ctx) {
				InputElement inputElement = (InputElement) ctx.getBindContext().getValidatorArg("component");
				NumberFormat format = NumberFormat.getInstance(Locale.FRANCE);
				Double number = new Double(0);
				try {
					number = format.parse(inputElement.getText()).doubleValue();
				} catch (WrongValueException e) {
					e.printStackTrace();
				} catch (ParseException e) {
					e.printStackTrace();
				}
				if (number <= 0 && saleSummary.getQuotation().isType()) {
					throw new WrongValueException(inputElement, "Ingrese una cantidad valida.");
				}
			}
		};
	}

	@Init
	public void init() {
		restartForm();
	}

	@NotifyChange("*")
	@Command
	public void restartForm() {
		seleccione = new String("--Seleccione--");
		modalMessage = null;
		saleSummary = new SaleSummary();
		saleSummary.setPlaneC(false);
		saleSummary.setPlaneP(false);
		saleSummary.setStopSequenceContinuous(false);
		saleSummary.setStopSequenceEven(false);
		saleSummary.setStopSequenceOdd(false);
		saleSummary.setDesignSpecial(false);
		saleSummary.setDoorFrameStainless(false);
		saleSummary.setSistelWarrowPb(false);
		saleSummary.setSistelWdisplayPb(false);
		saleSummary.setLightCurtain(true);
		saleSummary.setLoadLimiter(false);
		saleSummary.setSpeechSynthesizer(false);
		saleSummary.setGomSystem(false);
		saleSummary.setIntercom(false);
		saleSummary.setPhone(false);
		saleSummary.setAccessSytem(false);
		saleSummary.setFirefighterKeychain(false);
		searching = true;
		editing = false;
		disableSistelHall = true;
		cabinModel = new BasicData();
		User auxUser = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		this.user = serviceSecurityUser.findUser(auxUser.getUsername());
		listDesign = new ArrayList<BasicData>();
		listFan = new ArrayList<BasicData>();
		listBoothDisplay = new ArrayList<BasicData>();
		listFloorDisplay = new ArrayList<BasicData>();
		listRoofType = new ArrayList<BasicData>();
		listRifType = serviceBasicData.listRifType();

		listBType = serviceBasicData.listBuildingType();
		listElevatorType = serviceBasicData.listElevatorType();
		listElevatorCapa = serviceBasicData.listElevatorCapacitance();
		listMachineType = serviceBasicData.listMachineType();
		listMachineBase = serviceBasicData.listMachineBase();
		listBEmbarque = serviceBasicData.listAccess();
		listElectricityType = serviceBasicData.listElectricityType();
		listSpeed = serviceBasicData.listSpeed();
		listFrequency = serviceBasicData.listFrequency();
		listVoltageLighting = serviceBasicData.listVoltageLighting();
		listHourMachine = serviceBasicData.listHourMachine();
		listManeuverType = serviceBasicData.listManeuverType();
		listButtonType = serviceBasicData.listButtonType();
		listRailing = serviceBasicData.listRailing();
		listMirror = serviceBasicData.listMirror();
		listFloorType = serviceBasicData.listFloorType();
		listDoorType = serviceBasicData.listDoorType();
		listDoorSystem = serviceBasicData.listDoorSystem();
		listDoorframeType = serviceBasicData.listDoorframeType();
		listDoorframeHammered = serviceBasicData.listDoorframeHammered();
		listHallButton = serviceBasicData.listHallButton();
		listHallButtonType = serviceBasicData.listHallButtonType();
		listFreeAdmission = serviceBasicData.listFreeAdmission();
		listHeight = serviceBasicData.listHeight();
		listControlType = serviceBasicData.listControlType();
		listBoothButton = serviceBasicData.listBoothButton();
		listMotorTraction = serviceBasicData.listMotorTraction();
		listCabinModel = serviceBasicData.listCabinModel();
	}

	public String mailMessage() {
		String seller = new String(saleSummary.getQuotation().getSeller());
		String message = new String();
		message = "Modificación de resumen de venta. Enviado por " + seller + "\n\nCliente: " + saleSummary.getQuotation().getPartnerName() + "\n\nCantidad ascensores: " + saleSummary.getElevatorQuantity() + "\n\nCiudad: " + saleSummary.getConstructionCity();
		return message;
	}

	public List<File> mailAttach() {
		List<File> listAttach = new ArrayList<File>();
		GenericReport report = new GenericReport();
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("ID_SALE_SUMMARY", saleSummary.getIdSaleSummary());
		parameters.put("IMAGES_DIR", "../../resource/images/system/reports/");
		parameters.put("SUBREPORT_DIR", "../../resource/reports/ventas/resumen/");
		Long time = new Date().getTime();
		report.createPdf("/resource/reports/ventas/resumen", "sale_summary.jasper", parameters, "Resumen_venta_" + time + ".pdf");
		File file = new File(Sessions.getCurrent().getWebApp().getRealPath("/resource/reports/ventas/resumen/Resumen_venta_" + time + ".pdf"));
		listAttach.add(file);
		return listAttach;
	}

	public void sendMail() {
		List<String> listRecipient = new ArrayList<String>();
		Quotation auxQuotation = serviceQuotation.findById(saleSummary.getQuotation().getIdQuotation());
		listRecipient.add("logistica@ascensoresnardi.com");
		listRecipient.add(auxQuotation.getBudget().getSecurityUser().getEmail());
		listRecipient.add("sistemas@ascensoresnardi.com");
		emails.sendMail("sistemas@ascensoresnardi.com", "Modificacion resumen de venta obra " + saleSummary.getConstruction(), listRecipient, mailMessage(), mailAttach());
	}

	@NotifyChange({ "*" })
	@Command
	public void save(@BindingParam("component") InputElement component) {
		if (!serviceSaleSummary.save(saleSummary)) {
			Clients.showNotification("No se pudo guardar.", "error", null, "bottom_center", 2000);
			return;
		}
		sendMail();
		Clients.showNotification("Resumen de venta modificado", "info", null, "bottom_center", 2000);
		restartForm();
	}

	@NotifyChange("modalMessage")
	@Command
	public void confirmSave() {
		modalMessage = "¿Esta seguro de actualizar el resumen de venta?";
	}

	@NotifyChange("modalMessage")
	@Command
	public void cancelModal() {
		modalMessage = null;
	}

	@NotifyChange({ "editing" })
	@Command
	public void edit(@BindingParam("component") Button button) {
		editing = true;
	}

	@NotifyChange({ "listRifPartner", "listNumber", "listPartnerName", "listConstruction", "listSeller", "listQuotationNumber" })
	@Command
	public void searchSaleSummaryByField(@BindingParam("field") String field) {
		if (field.equals("rifPartner")) {
			listRifPartner = new SimpleListModelCustom<Object>(serviceSaleSummary.listRifPartner(this.user));
			return;
		} else if (field.equals("number")) {
			listNumber = new SimpleListModelCustom<Object>(serviceSaleSummary.listNumber(this.user));
			return;
		} else if (field.equals("partnerName")) {
			listPartnerName = new SimpleListModelCustom<Object>(serviceSaleSummary.listPartnerName(this.user));
			return;
		} else if (field.equals("construction")) {
			listConstruction = new SimpleListModelCustom<Object>(serviceSaleSummary.listConstruction(this.user));
			return;
		} else if (field.equals("seller")) {
			listSeller = new SimpleListModelCustom<Object>(serviceSaleSummary.listSeller(this.user));
			return;
		} else if (field.equals("quotationNumber")) {
			listQuotationNumber = new SimpleListModelCustom<Object>(serviceSaleSummary.listQuotationNumber(this.user));
			return;
		}
	}

	@NotifyChange("*")
	@Command
	public void loadSaleSummary(@BindingParam("field") String field, @BindingParam("val") String value) {
		List<SaleSummary> listSummary = new ArrayList<SaleSummary>();
		if (field.equals("partnerName"))
			listSummary = serviceSaleSummary.listByPartnerName(value, this.user);
		else if (field.compareTo("construction") == 0)
			listSummary = serviceSaleSummary.listByConstruction(value, this.user);
		else if (field.compareTo("seller") == 0)
			listSummary = serviceSaleSummary.listBySeller(value, this.user);
		else if (field.equals("rifPartner"))
			listSummary = serviceSaleSummary.listByRifPartner(value, this.user);
		else if (field.equals("number"))
			listSummary = serviceSaleSummary.listByNumber(value, this.user);
		else if (field.equals("quotationNumber")) {
			if (value.isEmpty())
				value = "0";
			for (int i = 0; i < value.length(); i++) {
				if (!Character.isDigit(value.charAt(i))) {
					value = "0";
					break;
				}
			}
			Integer quotationNumber = Integer.parseInt(value);
			listSummary = serviceSaleSummary.listByQuotationNumber(quotationNumber, this.user);
		}
		searchGeneric(listSummary);
	}

	public void searchGeneric(List<SaleSummary> list) {
		int listSize = list.size();
		if (listSize == 1) {
			saleSummary = list.get(0);
			searching = false;
			listRoofType = serviceBasicData.listRoofTypeByElevatorCapacitance(saleSummary.getBasicDataByElevatorCapacitance());
			listFan = serviceBasicData.listFan1();
			listFan.addAll(serviceBasicData.listFan2());
			if (saleSummary.getBasicDataByBoothDisplay().getName().contains("SISTEL")) {
				listBoothDisplay = serviceBasicData.listBoothDisplaySistel();
				listFloorDisplay = serviceBasicData.listFloorDisplaySistel();
			} else {
				listBoothDisplay = serviceBasicData.listBoothDisplayCF();
				listFloorDisplay = serviceBasicData.listFloorDisplayCF();
			}
			if (saleSummary.getBasicDataByCabinDesign() != null) {
				cabinModel = saleSummary.getBasicDataByCabinDesign().getBasicData();
				listDesign = serviceBasicData.listDesignByModel(cabinModel);
			}
		} else if (listSize == 0) {
			Clients.showNotification("Ningun registro coincide", "info", null, "top_center", 2000);
		} else {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("listSaleSummary", list);
			Executions.createComponents("system/ventas/resumen/frmSaleSummaryList.zul", null, map);
		}
	}

	@NotifyChange({ "searching", "saleSummary", "listRoofType", "listBoothDisplay", "listFloorDisplay", "cabinModel", "listDesign", "listFan" })
	@GlobalCommand
	public void selectedSaleSummary(@BindingParam("saleSummary") SaleSummary saleSummary) {
		this.saleSummary = serviceSaleSummary.findById(saleSummary.getIdSaleSummary());
		searching = false;
		listRoofType = serviceBasicData.listRoofTypeByElevatorCapacitance(this.saleSummary.getBasicDataByElevatorCapacitance());
		listFan = serviceBasicData.listFan1();
		listFan.addAll(serviceBasicData.listFan2());
		if (this.saleSummary.getBasicDataByBoothDisplay().getName().contains("SISTEL")) {
			listBoothDisplay = serviceBasicData.listBoothDisplaySistel();
			listFloorDisplay = serviceBasicData.listFloorDisplaySistel();
		} else {
			listBoothDisplay = serviceBasicData.listBoothDisplayCF();
			listFloorDisplay = serviceBasicData.listFloorDisplayCF();
		}
		if (this.saleSummary.getBasicDataByCabinDesign() != null) {
			cabinModel = this.saleSummary.getBasicDataByCabinDesign().getBasicData();
			listDesign = serviceBasicData.listDesignByModel(cabinModel);
		}
	}

	@Command
	public void selectElevatorType() {
		String elevatorType = saleSummary.getBasicDataByElevatorType() != null ? saleSummary.getBasicDataByElevatorType().getName() : "";
		String elevatorCapacitance = saleSummary.getBasicDataByElevatorCapacitance() != null ? saleSummary.getBasicDataByElevatorCapacitance().getName() : "";
		if (elevatorCapacitance.compareTo("800 Kg - 10 Pers") == 0 && (elevatorType.compareTo("PASAJERO") == 0 || elevatorType.compareTo("PANORAMICO") == 0)) {
			saleSummary.setCabinWidth(1.4);
			saleSummary.setCabinHeight(2.0);
			saleSummary.setCabinBackground(1.4);
		} else if (elevatorCapacitance.compareTo("1050 Kg - 13 Pers") == 0 && (elevatorType.compareTo("PASAJERO") == 0 || elevatorType.compareTo("PANORAMICO") == 0)) {
			saleSummary.setCabinWidth(1.6);
			saleSummary.setCabinHeight(2.0);
			saleSummary.setCabinBackground(1.5);
		} else if (elevatorCapacitance.compareTo("1200 Kg - 16 Pers") == 0 && (elevatorType.compareTo("PASAJERO") == 0 || elevatorType.compareTo("PANORAMICO") == 0)) {
			saleSummary.setCabinWidth(1.8);
			saleSummary.setCabinHeight(2.0);
			saleSummary.setCabinBackground(1.5);
		} else if (elevatorCapacitance.compareTo("1500 Kg - 20 Pers") == 0 && (elevatorType.compareTo("PASAJERO") == 0 || elevatorType.compareTo("PANORAMICO") == 0)) {
			saleSummary.setCabinWidth(2.0);
			saleSummary.setCabinHeight(2.0);
			saleSummary.setCabinBackground(1.7);
		} else if (elevatorCapacitance.compareTo("1050 Kg - 13 Pers") == 0 && elevatorType.compareTo("MONTACAMILLA") == 0) {
			saleSummary.setCabinWidth(1.2);
			saleSummary.setCabinHeight(2.0);
			saleSummary.setCabinBackground(2.3);
		} else if (elevatorCapacitance.compareTo("1500 Kg - 20 Pers") == 0 && elevatorType.compareTo("MONTACAMILLA") == 0) {
			saleSummary.setCabinWidth(1.5);
			saleSummary.setCabinHeight(2.0);
			saleSummary.setCabinBackground(2.3);
		}
		BindUtils.postNotifyChange(null, null, saleSummary, "cabinWidth");
		BindUtils.postNotifyChange(null, null, saleSummary, "cabinHeight");
		BindUtils.postNotifyChange(null, null, saleSummary, "cabinBackground");
	}

	@Command
	public void close() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("page", "");
		BindUtils.postGlobalCommand(null, null, "selectedPage", map);
	}

	@Command
	public void isStopSequenceContinuous() {
		saleSummary.setStopSequenceEven(false);
		saleSummary.setStopSequenceOdd(false);
		saleSummary.setStopSequenceEvenNumber(0);
		saleSummary.setStopSequenceOddNumber(0);
		saleSummary.setStopSequenceEvenQ(new String());
		saleSummary.setStopSequenceOddQ(new String());
		if (!saleSummary.getStopSequenceContinuous()) {
			saleSummary.setStopSequenceContinuousQ(new String());
			saleSummary.setStopSequenceContinuousNumber(0);
		}
	}

	@Command
	public void print() {
		GenericReport report = new GenericReport();
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("ID_SALE_SUMMARY", saleSummary.getIdSaleSummary());
		parameters.put("IMAGES_DIR", "../../resource/images/system/reports/");
		parameters.put("SUBREPORT_DIR", "../../resource/reports/ventas/resumen/");
		Long time = new Date().getTime();
		report.createPdf("/resource/reports/ventas/resumen", "sale_summary.jasper", parameters, "Resumen_venta_" + time + ".pdf");
		report.viewPdf("/resource/reports/ventas/resumen/Resumen_venta_" + time + ".pdf", "Resumen Venta");
	}

	@NotifyChange({ "listDesign" })
	@Command
	public void loadCabinDesign() {
		listDesign = serviceBasicData.listDesignByModel(cabinModel);
		// No asigno un nuevo OBJETO en lugar de "null" puesto que me da error al guardar el objeto saleSummary
		saleSummary.setBasicDataByCabinDesign(null);
	}

	@Command
	public void selectDoorType(@BindingParam("doorType") String doorType) {
		if (doorType.compareTo("BATIENTE IZQUIERDA") == 0 || doorType.compareTo("BATIENTE DERECHA") == 0 || doorType.compareTo("GUILLOTINA") == 0 || doorType.compareTo("SANTA MARIA") == 0)
			saleSummary.setBasicDataByDoorSystem(serviceBasicData.findByDoorSystem("NO APLICA"));
		else
			saleSummary.setBasicDataByDoorSystem(null);
		BindUtils.postNotifyChange(null, null, saleSummary, "basicDataByDoorSystem");
	}

	@Command
	public void changeTour(@BindingParam("tour") Double tour) {
		if (tour >= 24)
			saleSummary.setFirefighterKeychain(true);
		else
			saleSummary.setFirefighterKeychain(false);
		BindUtils.postNotifyChange(null, null, saleSummary, "firefighterKeychain");
	}

	@NotifyChange({ "listFan", "listRoofType" })
	@Command
	public void loadFans() {
		String elevatorCapacitance = new String(saleSummary.getBasicDataByElevatorCapacitance().getName());
		if (elevatorCapacitance.indexOf("320 Kg - 4 Pers") != -1 || elevatorCapacitance.indexOf("450 Kg - 6 Pers") != -1 || elevatorCapacitance.indexOf("600 Kg - 8 Pers") != -1) {
			listFan = serviceBasicData.listFan1();
		} else if (elevatorCapacitance.indexOf("OTRA") != -1) {
			listFan = serviceBasicData.listFan1();
			listFan.addAll(serviceBasicData.listFan2());
		} else {
			listFan = serviceBasicData.listFan2();
		}
		listRoofType = serviceBasicData.listRoofTypeByElevatorCapacitance(saleSummary.getBasicDataByElevatorCapacitance());
		// No asigno un nuevo OBJETO en lugar de "null" puesto que me da error al guardar el objeto saleSummary
		saleSummary.setBasicDataByRoofType(null);
		saleSummary.setBasicDataByFan(null);
		BindUtils.postNotifyChange(null, null, saleSummary, "fan");
		BindUtils.postNotifyChange(null, null, saleSummary, "roofType");
		selectElevatorType();
	}

	@NotifyChange({ "listBoothDisplay", "listFloorDisplay" })
	@Command
	public void loadBoothFloorDisplay() {
		String controlType = saleSummary.getBasicDataByControlType().getName();
		if (controlType.indexOf("SISTEL") != -1) {
			listBoothDisplay = serviceBasicData.listBoothDisplaySistel();
			listFloorDisplay = serviceBasicData.listFloorDisplaySistel();
		} else if (controlType.indexOf("CF CONTROL") != -1) {
			listBoothDisplay = serviceBasicData.listBoothDisplayCF();
			listFloorDisplay = serviceBasicData.listFloorDisplayCF();
		} else {
			listBoothDisplay = new ArrayList<BasicData>();
			listFloorDisplay = new ArrayList<BasicData>();
		}
		saleSummary.setBasicDataByBoothDisplay(null);
		saleSummary.setBasicDataByFloorDisplay(null);
	}

	@Command
	public void checkWidthDoorFrame(@BindingParam("component") InputElement component) {
		if (saleSummary.getBasicDataByDoorframeType() != null && saleSummary.getBasicDataByDoorframeType().getName().indexOf("RECTO - 30X150") != -1 && saleSummary.getHallButtonPlace().indexOf("MARCO") != -1) {
			throw new WrongValueException(component, "Este tipo no puede ser ubicado en el Marco.");
		}
	}

	@NotifyChange("disableSistelHall")
	@Command
	public void disabledSistelsHall() {
		if (saleSummary.getBasicDataByHallButtonType().getName().indexOf("SISTEL") != -1)
			disableSistelHall = false;
		else {
			disableSistelHall = true;
			saleSummary.setSistelWarrowPb(false);
			saleSummary.setSistelWarrowFloor(0);
			saleSummary.setSistelWdisplayPb(false);
			saleSummary.setSistelWdisplayFloor(0);
		}
	}

	@Command
	public void updateMotorQuantity(@ContextParam(ContextType.TRIGGER_EVENT) InputEvent event) {
		// Con la linea superior enlazo el evento sobre el input con el controlador Ver: http://forum.zkoss
		// .org/question/79590/textbox-onchanging-event-doesnt-work-properly/
		if (saleSummary.getQuotation().isType()) {
			Integer value = new Integer(0);
			if (!event.getValue().isEmpty())
				value = Integer.parseInt(event.getValue());
			saleSummary.setMotorQuantity(value);
			BindUtils.postNotifyChange(null, null, saleSummary, "motorQuantity");
		}
	}

	@Command
	public void activeDesignComment() {
		String cabinDesign = new String();
		String floorType = new String();
		if (saleSummary.getBasicDataByCabinDesign() != null)
			cabinDesign = saleSummary.getBasicDataByCabinDesign().getName();
		if (saleSummary.getBasicDataByFloorType() != null)
			floorType = saleSummary.getBasicDataByFloorType().getName();
		if (cabinDesign.indexOf("FORMICA") != -1 || cabinDesign.indexOf("OTRO") != -1 || floorType.indexOf("OTROS") != -1)
			saleSummary.setDesignSpecial(true);
		// IMPORTANTE Solo actualizao una propiedad del objeto saleSummary, mas no todo el objeto
		BindUtils.postNotifyChange(null, null, saleSummary, "designSpecial");
	}

	@Command
	public void updateDesignSpecialComment(@BindingParam("comment") String comment) {
		saleSummary.setDesignSpecialComment(comment);
		BindUtils.postNotifyChange(null, null, saleSummary, "designSpecialComment");
	}

	@Command
	public void isDesignSpecial(@BindingParam("check") Boolean checked) {
		if (!checked)
			saleSummary.setDesignSpecialComment(new String());
		BindUtils.postNotifyChange(null, null, saleSummary, "designSpecialComment");
	}
}