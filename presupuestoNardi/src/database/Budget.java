package database;

// Generated 08-jul-2013 15:07:39 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;

/**
 * Budget generated by hbm2java
 */
@Entity
@Table(name = "budget", schema = "public")
public class Budget implements java.io.Serializable {

    private static final long serialVersionUID = -756986380046440290L;
    private int idBudget;
    private BasicData basicDataByElectricityType;
    private BasicData basicDataByHourMachine;
    private BasicData basicDataByHallButton;
    private BasicData basicDataByRoofType;
    private BasicData basicDataBySpeed;
    private BasicData basicDataByVoltageLighting;
    private BasicData basicDataByDoorframeType;
    private BasicData basicDataByRailing;
    private BasicData basicDataByBoothButton;
    private SecurityUser securityUser;
    private BasicData basicDataByMirror;
    private BasicData basicDataByElevatorCapacitance;
    private BusinessPartner businessPartner;
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
    private BasicData basicDataByHeight;
    private BasicData basicDataByDoorType;
    private BasicData basicDataByButtonType;
    private BasicData basicDataByControlType;
    private BasicData basicDataByFreeAdmission;
    private BasicData basicDataByFloorDisplay;
    private BasicData basicDataByAccess;
    private int number;
    private Date date;
    private char rifType;
    private String rifPartner;
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
    private Set<Quotation> quotations = new HashSet<Quotation>(0);

    public Budget() {
    }

    public Budget(int idBudget, SecurityUser securityUser, BusinessPartner businessPartner, int number, Date date, char rifType, String rifPartner, String partnerName, String construction, String seller, String constructionAddress, String constructionCity, String contactPhone, String contactName, boolean type, char status) {
	this.idBudget = idBudget;
	this.securityUser = securityUser;
	this.businessPartner = businessPartner;
	this.number = number;
	this.date = date;
	this.rifType = rifType;
	this.rifPartner = rifPartner;
	this.partnerName = partnerName;
	this.construction = construction;
	this.seller = seller;
	this.constructionAddress = constructionAddress;
	this.constructionCity = constructionCity;
	this.contactPhone = contactPhone;
	this.contactName = contactName;
	this.type = type;
	this.status = status;
    }

    public Budget(int idBudget, BasicData basicDataByElectricityType, BasicData basicDataByHourMachine, BasicData basicDataByHallButton, BasicData basicDataByRoofType, BasicData basicDataBySpeed, BasicData basicDataByVoltageLighting, BasicData basicDataByDoorframeType, BasicData basicDataByRailing, BasicData basicDataByBoothButton, SecurityUser securityUser, BasicData basicDataByMirror, BasicData basicDataByElevatorCapacitance, BusinessPartner businessPartner, BasicData basicDataByBoothDisplay, BasicData basicDataByElevatorType, BasicData basicDataByDoorSystem, BasicData basicDataByFrequency, BasicData basicDataByHallButtonType, BasicData basicDataByFan, BasicData basicDataByCabinDesign, BasicData basicDataByMachineType, BasicData basicDataByBuildingType, BasicData basicDataByManeuverType, BasicData basicDataByDoorFrameHammered, BasicData basicDataByFloorType, BasicData basicDataByMachineBase, BasicData basicDataByHeight, BasicData basicDataByDoorType, BasicData basicDataByButtonType, BasicData basicDataByControlType, BasicData basicDataByFreeAdmission, BasicData basicDataByFloorDisplay, BasicData basicDataByAccess, int number, Date date, char rifType, String rifPartner, String partnerName, String construction, String seller, String constructionAddress, String constructionCity, String contactPhone, String email, String contactName, Boolean planeP, Boolean planeC, boolean type, Integer elevatorQuantity, Integer motorQuantity, String motorTraction, Integer stopNumber, Double tour, Double onTour, Double widthHole, Double fossa, Double bottomHole, Boolean designSpecial, String designSpecialComment, Integer doorOfNumber, String doorframeTypeComment, String hallButtonPlace, Boolean lightCurtain, Boolean loadLimiter, Boolean speechSynthesizer, Boolean gomSystem, Boolean intercom, Boolean phone, Boolean accessSytem, Boolean firefighterKeychain, String displayPlaceFloor, Boolean stopSequenceContinuous, String stopSequenceContinuousQ, Integer stopSequenceContinuousNumber, Boolean stopSequenceEven, String stopSequenceEvenQ, Integer stopSequenceEvenNumber, Boolean stopSequenceOdd, String stopSequenceOddQ, Integer stopSequenceOddNumber, String doorFrameHammeredDesc, Boolean doorFrameStainless, String doorFrameStainlessDescrip, Boolean sistelWdisplayPb, Integer sistelWdisplayFloor, Boolean sistelWarrowPb, Integer sistelWarrowFloor, String comment, char status, Set<Quotation> quotations) {
	this.idBudget = idBudget;
	this.basicDataByElectricityType = basicDataByElectricityType;
	this.basicDataByHourMachine = basicDataByHourMachine;
	this.basicDataByHallButton = basicDataByHallButton;
	this.basicDataByRoofType = basicDataByRoofType;
	this.basicDataBySpeed = basicDataBySpeed;
	this.basicDataByVoltageLighting = basicDataByVoltageLighting;
	this.basicDataByDoorframeType = basicDataByDoorframeType;
	this.basicDataByRailing = basicDataByRailing;
	this.basicDataByBoothButton = basicDataByBoothButton;
	this.securityUser = securityUser;
	this.basicDataByMirror = basicDataByMirror;
	this.basicDataByElevatorCapacitance = basicDataByElevatorCapacitance;
	this.businessPartner = businessPartner;
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
	this.basicDataByHeight = basicDataByHeight;
	this.basicDataByDoorType = basicDataByDoorType;
	this.basicDataByButtonType = basicDataByButtonType;
	this.basicDataByControlType = basicDataByControlType;
	this.basicDataByFreeAdmission = basicDataByFreeAdmission;
	this.basicDataByFloorDisplay = basicDataByFloorDisplay;
	this.basicDataByAccess = basicDataByAccess;
	this.number = number;
	this.date = date;
	this.rifType = rifType;
	this.rifPartner = rifPartner;
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
	this.quotations = quotations;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "budget_seq")
    @SequenceGenerator(name = "budget_seq", sequenceName = "budget_id_budget_seq")
    @Column(name = "id_budget", unique = true, nullable = false)
    public int getIdBudget() {
	return this.idBudget;
    }

    public void setIdBudget(int idBudget) {
	this.idBudget = idBudget;
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
    @JoinColumn(name = "hall_button")
    public BasicData getBasicDataByHallButton() {
	return this.basicDataByHallButton;
    }

    public void setBasicDataByHallButton(BasicData basicDataByHallButton) {
	this.basicDataByHallButton = basicDataByHallButton;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "roof_type")
    public BasicData getBasicDataByRoofType() {
	return this.basicDataByRoofType;
    }

    public void setBasicDataByRoofType(BasicData basicDataByRoofType) {
	this.basicDataByRoofType = basicDataByRoofType;
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
    @JoinColumn(name = "voltage_lighting")
    public BasicData getBasicDataByVoltageLighting() {
	return this.basicDataByVoltageLighting;
    }

    public void setBasicDataByVoltageLighting(BasicData basicDataByVoltageLighting) {
	this.basicDataByVoltageLighting = basicDataByVoltageLighting;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "doorframe_type")
    public BasicData getBasicDataByDoorframeType() {
	return this.basicDataByDoorframeType;
    }

    public void setBasicDataByDoorframeType(BasicData basicDataByDoorframeType) {
	this.basicDataByDoorframeType = basicDataByDoorframeType;
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
    @JoinColumn(name = "booth_button")
    public BasicData getBasicDataByBoothButton() {
	return this.basicDataByBoothButton;
    }

    public void setBasicDataByBoothButton(BasicData basicDataByBoothButton) {
	this.basicDataByBoothButton = basicDataByBoothButton;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_security_user", nullable = false)
    public SecurityUser getSecurityUser() {
	return this.securityUser;
    }

    public void setSecurityUser(SecurityUser securityUser) {
	this.securityUser = securityUser;
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
    @JoinColumn(name = "elevator_capacitance")
    public BasicData getBasicDataByElevatorCapacitance() {
	return this.basicDataByElevatorCapacitance;
    }

    public void setBasicDataByElevatorCapacitance(BasicData basicDataByElevatorCapacitance) {
	this.basicDataByElevatorCapacitance = basicDataByElevatorCapacitance;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_business_partner", nullable = false)
    public BusinessPartner getBusinessPartner() {
	return this.businessPartner;
    }

    public void setBusinessPartner(BusinessPartner businessPartner) {
	this.businessPartner = businessPartner;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "booth_display")
    public BasicData getBasicDataByBoothDisplay() {
	return this.basicDataByBoothDisplay;
    }

    public void setBasicDataByBoothDisplay(BasicData basicDataByBoothDisplay) {
	this.basicDataByBoothDisplay = basicDataByBoothDisplay;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "elevator_type")
    public BasicData getBasicDataByElevatorType() {
	return this.basicDataByElevatorType;
    }

    public void setBasicDataByElevatorType(BasicData basicDataByElevatorType) {
	this.basicDataByElevatorType = basicDataByElevatorType;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "door_system")
    public BasicData getBasicDataByDoorSystem() {
	return this.basicDataByDoorSystem;
    }

    public void setBasicDataByDoorSystem(BasicData basicDataByDoorSystem) {
	this.basicDataByDoorSystem = basicDataByDoorSystem;
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
    @JoinColumn(name = "hall_button_type")
    public BasicData getBasicDataByHallButtonType() {
	return this.basicDataByHallButtonType;
    }

    public void setBasicDataByHallButtonType(BasicData basicDataByHallButtonType) {
	this.basicDataByHallButtonType = basicDataByHallButtonType;
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
    @JoinColumn(name = "cabin_design")
    public BasicData getBasicDataByCabinDesign() {
	return this.basicDataByCabinDesign;
    }

    public void setBasicDataByCabinDesign(BasicData basicDataByCabinDesign) {
	this.basicDataByCabinDesign = basicDataByCabinDesign;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "machine_type")
    public BasicData getBasicDataByMachineType() {
	return this.basicDataByMachineType;
    }

    public void setBasicDataByMachineType(BasicData basicDataByMachineType) {
	this.basicDataByMachineType = basicDataByMachineType;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "building_type")
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
    @JoinColumn(name = "door_frame_hammered")
    public BasicData getBasicDataByDoorFrameHammered() {
	return this.basicDataByDoorFrameHammered;
    }

    public void setBasicDataByDoorFrameHammered(BasicData basicDataByDoorFrameHammered) {
	this.basicDataByDoorFrameHammered = basicDataByDoorFrameHammered;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "floor_type")
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
    @JoinColumn(name = "height")
    public BasicData getBasicDataByHeight() {
	return this.basicDataByHeight;
    }

    public void setBasicDataByHeight(BasicData basicDataByHeight) {
	this.basicDataByHeight = basicDataByHeight;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "door_type")
    public BasicData getBasicDataByDoorType() {
	return this.basicDataByDoorType;
    }

    public void setBasicDataByDoorType(BasicData basicDataByDoorType) {
	this.basicDataByDoorType = basicDataByDoorType;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "button_type")
    public BasicData getBasicDataByButtonType() {
	return this.basicDataByButtonType;
    }

    public void setBasicDataByButtonType(BasicData basicDataByButtonType) {
	this.basicDataByButtonType = basicDataByButtonType;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "control_type")
    public BasicData getBasicDataByControlType() {
	return this.basicDataByControlType;
    }

    public void setBasicDataByControlType(BasicData basicDataByControlType) {
	this.basicDataByControlType = basicDataByControlType;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "free_admission")
    public BasicData getBasicDataByFreeAdmission() {
	return this.basicDataByFreeAdmission;
    }

    public void setBasicDataByFreeAdmission(BasicData basicDataByFreeAdmission) {
	this.basicDataByFreeAdmission = basicDataByFreeAdmission;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "floor_display")
    public BasicData getBasicDataByFloorDisplay() {
	return this.basicDataByFloorDisplay;
    }

    public void setBasicDataByFloorDisplay(BasicData basicDataByFloorDisplay) {
	this.basicDataByFloorDisplay = basicDataByFloorDisplay;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "access")
    public BasicData getBasicDataByAccess() {
	return this.basicDataByAccess;
    }

    public void setBasicDataByAccess(BasicData basicDataByAccess) {
	this.basicDataByAccess = basicDataByAccess;
    }

    /**
     * <b>@Generated</B> con generationTime.ALWAYS es la forma de autoincrementar el campo cuando el campo no es
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

    @Column(name = "rif_type", nullable = false, length = 1)
    public char getRifType() {
	return this.rifType;
    }

    public void setRifType(char rifType) {
	this.rifType = rifType;
    }

    @Column(name = "rif_partner", nullable = false, length = 15)
    public String getRifPartner() {
	return this.rifPartner;
    }

    public void setRifPartner(String rifPartner) {
	this.rifPartner = rifPartner;
    }

    @Column(name = "partner_name", nullable = false, length = 100)
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

    @Column(name = "construction_address", nullable = false, length = 200)
    public String getConstructionAddress() {
	return this.constructionAddress;
    }

    public void setConstructionAddress(String constructionAddress) {
	this.constructionAddress = constructionAddress;
    }

    @Column(name = "construction_city", nullable = false, length = 100)
    public String getConstructionCity() {
	return this.constructionCity;
    }

    public void setConstructionCity(String constructionCity) {
	this.constructionCity = constructionCity;
    }

    @Column(name = "contact_phone", nullable = false, length = 15)
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

    @Column(name = "contact_name", nullable = false, length = 100)
    public String getContactName() {
	return this.contactName;
    }

    public void setContactName(String contactName) {
	this.contactName = contactName;
    }

    @Column(name = "plane_p")
    public Boolean getPlaneP() {
	return this.planeP;
    }

    public void setPlaneP(Boolean planeP) {
	this.planeP = planeP;
    }

    @Column(name = "plane_c")
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

    @Column(name = "elevator_quantity")
    public Integer getElevatorQuantity() {
	return this.elevatorQuantity;
    }

    public void setElevatorQuantity(Integer elevatorQuantity) {
	this.elevatorQuantity = elevatorQuantity;
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

    @Column(name = "design_special_comment", length = 300)
    public String getDesignSpecialComment() {
	return this.designSpecialComment;
    }

    public void setDesignSpecialComment(String designSpecialComment) {
	this.designSpecialComment = designSpecialComment;
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

    @Column(name = "light_curtain")
    public Boolean getLightCurtain() {
	return this.lightCurtain;
    }

    public void setLightCurtain(Boolean lightCurtain) {
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

    @Column(name = "stop_sequence_continuous_q", length = 50)
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

    @Column(name = "stop_sequence_even_q", length = 50)
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

    @Column(name = "stop_sequence_odd_q", length = 50)
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

    @Column(name = "door_frame_stainless_descrip", length = 50)
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

    @Column(name = "comment", length = 700)
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

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "budget")
    public Set<Quotation> getQuotations() {
	return this.quotations;
    }

    public void setQuotations(Set<Quotation> quotations) {
	this.quotations = quotations;
    }

}
