package controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.zkoss.bind.BindUtils;
import org.zkoss.bind.annotation.BindingParam;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.Init;
import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.util.Clients;

import zk.SecurityUserStatus;

import dao.DaoSecurityUser;
import database.SecurityUser;

public class FrmSecurityUserMaster {

	private List<SecurityUserStatus> listUsers;

	public List<SecurityUserStatus> getListUsers() {
		return listUsers;
	}

	public void setListUsers(List<SecurityUserStatus> listUsers) {
		this.listUsers = listUsers;
	}

	@Init
	public void init() {
		restartForm();
	}

	@Command
	public void restartForm() {
		listUsers = generateListStatus();
	}

	@Command
	public void close() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("page", "");
		BindUtils.postGlobalCommand(null, null, "selectedPage", map);
	}

	@Command
	public void edit(@BindingParam("user") SecurityUserStatus user) {
		user.setEditUser(!user.getEditUser());
		/*
		 * IMPORTANTE Solo actualizao una propiedad del objeto BUDGET, mas no
		 * todo el objeto
		 */
		BindUtils.postNotifyChange(null, null, user, "editUser");
	}

	@NotifyChange("changed")
	@Command
	public void save(@BindingParam("user") SecurityUserStatus user) {
		DaoSecurityUser daoSecurityUser = new DaoSecurityUser();
		edit(user);
		/*
		 * IMPORTANTE Solo actualizao una propiedad del objeto BUDGET, mas no
		 * todo el objeto
		 */
		BindUtils.postNotifyChange(null, null, user, "editUser");
		if (!daoSecurityUser.save(user.getUser())) {
			user.setModified(false);
			return;
		}
		user.setModified(true);
	}

	@Command
	public void changed(@BindingParam("Component") Component component,
			@BindingParam("user") SecurityUserStatus user) {
		if (user.getModified() != null)
			if (user.getModified()) {
				Clients.showNotification("Guardado", "info", component,
						"end_center", 2000);
				user.setModified(null);
			} else if (!user.getModified()) {
				Clients.showNotification("No pudo guardar", "error", component,
						"end_center", 2000);
				user.setModified(null);
			}
	}

	public List<SecurityUserStatus> generateListStatus() {
		List<SecurityUser> listUser = new DaoSecurityUser().listAll();
		List<SecurityUserStatus> listUserStatus = new ArrayList<SecurityUserStatus>();
		for (SecurityUser securityUser : listUser) {
			listUserStatus.add(new SecurityUserStatus(securityUser, false));
		}
		return listUserStatus;
	}
}