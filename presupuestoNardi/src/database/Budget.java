package database;

// Generated 12-mar-2013 15:01:36 by Hibernate Tools 3.4.0.CR1

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
	private BasicData basicDataByButtonType;
	private BasicData basicDataByMachineType;
	private BasicData basicDataByHallButton;
	private BasicData basicDataByBoothDisplay;
	private BasicData basicDataByHallButtonType;
	private BasicData basicDataByManeuverType;
	private BasicData basicDataByFrequency;
	private BasicData basicDataByFloorDisplay;
	private BasicData basicDataByMirror;
	private BasicData basicDataByVoltageLighting;
	private BasicData basicDataByAccess;
	private BasicData basicDataByElectricityType;
	private BasicData basicDataByRailing;
	private BasicData basicDataByDoorType;
	private BasicData basicDataByFloorType;
	private BasicData basicDataByBuildingType;
	private BasicData basicDataByElevatorCapacitance;
	private BasicData basicDataByRoofType;
	private BasicData basicDataByFan;
	private BasicData basicDataByHeight;
	private BasicData basicDataByCabinDesign;
	private BasicData basicDataBySpeed;
	private BasicData basicDataByFreeAdmission;
	private BasicData basicDataByDoorFrameHammered;
	private BasicData basicDataByControlType;
	private BasicData basicDataByElevatorType;
	private BasicData basicDataByBoothButton;
	private BasicData basicDataByDoorSystem;
	private BasicData basicDataByHourMachine;
	private BasicData basicDataByDoorframeType;
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

	public Budget(BasicData basicDataByButtonType,
			BasicData basicDataByMachineType, BasicData basicDataByHallButton,
			BasicData basicDataByBoothDisplay,
			BasicData basicDataByHallButtonType,
			BasicData basicDataByManeuverType, BasicData basicDataByFrequency,
			BasicData basicDataByFloorDisplay, BasicData basicDataByMirror,
			BasicData basicDataByVoltageLighting, BasicData basicDataByAccess,
			BasicData basicDataByElectricityType, BasicData basicDataByRailing,
			BasicData basicDataByDoorType, BasicData basicDataByFloorType,
			BasicData basicDataByBuildingType,
			BasicData basicDataByElevatorCapacitance,
			BasicData basicDataByRoofType, BasicData basicDataByFan,
			BasicData basicDataByHeight, BasicData basicDataByCabinDesign,
			BasicData basicDataBySpeed, BasicData basicDataByFreeAdmission,
			BasicData basicDataByDoorFrameHammered,
			BasicData basicDataByControlType,
			BasicData basicDataByElevatorType,
			BasicData basicDataByBoothButton, BasicData basicDataByDoorSystem,
			BasicData basicDataByHourMachine,
			BasicData basicDataByDoorframeType, int number, Date date,
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
		this.basicDataByButtonType = basicDataByButtonType;
		this.basicDataByMachineType = basicDataByMachineType;
		this.basicDataByHallButton = basicDataByHallButton;
		this.basicDataByBoothDisplay = basicDataByBoothDisplay;
		this.basicDataByHallButtonType = basicDataByHallButtonType;
		this.basicDataByManeuverType = basicDataByManeuverType;
		this.basicDataByFrequency = basicDataByFrequency;
		this.basicDataByFloorDisplay = basicDataByFloorDisplay;
		this.basicDataByMirror = basicDataByMirror;
		this.basicDataByVoltageLighting = basicDataByVoltageLighting;
		this.basicDataByAccess = basicDataByAccess;
		this.basicDataByElectricityType = basicDataByElectricityType;
		this.basicDataByRailing = basicDataByRailing;
		this.basicDataByDoorType = basicDataByDoorType;
		this.basicDataByFloorType = basicDataByFloorType;
		this.basicDataByBuildingType = basicDataByBuildingType;
		this.basicDataByElevatorCapacitance = basicDataByElevatorCapacitance;
		this.basicDataByRoofType = basicDataByRoofType;
		this.basicDataByFan = basicDataByFan;
		this.basicDataByHeight = basicDataByHeight;
		this.basicDataByCabinDesign = basicDataByCabinDesign;
		this.basicDataBySpeed = basicDataBySpeed;
		this.basicDataByFreeAdmission = basicDataByFreeAdmission;
		this.basicDataByDoorFrameHammered = basicDataByDoorFrameHammered;
		this.basicDataByControlType = basicDataByControlType;
		this.basicDataByElevatorType = basicDataByElevatorType;
		this.basicDataByBoothButton = basicDataByBoothButton;
		this.basicDataByDoorSystem = basicDataByDoorSystem;
		this.basicDataByHourMachine = basicDataByHourMachine;
		this.basicDataByDoorframeType = basicDataByDoorframeType;
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
	public BasicData getBasicDataByButtonType() {
		return this.basicDataByButtonType;
	}

	public void setBasicDataByButtonType(BasicData basicDataByButtonType) {
		this.basicDataByButtonType = basicDataByButtonType;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "machineType")
	public BasicData getBasicDataByMachineType() {
		return this.basicDataByMachineType;
	}

	public void setBasicDataByMachineType(BasicData basicDataByMachineType) {
		this.basicDataByMachineType = basicDataByMachineType;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "hallButton")
	public BasicData getBasicDataByHallButton() {
		return this.basicDataByHallButton;
	}

	public void setBasicDataByHallButton(BasicData basicDataByHallButton) {
		this.basicDataByHallButton = basicDataByHallButton;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "boothDisplay")
	public BasicData getBasicDataByBoothDisplay() {
		return this.basicDataByBoothDisplay;
	}

	public void setBasicDataByBoothDisplay(BasicData basicDataByBoothDisplay) {
		this.basicDataByBoothDisplay = basicDataByBoothDisplay;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "hallButtonType")
	public BasicData getBasicDataByHallButtonType() {
		return this.basicDataByHallButtonType;
	}

	public void setBasicDataByHallButtonType(BasicData basicDataByHallButtonType) {
		this.basicDataByHallButtonType = basicDataByHallButtonType;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "maneuverType")
	public BasicData getBasicDataByManeuverType() {
		return this.basicDataByManeuverType;
	}

	public void setBasicDataByManeuverType(BasicData basicDataByManeuverType) {
		this.basicDataByManeuverType = basicDataByManeuverType;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "frequency")
	public BasicData getBasicDataByFrequency() {
		return this.basicDataByFrequency;
	}

	public void setBasicDataByFrequency(BasicData basicDataByFrequency) {
		this.basicDataByFrequency = basicDataByFrequency;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "floorDisplay")
	public BasicData getBasicDataByFloorDisplay() {
		return this.basicDataByFloorDisplay;
	}

	public void setBasicDataByFloorDisplay(BasicData basicDataByFloorDisplay) {
		this.basicDataByFloorDisplay = basicDataByFloorDisplay;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "mirror")
	public BasicData getBasicDataByMirror() {
		return this.basicDataByMirror;
	}

	public void setBasicDataByMirror(BasicData basicDataByMirror) {
		this.basicDataByMirror = basicDataByMirror;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "voltageLighting")
	public BasicData getBasicDataByVoltageLighting() {
		return this.basicDataByVoltageLighting;
	}

	public void setBasicDataByVoltageLighting(
			BasicData basicDataByVoltageLighting) {
		this.basicDataByVoltageLighting = basicDataByVoltageLighting;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "access")
	public BasicData getBasicDataByAccess() {
		return this.basicDataByAccess;
	}

	public void setBasicDataByAccess(BasicData basicDataByAccess) {
		this.basicDataByAccess = basicDataByAccess;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "electricityType")
	public BasicData getBasicDataByElectricityType() {
		return this.basicDataByElectricityType;
	}

	public void setBasicDataByElectricityType(
			BasicData basicDataByElectricityType) {
		this.basicDataByElectricityType = basicDataByElectricityType;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "railing")
	public BasicData getBasicDataByRailing() {
		return this.basicDataByRailing;
	}

	public void setBasicDataByRailing(BasicData basicDataByRailing) {
		this.basicDataByRailing = basicDataByRailing;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "doorType")
	public BasicData getBasicDataByDoorType() {
		return this.basicDataByDoorType;
	}

	public void setBasicDataByDoorType(BasicData basicDataByDoorType) {
		this.basicDataByDoorType = basicDataByDoorType;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "floorType")
	public BasicData getBasicDataByFloorType() {
		return this.basicDataByFloorType;
	}

	public void setBasicDataByFloorType(BasicData basicDataByFloorType) {
		this.basicDataByFloorType = basicDataByFloorType;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "buildingType")
	public BasicData getBasicDataByBuildingType() {
		return this.basicDataByBuildingType;
	}

	public void setBasicDataByBuildingType(BasicData basicDataByBuildingType) {
		this.basicDataByBuildingType = basicDataByBuildingType;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "elevatorCapacitance")
	public BasicData getBasicDataByElevatorCapacitance() {
		return this.basicDataByElevatorCapacitance;
	}

	public void setBasicDataByElevatorCapacitance(
			BasicData basicDataByElevatorCapacitance) {
		this.basicDataByElevatorCapacitance = basicDataByElevatorCapacitance;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "roofType")
	public BasicData getBasicDataByRoofType() {
		return this.basicDataByRoofType;
	}

	public void setBasicDataByRoofType(BasicData basicDataByRoofType) {
		this.basicDataByRoofType = basicDataByRoofType;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fan")
	public BasicData getBasicDataByFan() {
		return this.basicDataByFan;
	}

	public void setBasicDataByFan(BasicData basicDataByFan) {
		this.basicDataByFan = basicDataByFan;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "height")
	public BasicData getBasicDataByHeight() {
		return this.basicDataByHeight;
	}

	public void setBasicDataByHeight(BasicData basicDataByHeight) {
		this.basicDataByHeight = basicDataByHeight;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cabinDesign")
	public BasicData getBasicDataByCabinDesign() {
		return this.basicDataByCabinDesign;
	}

	public void setBasicDataByCabinDesign(BasicData basicDataByCabinDesign) {
		this.basicDataByCabinDesign = basicDataByCabinDesign;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "speed")
	public BasicData getBasicDataBySpeed() {
		return this.basicDataBySpeed;
	}

	public void setBasicDataBySpeed(BasicData basicDataBySpeed) {
		this.basicDataBySpeed = basicDataBySpeed;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "freeAdmission")
	public BasicData getBasicDataByFreeAdmission() {
		return this.basicDataByFreeAdmission;
	}

	public void setBasicDataByFreeAdmission(BasicData basicDataByFreeAdmission) {
		this.basicDataByFreeAdmission = basicDataByFreeAdmission;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "doorFrameHammered")
	public BasicData getBasicDataByDoorFrameHammered() {
		return this.basicDataByDoorFrameHammered;
	}

	public void setBasicDataByDoorFrameHammered(
			BasicData basicDataByDoorFrameHammered) {
		this.basicDataByDoorFrameHammered = basicDataByDoorFrameHammered;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "controlType")
	public BasicData getBasicDataByControlType() {
		return this.basicDataByControlType;
	}

	public void setBasicDataByControlType(BasicData basicDataByControlType) {
		this.basicDataByControlType = basicDataByControlType;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "elevatorType")
	public BasicData getBasicDataByElevatorType() {
		return this.basicDataByElevatorType;
	}

	public void setBasicDataByElevatorType(BasicData basicDataByElevatorType) {
		this.basicDataByElevatorType = basicDataByElevatorType;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "boothButton")
	public BasicData getBasicDataByBoothButton() {
		return this.basicDataByBoothButton;
	}

	public void setBasicDataByBoothButton(BasicData basicDataByBoothButton) {
		this.basicDataByBoothButton = basicDataByBoothButton;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "doorSystem")
	public BasicData getBasicDataByDoorSystem() {
		return this.basicDataByDoorSystem;
	}

	public void setBasicDataByDoorSystem(BasicData basicDataByDoorSystem) {
		this.basicDataByDoorSystem = basicDataByDoorSystem;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "hourMachine")
	public BasicData getBasicDataByHourMachine() {
		return this.basicDataByHourMachine;
	}

	public void setBasicDataByHourMachine(BasicData basicDataByHourMachine) {
		this.basicDataByHourMachine = basicDataByHourMachine;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "doorframeType")
	public BasicData getBasicDataByDoorframeType() {
		return this.basicDataByDoorframeType;
	}

	public void setBasicDataByDoorframeType(BasicData basicDataByDoorframeType) {
		this.basicDataByDoorframeType = basicDataByDoorframeType;
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
