package controller.contacto;

import java.util.ArrayList;
import java.util.List;

import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.Init;
import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.zk.ui.select.annotation.WireVariable;

import dao.DaoSecurityGroup;
import dao.DaoSecurityUser;
import database.SecurityGroup;
import database.SecurityUser;

public class FrmContact {

    @WireVariable
    private DaoSecurityUser daoSecurityUser;
    @WireVariable
    private DaoSecurityGroup daoSecurityGroup;

    private List<SecurityUser> listSecurityUsers;

    public List<SecurityUser> getListSecurityUsers() {
	return listSecurityUsers;
    }

    public void setListSecurityUsers(List<SecurityUser> listSecurityUsers) {
	this.listSecurityUsers = listSecurityUsers;
    }

    @Init
    public void init() {
	restartForm();
    }

    @NotifyChange({ "*" })
    @Command
    public void restartForm() {
	SecurityGroup group = daoSecurityGroup.listByField("name", "SELLER");
	listSecurityUsers = new ArrayList<SecurityUser>(group.getSecurityUsers());
	group = daoSecurityGroup.listByField("name", "SALES COORDINATOR");
	listSecurityUsers.addAll(group.getSecurityUsers());
    }
}