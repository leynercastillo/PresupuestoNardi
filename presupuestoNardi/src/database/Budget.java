package database;

// Generated 18/02/2013 11:33:51 AM by Hibernate Tools 3.6.0

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Budget generated by hbm2java
 */
@Entity
@Table(name = "budget", catalog = "ascensor_nardi")
public class Budget implements java.io.Serializable {

	private Integer idBudget;
	private Basicdata basicdataByButtonType;
	private Basicdata basicdataByMachineType;
	private Basicdata basicdataByHallButton;
	private Basicdata basicdataByBoothDisplay;
	private Basicdata basicdataByHallButtonType;
	private Basicdata basicdataByManeuverType;
	private Basicdata basicdataByFrequency;
	private Basicdata basicdataByFloorDisplay;
	private Basicdata basicdataByMirror;
	private Basicdata basicdataByVoltageLighting;
	private Basicdata basicdataByAccess;
	private Basicdata basicdataByElectricityType;
	private Basicdata basicdataByRailing;
	private Basicdata basicdataByDoorType;
	private Basicdata basicdataByFloorType;
	private Basicdata basicdataByBuildingType;
	private Basicdata basicdataByElevatorCapacitance;
	private Basicdata basicdataByRoofType;
	private Basicdata basicdataByFan;
	private Basicdata basicdataByHeight;
	private Basicdata basicdataByCabinDesign;
	private Basicdata basicdataBySpeed;
	private Basicdata basicdataByFreeAdmission;
	private Basicdata basicdataByDoorFrameHammered;
	private Basicdata basicdataByControlType;
	private Basicdata basicdataByElevatorType;
	private Basicdata basicdataByBoothButton;
	private Basicdata basicdataByDoorSystem;
	private Basicdata basicdataByHourMachine;
	private Basicdata basicdataByDoorframeType;
	private int number;
	private Date date;
	private String partnerName;
	private String construction;
	private String seller;
	private String constructionAddress;
	private String constructionCity;
	private String contactPhone;
	private String email;
	private String contactName;
	private Boolean planeP;
	private Boolean planeC;
	private boolean type;
	private Integer elevatorQuantity;
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
	private Integer doorOfNumber;
	private String doorframeTypeComment;
	private String hallButtonPlace;
	private Boolean lightCurtain;
	private Boolean loadLimiter;
	private Boolean speechSynthesizer;
	private Boolean gomSystem;
	private Boolean intercom;
	private Boolean phone;
	private Boolean accessSytem;
	private Boolean firefighterKeychain;
	private String comment;
	private String displayPlaceFloor;
	private Boolean stopSequenceContinuous;
	private String stopSequenceContinuousQ;
	private Boolean stopSequenceEven;
	private String stopSequenceEvenQ;
	private Boolean stopSequenceOdd;
	private String stopSequenceOddQ;
	private String doorFrameHammeredDesc;
	private Boolean doorFrameStainless;
	private String doorFrameStainlessDescrip;
	private Boolean sistelWdisplayPb;
	private Integer sistelWdisplayFloor;
	private Boolean sistelWarrowPb;
	private Integer sistelWarrowFloor;
	private char status;

	public Budget() {
	}

	public Budget(int number, Date date, String partnerName,
			String construction, String seller, String constructionAddress,
			String constructionCity, String contactPhone, String email,
			String contactName, boolean type, char status) {
		this.number = number;
		this.date = date;
		this.partnerName = partnerName;
		this.construction = construction;
		this.seller = seller;
		this.constructionAddress = constructionAddress;
		this.constructionCity = constructionCity;
		this.contactPhone = contactPhone;
		this.email = email;
		this.contactName = contactName;
		this.type = type;
		this.status = status;
	}

	public Budget(Basicdata basicdataByButtonType,
			Basicdata basicdataByMachineType, Basicdata basicdataByHallButton,
			Basicdata basicdataByBoothDisplay,
			Basicdata basicdataByHallButtonType,
			Basicdata basicdataByManeuverType, Basicdata basicdataByFrequency,
			Basicdata basicdataByFloorDisplay, Basicdata basicdataByMirror,
			Basicdata basicdataByVoltageLighting, Basicdata basicdataByAccess,
			Basicdata basicdataByElectricityType, Basicdata basicdataByRailing,
			Basicdata basicdataByDoorType, Basicdata basicdataByFloorType,
			Basicdata basicdataByBuildingType,
			Basicdata basicdataByElevatorCapacitance,
			Basicdata basicdataByRoofType, Basicdata basicdataByFan,
			Basicdata basicdataByHeight, Basicdata basicdataByCabinDesign,
			Basicdata basicdataBySpeed, Basicdata basicdataByFreeAdmission,
			Basicdata basicdataByDoorFrameHammered,
			Basicdata basicdataByControlType,
			Basicdata basicdataByElevatorType,
			Basicdata basicdataByBoothButton, Basicdata basicdataByDoorSystem,
			Basicdata basicdataByHourMachine,
			Basicdata basicdataByDoorframeType, int number, Date date,
			String partnerName, String construction, String seller,
			String constructionAddress, String constructionCity,
			String contactPhone, String email, String contactName,
			Boolean planeP, Boolean planeC, boolean type,
			Integer elevatorQuantity, Integer motorQuantity,
			String motorTraction, Integer stopNumber, Double tour,
			Double onTour, Double widthHole, Double fossa, Double bottomHole,
			Boolean designSpecial, String designSpecialComment,
			Integer doorOfNumber, String doorframeTypeComment,
			String hallButtonPlace, Boolean lightCurtain, Boolean loadLimiter,
			Boolean speechSynthesizer, Boolean gomSystem, Boolean intercom,
			Boolean phone, Boolean accessSytem, Boolean firefighterKeychain,
			String comment, String displayPlaceFloor,
			Boolean stopSequenceContinuous, String stopSequenceContinuousQ,
			Boolean stopSequenceEven, String stopSequenceEvenQ,
			Boolean stopSequenceOdd, String stopSequenceOddQ,
			String doorFrameHammeredDesc, Boolean doorFrameStainless,
			String doorFrameStainlessDescrip, Boolean sistelWdisplayPb,
			Integer sistelWdisplayFloor, Boolean sistelWarrowPb,
			Integer sistelWarrowFloor, char status) {
		this.basicdataByButtonType = basicdataByButtonType;
		this.basicdataByMachineType = basicdataByMachineType;
		this.basicdataByHallButton = basicdataByHallButton;
		this.basicdataByBoothDisplay = basicdataByBoothDisplay;
		this.basicdataByHallButtonType = basicdataByHallButtonType;
		this.basicdataByManeuverType = basicdataByManeuverType;
		this.basicdataByFrequency = basicdataByFrequency;
		this.basicdataByFloorDisplay = basicdataByFloorDisplay;
		this.basicdataByMirror = basicdataByMirror;
		this.basicdataByVoltageLighting = basicdataByVoltageLighting;
		this.basicdataByAccess = basicdataByAccess;
		this.basicdataByElectricityType = basicdataByElectricityType;
		this.basicdataByRailing = basicdataByRailing;
		this.basicdataByDoorType = basicdataByDoorType;
		this.basicdataByFloorType = basicdataByFloorType;
		this.basicdataByBuildingType = basicdataByBuildingType;
		this.basicdataByElevatorCapacitance = basicdataByElevatorCapacitance;
		this.basicdataByRoofType = basicdataByRoofType;
		this.basicdataByFan = basicdataByFan;
		this.basicdataByHeight = basicdataByHeight;
		this.basicdataByCabinDesign = basicdataByCabinDesign;
		this.basicdataBySpeed = basicdataBySpeed;
		this.basicdataByFreeAdmission = basicdataByFreeAdmission;
		this.basicdataByDoorFrameHammered = basicdataByDoorFrameHammered;
		this.basicdataByControlType = basicdataByControlType;
		this.basicdataByElevatorType = basicdataByElevatorType;
		this.basicdataByBoothButton = basicdataByBoothButton;
		this.basicdataByDoorSystem = basicdataByDoorSystem;
		this.basicdataByHourMachine = basicdataByHourMachine;
		this.basicdataByDoorframeType = basicdataByDoorframeType;
		this.number = number;
		this.date = date;
		this.partnerName = partnerName;
		this.construction = construction;
		this.seller = seller;
		this.constructionAddress = constructionAddress;
		this.constructionCity = constructionCity;
		this.contactPhone = contactPhone;
		this.email = email;
		this.contactName = contactName;
		this.planeP = planeP;
		this.planeC = planeC;
		this.type = type;
		this.elevatorQuantity = elevatorQuantity;
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
		this.comment = comment;
		this.displayPlaceFloor = displayPlaceFloor;
		this.stopSequenceContinuous = stopSequenceContinuous;
		this.stopSequenceContinuousQ = stopSequenceContinuousQ;
		this.stopSequenceEven = stopSequenceEven;
		this.stopSequenceEvenQ = stopSequenceEvenQ;
		this.stopSequenceOdd = stopSequenceOdd;
		this.stopSequenceOddQ = stopSequenceOddQ;
		this.doorFrameHammeredDesc = doorFrameHammeredDesc;
		this.doorFrameStainless = doorFrameStainless;
		this.doorFrameStainlessDescrip = doorFrameStainlessDescrip;
		this.sistelWdisplayPb = sistelWdisplayPb;
		this.sistelWdisplayFloor = sistelWdisplayFloor;
		this.sistelWarrowPb = sistelWarrowPb;
		this.sistelWarrowFloor = sistelWarrowFloor;
		this.status = status;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idBudget", unique = true, nullable = false)
	public Integer getIdBudget() {
		return this.idBudget;
	}

	public void setIdBudget(Integer idBudget) {
		this.idBudget = idBudget;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "buttonType")
	public Basicdata getBasicdataByButtonType() {
		return this.basicdataByButtonType;
	}

	public void setBasicdataByButtonType(Basicdata basicdataByButtonType) {
		this.basicdataByButtonType = basicdataByButtonType;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "machineType")
	public Basicdata getBasicdataByMachineType() {
		return this.basicdataByMachineType;
	}

	public void setBasicdataByMachineType(Basicdata basicdataByMachineType) {
		this.basicdataByMachineType = basicdataByMachineType;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "hallButton")
	public Basicdata getBasicdataByHallButton() {
		return this.basicdataByHallButton;
	}

	public void setBasicdataByHallButton(Basicdata basicdataByHallButton) {
		this.basicdataByHallButton = basicdataByHallButton;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "boothDisplay")
	public Basicdata getBasicdataByBoothDisplay() {
		return this.basicdataByBoothDisplay;
	}

	public void setBasicdataByBoothDisplay(Basicdata basicdataByBoothDisplay) {
		this.basicdataByBoothDisplay = basicdataByBoothDisplay;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "hallButtonType")
	public Basicdata getBasicdataByHallButtonType() {
		return this.basicdataByHallButtonType;
	}

	public void setBasicdataByHallButtonType(Basicdata basicdataByHallButtonType) {
		this.basicdataByHallButtonType = basicdataByHallButtonType;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "maneuverType")
	public Basicdata getBasicdataByManeuverType() {
		return this.basicdataByManeuverType;
	}

	public void setBasicdataByManeuverType(Basicdata basicdataByManeuverType) {
		this.basicdataByManeuverType = basicdataByManeuverType;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "frequency")
	public Basicdata getBasicdataByFrequency() {
		return this.basicdataByFrequency;
	}

	public void setBasicdataByFrequency(Basicdata basicdataByFrequency) {
		this.basicdataByFrequency = basicdataByFrequency;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "floorDisplay")
	public Basicdata getBasicdataByFloorDisplay() {
		return this.basicdataByFloorDisplay;
	}

	public void setBasicdataByFloorDisplay(Basicdata basicdataByFloorDisplay) {
		this.basicdataByFloorDisplay = basicdataByFloorDisplay;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "mirror")
	public Basicdata getBasicdataByMirror() {
		return this.basicdataByMirror;
	}

	public void setBasicdataByMirror(Basicdata basicdataByMirror) {
		this.basicdataByMirror = basicdataByMirror;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "voltageLighting")
	public Basicdata getBasicdataByVoltageLighting() {
		return this.basicdataByVoltageLighting;
	}

	public void setBasicdataByVoltageLighting(
			Basicdata basicdataByVoltageLighting) {
		this.basicdataByVoltageLighting = basicdataByVoltageLighting;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "access")
	public Basicdata getBasicdataByAccess() {
		return this.basicdataByAccess;
	}

	public void setBasicdataByAccess(Basicdata basicdataByAccess) {
		this.basicdataByAccess = basicdataByAccess;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "electricityType")
	public Basicdata getBasicdataByElectricityType() {
		return this.basicdataByElectricityType;
	}

	public void setBasicdataByElectricityType(
			Basicdata basicdataByElectricityType) {
		this.basicdataByElectricityType = basicdataByElectricityType;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "railing")
	public Basicdata getBasicdataByRailing() {
		return this.basicdataByRailing;
	}

	public void setBasicdataByRailing(Basicdata basicdataByRailing) {
		this.basicdataByRailing = basicdataByRailing;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "doorType")
	public Basicdata getBasicdataByDoorType() {
		return this.basicdataByDoorType;
	}

	public void setBasicdataByDoorType(Basicdata basicdataByDoorType) {
		this.basicdataByDoorType = basicdataByDoorType;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "floorType")
	public Basicdata getBasicdataByFloorType() {
		return this.basicdataByFloorType;
	}

	public void setBasicdataByFloorType(Basicdata basicdataByFloorType) {
		this.basicdataByFloorType = basicdataByFloorType;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "buildingType")
	public Basicdata getBasicdataByBuildingType() {
		return this.basicdataByBuildingType;
	}

	public void setBasicdataByBuildingType(Basicdata basicdataByBuildingType) {
		this.basicdataByBuildingType = basicdataByBuildingType;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "elevatorCapacitance")
	public Basicdata getBasicdataByElevatorCapacitance() {
		return this.basicdataByElevatorCapacitance;
	}

	public void setBasicdataByElevatorCapacitance(
			Basicdata basicdataByElevatorCapacitance) {
		this.basicdataByElevatorCapacitance = basicdataByElevatorCapacitance;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "roofType")
	public Basicdata getBasicdataByRoofType() {
		return this.basicdataByRoofType;
	}

	public void setBasicdataByRoofType(Basicdata basicdataByRoofType) {
		this.basicdataByRoofType = basicdataByRoofType;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fan")
	public Basicdata getBasicdataByFan() {
		return this.basicdataByFan;
	}

	public void setBasicdataByFan(Basicdata basicdataByFan) {
		this.basicdataByFan = basicdataByFan;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "height")
	public Basicdata getBasicdataByHeight() {
		return this.basicdataByHeight;
	}

	public void setBasicdataByHeight(Basicdata basicdataByHeight) {
		this.basicdataByHeight = basicdataByHeight;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cabinDesign")
	public Basicdata getBasicdataByCabinDesign() {
		return this.basicdataByCabinDesign;
	}

	public void setBasicdataByCabinDesign(Basicdata basicdataByCabinDesign) {
		this.basicdataByCabinDesign = basicdataByCabinDesign;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "speed")
	public Basicdata getBasicdataBySpeed() {
		return this.basicdataBySpeed;
	}

	public void setBasicdataBySpeed(Basicdata basicdataBySpeed) {
		this.basicdataBySpeed = basicdataBySpeed;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "freeAdmission")
	public Basicdata getBasicdataByFreeAdmission() {
		return this.basicdataByFreeAdmission;
	}

	public void setBasicdataByFreeAdmission(Basicdata basicdataByFreeAdmission) {
		this.basicdataByFreeAdmission = basicdataByFreeAdmission;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "doorFrameHammered")
	public Basicdata getBasicdataByDoorFrameHammered() {
		return this.basicdataByDoorFrameHammered;
	}

	public void setBasicdataByDoorFrameHammered(
			Basicdata basicdataByDoorFrameHammered) {
		this.basicdataByDoorFrameHammered = basicdataByDoorFrameHammered;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "controlType")
	public Basicdata getBasicdataByControlType() {
		return this.basicdataByControlType;
	}

	public void setBasicdataByControlType(Basicdata basicdataByControlType) {
		this.basicdataByControlType = basicdataByControlType;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "elevatorType")
	public Basicdata getBasicdataByElevatorType() {
		return this.basicdataByElevatorType;
	}

	public void setBasicdataByElevatorType(Basicdata basicdataByElevatorType) {
		this.basicdataByElevatorType = basicdataByElevatorType;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "boothButton")
	public Basicdata getBasicdataByBoothButton() {
		return this.basicdataByBoothButton;
	}

	public void setBasicdataByBoothButton(Basicdata basicdataByBoothButton) {
		this.basicdataByBoothButton = basicdataByBoothButton;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "doorSystem")
	public Basicdata getBasicdataByDoorSystem() {
		return this.basicdataByDoorSystem;
	}

	public void setBasicdataByDoorSystem(Basicdata basicdataByDoorSystem) {
		this.basicdataByDoorSystem = basicdataByDoorSystem;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "hourMachine")
	public Basicdata getBasicdataByHourMachine() {
		return this.basicdataByHourMachine;
	}

	public void setBasicdataByHourMachine(Basicdata basicdataByHourMachine) {
		this.basicdataByHourMachine = basicdataByHourMachine;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "doorframeType")
	public Basicdata getBasicdataByDoorframeType() {
		return this.basicdataByDoorframeType;
	}

	public void setBasicdataByDoorframeType(Basicdata basicdataByDoorframeType) {
		this.basicdataByDoorframeType = basicdataByDoorframeType;
	}

	@Column(name = "number", nullable = false)
	public int getNumber() {
		return this.number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date", nullable = false, length = 19)
	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Column(name = "partnerName", nullable = false, length = 100)
	public String getPartnerName() {
		return this.partnerName;
	}

	public void setPartnerName(String partnerName) {
		this.partnerName = partnerName;
	}

	@Column(name = "construction", nullable = false, length = 100)
	public String getConstruction() {
		return this.construction;
	}

	public void setConstruction(String construction) {
		this.construction = construction;
	}

	@Column(name = "seller", nullable = false, length = 100)
	public String getSeller() {
		return this.seller;
	}

	public void setSeller(String seller) {
		this.seller = seller;
	}

	@Column(name = "constructionAddress", nullable = false, length = 200)
	public String getConstructionAddress() {
		return this.constructionAddress;
	}

	public void setConstructionAddress(String constructionAddress) {
		this.constructionAddress = constructionAddress;
	}

	@Column(name = "constructionCity", nullable = false, length = 100)
	public String getConstructionCity() {
		return this.constructionCity;
	}

	public void setConstructionCity(String constructionCity) {
		this.constructionCity = constructionCity;
	}

	@Column(name = "contactPhone", nullable = false, length = 15)
	public String getContactPhone() {
		return this.contactPhone;
	}

	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}

	@Column(name = "email", nullable = false, length = 100)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "contactName", nullable = false, length = 100)
	public String getContactName() {
		return this.contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	@Column(name = "planeP")
	public Boolean getPlaneP() {
		return this.planeP;
	}

	public void setPlaneP(Boolean planeP) {
		this.planeP = planeP;
	}

	@Column(name = "planeC")
	public Boolean getPlaneC() {
		return this.planeC;
	}

	public void setPlaneC(Boolean planeC) {
		this.planeC = planeC;
	}

	@Column(name = "type", nullable = false)
	public boolean isType() {
		return this.type;
	}

	public void setType(boolean type) {
		this.type = type;
	}

	@Column(name = "elevatorQuantity")
	public Integer getElevatorQuantity() {
		return this.elevatorQuantity;
	}

	public void setElevatorQuantity(Integer elevatorQuantity) {
		this.elevatorQuantity = elevatorQuantity;
	}

	@Column(name = "motorQuantity")
	public Integer getMotorQuantity() {
		return this.motorQuantity;
	}

	public void setMotorQuantity(Integer motorQuantity) {
		this.motorQuantity = motorQuantity;
	}

	@Column(name = "motorTraction", length = 10)
	public String getMotorTraction() {
		return this.motorTraction;
	}

	public void setMotorTraction(String motorTraction) {
		this.motorTraction = motorTraction;
	}

	@Column(name = "stopNumber")
	public Integer getStopNumber() {
		return this.stopNumber;
	}

	public void setStopNumber(Integer stopNumber) {
		this.stopNumber = stopNumber;
	}

	@Column(name = "tour", precision = 22, scale = 0)
	public Double getTour() {
		return this.tour;
	}

	public void setTour(Double tour) {
		this.tour = tour;
	}

	@Column(name = "onTour", precision = 22, scale = 0)
	public Double getOnTour() {
		return this.onTour;
	}

	public void setOnTour(Double onTour) {
		this.onTour = onTour;
	}

	@Column(name = "widthHole", precision = 22, scale = 0)
	public Double getWidthHole() {
		return this.widthHole;
	}

	public void setWidthHole(Double widthHole) {
		this.widthHole = widthHole;
	}

	@Column(name = "fossa", precision = 22, scale = 0)
	public Double getFossa() {
		return this.fossa;
	}

	public void setFossa(Double fossa) {
		this.fossa = fossa;
	}

	@Column(name = "bottomHole", precision = 22, scale = 0)
	public Double getBottomHole() {
		return this.bottomHole;
	}

	public void setBottomHole(Double bottomHole) {
		this.bottomHole = bottomHole;
	}

	@Column(name = "designSpecial")
	public Boolean getDesignSpecial() {
		return this.designSpecial;
	}

	public void setDesignSpecial(Boolean designSpecial) {
		this.designSpecial = designSpecial;
	}

	@Column(name = "designSpecialComment", length = 300)
	public String getDesignSpecialComment() {
		return this.designSpecialComment;
	}

	public void setDesignSpecialComment(String designSpecialComment) {
		this.designSpecialComment = designSpecialComment;
	}

	@Column(name = "doorOfNumber")
	public Integer getDoorOfNumber() {
		return this.doorOfNumber;
	}

	public void setDoorOfNumber(Integer doorOfNumber) {
		this.doorOfNumber = doorOfNumber;
	}

	@Column(name = "doorframeTypeComment", length = 200)
	public String getDoorframeTypeComment() {
		return this.doorframeTypeComment;
	}

	public void setDoorframeTypeComment(String doorframeTypeComment) {
		this.doorframeTypeComment = doorframeTypeComment;
	}

	@Column(name = "hallButtonPlace", length = 100)
	public String getHallButtonPlace() {
		return this.hallButtonPlace;
	}

	public void setHallButtonPlace(String hallButtonPlace) {
		this.hallButtonPlace = hallButtonPlace;
	}

	@Column(name = "lightCurtain")
	public Boolean getLightCurtain() {
		return this.lightCurtain;
	}

	public void setLightCurtain(Boolean lightCurtain) {
		this.lightCurtain = lightCurtain;
	}

	@Column(name = "loadLimiter")
	public Boolean getLoadLimiter() {
		return this.loadLimiter;
	}

	public void setLoadLimiter(Boolean loadLimiter) {
		this.loadLimiter = loadLimiter;
	}

	@Column(name = "speechSynthesizer")
	public Boolean getSpeechSynthesizer() {
		return this.speechSynthesizer;
	}

	public void setSpeechSynthesizer(Boolean speechSynthesizer) {
		this.speechSynthesizer = speechSynthesizer;
	}

	@Column(name = "gomSystem")
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

	@Column(name = "accessSytem")
	public Boolean getAccessSytem() {
		return this.accessSytem;
	}

	public void setAccessSytem(Boolean accessSytem) {
		this.accessSytem = accessSytem;
	}

	@Column(name = "firefighterKeychain")
	public Boolean getFirefighterKeychain() {
		return this.firefighterKeychain;
	}

	public void setFirefighterKeychain(Boolean firefighterKeychain) {
		this.firefighterKeychain = firefighterKeychain;
	}

	@Column(name = "comment", length = 300)
	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@Column(name = "displayPlaceFloor", length = 50)
	public String getDisplayPlaceFloor() {
		return this.displayPlaceFloor;
	}

	public void setDisplayPlaceFloor(String displayPlaceFloor) {
		this.displayPlaceFloor = displayPlaceFloor;
	}

	@Column(name = "stopSequenceContinuous")
	public Boolean getStopSequenceContinuous() {
		return this.stopSequenceContinuous;
	}

	public void setStopSequenceContinuous(Boolean stopSequenceContinuous) {
		this.stopSequenceContinuous = stopSequenceContinuous;
	}

	@Column(name = "stopSequenceContinuousQ", length = 50)
	public String getStopSequenceContinuousQ() {
		return this.stopSequenceContinuousQ;
	}

	public void setStopSequenceContinuousQ(String stopSequenceContinuousQ) {
		this.stopSequenceContinuousQ = stopSequenceContinuousQ;
	}

	@Column(name = "stopSequenceEven")
	public Boolean getStopSequenceEven() {
		return this.stopSequenceEven;
	}

	public void setStopSequenceEven(Boolean stopSequenceEven) {
		this.stopSequenceEven = stopSequenceEven;
	}

	@Column(name = "stopSequenceEvenQ", length = 50)
	public String getStopSequenceEvenQ() {
		return this.stopSequenceEvenQ;
	}

	public void setStopSequenceEvenQ(String stopSequenceEvenQ) {
		this.stopSequenceEvenQ = stopSequenceEvenQ;
	}

	@Column(name = "stopSequenceOdd")
	public Boolean getStopSequenceOdd() {
		return this.stopSequenceOdd;
	}

	public void setStopSequenceOdd(Boolean stopSequenceOdd) {
		this.stopSequenceOdd = stopSequenceOdd;
	}

	@Column(name = "stopSequenceOddQ", length = 50)
	public String getStopSequenceOddQ() {
		return this.stopSequenceOddQ;
	}

	public void setStopSequenceOddQ(String stopSequenceOddQ) {
		this.stopSequenceOddQ = stopSequenceOddQ;
	}

	@Column(name = "doorFrameHammeredDesc", length = 100)
	public String getDoorFrameHammeredDesc() {
		return this.doorFrameHammeredDesc;
	}

	public void setDoorFrameHammeredDesc(String doorFrameHammeredDesc) {
		this.doorFrameHammeredDesc = doorFrameHammeredDesc;
	}

	@Column(name = "doorFrameStainless")
	public Boolean getDoorFrameStainless() {
		return this.doorFrameStainless;
	}

	public void setDoorFrameStainless(Boolean doorFrameStainless) {
		this.doorFrameStainless = doorFrameStainless;
	}

	@Column(name = "doorFrameStainlessDescrip", length = 50)
	public String getDoorFrameStainlessDescrip() {
		return this.doorFrameStainlessDescrip;
	}

	public void setDoorFrameStainlessDescrip(String doorFrameStainlessDescrip) {
		this.doorFrameStainlessDescrip = doorFrameStainlessDescrip;
	}

	@Column(name = "sistelWDisplayPB")
	public Boolean getSistelWdisplayPb() {
		return this.sistelWdisplayPb;
	}

	public void setSistelWdisplayPb(Boolean sistelWdisplayPb) {
		this.sistelWdisplayPb = sistelWdisplayPb;
	}

	@Column(name = "sistelWDisplayFloor")
	public Integer getSistelWdisplayFloor() {
		return this.sistelWdisplayFloor;
	}

	public void setSistelWdisplayFloor(Integer sistelWdisplayFloor) {
		this.sistelWdisplayFloor = sistelWdisplayFloor;
	}

	@Column(name = "sistelWArrowPB")
	public Boolean getSistelWarrowPb() {
		return this.sistelWarrowPb;
	}

	public void setSistelWarrowPb(Boolean sistelWarrowPb) {
		this.sistelWarrowPb = sistelWarrowPb;
	}

	@Column(name = "sistelWArrowFloor")
	public Integer getSistelWarrowFloor() {
		return this.sistelWarrowFloor;
	}

	public void setSistelWarrowFloor(Integer sistelWarrowFloor) {
		this.sistelWarrowFloor = sistelWarrowFloor;
	}

	@Column(name = "status", nullable = false, length = 1)
	public char getStatus() {
		return this.status;
	}

	public void setStatus(char status) {
		this.status = status;
	}

}
