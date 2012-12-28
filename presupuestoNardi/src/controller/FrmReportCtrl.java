package controller;

import org.zkoss.bind.annotation.ContextParam;
import org.zkoss.bind.annotation.ContextType;
import org.zkoss.bind.annotation.ExecutionArgParam;
import org.zkoss.bind.annotation.Init;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.select.Selectors;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.Window;

public class FrmReportCtrl {

	private String report;
	private String reportTitle;
	
	public String getReportTitle() {
		return reportTitle;
	}

	public void setReportTitle(String reportTitle) {
		this.reportTitle = reportTitle;
	}

	public String getReport() {
		return report;
	}

	public void setReport(String report) {
		this.report = report;
	}

	@Init
	public void init(@ExecutionArgParam("reportPath") String reportPath, @ExecutionArgParam("reportTitle") String title, @ContextParam(ContextType.VIEW) Component view){
		Selectors.wireComponents(view, this, false);
		report = new String(reportPath);
		reportTitle = new String(title);
	}
}