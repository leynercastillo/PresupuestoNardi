/**
 * 
 */
package controller;

import javax.swing.plaf.basic.BasicButtonListener;

import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.Init;
import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.zul.Label;
import org.zkoss.zul.Messagebox;
import org.zkoss.zul.Window;

import database.Basicdata;

/**
 * @author leyner
 * 
 */
public class FrmBasicDataCtrl {

	private Basicdata basicdata;

	public Basicdata getBasicdata() {
		return basicdata;
	}

	public void setBasicdata(Basicdata basicdata) {
		this.basicdata = basicdata;
	}

	@Init
	public void init() {
		basicdata = new Basicdata();
	}

	@NotifyChange("basicdata")
	@Command
	public void clickAdd() {
	}
}