package model.service;

import java.util.List;

import model.dao.DaoBasicdata;
import model.database.BasicData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ServiceBasicData {

	@Autowired
	private DaoBasicdata daoBasicdata;
	
	@Transactional
	public Boolean save(BasicData basicData) {
		
		if (basicData.getIdBasic() == 0)
			return daoBasicdata.save(basicData);
		else 
			return daoBasicdata.update(basicData);
		
	}
	
	public BasicData findById(int id){
		return daoBasicdata.findByField("idBasic", id);
	}
	
	@Transactional(readOnly = true)
	public BasicData findByDoorSystem(String doorSystem) {
		return daoBasicdata.findByName("BUDGET", "DOOR SYSTEM", doorSystem);
	}

	@Transactional(readOnly = true)
	public BasicData findByElevatorCapacitance(String capacitance) {
		return daoBasicdata.findByName("BUDGET", "ELEVATOR CAPACITANCE", capacitance);
	}

	@Transactional(readOnly = true)
	public List<BasicData> listPriceType() {
		return daoBasicdata.listByFieldTable("ITEM", "PRICE TYPE");
	}

	@Transactional(readOnly = true)
	public List<BasicData> listNames(String name) {
		return daoBasicdata.listByFieldValue("name", name);
	}

	@Transactional(readOnly = true)
	public List<String> listNamesByBudgetComponent() {
		return daoBasicdata.listFieldByDataBase("BUDGET", "dataBaseName");
	}

	@Transactional(readOnly = true)
	public List<BasicData> listRifType() {
		return daoBasicdata.listByFieldTable("BUSINESS PARTNER", "RIF TYPE");
	}

	@Transactional(readOnly = true)
	public List<BasicData> listRoofType() {
		return daoBasicdata.listByFieldTable("BUDGET", "ROOF TYPE");
	}

	@Transactional(readOnly = true)
	public List<BasicData> listElevatorCapacitance() {
		return daoBasicdata.listByFieldTable("BUDGET", "ELEVATOR CAPACITANCE");
	}

	@Transactional(readOnly = true)
	public List<BasicData> listSpeed() {
		return daoBasicdata.listByFieldTable("BUDGET", "SPEED");
	}

	@Transactional(readOnly = true)
	public List<BasicData> listManeuverType() {
		return daoBasicdata.listByFieldTable("BUDGET", "MANEUVER TYPE");
	}

	@Transactional(readOnly = true)
	public List<BasicData> listHallButton() {
		return daoBasicdata.listByFieldTable("BUDGET", "HALL BUTTON");
	}

	@Transactional(readOnly = true)
	public List<BasicData> listMachineType() {
		return daoBasicdata.listByFieldTable("BUDGET", "MACHINE TYPE");
	}

	@Transactional(readOnly = true)
	public List<BasicData> listElectricityType() {
		return daoBasicdata.listByFieldTable("BUDGET", "ELECTRICITY TYPE");
	}

	@Transactional(readOnly = true)
	public List<BasicData> listCabinModel() {
		return daoBasicdata.listByFieldTable("BUDGET", "CABIN MODEL");
	}

	@Transactional(readOnly = true)
	public List<BasicData> listRailing() {
		return daoBasicdata.listByFieldTable("BUDGET", "RAILING");
	}

	@Transactional(readOnly = true)
	public List<BasicData> listFloorType() {
		return daoBasicdata.listByFieldTable("BUDGET", "FLOOR TYPE");
	}

	@Transactional(readOnly = true)
	public List<BasicData> listDoorType() {
		return daoBasicdata.listByFieldTable("BUDGET", "DOOR TYPE");
	}

	@Transactional(readOnly = true)
	public List<BasicData> listFreeAdmission() {
		return daoBasicdata.listByFieldTable("BUDGET", "FREE ADMISSION");
	}

	@Transactional(readOnly = true)
	public List<BasicData> listHeight() {
		return daoBasicdata.listByFieldTable("BUDGET", "HEIGHT");
	}

	@Transactional(readOnly = true)
	public List<BasicData> listDoorframeHammered() {
		return daoBasicdata.listByFieldTable("BUDGET", "DOOR FRAME HAMMERED");
	}

	@Transactional(readOnly = true)
	public List<BasicData> listElevatorType() {
		return daoBasicdata.listByFieldTable("BUDGET", "ELEVATOR TYPE");
	}

	@Transactional(readOnly = true)
	public List<BasicData> listHallButtonType() {
		return daoBasicdata.listByFieldTable("BUDGET", "HALL BUTTON TYPE");
	}

	@Transactional(readOnly = true)
	public List<BasicData> listControlType() {
		return daoBasicdata.listByFieldTable("BUDGET", "CONTROL TYPE");
	}

	@Transactional(readOnly = true)
	public List<BasicData> listBoothDisplaySistel() {
		return daoBasicdata.listByFieldTable("BUDGET", "BOOTH DISPLAY SISTEL");
	}

	@Transactional(readOnly = true)
	public List<BasicData> listFloorDisplaySistel() {
		return daoBasicdata.listByFieldTable("BUDGET", "FLOOR DISPLAY SISTEL");
	}

	@Transactional(readOnly = true)
	public List<BasicData> listBoothDisplayCF() {
		return daoBasicdata.listByFieldTable("BUDGET", "BOOTH DISPLAY CF");
	}

	@Transactional(readOnly = true)
	public List<BasicData> listFloorDisplayCF() {
		return daoBasicdata.listByFieldTable("BUDGET", "FLOOR DISPLAY CF");
	}
	
	@Transactional(readOnly = true)
	public List<BasicData> listBoothDisplayRelematico() {
		return daoBasicdata.listByFieldTable("BUDGET", "BOOTH DISPLAY RELEMATICO");
	}

	@Transactional(readOnly = true)
	public List<BasicData> listFloorDisplayRelematico() {
		return daoBasicdata.listByFieldTable("BUDGET", "FLOOR DISPLAY RELEMATICO");
	}

	@Transactional(readOnly = true)
	public List<BasicData> listBuildingType() {
		return daoBasicdata.listByFieldTable("BUDGET", "BUILDING TYPE");
	}

	@Transactional(readOnly = true)
	public List<BasicData> listMachineBase() {
		return daoBasicdata.listByFieldTable("BUDGET", "MACHINE BASE");
	}

	@Transactional(readOnly = true)
	public List<BasicData> listFrequency() {
		return daoBasicdata.listByFieldTable("BUDGET", "FREQUENCY");
	}

	@Transactional(readOnly = true)
	public List<BasicData> listVoltageLighting() {
		return daoBasicdata.listByFieldTable("BUDGET", "VOLTAGE LIGHTING");
	}

	@Transactional(readOnly = true)
	public List<BasicData> listAccess() {
		return daoBasicdata.listByFieldTable("BUDGET", "BUILDING EMBARQUE");
	}

	@Transactional(readOnly = true)
	public List<BasicData> listHourMachine() {
		return daoBasicdata.listByFieldTable("BUDGET", "HOUR MACHINE");
	}

	@Transactional(readOnly = true)
	public List<BasicData> listButtonType() {
		return daoBasicdata.listByFieldTable("BUDGET", "BUTTON TYPE");
	}

	@Transactional(readOnly = true)
	public List<BasicData> listMirror() {
		return daoBasicdata.listByFieldTable("BUDGET", "MIRROR");
	}

	@Transactional(readOnly = true)
	public List<BasicData> listDoorframeType() {
		return daoBasicdata.listByFieldTable("BUDGET", "DOOR FRAME TYPE");
	}

	@Transactional(readOnly = true)
	public List<BasicData> listDoorSystem() {
		return daoBasicdata.listByFieldTable("BUDGET", "DOOR SYSTEM");
	}

	@Transactional(readOnly = true)
	public List<BasicData> listBoothButton() {
		return daoBasicdata.listByFieldTable("BUDGET", "BOOTH BUTTON");
	}

	@Transactional(readOnly = true)
	public List<BasicData> listMotorTraction() {
		return daoBasicdata.listByFieldTable("BUDGET", "MOTOR TRACTION");
	}

	@Transactional(readOnly = true)
	public List<BasicData> listFan1() {
		return daoBasicdata.listByFieldTable("BUDGET", "FAN 1");
	}

	@Transactional(readOnly = true)
	public List<BasicData> listFan2() {
		return daoBasicdata.listByFieldTable("BUDGET", "FAN 2");
	}

	@Transactional(readOnly = true)
	public List<BasicData> listRoofTypeByElevatorCapacitance(BasicData elevatorCapacitance) {
		if (elevatorCapacitance.getName().equals("OTRA"))
			return daoBasicdata.listByParent(findByElevatorCapacitance("450 Kg - 6 Pers"));
		else
			return daoBasicdata.listByParent(elevatorCapacitance);
	}

	@Transactional(readOnly = true)
	public List<BasicData> listDesignByModel(BasicData model) {
		return daoBasicdata.listByParent(model);
	}

	@Transactional(readOnly = true)
	public List<BasicData> listQuotationTypeMoney() {
		return daoBasicdata.listByFieldTable("QUOTATION", "QUOTATION TYPE MONEY");
	}
	
	@Transactional(readOnly = true)
	public BasicData findByWarrantyNN() {
		return daoBasicdata.findByWarranty("MONEDA NACIONAL Y NUEVO", "QUOTATION");
	}
	
	@Transactional(readOnly = true)
	public BasicData findByWarrantyNM() {
		return daoBasicdata.findByWarranty("MONEDA NACIONAL Y MODERNIZACION", "QUOTATION");
	}
	
	@Transactional(readOnly = true)
	public BasicData findByWarrantyEN() {
		return daoBasicdata.findByWarranty("MONEDA EXTRANJERA Y NUEVO", "QUOTATION");
	}
	
	@Transactional(readOnly = true)
	public BasicData findByWarrantyEM() {
		return daoBasicdata.findByWarranty("MONEDA EXTRANJERA Y MODERNIZACION", "QUOTATION");
	}
	
	@Transactional(readOnly = true)
	public BasicData findByWarrantyNNP() {
		return daoBasicdata.findByWarranty("MONEDA NACIONAL Y NUEVO", "PAYMENT");
	}
	
	@Transactional(readOnly = true)
	public BasicData findByWarrantyNMP() {
		return daoBasicdata.findByWarranty("MONEDA NACIONAL Y MODERNIZACION", "PAYMENT");
	}
	
	@Transactional(readOnly = true)
	public BasicData findByWarrantyENP() {
		return daoBasicdata.findByWarranty("MONEDA EXTRANJERA Y NUEVO", "PAYMENT");
	}
	
	@Transactional(readOnly = true)
	public BasicData findByWarrantyEMP() {
		return daoBasicdata.findByWarranty("MONEDA EXTRANJERA Y MODERNIZACION", "PAYMENT");
	}
	
	@Transactional(readOnly = true)
	public BasicData findByWarrantyENPF() {
		return daoBasicdata.findByWarranty("MONEDA EXTRANJERA Y NUEVO", "PAYMENT FOREIGN");
	}
	
	@Transactional(readOnly = true)
	public BasicData findByWarrantyEMPF() {
		return daoBasicdata.findByWarranty("MONEDA EXTRANJERA Y MODERNIZACION",  "PAYMENT FOREIGN");
	}
	
	@Transactional(readOnly = true)
	public BasicData findByWarrantyNNW() {
		return daoBasicdata.findByWarranty("MONEDA NACIONAL Y NUEVO", "WARRANTY");
	}
	
	@Transactional(readOnly = true)
	public BasicData findByWarrantyNMW() {
		return daoBasicdata.findByWarranty("MONEDA NACIONAL Y MODERNIZACION", "WARRANTY");
	}
	
	@Transactional(readOnly = true)
	public BasicData findByWarrantyENW() {
		return daoBasicdata.findByWarranty("MONEDA EXTRANJERA Y NUEVO", "WARRANTY");
	}
	
	@Transactional(readOnly = true)
	public BasicData findByWarrantyEMW() {
		return daoBasicdata.findByWarranty("MONEDA EXTRANJERA Y MODERNIZACION", "WARRANTY");
	}
	
	@Transactional(readOnly = true)
	public BasicData findByWarrantyNNEW() {
		return daoBasicdata.findByWarranty("MONEDA NACIONAL Y NUEVO", "EXTENDED WARRANTY");
	}
	
	@Transactional(readOnly = true)
	public BasicData findByWarrantyNMEW() {
		return daoBasicdata.findByWarranty("MONEDA NACIONAL Y MODERNIZACION", "EXTENDED WARRANTY");
	}
	
	@Transactional(readOnly = true)
	public BasicData findByWarrantyENEW() {
		return daoBasicdata.findByWarranty("MONEDA EXTRANJERA Y NUEVO", "EXTENDED WARRANTY");
	}
	
	@Transactional(readOnly = true)
	public BasicData findByWarrantyEMEW() {
		return daoBasicdata.findByWarranty("MONEDA EXTRANJERA Y MODERNIZACION", "EXTENDED WARRANTY");
	}
	
	@Transactional(readOnly = true)
	public BasicData findByWarrantyNNDE() {
		return daoBasicdata.findByWarranty("MONEDA NACIONAL Y NUEVO", "DELIVERY ESTIMATE");
	}
	
	@Transactional(readOnly = true)
	public BasicData findByWarrantyNMDE() {
		return daoBasicdata.findByWarranty("MONEDA NACIONAL Y MODERNIZACION", "DELIVERY ESTIMATE");
	}
	
	@Transactional(readOnly = true)
	public BasicData findByWarrantyENDE() {
		return daoBasicdata.findByWarranty("MONEDA EXTRANJERA Y NUEVO", "DELIVERY ESTIMATE");
	}
	
	@Transactional(readOnly = true)
	public BasicData findByWarrantyEMDE() {
		return daoBasicdata.findByWarranty("MONEDA EXTRANJERA Y MODERNIZACION", "DELIVERY ESTIMATE");
	}
	
	@Transactional(readOnly = true)
	public BasicData findByWarrantyNNV() {
		return daoBasicdata.findByWarranty("MONEDA NACIONAL Y NUEVO", "VALIDITY");
	}
	
	@Transactional(readOnly = true)
	public BasicData findByWarrantyNMV() {
		return daoBasicdata.findByWarranty("MONEDA NACIONAL Y MODERNIZACION", "VALIDITY");
	}
	
	@Transactional(readOnly = true)
	public BasicData findByWarrantyENV() {
		return daoBasicdata.findByWarranty("MONEDA EXTRANJERA Y NUEVO", "VALIDITY");
	}
	
	@Transactional(readOnly = true)
	public BasicData findByWarrantyEMV() {
		return daoBasicdata.findByWarranty("MONEDA EXTRANJERA Y MODERNIZACION", "VALIDITY");
	}
	
	
}