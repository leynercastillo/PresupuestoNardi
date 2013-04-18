package controller.seguridad.perfil;

import general.ValidateZK;

import java.util.HashMap;
import java.util.Map;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.zkoss.bind.BindUtils;
import org.zkoss.bind.Validator;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.Init;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.select.annotation.WireVariable;
import org.zkoss.zk.ui.util.Clients;
import org.zkoss.zul.Window;

import dao.DaoSecurityUser;
import database.SecurityUser;

public class FrmSecurityProfile {

    @WireVariable
    private DaoSecurityUser daoSecurityUser;
    
    private SecurityUser user;

    public SecurityUser getUser() {
	return user;
    }

    public void setUser(SecurityUser user) {
	this.user = user;
    }

    @Init
    public void init() {
	User auxUser = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
	user = new SecurityUser();
	user = daoSecurityUser.findByString("email", auxUser.getUsername());
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
	if (!daoSecurityUser.update(user)) {
	    Clients.showNotification("No se pudo guardar el usuario", "error", null, "end_center", 2000);
	    return;
	} else
	    Clients.showNotification("Datos guardados.", "info", null, "end_center", 2000);
    }

    @Command
    public void frmChangePassword() {
	Map<String, Object> map = new HashMap<String, Object>();
	map.put("user", user);
	Window win = (Window) Executions.createComponents("seguridad/perfil/frmChangePassword.zul", null, map);
    }
}