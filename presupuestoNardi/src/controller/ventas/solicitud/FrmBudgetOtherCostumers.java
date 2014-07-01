package controller.ventas.solicitud;


import general.GenericReport;
import general.SimpleListModelCustom;
import general.ValidateZK;

import java.io.File;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import model.database.BasicData;
import model.database.BudgetDetailOtherCostumers;
import model.database.BudgetOtherCostumers;
import model.database.BusinessPartner;
import model.database.Item;
import model.database.SecurityUser;
import model.service.ServiceBasicData;
import model.service.ServiceBudgetDetailOtherCostumers;
import model.service.ServiceBudgetOtherCostumers;
import model.service.ServiceBusinessPartner;
import model.service.ServiceItem;
import model.service.ServiceQuotation;
import model.service.ServiceSecurityUser;




import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.zkoss.bind.BindUtils;
import org.zkoss.bind.ValidationContext;
import org.zkoss.bind.Validator;
import org.zkoss.bind.annotation.BindingParam;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.GlobalCommand;
import org.zkoss.bind.annotation.Init;
import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.bind.validator.AbstractValidator;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.Sessions;
import org.zkoss.zk.ui.WrongValueException;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zk.ui.select.annotation.WireVariable;
import org.zkoss.zk.ui.util.Clients;
import org.zkoss.zul.ListModel;
import org.zkoss.zul.ListModelList;
import org.zkoss.zul.Window;
import org.zkoss.zul.impl.InputElement;

import controller.ventas.solicitud.BudgetDetailOtherCostumersFilter;

import springBean.Emails;

/**
 * @author ana.perez
 * 
 */

public class FrmBudgetOtherCostumers {

	  @Wire("#window")
	    private Window window;

	
	    
	@WireVariable
	private ServiceBasicData serviceBasicData;
	@WireVariable
	private ServiceBudgetOtherCostumers serviceBudgetOtherCostumers;
	@WireVariable
	private ServiceBudgetDetailOtherCostumers serviceBudgetDetailOtherCostumers;
	@WireVariable
	private ServiceSecurityUser serviceSecurityUser;
	@WireVariable
	private ServiceBusinessPartner serviceBusinessPartner;
	@WireVariable
	private ServiceQuotation serviceQuotation;
	@WireVariable
	private ServiceItem serviceItem;
	@WireVariable
	private Emails emails;
	
	private int cantidad;
	private String seleccione;
	private String modalMessage;
	private String minCombo;
	private final String dash = new String("--");
	private List<BasicData> listBType;
	private Item selectedItem;
	private BudgetDetailOtherCostumers selectedDetail;
	private List<BasicData> listRifType;
	private ListModel<Object> listRifPartner;
	private ListModel<Object> listNumber;
	private ListModel<Object> listPartnerName;;
	private ListModel<Object> listSeller;
	private ListModel<Object> listItemCode;
	private ListModel<Object> listItemName;
	private ListModel<Object> listComponents;
	private List<BudgetDetailOtherCostumers> listDetail = new ArrayList<BudgetDetailOtherCostumers>();
	
	
	private Boolean disabledAll;
	private Boolean disableAll;
	private Boolean disableAfterSearch;
	private Boolean disabledNumber;
	private Boolean disableSeller;
	private Boolean disableSistelHall;
	private Boolean update;
	
	private float total;
	private float acumTotal;
	
	private BudgetDetailOtherCostumers budgetDetailOtherCostumers;
	private BudgetOtherCostumers budgetOtherCostumers;
	private BusinessPartner businessPartner;
	private Item item;
	private BudgetDetailOtherCostumers Detail;
	private Item elevatorComponent;
	private BudgetDetailOtherCostumersFilter itemFilter;
	private List<Item> listItems;

	


	public BudgetDetailOtherCostumers getDetail() {
		return Detail;
	}

	public void setDetail(BudgetDetailOtherCostumers detail) {
		Detail = detail;
	}

	public BudgetDetailOtherCostumers getSelectedDetail() {
		return selectedDetail;
	}

	public void setSelectedDetail(BudgetDetailOtherCostumers selectedDetail) {
		this.selectedDetail = selectedDetail;
	}

	

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	public float getAcumTotal() {
		return acumTotal;
	}

	public void setAcumTotal(float acumTotal) {
		this.acumTotal = acumTotal;
	}

	public BudgetDetailOtherCostumersFilter getItemFilter() {
		return itemFilter;
	}

	public void setItemFilter(BudgetDetailOtherCostumersFilter itemFilter) {
		this.itemFilter = itemFilter;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public List<BudgetDetailOtherCostumers> getListDetail() {
		return listDetail;
	}

	public void setListDetail(List<BudgetDetailOtherCostumers> listDetail) {
		this.listDetail = listDetail;
	}

	public BudgetDetailOtherCostumers getBudgetDetailOtherCostumers() {
		return budgetDetailOtherCostumers;
	}

	public void setBudgetDetailOtherCostumers(BudgetDetailOtherCostumers budgetDetailOtherCostumers) {
		this.budgetDetailOtherCostumers = budgetDetailOtherCostumers;
	}


	public List<Item> getListItems() {
		return listItems;
	}

	public void setListItems(List<Item> listItems) {
		this.listItems = listItems;
	}

	public ListModel<Object> getListComponents() {
		return listComponents;
	}

	public void setListComponents(ListModel<Object> listComponents) {
		this.listComponents = listComponents;
	}

	public ServiceBudgetOtherCostumers getServiceBudgetOtherCostumers() {
		return serviceBudgetOtherCostumers;
	}

	public void setServiceBudgetOtherCostumers(ServiceBudgetOtherCostumers serviceBudgetOtherCostumers) {
		this.serviceBudgetOtherCostumers = serviceBudgetOtherCostumers;
	}

	public ServiceBudgetDetailOtherCostumers getServiceBudgetDetailOtherCostumers() {
		return serviceBudgetDetailOtherCostumers;
	}

	public void setServiceBudgetDetailOtherCostumers(ServiceBudgetDetailOtherCostumers serviceBudgetDetailOtherCostumers) {
		this.serviceBudgetDetailOtherCostumers = serviceBudgetDetailOtherCostumers;
	}

	public Boolean getUpdate() {
		return update;
	}

	public void setUpdate(Boolean update) {
		this.update = update;
	}

	public Item getElevatorComponent() {
		return elevatorComponent;
	}

	public void setElevatorComponent(Item elevatorComponent) {
		this.elevatorComponent = elevatorComponent;
	}

	

	public Boolean getDisableAll() {
		return disableAll;
	}

	public void setDisableAll(Boolean disableAll) {
		this.disableAll = disableAll;
	}

	public String getMinCombo() {
		return minCombo;
	}

	public void setMinCombo(String minCombo) {
		this.minCombo = minCombo;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public ListModel<Object> getListItemCode() {
		return listItemCode;
	}

	public void setListItemCode(ListModel<Object> listItemCode) {
		this.listItemCode = listItemCode;
	}

	public ListModel<Object> getListItemName() {
		return listItemName;
	}

	public void setListItemName(ListModel<Object> listItemName) {
		this.listItemName = listItemName;
	}

	public String getModalMessage() {
		return modalMessage;
	}

	public void setModalMessage(String modalMessage) {
		this.modalMessage = modalMessage;
	}

	public ListModel<Object> getListSeller() {
		return listSeller;
	}

	public void setListSeller(ListModel<Object> listSeller) {
		this.listSeller = listSeller;
	}


	public ListModel<Object> getListPartnerName() {
		return listPartnerName;
	}

	public void setListPartnerName(ListModel<Object> listPartnerName) {
		this.listPartnerName = listPartnerName;
	}

	public ListModel<Object> getListNumber() {
		return listNumber;
	}

	public void setListNumber(ListModel<Object> listNumber) {
		this.listNumber = listNumber;
	}

	public String getDash() {
		return dash;
	}

	public ListModel<Object> getListRifPartner() {
		return listRifPartner;
	}

	public void setListRifPartner(ListModel<Object> listRifPartner) {
		this.listRifPartner = listRifPartner;
	}

	public List<BasicData> getListRifType() {
		return listRifType;
	}

	public void setListRifType(List<BasicData> listRifType) {
		this.listRifType = listRifType;
	}

	public Boolean getDisableSistelHall() {
		return disableSistelHall;
	}

	public void setDisableSistelHall(Boolean disableSistelHall) {
		this.disableSistelHall = disableSistelHall;
	}

	public Boolean getDisableSeller() {
		return disableSeller;
	}

	public void setDisableSeller(Boolean disableSeller) {
		this.disableSeller = disableSeller;
	}


	public Boolean getDisabledNumber() {
		return disabledNumber;
	}

	public void setDisabledNumber(Boolean disabledNumber) {
		this.disabledNumber = disabledNumber;
	}

	public Boolean getDisableAfterSearch() {
		return disableAfterSearch;
	}

	public void setDisableAfterSearch(Boolean disableAfterSearch) {
		this.disableAfterSearch = disableAfterSearch;
	}

	public Boolean getDisabledAll() {
		return disabledAll;
	}

	public void setDisabledAll(Boolean disabledAll) {
		this.disabledAll = disabledAll;
	}

	public String getSeleccione() {
		return seleccione;
	}

	public void setSeleccione(String seleccione) {
		this.seleccione = seleccione;
	}	

	public BudgetOtherCostumers getBudgetOtherCostumers() {
		return budgetOtherCostumers;
	}

	public void setBudgetOtherCostumers(BudgetOtherCostumers budgetOtherCostumers) {
		this.budgetOtherCostumers = budgetOtherCostumers;
	}

	public List<BasicData> getListBType() {
		return listBType;
	}

	public void setListBType(List<BasicData> listBType) {
		this.listBType = listBType;
	}
	

	    public Item getSelectedItem() {
		return selectedItem;
	    }

	    public void setSelectedItem(Item selectedItem) {
		this.selectedItem = selectedItem;
	    }

	@Init
	public void init() {
		
		restartForm();
	}

	@NotifyChange("*")
	@Command
	public void restartForm() {
		
		minCombo = "--";
		seleccione = new String("--Seleccione--");
		modalMessage = null;
		budgetOtherCostumers = new BudgetOtherCostumers();
		budgetDetailOtherCostumers = new BudgetDetailOtherCostumers();
		businessPartner = new BusinessPartner();
		List<BudgetOtherCostumers> listAllBudget = serviceBudgetOtherCostumers.listAll();
		if (listAllBudget.isEmpty())
			budgetOtherCostumers.setNumber("A1");
		else
			budgetOtherCostumers.setNumber("A"+ (listAllBudget.size() + 1));
		disabledAll = new Boolean(false);
		disableAfterSearch = new Boolean(false);
		disabledNumber = new Boolean(true);
		disableSeller = new Boolean(true);
		disableSistelHall = new Boolean(true);
		disableAll = true;
		
		User auxUser = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		SecurityUser user = serviceSecurityUser.findUser(auxUser.getUsername());
		budgetOtherCostumers.setSeller(user.getName());
		budgetOtherCostumers.setSecurityUser(user);
		budgetOtherCostumers.setDate(new Date());
		budgetOtherCostumers.setStatus('A');
		budgetOtherCostumers.setRifType('-');
		budgetOtherCostumers.setRifPartner(new String());
		
		total = 0;
		acumTotal = 0;
		
		listRifPartner = new ListModelList<Object>();
		listNumber = new ListModelList<Object>();
		listPartnerName = new ListModelList<Object>();
		listItems = serviceItem.listAll();
		listDetail = new ArrayList<BudgetDetailOtherCostumers>();
		listSeller = new ListModelList<Object>();
		listRifType = serviceBasicData.listRifType();
		update = false;
		itemFilter = new BudgetDetailOtherCostumersFilter();
		
	}

	/**
	 * Metodo que valida que un componente ZK no este vacio.
	 * 
	 * @return {@link Validator}
	 */
	public Validator getNoEmpty() {
		return new ValidateZK().getNoEmpty();
	}

	/**
	 * Metodo que valida que un string sea un Email valido. Solo aplica para componentes ZK
	 * 
	 * @return {@link Validator}
	 */
	public Validator getNoEmail() {
		return new ValidateZK().getNoEmail();
	}

	
	public Validator getNoSelect() {
		return new ValidateZK().getNoSelect();
	}

	public Validator getNoZero() {
		return new ValidateZK().getNoZero();
	}

	public Validator getNoZeroDouble() {
		return new AbstractValidator() {
			@Override
			public void validate(ValidationContext ctx) {
				InputElement inputElement = (InputElement) ctx.getBindContext().getValidatorArg("component");
				NumberFormat format = NumberFormat.getInstance(Locale.FRANCE);
				Double number = new Double(0);
				try {
					number = format.parse(inputElement.getText()).doubleValue();
				} catch (WrongValueException e) {
					e.printStackTrace();
				} catch (ParseException e) {
					e.printStackTrace();
				}
				if (number <= 0) {
					throw new WrongValueException(inputElement, "Ingrese una cantidad valida.");
				}
			}
		};
	}

	public Validator getNoRepeatCode() {
		return new AbstractValidator() {
			@Override
			public void validate(ValidationContext ctx) {
				InputElement inputElement = (InputElement) ctx.getBindContext().getValidatorArg("component");
				String string = inputElement.getText();
				String str = null;
				Item auxItem = serviceItem.findByCode(string);
				if (auxItem != null && !update)
					str = auxItem.getCode();
				if (string.isEmpty())
					throw new WrongValueException(inputElement, "Ingrese un dato valido.");
				if (string.equalsIgnoreCase(str))
					throw new WrongValueException(inputElement, "Este codigo ya se encuentra registrado en el sistema.");
			}
		};
	}
	public String mailMessage() {
		String seller = new String(budgetOtherCostumers.getSeller());
		String message = new String();
		message = "Solicitud de presupuesto enviada por " + seller + "\n\nCliente: " + budgetOtherCostumers.getPartnerName() +  "\n\nCiudad: " + budgetOtherCostumers.getConstructionCity();
		return message;
	}

	public List<File> mailAttach() {
		List<File> listAttach = new ArrayList<File>();
		GenericReport report = new GenericReport();
		Map<String, Object> parameters = new HashMap<String, Object>();
		String number = budgetOtherCostumers.getNumber();
		parameters.put("NUMBER", number);
		parameters.put("REPORT_TITLE", "Solicitud Presupuesto");
		parameters.put("IMAGES_DIR", "../../resource/images/system/reports/");
		parameters.put("SUBREPORT_DIR", "../../resource/reports/ventas/solicitud/");
		report.createPdf("/resource/reports/ventas/solicitud", "budget_other_costumers.jasper", parameters, "solicitud_" + number + ".pdf");
		File file = new File(Sessions.getCurrent().getWebApp().getRealPath("/resource/reports/ventas/solicitud/solicitud_" + number + ".pdf"));
		listAttach.add(file);
		return listAttach;
	}

	public void sendMail() {
		List<String> listRecipient = new ArrayList<String>();
		//listRecipient.add("ventas@ascensoresnardi.com");
		listRecipient.add("sistemas@ascensoresnardi.com");
		emails.sendMail("sistemas@ascensoresnardi.com", "Solicitud de presupuesto nro" + budgetOtherCostumers.getNumber(), listRecipient, mailMessage(), mailAttach());
	}
	

	@NotifyChange({ "listItemCode", "listItemName","listComponents"})
	@Command
	public void searchItemByField(@BindingParam("field") String field) {
		if (field.compareTo("code") == 0) {
			listItemCode = new SimpleListModelCustom<Object>(serviceItem.listCodes());
		} else if (field.compareTo("name") == 0) {
			listItemName = new SimpleListModelCustom<Object>(serviceItem.listNames());
		} 
	}
	
	
	@NotifyChange({ "item", "disableAll", "update", "listItem" })
	@Command
	public void loadItem(@BindingParam("field") String field, @BindingParam("val") String value) {
		List<Item> listItemAux = new ArrayList<Item>();
		if (field.compareTo("code") == 0)
			listItemAux = serviceItem.listByCodes(value);
		else if (field.compareTo("name") == 0)
			listItemAux = serviceItem.listByName(value);
		int listSize = listItemAux.size();
		if (listSize == 1) {
			item = new Item();
			item = listItemAux.get(0);
			disableAll = false;
			update = true;
			return;
		} else if (listSize == 0) {
			Clients.showNotification("Ningun registro coincide", "info", null, "top_center", 2000);
		} else {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("listItem", listItemAux);
			Executions.createComponents("system/articulos/frmItemList.zul", null, map);
		}
		
	}
	
	
	@NotifyChange("elevatorComponent")
	@Command
	public void loadItemByField(@BindingParam("input") InputElement input) {
		System.out.println(input.getText());
		List<Item> list = serviceItem.listByName(input.getText());
		int listSize = list.size();
		if (listSize == 1) {
			elevatorComponent = new Item();
			elevatorComponent = list.get(0);
			return;
		} else if (listSize == 0) {
			Clients.showNotification("Ningun registro coincide", "info", input, "end_center", 2000);
		} else {
			Clients.showNotification("Ningun registro coincide", "info", input, "end_center", 2000);
		}
	}
	
	


	@NotifyChange({ "*" })
	@Command
	public void save(@BindingParam("component") InputElement component) {
		
		boolean sendMail = false;
		// Se envia si se guarda. Si se modifica o no se guarda, no se envia
		if (budgetOtherCostumers.getIdBudgetOtherCostumers() == 0)
			sendMail = true;
		if (businessPartner.getIdBusinessPartner() != 0)
			budgetOtherCostumers.setBusinessPartner(businessPartner);
		if (!serviceBudgetOtherCostumers.save(budgetOtherCostumers)) {
			Clients.showNotification("No se pudo guardar.", "error", null, "bottom_center", 2000);
			return;
		}
		
		
		
		  for (int i=0; i<listDetail.size(); i++){
		if (!serviceBudgetDetailOtherCostumers.save(listDetail.get(i))) {
			Clients.showNotification("No se pudo guardar.", "error", null, "bottom_center", 2000);
			return;
		}
		}
		if (sendMail)
			sendMail();
		Clients.showNotification("Solicitud enviado", "info", null, "bottom_center", 2000);
		print();
		restartForm();
		
	}

	@NotifyChange("modalMessage")
	@Command
	public void confirmSave() {
		modalMessage = "¿Esta seguro de guardar la solicitud?";
	}

	@NotifyChange("modalMessage")
	@Command
	public void cancelModal() {
		modalMessage = null;
	}

	@NotifyChange({ "disabledAll", "budgetNumber", "budget", "disableAfterSearch", "disabledNumber" })
	@Command
	public void search() {
		restartForm();
		budgetOtherCostumers.setNumber("0");
		budgetOtherCostumers.setSeller(new String());
		disabledAll = new Boolean(true);
		disableAfterSearch = new Boolean(false);
		disabledNumber = new Boolean(false);
		disableSeller = new Boolean(false);
		disableAll = true;
	}

	@NotifyChange({ "listRifPartner", "listNumber", "listPartnerName", "listConstruction", "listSeller" })
	@Command
	public void loadBudgetByField(@BindingParam("field") String field) {
		if (field.compareTo("rifPartner") == 0) {
			listRifPartner = new SimpleListModelCustom<Object>(serviceBudgetOtherCostumers.listRifPartner());
			return;
		} else if (field.compareTo("number") == 0) {
			listNumber = new SimpleListModelCustom<Object>(serviceBudgetOtherCostumers.listNumber());
			return;
		} else if (field.compareTo("partnerName") == 0) {
			listPartnerName = new SimpleListModelCustom<Object>(serviceBudgetOtherCostumers.listPartnerName());
			return;
		} else if (field.compareTo("seller") == 0) {
			listSeller = new SimpleListModelCustom<Object>(serviceBudgetOtherCostumers.listSeller());
			return;
		}
	}

	@NotifyChange({ "listRifPartner", "listPartnerName" })
	@Command
	public void loadBusinessPartnerByField(@BindingParam("field") String field) {
		if (field.compareTo("rifPartner") == 0) {
			listRifPartner = new SimpleListModelCustom<Object>(serviceBusinessPartner.listRif());
		} else {
			listPartnerName = new SimpleListModelCustom<Object>(serviceBusinessPartner.listName());
		}
	}

	@NotifyChange("*")
	@Command
	public void searchBudget(@BindingParam("field") String field, @BindingParam("val") String value) {
		List<BudgetOtherCostumers> listBudget2 = new ArrayList<BudgetOtherCostumers>();
		if (field.compareTo("partnerName") == 0)
			listBudget2 = serviceBudgetOtherCostumers.listByPartnerName(value);
		
		else if (field.compareTo("seller") == 0)
			listBudget2 = serviceBudgetOtherCostumers.listBySeller(value);
		else if (field.compareTo("rif") == 0)
			listBudget2 = serviceBudgetOtherCostumers.listByRifPartner(value);
		else if (field.compareTo("number") == 0) {
			if (value.isEmpty())
				value = "0";
			for (int i = 0; i < value.length(); i++) {
				if (!Character.isDigit(value.charAt(i))) {
					value = "0";
					break;
				}
			}
			
			BudgetOtherCostumers auxBudgetOtherCostumers = serviceBudgetOtherCostumers.findByNumber(value);
			if (auxBudgetOtherCostumers != null)
				listBudget2.add(auxBudgetOtherCostumers);
		}
		searchGeneric(listBudget2);
		
	}
	
	@NotifyChange("selectedItem")
	    @Command
	    public void sendItem() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("item", selectedItem);
		BindUtils.postGlobalCommand(null, null, "selectedItem", map);
	    }
	

	@NotifyChange({ "item", "disableAll", "update"})
	@GlobalCommand
	public void selectedItem(@BindingParam("item") Item selectedItem) {
		System.out.println("Entró Item");
		item = serviceItem.findById(selectedItem.getIdItem());
		disableAll = false;
		update = true;
	}
	

	@NotifyChange({"budgetDetailOtherCostumers", "listDetail", "total"})
	@Command
	public void chooseBtn() {
	
	BudgetDetailOtherCostumers  auxBDOC = new BudgetDetailOtherCostumers();
	
	auxBDOC.setNumber(budgetOtherCostumers.getNumber());
	auxBDOC.setCode(item.getCode());
	auxBDOC.setName(item.getName());
	auxBDOC.setPrice(item.getPrice());
	auxBDOC.setCantidad(1);
	auxBDOC.setEstatus('A');
	listDetail.add(auxBDOC);
	budgetDetailOtherCostumers = auxBDOC;
	auxBDOC =  new BudgetDetailOtherCostumers();
	Total();
	}
	
	@NotifyChange("selectedDetail")
	    @Command
	    public void sendDetail() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("Detail", selectedDetail);
		BindUtils.postGlobalCommand(null, null, "selectedDetail", map);
	    }
	

	
	@NotifyChange({"budgetDetailOtherCostumers", "listDetail", "total"})
	@Command
	public void removeBtn() {

	listDetail.remove(selectedDetail);
	Total();
	}
	
	@NotifyChange({"budgetDetailOtherCostumers", "listDetail", "total"})
	@Command
	public void removeAllBtn() {
		listDetail.removeAll(listDetail);
		Total();
	}
	
	@NotifyChange({"budgetDetailOtherCostumers", "listDetail", "total"})
	@Command
	public void chooseAllBtn() {
		
		for (int i = 0, j = listItems.size(); i < j; i++) {
			BudgetDetailOtherCostumers  aux = new BudgetDetailOtherCostumers();
			
			aux.setNumber(budgetOtherCostumers.getNumber());
			aux.setCode(listItems.get(i).getCode());
			aux.setName(listItems.get(i).getName());
			aux.setPrice(listItems.get(i).getPrice());
			aux.setCantidad(1);
			aux.setEstatus('A');
			listDetail.add(aux);
			budgetDetailOtherCostumers = aux;
			aux=  new BudgetDetailOtherCostumers();
			
		}
		
		Total();
		
		
	}
	
	@NotifyChange({"total"})
	@Command
	public void Total() {
	total = 0;
	for (int i=0; i<listDetail.size(); i++){	
	total = total + (listDetail.get(i).getPrice()*listDetail.get(i).getCantidad());
	System.out.println(listDetail.get(i).getPrice()*listDetail.get(i).getCantidad());
	}
	System.out.println(total);
	
	
	}

	public void searchGeneric(List<BudgetOtherCostumers> list) {
		int listSize = list.size();
		if (listSize == 1) {
			budgetOtherCostumers = list.get(0);
			disableAfterSearch = new Boolean(true);
			disabledNumber = new Boolean(true);
			disableSeller = new Boolean(true);
		
		} else if (listSize == 0) {
			Clients.showNotification("Ningun registro coincide", "info", null, "top_center", 2000);
		} else {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("listBudget", list);
			Executions.createComponents("system/ventas/solicitud/frmWindowBudgets.zul", null, map);
		}
	}

	@NotifyChange({ "budgetOtherCostumers", "budgetNumber", "disableAfterSearch", "disabledNumber", "disableSeller" })
	@GlobalCommand
	public void selectedBudget(@BindingParam("BudgetOtherCostumers") BudgetOtherCostumers budgetOtherCostumers) {
		this.budgetOtherCostumers = serviceBudgetOtherCostumers.findByNumber(budgetOtherCostumers.getNumber());
		disableAfterSearch = new Boolean(true);
		disabledNumber = new Boolean(true);
		disableSeller = new Boolean(true);
		
	}

	@Command
	public void close() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("page", "");
		BindUtils.postGlobalCommand(null, null, "selectedPage", map);
	}


	@Command
	public void print() {
		GenericReport report = new GenericReport();
		Map<String, Object> parameters = new HashMap<String, Object>();
		String number = budgetOtherCostumers.getNumber();
		parameters.put("NUMBER", number);
		parameters.put("REPORT_TITLE", "Solicitud Presupuesto a Terceros");
		parameters.put("IMAGES_DIR", "../../resource/images/system/reports/");
		parameters.put("SUBREPORT_DIR", "../../resource/reports/ventas/solicitud/");
		report.createPdf("/resource/reports/ventas/solicitud", "budget_other_costumers.jasper", parameters, "solicitud_" + number + ".pdf");
		report.viewPdf("/resource/reports/ventas/solicitud/solicitud_" + number + ".pdf", "Solicitud de presupuesto");
	}


	@Command
	public void searchBusinessPartner(@BindingParam("field") String field, @BindingParam("val") String val) {
		if (field.compareTo("rif") == 0)
			businessPartner = serviceBusinessPartner.findActiveByRif(val);
		else if (field.compareTo("partnerName") == 0)
			businessPartner = serviceBusinessPartner.findActiveByName(val);
		if (businessPartner == null) {
			Executions.createComponents("system/socios/frmBusinessPartner.zul", null, null);
		} else {
			budgetOtherCostumers.setPartnerName(businessPartner.getName());
			budgetOtherCostumers.setRifPartner(businessPartner.getRif());
			budgetOtherCostumers.setRifType(businessPartner.getBasicData().getName().charAt(0));
			BindUtils.postNotifyChange(null, null, budgetOtherCostumers, "partnerName");
			BindUtils.postNotifyChange(null, null, budgetOtherCostumers, "rifType");
			BindUtils.postNotifyChange(null, null, budgetOtherCostumers, "rifPartner");
		}
	}

	@GlobalCommand
	public void selectedBusinessPartner(@BindingParam("BusinessPartner") BusinessPartner businessPartner) {
		if (businessPartner != null) {
			this.businessPartner = serviceBusinessPartner.findById(businessPartner.getIdBusinessPartner());
			budgetOtherCostumers.setPartnerName(this.businessPartner.getName());
			budgetOtherCostumers.setRifPartner(this.businessPartner.getRif());
			budgetOtherCostumers.setRifType(this.businessPartner.getBasicData().getName().charAt(0));
		} else {
			budgetOtherCostumers.setPartnerName(null);
			budgetOtherCostumers.setRifPartner("");
			budgetOtherCostumers.setRifType('-');
		}
		BindUtils.postNotifyChange(null, null, budgetOtherCostumers, "partnerName");
		BindUtils.postNotifyChange(null, null, budgetOtherCostumers, "rifType");
		BindUtils.postNotifyChange(null, null, budgetOtherCostumers, "rifPartner");
	}

	@NotifyChange("*")
	@Command
	public void copy() {
		BudgetOtherCostumers auxBudgetOtherCostumers = this.budgetOtherCostumers;
		restartForm();
		this.budgetOtherCostumers = auxBudgetOtherCostumers;
		User auxUser = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		SecurityUser user = serviceSecurityUser.findUser(auxUser.getUsername());
		this.budgetOtherCostumers.setSecurityUser(user);
		this.budgetOtherCostumers.setSeller(user.getName());
		List<BudgetOtherCostumers> listAllBudget = serviceBudgetOtherCostumers.listAll();
		budgetOtherCostumers.setIdBudgetOtherCostumers(0);
		budgetOtherCostumers.setNumber(listAllBudget.get(listAllBudget.size() - 1).getNumber() + 1);
		budgetOtherCostumers.setDate(new Date());
		// Recargamos todas las listas dependientes de lo seleccionado en el budget
		
	}
	
	

	@NotifyChange({ "listItems" })
	@Command
	public void dataFilter() {
		listItems = itemFilter.getFilterDetail(itemFilter);
	}
}
