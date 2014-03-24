package controller.socios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.database.BusinessPartner;
import model.service.ServiceBusinessPartner;

@Entity
public class BusinessPartnerFilter {

	@ManyToOne
	private ServiceBusinessPartner serviceBusinessPartner;
	private String rif = "";
	private String name = "";
	@OneToMany
	private List<BusinessPartner> listBusinessPartner;

	public BusinessPartnerFilter() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		this.serviceBusinessPartner = applicationContext.getBean(ServiceBusinessPartner.class);
		listBusinessPartner = serviceBusinessPartner.listAll();
	}

	public String getRif() {
		return rif;
	}

	public void setRif(String rif) {
		this.rif = rif == null ? "" : rif.trim();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name == null ? "" : name.trim();
	}

	public List<BusinessPartner> getFilter(BusinessPartnerFilter partnerFilter) {
		List<BusinessPartner> partners = new ArrayList<BusinessPartner>();
		String rif = partnerFilter.getRif().toLowerCase();
		String name = partnerFilter.getName().toLowerCase();
		for (Iterator<BusinessPartner> i = listBusinessPartner.iterator(); i.hasNext();) {
			BusinessPartner bp = i.next();
			if (bp.getRif().toLowerCase().contains(rif) && bp.getName().toLowerCase().contains(name)) {
				partners.add(bp);
			}
		}
		return partners;
	}
}