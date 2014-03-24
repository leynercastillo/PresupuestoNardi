package controller.ventas.resumen;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import model.database.BasicData;
import model.database.SaleSummary;
import model.service.ServiceBasicData;
import model.service.ServiceQuotation;

import org.zkoss.bind.BindUtils;
import org.zkoss.bind.annotation.BindingParam;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.ContextParam;
import org.zkoss.bind.annotation.ContextType;
import org.zkoss.bind.annotation.ExecutionArgParam;
import org.zkoss.bind.annotation.Init;
import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.select.annotation.WireVariable;
import org.zkoss.zul.Window;

@Entity
public class FrmSaleSummaryList {

	@ManyToOne
	@WireVariable
	private ServiceQuotation serviceQuotation;
	@ManyToOne
	@WireVariable
	private ServiceBasicData serviceBasicData;

	@OneToMany
	private List<SaleSummary> listSaleSummary;
	@ManyToOne
	private SaleSummary saleSummary;
	@ManyToOne
	private SaleSummaryFilter saleSummaryFilter;

	public SaleSummaryFilter getSaleSummaryFilter() {
		return saleSummaryFilter;
	}

	public void setSaleSummaryFilter(SaleSummaryFilter saleSummaryFilter) {
		this.saleSummaryFilter = saleSummaryFilter;
	}

	public SaleSummary getSaleSummary() {
		return saleSummary;
	}

	public void setSaleSummary(SaleSummary saleSummary) {
		this.saleSummary = saleSummary;
	}

	public List<SaleSummary> getListSaleSummary() {
		return listSaleSummary;
	}

	public void setListSaleSummary(List<SaleSummary> listSaleSummary) {
		this.listSaleSummary = listSaleSummary;
	}

	@Init
	public void init(@ExecutionArgParam("listSaleSummary") List<SaleSummary> listSummary, @ContextParam(ContextType.VIEW) Component view) {
		this.listSaleSummary = listSummary;
		saleSummaryFilter = new SaleSummaryFilter(listSaleSummary);
	}

	public String getSaleSummaryNumber(SaleSummary saleSummary) {
		return saleSummary.getNumber() + "-" + saleSummary.getVersion();
	}

	public String getTeam(SaleSummary saleSummary) {
		BasicData elevatorType = serviceBasicData.findById(saleSummary.getBasicDataByElevatorType().getIdBasic());
		return saleSummary.getElevatorQuantity() + " - " + elevatorType.getName();
	}

	public String getDateFormat(Date date) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		return dateFormat.format(date);
	}

	@Command
	public void sendSaleSummary(@BindingParam("window") Window win) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("saleSummary", saleSummary);
		win.detach();
		BindUtils.postGlobalCommand(null, null, "selectedSaleSummary", map);
	}

	@NotifyChange({ "listSaleSummary" })
	@Command
	public void dataFilter() {
		listSaleSummary = saleSummaryFilter.getFilter(saleSummaryFilter);
	}
}