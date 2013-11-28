package model.service;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import model.dao.DaoSaleSummary;
import model.database.Quotation;
import model.database.SaleSummary;
import model.database.SecurityGroup;
import model.database.SecurityUser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ServiceSaleSummary {

	@Autowired
	private DaoSaleSummary daoSaleSummary;
	@Autowired
	private ServiceSecurityGroup serviceSecurityGroup;

	private Set<SecurityUser> listUserByGroup(SecurityUser user) {
		Set<SecurityUser> listUser = new HashSet<SecurityUser>();
		SecurityGroup group = serviceSecurityGroup.findById(user.getSecurityGroup().getIdSecurityGroup());
		if (group.getName().equals("SELLER"))
			listUser.add(user);
		else
			listUser = serviceSecurityGroup.findGroupSeller().getSecurityUsers();
		return listUser;
	}

	@Transactional
	public Boolean save(SaleSummary saleSummary) {
		String number;
		if (saleSummary.getIdSaleSummary() == 0) {
			int lastConstructionNumber = daoSaleSummary.getLastConstructionNumber();
			number = (saleSummary.isSaleType() ? "1-" : "2-") + (lastConstructionNumber + 1) + (saleSummary.getElevatorQuantity() > 1 ? ("/" + (lastConstructionNumber + saleSummary.getElevatorQuantity())) : "");
			saleSummary.setNumber(number);
			saleSummary.setLastConstructionNumber(lastConstructionNumber + saleSummary.getElevatorQuantity());
		} else {
			saleSummary.setIdSaleSummary(0);
			saleSummary.setDate(new Date());
		}
		return daoSaleSummary.save(saleSummary);
	}

	@Transactional(readOnly = true)
	public SaleSummary findById(int id) {
		return daoSaleSummary.findByField("idSaleSummary", id);
	}
	
	@Transactional(readOnly = true)
	public SaleSummary findByQuotation(Quotation quotation){
		return daoSaleSummary.findByField("quotation", quotation);
	}

	/**
	 * @param user
	 *                SecurityUser that use
	 * @return if user is SELLER return the partners rif only, else return all the partners rif
	 */
	@Transactional(readOnly = true)
	public List<String> listRifPartner(SecurityUser user) {
		return daoSaleSummary.listStringByQuotationField("rifPartner", listUserByGroup(user));
	}

	@Transactional(readOnly = true)
	public List<String> listPartnerName(SecurityUser user) {
		return daoSaleSummary.listStringByQuotationField("partnerName", listUserByGroup(user));
	}

	@Transactional(readOnly = true)
	public List<String> listSeller(SecurityUser user) {
		return daoSaleSummary.listStringByQuotationField("seller", listUserByGroup(user));
	}

	@Transactional(readOnly = true)
	public List<String> listQuotationNumber(SecurityUser user) {
		List<String> list = daoSaleSummary.listStringByQuotationField("newNumber", listUserByGroup(user));
		list.addAll(daoSaleSummary.listStringByQuotationField("modernizationNumber", listUserByGroup(user)));
		return list;
	}

	@Transactional(readOnly = true)
	public List<String> listNumber(SecurityUser user) {
		return daoSaleSummary.listStringByField("number", listUserByGroup(user));
	}

	@Transactional(readOnly = true)
	public List<String> listConstruction(SecurityUser user) {
		return daoSaleSummary.listStringByField("construction", listUserByGroup(user));
	}

	@Transactional(readOnly = true)
	public List<SaleSummary> listByRifPartner(String rif, SecurityUser user) {
		return daoSaleSummary.listByQuotationField("rifPartner", rif, listUserByGroup(user));
	}

	@Transactional(readOnly = true)
	public List<SaleSummary> listByPartnerName(String partnerName, SecurityUser user) {
		return daoSaleSummary.listByQuotationField("partnerName", partnerName, listUserByGroup(user));
	}

	@Transactional(readOnly = true)
	public List<SaleSummary> listBySeller(String seller, SecurityUser user) {
		return daoSaleSummary.listByQuotationField("seller", seller, listUserByGroup(user));
	}

	@Transactional(readOnly = true)
	public List<SaleSummary> listByNumber(String number, SecurityUser user) {
		return daoSaleSummary.listByField("number", number, listUserByGroup(user));
	}

	@Transactional(readOnly = true)
	public List<SaleSummary> listByConstruction(String construction, SecurityUser user) {
		return daoSaleSummary.listByField("construction", construction, listUserByGroup(user));
	}

	@Transactional(readOnly = true)
	public List<SaleSummary> listByQuotationNumber(Integer quotationNumber, SecurityUser user) {
		List<SaleSummary> list = daoSaleSummary.listByQuotationField("newNumber", quotationNumber, listUserByGroup(user));
		list.addAll(daoSaleSummary.listByQuotationField("modernizationNumber", quotationNumber, listUserByGroup(user)));
		return list;
	}
}