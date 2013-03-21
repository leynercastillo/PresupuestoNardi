package controller;

import general.ValidateZK;

import java.util.HashMap;
import java.util.Map;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.zkoss.bind.BindUtils;
import org.zkoss.bind.Validator;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.Init;
import org.zkoss.zhtml.Messagebox;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zul.Window;

import dao.DaoSecurityUser;
import database.SecurityUser;

public class FrmSecurityProfile {

	private SecurityUser user;

	public SecurityUser getUser() {
		return user;
	}

	public void setUser(SecurityUser user) {
		this.user = user;
	}

	@Init
	public void init() {
		User auxUser = (User) SecurityContextHolder.getContext()
				.getAuthentication().getPrincipal();
		user = new DaoSecurityUser().findByString("name", auxUser
				.getUsername());
	}

	@Command
	public void close() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("page", "");
		BindUtils.postGlobalCommand(null, null, "selectedPage", map);
	}

	public Validator getNoEmpty() {
		return new ValidateZK().getNoEmpty();
	}

	@Command
	public void save() {
		DaoSecurityUser daoSecurityUser = new DaoSecurityUser();
		if (!daoSecurityUser.save(user)) {
			Messagebox.show("No se puedo guardar usuario", "Error",
					Messagebox.OK, Messagebox.ERROR);
			return;
		} else
			Messagebox.show("Datos guardados", "Information", Messagebox.OK,
					Messagebox.INFORMATION);
	}

	@Command
	public void frmChangePassword(){
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("user", user);
		Window win = (Window) Executions.createComponents(
				"security/frmChangePassword.zul", null, map);
	}
}