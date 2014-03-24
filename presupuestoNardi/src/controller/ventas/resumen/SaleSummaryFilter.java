package controller.ventas.resumen;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.database.Quotation;
import model.database.SaleSummary;
import model.service.ServiceQuotation;

@Entity
public class SaleSummaryFilter {
	@ManyToOne
	private ServiceQuotation serviceQuotation;
	private String number = "";
	private String partnerName = "";
	private String construction = "";
	private String seller = "";
	@OneToMany
	private List<SaleSummary> listSaleSummary;

	protected SaleSummaryFilter() {
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getPartnerName() {
		return partnerName;
	}

	public void setPartnerName(String partnerName) {
		this.partnerName = partnerName;
	}

	public String getConstruction() {
		return construction;
	}

	public void setConstruction(String construction) {
		this.construction = construction;
	}

	public String getSeller() {
		return seller;
	}

	public void setSeller(String seller) {
		this.seller = seller;
	}

	public SaleSummaryFilter(List<SaleSummary> list) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		this.serviceQuotation = applicationContext.getBean(ServiceQuotation.class);
		listSaleSummary = list;
	}

	public List<SaleSummary> getFilter(SaleSummaryFilter saleSummaryFilter) {
		List<SaleSummary> list = new ArrayList<SaleSummary>();
		String number = saleSummaryFilter.getNumber().toLowerCase();
		String partnerName = saleSummaryFilter.getPartnerName().toLowerCase();
		String construction = saleSummaryFilter.getConstruction().toLowerCase();
		String seller = saleSummaryFilter.getSeller().toLowerCase();
		for (Iterator<SaleSummary> i = listSaleSummary.iterator(); i.hasNext();) {
			SaleSummary auxSummary = i.next();
			Quotation auxQuotation = serviceQuotation.findById(auxSummary.getQuotation().getIdQuotation());
			if (auxSummary.getNumber().toLowerCase().contains(number) && auxQuotation.getPartnerName().toLowerCase().contains(partnerName) && auxSummary.getConstruction().toLowerCase().contains(construction) && auxQuotation.getSeller().toLowerCase().contains(seller)) {
				list.add(auxSummary);
			}
		}
		return list;
	}
}