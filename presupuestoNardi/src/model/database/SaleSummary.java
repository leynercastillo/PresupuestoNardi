package model.database;

// Generated 05-nov-2013 16:26:03 by Hibernate Tools 4.0.0

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;

/**
 * SaleSummary generated by hbm2java
 */
@Entity
@Table(name = "sale_summary", schema = "public")
public class SaleSummary implements java.io.Serializable {

	private static final long serialVersionUID = 4152859691803286041L;
	private int idSaleSummary;
	private int version;
	private BasicData basicDataByElectricityType;
	private BasicData basicDataByHourMachine;
	private BasicData basicDataByHallButton;
	private BasicData basicDataByRoofType;
	private BasicData basicDataBySpeed;
	private BasicData basicDataByVoltageLighting;
	private BasicData basicDataByDoorframeType;
	private BasicData basicDataByRailing;
	private BasicData basicDataByBoothButton;
	private BasicData basicDataByMirror;
	private BasicData basicDataByBoothDisplay;
	private BasicData basicDataByElevatorType;
	private BasicData basicDataByDoorSystem;
	private BasicData basicDataByFrequency;
	private BasicData basicDataByHallButtonType;
	private BasicData basicDataByFan;
	private BasicData basicDataByCabinDesign;
	private BasicData basicDataByMachineType;
	private BasicData basicDataByBuildingType;
	private BasicData basicDataByManeuverType;
	private BasicData basicDataByDoorFrameHammered;
	private BasicData basicDataByFloorType;
	private BasicData basicDataByMachineBase;
	private Quotation quotation;
	private BasicData basicDataByHeight;
	private BasicData basicDataByDoorType;
	private BasicData basicDataByButtonType;
	private BasicData basicDataByControlType;
	private BasicData basicDataByFreeAdmission;
	private BasicData basicDataByFloorDisplay;
	private BasicData basicDataByAccess;
	private int number;
	private Date date;
	private String construction;
	private String constructionCity;
	private String constructionAddress;
	private String seller;
	private String contactName;
	private String contactPhone;
	private String email;
	private Boolean planeC;
	private Boolean planeP;
	private boolean saleType;
	private Integer elevatorQuantity;
	private Integer elevatorCapacitance;
	private Integer motorQuantity;
	private String motorTraction;
	private Integer stopNumber;
	private Double tour;
	private Double onTour;
	private Double widthHole;
	private Double fossa;
	private Double bottomHole;
	private Boolean designSpecial;
	private String designSpecialComment;
	private Double cabinWidth;
	private Double cabinBackground;
	private Double cabinHeight;
	private Integer doorOfNumber;
	private String doorframeTypeComment;
	private String hallButtonPlace;
	private boolean lightCurtain;
	private Boolean loadLimiter;
	private Boolean speechSynthesizer;
	private Boolean gomSystem;
	private Boolean intercom;
	private Boolean phone;
	private Boolean accessSytem;
	private Boolean firefighterKeychain;
	private String displayPlaceFloor;
	private Boolean stopSequenceContinuous;
	private String stopSequenceContinuousQ;
	private Integer stopSequenceContinuousNumber;
	private Boolean stopSequenceEven;
	private String stopSequenceEvenQ;
	private Integer stopSequenceEvenNumber;
	private Boolean stopSequenceOdd;
	private String stopSequenceOddQ;
	private Integer stopSequenceOddNumber;
	private String doorFrameHammeredDesc;
	private Boolean doorFrameStainless;
	private String doorFrameStainlessDescrip;
	private Boolean sistelWdisplayPb;
	private Integer sistelWdisplayFloor;
	private Boolean sistelWarrowPb;
	private Integer sistelWarrowFloor;
	private String comment;
	private char status;

	public SaleSummary() {
	}

	public SaleSummary(int idSaleSummary, BasicData basicDataByHallButton, BasicData basicDataByRoofType, BasicData basicDataBySpeed, BasicData basicDataByDoorframeType, BasicData basicDataByRailing, BasicData basicDataByBoothButton, BasicData basicDataByMirror, BasicData basicDataByBoothDisplay, BasicData basicDataByElevatorType, BasicData basicDataByDoorSystem, BasicData basicDataByFrequency, BasicData basicDataByHallButtonType, BasicData basicDataByFan, BasicData basicDataByCabinDesign, BasicData basicDataByMachineType, BasicData basicDataByBuildingType, BasicData basicDataByDoorFrameHammered, BasicData basicDataByFloorType, Quotation quotation, BasicData basicDataByHeight, BasicData basicDataByDoorType, BasicData basicDataByButtonType, BasicData basicDataByControlType, BasicData basicDataByFreeAdmission, BasicData basicDataByFloorDisplay, BasicData basicDataByAccess, int number, Date date, String construction, String constructionCity, String constructionAddress, String seller, String contactName, String contactPhone, boolean saleType, boolean lightCurtain, char status) {
		this.idSaleSummary = idSaleSummary;
		this.basicDataByHallButton = basicDataByHallButton;
		this.basicDataByRoofType = basicDataByRoofType;
		this.basicDataBySpeed = basicDataBySpeed;
		this.basicDataByDoorframeType = basicDataByDoorframeType;
		this.basicDataByRailing = basicDataByRailing;
		this.basicDataByBoothButton = basicDataByBoothButton;
		this.basicDataByMirror = basicDataByMirror;
		this.basicDataByBoothDisplay = basicDataByBoothDisplay;
		this.basicDataByElevatorType = basicDataByElevatorType;
		this.basicDataByDoorSystem = basicDataByDoorSystem;
		this.basicDataByFrequency = basicDataByFrequency;
		this.basicDataByHallButtonType = basicDataByHallButtonType;
		this.basicDataByFan = basicDataByFan;
		this.basicDataByCabinDesign = basicDataByCabinDesign;
		this.basicDataByMachineType = basicDataByMachineType;
		this.basicDataByBuildingType = basicDataByBuildingType;
		this.basicDataByDoorFrameHammered = basicDataByDoorFrameHammered;
		this.basicDataByFloorType = basicDataByFloorType;
		this.quotation = quotation;
		this.basicDataByHeight = basicDataByHeight;
		this.basicDataByDoorType = basicDataByDoorType;
		this.basicDataByButtonType = basicDataByButtonType;
		this.basicDataByControlType = basicDataByControlType;
		this.basicDataByFreeAdmission = basicDataByFreeAdmission;
		this.basicDataByFloorDisplay = basicDataByFloorDisplay;
		this.basicDataByAccess = basicDataByAccess;
		this.number = number;
		this.date = date;
		this.construction = construction;
		this.constructionCity = constructionCity;
		this.constructionAddress = constructionAddress;
		this.seller = seller;
		this.contactName = contactName;
		this.contactPhone = contactPhone;
		this.saleType = saleType;
		this.lightCurtain = lightCurtain;
		this.status = status;
	}

	public SaleSummary(int idSaleSummary, BasicData basicDataByElectricityType, BasicData basicDataByHourMachine, BasicData basicDataByHallButton, BasicData basicDataByRoofType, BasicData basicDataBySpeed, BasicData basicDataByVoltageLighting, BasicData basicDataByDoorframeType, BasicData basicDataByRailing, BasicData basicDataByBoothButton, BasicData basicDataByMirror, BasicData basicDataByBoothDisplay, BasicData basicDataByElevatorType, BasicData basicDataByDoorSystem, BasicData basicDataByFrequency, BasicData basicDataByHallButtonType, BasicData basicDataByFan, BasicData basicDataByCabinDesign, BasicData basicDataByMachineType, BasicData basicDataByBuildingType, BasicData basicDataByManeuverType, BasicData basicDataByDoorFrameHammered, BasicData basicDataByFloorType, BasicData basicDataByMachineBase, Quotation quotation, BasicData basicDataByHeight, BasicData basicDataByDoorType, BasicData basicDataByButtonType, BasicData basicDataByControlType, BasicData basicDataByFreeAdmission, BasicData basicDataByFloorDisplay, BasicData basicDataByAccess, int number, Date date, String construction, String constructionCity, String constructionAddress, String seller, String contactName, String contactPhone, String email, Boolean planeC, Boolean planeP, boolean saleType, Integer elevatorQuantity, Integer elevatorCapacitance, Integer motorQuantity, String motorTraction, Integer stopNumber, Double tour, Double onTour, Double widthHole, Double fossa, Double bottomHole, Boolean designSpecial, String designSpecialComment, Double cabinWidth, Double cabinBackground, Double cabinHeight, Integer doorOfNumber, String doorframeTypeComment, String hallButtonPlace, boolean lightCurtain, Boolean loadLimiter, Boolean speechSynthesizer, Boolean gomSystem, Boolean intercom, Boolean phone, Boolean accessSytem, Boolean firefighterKeychain, String displayPlaceFloor, Boolean stopSequenceContinuous, String stopSequenceContinuousQ, Integer stopSequenceContinuousNumber, Boolean stopSequenceEven, String stopSequenceEvenQ, Integer stopSequenceEvenNumber, Boolean stopSequenceOdd, String stopSequenceOddQ, Integer stopSequenceOddNumber, String doorFrameHammeredDesc, Boolean doorFrameStainless, String doorFrameStainlessDescrip, Boolean sistelWdisplayPb, Integer sistelWdisplayFloor, Boolean sistelWarrowPb, Integer sistelWarrowFloor, String comment, char status) {
		this.idSaleSummary = idSaleSummary;
		this.basicDataByElectricityType = basicDataByElectricityType;
		this.basicDataByHourMachine = basicDataByHourMachine;
		this.basicDataByHallButton = basicDataByHallButton;
		this.basicDataByRoofType = basicDataByRoofType;
		this.basicDataBySpeed = basicDataBySpeed;
		this.basicDataByVoltageLighting = basicDataByVoltageLighting;
		this.basicDataByDoorframeType = basicDataByDoorframeType;
		this.basicDataByRailing = basicDataByRailing;
		this.basicDataByBoothButton = basicDataByBoothButton;
		this.basicDataByMirror = basicDataByMirror;
		this.basicDataByBoothDisplay = basicDataByBoothDisplay;
		this.basicDataByElevatorType = basicDataByElevatorType;
		this.basicDataByDoorSystem = basicDataByDoorSystem;
		this.basicDataByFrequency = basicDataByFrequency;
		this.basicDataByHallButtonType = basicDataByHallButtonType;
		this.basicDataByFan = basicDataByFan;
		this.basicDataByCabinDesign = basicDataByCabinDesign;
		this.basicDataByMachineType = basicDataByMachineType;
		this.basicDataByBuildingType = basicDataByBuildingType;
		this.basicDataByManeuverType = basicDataByManeuverType;
		this.basicDataByDoorFrameHammered = basicDataByDoorFrameHammered;
		this.basicDataByFloorType = basicDataByFloorType;
		this.basicDataByMachineBase = basicDataByMachineBase;
		this.quotation = quotation;
		this.basicDataByHeight = basicDataByHeight;
		this.basicDataByDoorType = basicDataByDoorType;
		this.basicDataByButtonType = basicDataByButtonType;
		this.basicDataByControlType = basicDataByControlType;
		this.basicDataByFreeAdmission = basicDataByFreeAdmission;
		this.basicDataByFloorDisplay = basicDataByFloorDisplay;
		this.basicDataByAccess = basicDataByAccess;
		this.number = number;
		this.date = date;
		this.construction = construction;
		this.constructionCity = constructionCity;
		this.constructionAddress = constructionAddress;
		this.seller = seller;
		this.contactName = contactName;
		this.contactPhone = contactPhone;
		this.email = email;
		this.planeC = planeC;
		this.planeP = planeP;
		this.saleType = saleType;
		this.elevatorQuantity = elevatorQuantity;
		this.elevatorCapacitance = elevatorCapacitance;
		this.motorQuantity = motorQuantity;
		this.motorTraction = motorTraction;
		this.stopNumber = stopNumber;
		this.tour = tour;
		this.onTour = onTour;
		this.widthHole = widthHole;
		this.fossa = fossa;
		this.bottomHole = bottomHole;
		this.designSpecial = designSpecial;
		this.designSpecialComment = designSpecialComment;
		this.cabinWidth = cabinWidth;
		this.cabinBackground = cabinBackground;
		this.cabinHeight = cabinHeight;
		this.doorOfNumber = doorOfNumber;
		this.doorframeTypeComment = doorframeTypeComment;
		this.hallButtonPlace = hallButtonPlace;
		this.lightCurtain = lightCurtain;
		this.loadLimiter = loadLimiter;
		this.speechSynthesizer = speechSynthesizer;
		this.gomSystem = gomSystem;
		this.intercom = intercom;
		this.phone = phone;
		this.accessSytem = accessSytem;
		this.firefighterKeychain = firefighterKeychain;
		this.displayPlaceFloor = displayPlaceFloor;
		this.stopSequenceContinuous = stopSequenceContinuous;
		this.stopSequenceContinuousQ = stopSequenceContinuousQ;
		this.stopSequenceContinuousNumber = stopSequenceContinuousNumber;
		this.stopSequenceEven = stopSequenceEven;
		this.stopSequenceEvenQ = stopSequenceEvenQ;
		this.stopSequenceEvenNumber = stopSequenceEvenNumber;
		this.stopSequenceOdd = stopSequenceOdd;
		this.stopSequenceOddQ = stopSequenceOddQ;
		this.stopSequenceOddNumber = stopSequenceOddNumber;
		this.doorFrameHammeredDesc = doorFrameHammeredDesc;
		this.doorFrameStainless = doorFrameStainless;
		this.doorFrameStainlessDescrip = doorFrameStainlessDescrip;
		this.sistelWdisplayPb = sistelWdisplayPb;
		this.sistelWdisplayFloor = sistelWdisplayFloor;
		this.sistelWarrowPb = sistelWarrowPb;
		this.sistelWarrowFloor = sistelWarrowFloor;
		this.comment = comment;
		this.status = status;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "id_sale_summary_seq")
	@SequenceGenerator(name = "id_sale_summary_seq", sequenceName = "sale_summary_id_sale_summary_seq")
	@Column(name = "id_sale_summary", unique = true, nullable = false)
	public int getIdSaleSummary() {
		return this.idSaleSummary;
	}

	public void setIdSaleSummary(int idSaleSummary) {
		this.idSaleSummary = idSaleSummary;
	}

	@Version
	@Column(name = "version", nullable = false)
	public int getVersion() {
		return this.version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "electricity_type")
	public BasicData getBasicDataByElectricityType() {
		return this.basicDataByElectricityType;
	}

	public void setBasicDataByElectricityType(BasicData basicDataByElectricityType) {
		this.basicDataByElectricityType = basicDataByElectricityType;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "hour_machine")
	public BasicData getBasicDataByHourMachine() {
		return this.basicDataByHourMachine;
	}

	public void setBasicDataByHourMachine(BasicData basicDataByHourMachine) {
		this.basicDataByHourMachine = basicDataByHourMachine;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "hall_button", nullable = false)
	public BasicData getBasicDataByHallButton() {
		return this.basicDataByHallButton;
	}

	public void setBasicDataByHallButton(BasicData basicDataByHallButton) {
		this.basicDataByHallButton = basicDataByHallButton;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "roof_type", nullable = false)
	public BasicData getBasicDataByRoofType() {
		return this.basicDataByRoofType;
	}

	public void setBasicDataByRoofType(BasicData basicDataByRoofType) {
		this.basicDataByRoofType = basicDataByRoofType;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "speed", nullable = false)
	public BasicData getBasicDataBySpeed() {
		return this.basicDataBySpeed;
	}

	public void setBasicDataBySpeed(BasicData basicDataBySpeed) {
		this.basicDataBySpeed = basicDataBySpeed;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "voltage_lighting")
	public BasicData getBasicDataByVoltageLighting() {
		return this.basicDataByVoltageLighting;
	}

	public void setBasicDataByVoltageLighting(BasicData basicDataByVoltageLighting) {
		this.basicDataByVoltageLighting = basicDataByVoltageLighting;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "doorframe_type", nullable = false)
	public BasicData getBasicDataByDoorframeType() {
		return this.basicDataByDoorframeType;
	}

	public void setBasicDataByDoorframeType(BasicData basicDataByDoorframeType) {
		this.basicDataByDoorframeType = basicDataByDoorframeType;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "railing", nullable = false)
	public BasicData getBasicDataByRailing() {
		return this.basicDataByRailing;
	}

	public void setBasicDataByRailing(BasicData basicDataByRailing) {
		this.basicDataByRailing = basicDataByRailing;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "booth_button", nullable = false)
	public BasicData getBasicDataByBoothButton() {
		return this.basicDataByBoothButton;
	}

	public void setBasicDataByBoothButton(BasicData basicDataByBoothButton) {
		this.basicDataByBoothButton = basicDataByBoothButton;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "mirror", nullable = false)
	public BasicData getBasicDataByMirror() {
		return this.basicDataByMirror;
	}

	public void setBasicDataByMirror(BasicData basicDataByMirror) {
		this.basicDataByMirror = basicDataByMirror;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "booth_display", nullable = false)
	public BasicData getBasicDataByBoothDisplay() {
		return this.basicDataByBoothDisplay;
	}

	public void setBasicDataByBoothDisplay(BasicData basicDataByBoothDisplay) {
		this.basicDataByBoothDisplay = basicDataByBoothDisplay;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "elevator_type", nullable = false)
	public BasicData getBasicDataByElevatorType() {
		return this.basicDataByElevatorType;
	}

	public void setBasicDataByElevatorType(BasicData basicDataByElevatorType) {
		this.basicDataByElevatorType = basicDataByElevatorType;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "door_system", nullable = false)
	public BasicData getBasicDataByDoorSystem() {
		return this.basicDataByDoorSystem;
	}

	public void setBasicDataByDoorSystem(BasicData basicDataByDoorSystem) {
		this.basicDataByDoorSystem = basicDataByDoorSystem;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "frequency", nullable = false)
	public BasicData getBasicDataByFrequency() {
		return this.basicDataByFrequency;
	}

	public void setBasicDataByFrequency(BasicData basicDataByFrequency) {
		this.basicDataByFrequency = basicDataByFrequency;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "hall_button_type", nullable = false)
	public BasicData getBasicDataByHallButtonType() {
		return this.basicDataByHallButtonType;
	}

	public void setBasicDataByHallButtonType(BasicData basicDataByHallButtonType) {
		this.basicDataByHallButtonType = basicDataByHallButtonType;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fan", nullable = false)
	public BasicData getBasicDataByFan() {
		return this.basicDataByFan;
	}

	public void setBasicDataByFan(BasicData basicDataByFan) {
		this.basicDataByFan = basicDataByFan;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cabin_design", nullable = false)
	public BasicData getBasicDataByCabinDesign() {
		return this.basicDataByCabinDesign;
	}

	public void setBasicDataByCabinDesign(BasicData basicDataByCabinDesign) {
		this.basicDataByCabinDesign = basicDataByCabinDesign;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "machine_type", nullable = false)
	public BasicData getBasicDataByMachineType() {
		return this.basicDataByMachineType;
	}

	public void setBasicDataByMachineType(BasicData basicDataByMachineType) {
		this.basicDataByMachineType = basicDataByMachineType;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "building_type", nullable = false)
	public BasicData getBasicDataByBuildingType() {
		return this.basicDataByBuildingType;
	}

	public void setBasicDataByBuildingType(BasicData basicDataByBuildingType) {
		this.basicDataByBuildingType = basicDataByBuildingType;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "maneuver_type")
	public BasicData getBasicDataByManeuverType() {
		return this.basicDataByManeuverType;
	}

	public void setBasicDataByManeuverType(BasicData basicDataByManeuverType) {
		this.basicDataByManeuverType = basicDataByManeuverType;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "door_frame_hammered", nullable = false)
	public BasicData getBasicDataByDoorFrameHammered() {
		return this.basicDataByDoorFrameHammered;
	}

	public void setBasicDataByDoorFrameHammered(BasicData basicDataByDoorFrameHammered) {
		this.basicDataByDoorFrameHammered = basicDataByDoorFrameHammered;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "floor_type", nullable = false)
	public BasicData getBasicDataByFloorType() {
		return this.basicDataByFloorType;
	}

	public void setBasicDataByFloorType(BasicData basicDataByFloorType) {
		this.basicDataByFloorType = basicDataByFloorType;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "machine_base")
	public BasicData getBasicDataByMachineBase() {
		return this.basicDataByMachineBase;
	}

	public void setBasicDataByMachineBase(BasicData basicDataByMachineBase) {
		this.basicDataByMachineBase = basicDataByMachineBase;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_quotation", nullable = false)
	public Quotation getQuotation() {
		return this.quotation;
	}

	public void setQuotation(Quotation quotation) {
		this.quotation = quotation;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "height", nullable = false)
	public BasicData getBasicDataByHeight() {
		return this.basicDataByHeight;
	}

	public void setBasicDataByHeight(BasicData basicDataByHeight) {
		this.basicDataByHeight = basicDataByHeight;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "door_type", nullable = false)
	public BasicData getBasicDataByDoorType() {
		return this.basicDataByDoorType;
	}

	public void setBasicDataByDoorType(BasicData basicDataByDoorType) {
		this.basicDataByDoorType = basicDataByDoorType;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "button_type", nullable = false)
	public BasicData getBasicDataByButtonType() {
		return this.basicDataByButtonType;
	}

	public void setBasicDataByButtonType(BasicData basicDataByButtonType) {
		this.basicDataByButtonType = basicDataByButtonType;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "control_type", nullable = false)
	public BasicData getBasicDataByControlType() {
		return this.basicDataByControlType;
	}

	public void setBasicDataByControlType(BasicData basicDataByControlType) {
		this.basicDataByControlType = basicDataByControlType;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "free_admission", nullable = false)
	public BasicData getBasicDataByFreeAdmission() {
		return this.basicDataByFreeAdmission;
	}

	public void setBasicDataByFreeAdmission(BasicData basicDataByFreeAdmission) {
		this.basicDataByFreeAdmission = basicDataByFreeAdmission;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "floor_display", nullable = false)
	public BasicData getBasicDataByFloorDisplay() {
		return this.basicDataByFloorDisplay;
	}

	public void setBasicDataByFloorDisplay(BasicData basicDataByFloorDisplay) {
		this.basicDataByFloorDisplay = basicDataByFloorDisplay;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "access", nullable = false)
	public BasicData getBasicDataByAccess() {
		return this.basicDataByAccess;
	}

	public void setBasicDataByAccess(BasicData basicDataByAccess) {
		this.basicDataByAccess = basicDataByAccess;
	}

	/**
	 * <b>@Generated</b> con generationTime.ALWAYS es la forma de autoincrementar el campo cuando el campo no es
	 * primario, y la base de datos le ha asignado una secuencia incrementable.
	 * 
	 * @return
	 */
	@Generated(GenerationTime.ALWAYS)
	@Column(name = "number", nullable = false)
	public int getNumber() {
		return this.number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date", nullable = false, length = 29)
	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Column(name = "construction", nullable = false, length = 100)
	public String getConstruction() {
		return this.construction;
	}

	public void setConstruction(String construction) {
		this.construction = construction;
	}

	@Column(name = "construction_city", nullable = false, length = 100)
	public String getConstructionCity() {
		return this.constructionCity;
	}

	public void setConstructionCity(String constructionCity) {
		this.constructionCity = constructionCity;
	}

	@Column(name = "construction_address", nullable = false, length = 200)
	public String getConstructionAddress() {
		return this.constructionAddress;
	}

	public void setConstructionAddress(String constructionAddress) {
		this.constructionAddress = constructionAddress;
	}

	@Column(name = "seller", nullable = false, length = 100)
	public String getSeller() {
		return this.seller;
	}

	public void setSeller(String seller) {
		this.seller = seller;
	}

	@Column(name = "contact_name", nullable = false, length = 100)
	public String getContactName() {
		return this.contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	@Column(name = "contact_phone", nullable = false, length = 30)
	public String getContactPhone() {
		return this.contactPhone;
	}

	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}

	@Column(name = "email", length = 100)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "plane_c")
	public Boolean getPlaneC() {
		return this.planeC;
	}

	public void setPlaneC(Boolean planeC) {
		this.planeC = planeC;
	}

	@Column(name = "plane_p")
	public Boolean getPlaneP() {
		return this.planeP;
	}

	public void setPlaneP(Boolean planeP) {
		this.planeP = planeP;
	}

	@Column(name = "sale_type", nullable = false)
	public boolean isSaleType() {
		return this.saleType;
	}

	public void setSaleType(boolean saleType) {
		this.saleType = saleType;
	}

	@Column(name = "elevator_quantity")
	public Integer getElevatorQuantity() {
		return this.elevatorQuantity;
	}

	public void setElevatorQuantity(Integer elevatorQuantity) {
		this.elevatorQuantity = elevatorQuantity;
	}

	@Column(name = "elevator_capacitance")
	public Integer getElevatorCapacitance() {
		return this.elevatorCapacitance;
	}

	public void setElevatorCapacitance(Integer elevatorCapacitance) {
		this.elevatorCapacitance = elevatorCapacitance;
	}

	@Column(name = "motor_quantity")
	public Integer getMotorQuantity() {
		return this.motorQuantity;
	}

	public void setMotorQuantity(Integer motorQuantity) {
		this.motorQuantity = motorQuantity;
	}

	@Column(name = "motor_traction", length = 10)
	public String getMotorTraction() {
		return this.motorTraction;
	}

	public void setMotorTraction(String motorTraction) {
		this.motorTraction = motorTraction;
	}

	@Column(name = "stop_number")
	public Integer getStopNumber() {
		return this.stopNumber;
	}

	public void setStopNumber(Integer stopNumber) {
		this.stopNumber = stopNumber;
	}

	@Column(name = "tour", precision = 17, scale = 17)
	public Double getTour() {
		return this.tour;
	}

	public void setTour(Double tour) {
		this.tour = tour;
	}

	@Column(name = "on_tour", precision = 17, scale = 17)
	public Double getOnTour() {
		return this.onTour;
	}

	public void setOnTour(Double onTour) {
		this.onTour = onTour;
	}

	@Column(name = "width_hole", precision = 17, scale = 17)
	public Double getWidthHole() {
		return this.widthHole;
	}

	public void setWidthHole(Double widthHole) {
		this.widthHole = widthHole;
	}

	@Column(name = "fossa", precision = 17, scale = 17)
	public Double getFossa() {
		return this.fossa;
	}

	public void setFossa(Double fossa) {
		this.fossa = fossa;
	}

	@Column(name = "bottom_hole", precision = 17, scale = 17)
	public Double getBottomHole() {
		return this.bottomHole;
	}

	public void setBottomHole(Double bottomHole) {
		this.bottomHole = bottomHole;
	}

	@Column(name = "design_special")
	public Boolean getDesignSpecial() {
		return this.designSpecial;
	}

	public void setDesignSpecial(Boolean designSpecial) {
		this.designSpecial = designSpecial;
	}

	@Column(name = "design_special_comment", length = 500)
	public String getDesignSpecialComment() {
		return this.designSpecialComment;
	}

	public void setDesignSpecialComment(String designSpecialComment) {
		this.designSpecialComment = designSpecialComment;
	}

	@Column(name = "cabin_width", precision = 17, scale = 17)
	public Double getCabinWidth() {
		return this.cabinWidth;
	}

	public void setCabinWidth(Double cabinWidth) {
		this.cabinWidth = cabinWidth;
	}

	@Column(name = "cabin_background", precision = 17, scale = 17)
	public Double getCabinBackground() {
		return this.cabinBackground;
	}

	public void setCabinBackground(Double cabinBackground) {
		this.cabinBackground = cabinBackground;
	}

	@Column(name = "cabin_height", precision = 17, scale = 17)
	public Double getCabinHeight() {
		return this.cabinHeight;
	}

	public void setCabinHeight(Double cabinHeight) {
		this.cabinHeight = cabinHeight;
	}

	@Column(name = "door_of_number")
	public Integer getDoorOfNumber() {
		return this.doorOfNumber;
	}

	public void setDoorOfNumber(Integer doorOfNumber) {
		this.doorOfNumber = doorOfNumber;
	}

	@Column(name = "doorframe_type_comment", length = 200)
	public String getDoorframeTypeComment() {
		return this.doorframeTypeComment;
	}

	public void setDoorframeTypeComment(String doorframeTypeComment) {
		this.doorframeTypeComment = doorframeTypeComment;
	}

	@Column(name = "hall_button_place", length = 100)
	public String getHallButtonPlace() {
		return this.hallButtonPlace;
	}

	public void setHallButtonPlace(String hallButtonPlace) {
		this.hallButtonPlace = hallButtonPlace;
	}

	@Column(name = "light_curtain", nullable = false)
	public boolean isLightCurtain() {
		return this.lightCurtain;
	}

	public void setLightCurtain(boolean lightCurtain) {
		this.lightCurtain = lightCurtain;
	}

	@Column(name = "load_limiter")
	public Boolean getLoadLimiter() {
		return this.loadLimiter;
	}

	public void setLoadLimiter(Boolean loadLimiter) {
		this.loadLimiter = loadLimiter;
	}

	@Column(name = "speech_synthesizer")
	public Boolean getSpeechSynthesizer() {
		return this.speechSynthesizer;
	}

	public void setSpeechSynthesizer(Boolean speechSynthesizer) {
		this.speechSynthesizer = speechSynthesizer;
	}

	@Column(name = "gom_system")
	public Boolean getGomSystem() {
		return this.gomSystem;
	}

	public void setGomSystem(Boolean gomSystem) {
		this.gomSystem = gomSystem;
	}

	@Column(name = "intercom")
	public Boolean getIntercom() {
		return this.intercom;
	}

	public void setIntercom(Boolean intercom) {
		this.intercom = intercom;
	}

	@Column(name = "phone")
	public Boolean getPhone() {
		return this.phone;
	}

	public void setPhone(Boolean phone) {
		this.phone = phone;
	}

	@Column(name = "access_sytem")
	public Boolean getAccessSytem() {
		return this.accessSytem;
	}

	public void setAccessSytem(Boolean accessSytem) {
		this.accessSytem = accessSytem;
	}

	@Column(name = "firefighter_keychain")
	public Boolean getFirefighterKeychain() {
		return this.firefighterKeychain;
	}

	public void setFirefighterKeychain(Boolean firefighterKeychain) {
		this.firefighterKeychain = firefighterKeychain;
	}

	@Column(name = "display_place_floor", length = 50)
	public String getDisplayPlaceFloor() {
		return this.displayPlaceFloor;
	}

	public void setDisplayPlaceFloor(String displayPlaceFloor) {
		this.displayPlaceFloor = displayPlaceFloor;
	}

	@Column(name = "stop_sequence_continuous")
	public Boolean getStopSequenceContinuous() {
		return this.stopSequenceContinuous;
	}

	public void setStopSequenceContinuous(Boolean stopSequenceContinuous) {
		this.stopSequenceContinuous = stopSequenceContinuous;
	}

	@Column(name = "stop_sequence_continuous_q", length = 150)
	public String getStopSequenceContinuousQ() {
		return this.stopSequenceContinuousQ;
	}

	public void setStopSequenceContinuousQ(String stopSequenceContinuousQ) {
		this.stopSequenceContinuousQ = stopSequenceContinuousQ;
	}

	@Column(name = "stop_sequence_continuous_number")
	public Integer getStopSequenceContinuousNumber() {
		return this.stopSequenceContinuousNumber;
	}

	public void setStopSequenceContinuousNumber(Integer stopSequenceContinuousNumber) {
		this.stopSequenceContinuousNumber = stopSequenceContinuousNumber;
	}

	@Column(name = "stop_sequence_even")
	public Boolean getStopSequenceEven() {
		return this.stopSequenceEven;
	}

	public void setStopSequenceEven(Boolean stopSequenceEven) {
		this.stopSequenceEven = stopSequenceEven;
	}

	@Column(name = "stop_sequence_even_q", length = 150)
	public String getStopSequenceEvenQ() {
		return this.stopSequenceEvenQ;
	}

	public void setStopSequenceEvenQ(String stopSequenceEvenQ) {
		this.stopSequenceEvenQ = stopSequenceEvenQ;
	}

	@Column(name = "stop_sequence_even_number")
	public Integer getStopSequenceEvenNumber() {
		return this.stopSequenceEvenNumber;
	}

	public void setStopSequenceEvenNumber(Integer stopSequenceEvenNumber) {
		this.stopSequenceEvenNumber = stopSequenceEvenNumber;
	}

	@Column(name = "stop_sequence_odd")
	public Boolean getStopSequenceOdd() {
		return this.stopSequenceOdd;
	}

	public void setStopSequenceOdd(Boolean stopSequenceOdd) {
		this.stopSequenceOdd = stopSequenceOdd;
	}

	@Column(name = "stop_sequence_odd_q", length = 150)
	public String getStopSequenceOddQ() {
		return this.stopSequenceOddQ;
	}

	public void setStopSequenceOddQ(String stopSequenceOddQ) {
		this.stopSequenceOddQ = stopSequenceOddQ;
	}

	@Column(name = "stop_sequence_odd_number")
	public Integer getStopSequenceOddNumber() {
		return this.stopSequenceOddNumber;
	}

	public void setStopSequenceOddNumber(Integer stopSequenceOddNumber) {
		this.stopSequenceOddNumber = stopSequenceOddNumber;
	}

	@Column(name = "door_frame_hammered_desc", length = 100)
	public String getDoorFrameHammeredDesc() {
		return this.doorFrameHammeredDesc;
	}

	public void setDoorFrameHammeredDesc(String doorFrameHammeredDesc) {
		this.doorFrameHammeredDesc = doorFrameHammeredDesc;
	}

	@Column(name = "door_frame_stainless")
	public Boolean getDoorFrameStainless() {
		return this.doorFrameStainless;
	}

	public void setDoorFrameStainless(Boolean doorFrameStainless) {
		this.doorFrameStainless = doorFrameStainless;
	}

	@Column(name = "door_frame_stainless_descrip", length = 100)
	public String getDoorFrameStainlessDescrip() {
		return this.doorFrameStainlessDescrip;
	}

	public void setDoorFrameStainlessDescrip(String doorFrameStainlessDescrip) {
		this.doorFrameStainlessDescrip = doorFrameStainlessDescrip;
	}

	@Column(name = "sistel_wdisplay_pb")
	public Boolean getSistelWdisplayPb() {
		return this.sistelWdisplayPb;
	}

	public void setSistelWdisplayPb(Boolean sistelWdisplayPb) {
		this.sistelWdisplayPb = sistelWdisplayPb;
	}

	@Column(name = "sistel_wdisplay_floor")
	public Integer getSistelWdisplayFloor() {
		return this.sistelWdisplayFloor;
	}

	public void setSistelWdisplayFloor(Integer sistelWdisplayFloor) {
		this.sistelWdisplayFloor = sistelWdisplayFloor;
	}

	@Column(name = "sistel_warrow_pb")
	public Boolean getSistelWarrowPb() {
		return this.sistelWarrowPb;
	}

	public void setSistelWarrowPb(Boolean sistelWarrowPb) {
		this.sistelWarrowPb = sistelWarrowPb;
	}

	@Column(name = "sistel_warrow_floor")
	public Integer getSistelWarrowFloor() {
		return this.sistelWarrowFloor;
	}

	public void setSistelWarrowFloor(Integer sistelWarrowFloor) {
		this.sistelWarrowFloor = sistelWarrowFloor;
	}

	@Column(name = "comment", length = 1000)
	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@Column(name = "status", nullable = false, length = 1)
	public char getStatus() {
		return this.status;
	}

	public void setStatus(char status) {
		this.status = status;
	}

}