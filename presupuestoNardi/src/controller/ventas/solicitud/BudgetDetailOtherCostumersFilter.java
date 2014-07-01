package controller.ventas.solicitud;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



import model.database.Item;
import model.service.ServiceItem;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class BudgetDetailOtherCostumersFilter {
	private ServiceItem serviceItem;
	private String code = "";
	private String name = "";
	private List<Item> listItem;

	public BudgetDetailOtherCostumersFilter() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		this.serviceItem = applicationContext.getBean(ServiceItem.class);
		listItem = serviceItem.listAll();
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code == null ? "" : code.trim();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name == null ? "" : name.trim();
	}

	public List<Item> getFilterDetail(BudgetDetailOtherCostumersFilter filter) {
		List<Item> itemFilter = new ArrayList<Item>();
		String code = filter.getCode().toLowerCase();
		String name = filter.getName().toLowerCase();
		for (Iterator<Item> i = listItem.iterator(); i.hasNext();) {
			Item bp = i.next();
			if (bp.getCode().toLowerCase().contains(code) && bp.getName().toLowerCase().contains(name)) {
				itemFilter.add(bp);
			}
		}
		return itemFilter;
	}
}
