package controller.ventas.resumen;

import java.util.List;

import org.zkoss.bind.annotation.Init;
import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.zk.ui.select.annotation.WireVariable;

import dao.DaoQuotation;
import database.Quotation;

public class FrmSalesSummary {

    @WireVariable
    private DaoQuotation daoQuotation;

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
	listQuotations = daoQuotation.listActiveOrderDescByField("date");
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
}
