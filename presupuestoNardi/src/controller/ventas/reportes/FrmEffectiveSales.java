package controller.ventas.reportes;

import general.ValidateZK;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.zkoss.bind.Validator;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.Init;
import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.zk.ui.select.annotation.WireVariable;
import org.zkoss.zul.ListModelList;

import dao.DaoSecurityGroup;
import dao.DaoSecurityUser;
import database.SecurityGroup;
import database.SecurityUser;

public class FrmEffectiveSales {

	@WireVariable
	private DaoSecurityUser daoSecurityUser;
	@WireVariable
	private DaoSecurityGroup daoSecurityGroup;
	private Date beginDate;
	private Date endDate;
	private ListModelList<SecurityUser> listUsers;
	private Set<SecurityUser> listSelectedUsers;

	public Date getBeginDate() {
		return beginDate;
	}

	public void setBeginDate(Date beginDate) {
		this.beginDate = beginDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Set<SecurityUser> getListSelectedUsers() {
		return listSelectedUsers;
	}

	public void setListSelectedUsers(Set<SecurityUser> listSelectedUsers) {
		this.listSelectedUsers = listSelectedUsers;
	}

	public ListModelList<SecurityUser> getListUsers() {
		return listUsers;
	}

	public void setListUsers(ListModelList<SecurityUser> listUsers) {
		this.listUsers = listUsers;
	}

	public Validator getNoEmpty() {
		return new ValidateZK().getNoEmpty();
	}

	public Validator getNoBeforeDate() {
		return new ValidateZK().getNoBeforeDate();
	}

	@Init
	public void init() {
		restartForm();
	}

	@NotifyChange("*")
	@Command
	public void restartForm() {
		listSelectedUsers = new HashSet<SecurityUser>();
		SecurityGroup group = daoSecurityGroup.findByField("name", "SELLER");
		listUsers = new ListModelList<SecurityUser>();
		listUsers.setMultiple(true);
		listUsers.addAll(daoSecurityUser.listByGroup(group.getIdSecurityGroup()));
	}

	@Command
	public void generateReport() {
		List<Integer> listIdUser = new ArrayList<Integer>();
		for (SecurityUser user : listSelectedUsers) {
			listIdUser.add(user.getIdSecurityUser());
		}
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("LIST_USERS", listIdUser);
		map.put("BEGIN_DATE", beginDate);
		map.put("END_DATE", endDate);
	}
}