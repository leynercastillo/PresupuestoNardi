package database;

// Generated 15-abr-2013 11:18:36 by Hibernate Tools 3.4.0.CR1

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

/**
 * Quotation generated by hbm2java
 */
@Entity
@Table(name = "quotation", schema = "public")
public class Quotation implements java.io.Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 8126215234206695288L;

    private int idQuotation;
    private BasicData basicDataByElectricityType;
    private BasicData basicDataByCabinDesign;
    private BasicData basicDataByHallButton;
    private BasicData basicDataByMachineType;
    private BasicData basicDataByRoofType;
    private BasicData basicDataBySpeed;
    private BasicData basicDataByRailing;
    private BasicData basicDataByDoorframeType;
    private BasicData basicDataByManeuverType;
    private BasicData basicDataByMirror;
    private BasicData basicDataByDoorFrameHammered;
    private BasicData basicDataByFloorType;
    private BasicData basicDataByElevatorCapacitance;
    private BusinessPartner businessPartner;
    private BasicData basicDataByBoothDisplay;
    private BasicData basicDataByHeight;
    private BasicData basicDataByElevatorType;
    private BasicData basicDataByDoorType;
    private BasicData basicDataByControlType;
    private BasicData basicDataByHallButtonType;
    private BasicData basicDataByFreeAdmission;
    private BasicData basicDataByFloorDisplay;
    private Budget budget;
    private Integer newNumber;
    private Integer modernizationNumber;
    private int budgetNumber;
    private Date date;
    private boolean type;
    private char rifType;
    private String rifPartner;
    private String partnerName;
    private String construction;
    private String contactName;
    private String seller;
    private Integer elevatorQuantity;
    private Double tour;
    private Integer stopNumber;
    private Boolean stopSequenceOdd;
    private Boolean stopSequenceEven;
    private Integer stopSequenceOddNumber;
    private String stopSequenceOddQ;
    private String stopSequenceContinuousQ;
    private Boolean stopSequenceContinuous;
    private Integer stopSequenceContinuousNumber;
    private Integer stopSequenceEvenNumber;
    private String stopSequenceEvenQ;
    private Double widthHole;
    private Double bottomHole;
    private Double onTour;
    private Double fossa;
    private String designSpecialComment;
    private Boolean designSpecial;
    private Boolean doorFrameStainless;
    private String doorFrameStainlessDescrip;
    private String doorFrameHammeredDesc;
    private String doorframeTypeComment;
    private Boolean phone;
    private Boolean gomSystem;
    private Boolean accessSytem;
    private Boolean speechSynthesizer;
    private Boolean lightCurtain;
    private Boolean intercom;
    private Boolean loadLimiter;
    private Boolean firefighterKeychain;
    private String comment;
    private double priceNationalMaterial;
    private double priceImportedMaterial;
    private double totalPrice;
    private String payment;
    private String extendedWarranty;
    private String warranty;
    private String deliveryEstimate;
    private String quotationValidity;
    private String notes;
    private char status;

    public Quotation() {
    }

    public Quotation(int idQuotation, BusinessPartner businessPartner, Budget budget, int budgetNumber, Date date, boolean type, char rifType, String rifPartner, String partnerName, String construction, String contactName, String seller, double priceNationalMaterial, double priceImportedMaterial, double totalPrice, char status) {
	this.idQuotation = idQuotation;
	this.businessPartner = businessPartner;
	this.budget = budget;
	this.budgetNumber = budgetNumber;
	this.date = date;
	this.type = type;
	this.rifType = rifType;
	this.rifPartner = rifPartner;
	this.partnerName = partnerName;
	this.construction = construction;
	this.contactName = contactName;
	this.seller = seller;
	this.priceNationalMaterial = priceNationalMaterial;
	this.priceImportedMaterial = priceImportedMaterial;
	this.totalPrice = totalPrice;
	this.status = status;
    }

    public Quotation(int idQuotation, BasicData basicDataByElectricityType, BasicData basicDataByCabinDesign, BasicData basicDataByHallButton, BasicData basicDataByMachineType, BasicData basicDataByRoofType, BasicData basicDataBySpeed, BasicData basicDataByRailing, BasicData basicDataByDoorframeType, BasicData basicDataByManeuverType, BasicData basicDataByMirror, BasicData basicDataByDoorFrameHammered, BasicData basicDataByFloorType, BasicData basicDataByElevatorCapacitance, BusinessPartner businessPartner, BasicData basicDataByBoothDisplay, BasicData basicDataByHeight, BasicData basicDataByElevatorType, BasicData basicDataByDoorType, BasicData basicDataByControlType, BasicData basicDataByHallButtonType, BasicData basicDataByFreeAdmission, BasicData basicDataByFloorDisplay, Budget budget, Integer newNumber, Integer modernizationNumber, int budgetNumber, Date date, boolean type, char rifType, String rifPartner, String partnerName, String construction, String contactName, String seller, Integer elevatorQuantity, Double tour, Integer stopNumber, Boolean stopSequenceOdd, Boolean stopSequenceEven, Integer stopSequenceOddNumber, String stopSequenceOddQ, String stopSequenceContinuousQ, Boolean stopSequenceContinuous, Integer stopSequenceContinuousNumber, Integer stopSequenceEvenNumber, String stopSequenceEvenQ, Double widthHole, Double bottomHole, Double onTour, Double fossa, String designSpecialComment, Boolean designSpecial, Boolean doorFrameStainless, String doorFrameStainlessDescrip, String doorFrameHammeredDesc, String doorframeTypeComment, Boolean phone, Boolean gomSystem, Boolean accessSytem, Boolean speechSynthesizer, Boolean lightCurtain, Boolean intercom, Boolean loadLimiter, Boolean firefighterKeychain, String comment, double priceNationalMaterial, double priceImportedMaterial, double totalPrice, String payment, String extendedWarranty, String warranty, String deliveryEstimate, String quotationValidity, String notes, char status) {
	this.idQuotation = idQuotation;
	this.basicDataByElectricityType = basicDataByElectricityType;
	this.basicDataByCabinDesign = basicDataByCabinDesign;
	this.basicDataByHallButton = basicDataByHallButton;
	this.basicDataByMachineType = basicDataByMachineType;
	this.basicDataByRoofType = basicDataByRoofType;
	this.basicDataBySpeed = basicDataBySpeed;
	this.basicDataByRailing = basicDataByRailing;
	this.basicDataByDoorframeType = basicDataByDoorframeType;
	this.basicDataByManeuverType = basicDataByManeuverType;
	this.basicDataByMirror = basicDataByMirror;
	this.basicDataByDoorFrameHammered = basicDataByDoorFrameHammered;
	this.basicDataByFloorType = basicDataByFloorType;
	this.basicDataByElevatorCapacitance = basicDataByElevatorCapacitance;
	this.businessPartner = businessPartner;
	this.basicDataByBoothDisplay = basicDataByBoothDisplay;
	this.basicDataByHeight = basicDataByHeight;
	this.basicDataByElevatorType = basicDataByElevatorType;
	this.basicDataByDoorType = basicDataByDoorType;
	this.basicDataByControlType = basicDataByControlType;
	this.basicDataByHallButtonType = basicDataByHallButtonType;
	this.basicDataByFreeAdmission = basicDataByFreeAdmission;
	this.basicDataByFloorDisplay = basicDataByFloorDisplay;
	this.budget = budget;
	this.newNumber = newNumber;
	this.modernizationNumber = modernizationNumber;
	this.budgetNumber = budgetNumber;
	this.date = date;
	this.type = type;
	this.rifType = rifType;
	this.rifPartner = rifPartner;
	this.partnerName = partnerName;
	this.construction = construction;
	this.contactName = contactName;
	this.seller = seller;
	this.elevatorQuantity = elevatorQuantity;
	this.tour = tour;
	this.stopNumber = stopNumber;
	this.stopSequenceOdd = stopSequenceOdd;
	this.stopSequenceEven = stopSequenceEven;
	this.stopSequenceOddNumber = stopSequenceOddNumber;
	this.stopSequenceOddQ = stopSequenceOddQ;
	this.stopSequenceContinuousQ = stopSequenceContinuousQ;
	this.stopSequenceContinuous = stopSequenceContinuous;
	this.stopSequenceContinuousNumber = stopSequenceContinuousNumber;
	this.stopSequenceEvenNumber = stopSequenceEvenNumber;
	this.stopSequenceEvenQ = stopSequenceEvenQ;
	this.widthHole = widthHole;
	this.bottomHole = bottomHole;
	this.onTour = onTour;
	this.fossa = fossa;
	this.designSpecialComment = designSpecialComment;
	this.designSpecial = designSpecial;
	this.doorFrameStainless = doorFrameStainless;
	this.doorFrameStainlessDescrip = doorFrameStainlessDescrip;
	this.doorFrameHammeredDesc = doorFrameHammeredDesc;
	this.doorframeTypeComment = doorframeTypeComment;
	this.phone = phone;
	this.gomSystem = gomSystem;
	this.accessSytem = accessSytem;
	this.speechSynthesizer = speechSynthesizer;
	this.lightCurtain = lightCurtain;
	this.intercom = intercom;
	this.loadLimiter = loadLimiter;
	this.firefighterKeychain = firefighterKeychain;
	this.comment = comment;
	this.priceNationalMaterial = priceNationalMaterial;
	this.priceImportedMaterial = priceImportedMaterial;
	this.totalPrice = totalPrice;
	this.payment = payment;
	this.extendedWarranty = extendedWarranty;
	this.warranty = warranty;
	this.deliveryEstimate = deliveryEstimate;
	this.quotationValidity = quotationValidity;
	this.notes = notes;
	this.status = status;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "quotation_seq")
    @SequenceGenerator(name = "quotation_seq", sequenceName = "quotation_id_quotation_seq")
    @Column(name = "id_quotation", unique = true, nullable = false)
    public int getIdQuotation() {
	return this.idQuotation;
    }

    public void setIdQuotation(int idQuotation) {
	this.idQuotation = idQuotation;
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
    @JoinColumn(name = "cabin_design")
    public BasicData getBasicDataByCabinDesign() {
	return this.basicDataByCabinDesign;
    }

    public void setBasicDataByCabinDesign(BasicData basicDataByCabinDesign) {
	this.basicDataByCabinDesign = basicDataByCabinDesign;
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
    @JoinColumn(name = "machine_type")
    public BasicData getBasicDataByMachineType() {
	return this.basicDataByMachineType;
    }

    public void setBasicDataByMachineType(BasicData basicDataByMachineType) {
	this.basicDataByMachineType = basicDataByMachineType;
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
    @JoinColumn(name = "railing")
    public BasicData getBasicDataByRailing() {
	return this.basicDataByRailing;
    }

    public void setBasicDataByRailing(BasicData basicDataByRailing) {
	this.basicDataByRailing = basicDataByRailing;
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
    @JoinColumn(name = "maneuver_type")
    public BasicData getBasicDataByManeuverType() {
	return this.basicDataByManeuverType;
    }

    public void setBasicDataByManeuverType(BasicData basicDataByManeuverType) {
	this.basicDataByManeuverType = basicDataByManeuverType;
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
    @JoinColumn(name = "height")
    public BasicData getBasicDataByHeight() {
	return this.basicDataByHeight;
    }

    public void setBasicDataByHeight(BasicData basicDataByHeight) {
	this.basicDataByHeight = basicDataByHeight;
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
    @JoinColumn(name = "door_type")
    public BasicData getBasicDataByDoorType() {
	return this.basicDataByDoorType;
    }

    public void setBasicDataByDoorType(BasicData basicDataByDoorType) {
	this.basicDataByDoorType = basicDataByDoorType;
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
    @JoinColumn(name = "hall_button_type")
    public BasicData getBasicDataByHallButtonType() {
	return this.basicDataByHallButtonType;
    }

    public void setBasicDataByHallButtonType(BasicData basicDataByHallButtonType) {
	this.basicDataByHallButtonType = basicDataByHallButtonType;
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
    @JoinColumn(name = "id_budget", nullable = false)
    public Budget getBudget() {
	return this.budget;
    }

    public void setBudget(Budget budget) {
	this.budget = budget;
    }

    @Column(name = "new_number")
    public Integer getNewNumber() {
	return this.newNumber;
    }

    public void setNewNumber(Integer newNumber) {
	this.newNumber = newNumber;
    }

    @Column(name = "modernization_number")
    public Integer getModernizationNumber() {
	return this.modernizationNumber;
    }

    public void setModernizationNumber(Integer modernizationNumber) {
	this.modernizationNumber = modernizationNumber;
    }

    @Column(name = "budget_number", nullable = false)
    public int getBudgetNumber() {
	return this.budgetNumber;
    }

    public void setBudgetNumber(int budgetNumber) {
	this.budgetNumber = budgetNumber;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "date", nullable = false, length = 29)
    public Date getDate() {
	return this.date;
    }

    public void setDate(Date date) {
	this.date = date;
    }

    @Column(name = "type", nullable = false)
    public boolean isType() {
	return this.type;
    }

    public void setType(boolean type) {
	this.type = type;
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

    @Column(name = "contact_name", nullable = false, length = 100)
    public String getContactName() {
	return this.contactName;
    }

    public void setContactName(String contactName) {
	this.contactName = contactName;
    }

    @Column(name = "seller", nullable = false, length = 100)
    public String getSeller() {
	return this.seller;
    }

    public void setSeller(String seller) {
	this.seller = seller;
    }

    @Column(name = "elevator_quantity")
    public Integer getElevatorQuantity() {
	return this.elevatorQuantity;
    }

    public void setElevatorQuantity(Integer elevatorQuantity) {
	this.elevatorQuantity = elevatorQuantity;
    }

    @Column(name = "tour", precision = 17, scale = 17)
    public Double getTour() {
	return this.tour;
    }

    public void setTour(Double tour) {
	this.tour = tour;
    }

    @Column(name = "stop_number")
    public Integer getStopNumber() {
	return this.stopNumber;
    }

    public void setStopNumber(Integer stopNumber) {
	this.stopNumber = stopNumber;
    }

    @Column(name = "stop_sequence_odd")
    public Boolean getStopSequenceOdd() {
	return this.stopSequenceOdd;
    }

    public void setStopSequenceOdd(Boolean stopSequenceOdd) {
	this.stopSequenceOdd = stopSequenceOdd;
    }

    @Column(name = "stop_sequence_even")
    public Boolean getStopSequenceEven() {
	return this.stopSequenceEven;
    }

    public void setStopSequenceEven(Boolean stopSequenceEven) {
	this.stopSequenceEven = stopSequenceEven;
    }

    @Column(name = "stop_sequence_odd_number")
    public Integer getStopSequenceOddNumber() {
	return this.stopSequenceOddNumber;
    }

    public void setStopSequenceOddNumber(Integer stopSequenceOddNumber) {
	this.stopSequenceOddNumber = stopSequenceOddNumber;
    }

    @Column(name = "stop_sequence_odd_q", length = 50)
    public String getStopSequenceOddQ() {
	return this.stopSequenceOddQ;
    }

    public void setStopSequenceOddQ(String stopSequenceOddQ) {
	this.stopSequenceOddQ = stopSequenceOddQ;
    }

    @Column(name = "stop_sequence_continuous_q", length = 50)
    public String getStopSequenceContinuousQ() {
	return this.stopSequenceContinuousQ;
    }

    public void setStopSequenceContinuousQ(String stopSequenceContinuousQ) {
	this.stopSequenceContinuousQ = stopSequenceContinuousQ;
    }

    @Column(name = "stop_sequence_continuous")
    public Boolean getStopSequenceContinuous() {
	return this.stopSequenceContinuous;
    }

    public void setStopSequenceContinuous(Boolean stopSequenceContinuous) {
	this.stopSequenceContinuous = stopSequenceContinuous;
    }

    @Column(name = "stop_sequence_continuous_number")
    public Integer getStopSequenceContinuousNumber() {
	return this.stopSequenceContinuousNumber;
    }

    public void setStopSequenceContinuousNumber(Integer stopSequenceContinuousNumber) {
	this.stopSequenceContinuousNumber = stopSequenceContinuousNumber;
    }

    @Column(name = "stop_sequence_even_number")
    public Integer getStopSequenceEvenNumber() {
	return this.stopSequenceEvenNumber;
    }

    public void setStopSequenceEvenNumber(Integer stopSequenceEvenNumber) {
	this.stopSequenceEvenNumber = stopSequenceEvenNumber;
    }

    @Column(name = "stop_sequence_even_q", length = 50)
    public String getStopSequenceEvenQ() {
	return this.stopSequenceEvenQ;
    }

    public void setStopSequenceEvenQ(String stopSequenceEvenQ) {
	this.stopSequenceEvenQ = stopSequenceEvenQ;
    }

    @Column(name = "width_hole", precision = 17, scale = 17)
    public Double getWidthHole() {
	return this.widthHole;
    }

    public void setWidthHole(Double widthHole) {
	this.widthHole = widthHole;
    }

    @Column(name = "bottom_hole", precision = 17, scale = 17)
    public Double getBottomHole() {
	return this.bottomHole;
    }

    public void setBottomHole(Double bottomHole) {
	this.bottomHole = bottomHole;
    }

    @Column(name = "on_tour", precision = 17, scale = 17)
    public Double getOnTour() {
	return this.onTour;
    }

    public void setOnTour(Double onTour) {
	this.onTour = onTour;
    }

    @Column(name = "fossa", precision = 17, scale = 17)
    public Double getFossa() {
	return this.fossa;
    }

    public void setFossa(Double fossa) {
	this.fossa = fossa;
    }

    @Column(name = "design_special_comment", length = 300)
    public String getDesignSpecialComment() {
	return this.designSpecialComment;
    }

    public void setDesignSpecialComment(String designSpecialComment) {
	this.designSpecialComment = designSpecialComment;
    }

    @Column(name = "design_special")
    public Boolean getDesignSpecial() {
	return this.designSpecial;
    }

    public void setDesignSpecial(Boolean designSpecial) {
	this.designSpecial = designSpecial;
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

    @Column(name = "door_frame_hammered_desc", length = 100)
    public String getDoorFrameHammeredDesc() {
	return this.doorFrameHammeredDesc;
    }

    public void setDoorFrameHammeredDesc(String doorFrameHammeredDesc) {
	this.doorFrameHammeredDesc = doorFrameHammeredDesc;
    }

    @Column(name = "doorframe_type_comment", length = 200)
    public String getDoorframeTypeComment() {
	return this.doorframeTypeComment;
    }

    public void setDoorframeTypeComment(String doorframeTypeComment) {
	this.doorframeTypeComment = doorframeTypeComment;
    }

    @Column(name = "phone")
    public Boolean getPhone() {
	return this.phone;
    }

    public void setPhone(Boolean phone) {
	this.phone = phone;
    }

    @Column(name = "gom_system")
    public Boolean getGomSystem() {
	return this.gomSystem;
    }

    public void setGomSystem(Boolean gomSystem) {
	this.gomSystem = gomSystem;
    }

    @Column(name = "access_sytem")
    public Boolean getAccessSytem() {
	return this.accessSytem;
    }

    public void setAccessSytem(Boolean accessSytem) {
	this.accessSytem = accessSytem;
    }

    @Column(name = "speech_synthesizer")
    public Boolean getSpeechSynthesizer() {
	return this.speechSynthesizer;
    }

    public void setSpeechSynthesizer(Boolean speechSynthesizer) {
	this.speechSynthesizer = speechSynthesizer;
    }

    @Column(name = "light_curtain")
    public Boolean getLightCurtain() {
	return this.lightCurtain;
    }

    public void setLightCurtain(Boolean lightCurtain) {
	this.lightCurtain = lightCurtain;
    }

    @Column(name = "intercom")
    public Boolean getIntercom() {
	return this.intercom;
    }

    public void setIntercom(Boolean intercom) {
	this.intercom = intercom;
    }

    @Column(name = "load_limiter")
    public Boolean getLoadLimiter() {
	return this.loadLimiter;
    }

    public void setLoadLimiter(Boolean loadLimiter) {
	this.loadLimiter = loadLimiter;
    }

    @Column(name = "firefighter_keychain")
    public Boolean getFirefighterKeychain() {
	return this.firefighterKeychain;
    }

    public void setFirefighterKeychain(Boolean firefighterKeychain) {
	this.firefighterKeychain = firefighterKeychain;
    }

    @Column(name = "comment", length = 700)
    public String getComment() {
	return this.comment;
    }

    public void setComment(String comment) {
	this.comment = comment;
    }

    @Column(name = "price_national_material", nullable = false, precision = 17, scale = 17)
    public double getPriceNationalMaterial() {
	return this.priceNationalMaterial;
    }

    public void setPriceNationalMaterial(double priceNationalMaterial) {
	this.priceNationalMaterial = priceNationalMaterial;
    }

    @Column(name = "price_imported_material", nullable = false, precision = 17, scale = 17)
    public double getPriceImportedMaterial() {
	return this.priceImportedMaterial;
    }

    public void setPriceImportedMaterial(double priceImportedMaterial) {
	this.priceImportedMaterial = priceImportedMaterial;
    }

    @Column(name = "total_price", nullable = false, precision = 17, scale = 17)
    public double getTotalPrice() {
	return this.totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
	this.totalPrice = totalPrice;
    }

    @Column(name = "payment", length = 700)
    public String getPayment() {
	return this.payment;
    }

    public void setPayment(String payment) {
	this.payment = payment;
    }

    @Column(name = "extended_warranty", length = 120)
    public String getExtendedWarranty() {
	return this.extendedWarranty;
    }

    public void setExtendedWarranty(String extendedWarranty) {
	this.extendedWarranty = extendedWarranty;
    }

    @Column(name = "warranty", length = 120)
    public String getWarranty() {
	return this.warranty;
    }

    public void setWarranty(String warranty) {
	this.warranty = warranty;
    }

    @Column(name = "delivery_estimate", length = 120)
    public String getDeliveryEstimate() {
	return this.deliveryEstimate;
    }

    public void setDeliveryEstimate(String deliveryEstimate) {
	this.deliveryEstimate = deliveryEstimate;
    }

    @Column(name = "quotation_validity", length = 120)
    public String getQuotationValidity() {
	return this.quotationValidity;
    }

    public void setQuotationValidity(String quotationValidity) {
	this.quotationValidity = quotationValidity;
    }

    @Column(name = "notes", length = 1000)
    public String getNotes() {
	return this.notes;
    }

    public void setNotes(String notes) {
	this.notes = notes;
    }

    @Column(name = "status", nullable = false, length = 1)
    public char getStatus() {
	return this.status;
    }

    public void setStatus(char status) {
	this.status = status;
    }

}
