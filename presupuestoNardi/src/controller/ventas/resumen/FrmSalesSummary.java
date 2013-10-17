package controller.ventas.resumen;

import general.GenericReport;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.database.Quotation;
import model.service.ServiceQuotation;

import org.zkoss.bind.BindUtils;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.Init;
import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.zk.ui.select.annotation.WireVariable;

public class FrmSalesSummary {

	@WireVariable
	private ServiceQuotation serviceQuotation;

	private List<Quotation> listQuotations;
	private Quotation quotation;

	public List<Quotation> getListQuotations() {
		return listQuotations;
	}

	public void setListQuotations(List<Quotation> listQuotations) {
		this.listQuotations = listQuotations;
	}

	public Quotation getQuotation() {
		return quotation;
	}

	public void setQuotation(Quotation quotation) {
		this.quotation = quotation;
	}

	@Init
	public void init() {
		restartForm();
	}

	@NotifyChange({ "*" })
	public void restartForm() {
		listQuotations = serviceQuotation.listOrderedByDate();
	}

	public String getQuotationNumber(Quotation quotation) {
		if (quotation.isType())
			return "1 - " + quotation.getNewNumber() + " - " + quotation.getVersionNumber();
		else
			return "2 - " + quotation.getModernizationNumber() + " - " + quotation.getVersionNumber();
	}

	public String getTeam(Quotation quotation) {
		return quotation.getElevatorQuantity() + " - " + quotation.getBasicDataByElevatorType().getName();
	}

	public String getDateFormat(Date date) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		return dateFormat.format(date);
	}

	@Command
	public void pdfQuotation() {
		GenericReport report = new GenericReport();
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("REPORT_TITLE", "Resumen de Venta");
		parameters.put("NUMBER", quotation.getBudgetNumber());
		/*
		 * Enviamos por parametro a ireport la ruta de la ubicacion de los subreportes e imagenes.
		 */
		parameters.put("IMAGES_DIR", "../../resource/images/system/reports/");
		parameters.put("SUBREPORT_DIR", "../../resource/reports/ventas/resumen/");
		report.createPdf("/resource/reports/ventas/resumen", "sale_summary.jasper", parameters, "presupuesto" + quotation.getBudgetNumber() + ".pdf");
		report.viewPdf("/resource/reports/ventas/resumen/presupuesto" + quotation.getBudgetNumber() + ".pdf", "Resumen de venta");
	}

	@Command
	public void close() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("page", "");
		BindUtils.postGlobalCommand(null, null, "selectedPage", map);
	}
}