package controller;

import general.ShaEncoding;

import java.security.NoSuchAlgorithmException;

import org.zkoss.bind.ValidationContext;
import org.zkoss.bind.Validator;
import org.zkoss.bind.annotation.BindingParam;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.ExecutionArgParam;
import org.zkoss.bind.annotation.Init;
import org.zkoss.bind.validator.AbstractValidator;
import org.zkoss.zhtml.Messagebox;
import org.zkoss.zk.ui.WrongValueException;
import org.zkoss.zul.Window;
import org.zkoss.zul.impl.InputElement;

import dao.DaoSecurityUser;
import database.SecurityUser;

public class FrmChangePassword {

	private SecurityUser user;
	private String newPassword;
	private String confirmPassword;
	private String currentPassword;

	public String getCurrentPassword() {
		return currentPassword;
	}

	public void setCurrentPassword(String currentPassword) {
		this.currentPassword = currentPassword;
	}

	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public SecurityUser getUser() {
		return user;
	}

	public void setUser(SecurityUser user) {
		this.user = user;
	}

	@Init
	public void init(@ExecutionArgParam("user") SecurityUser user){
		this.user = user;
		newPassword = new String();
		confirmPassword = new String();
		currentPassword = new String();
	}

	public Validator getNoCurrentPassword() {
		return new AbstractValidator() {
			@Override
			public void validate(ValidationContext ctx) {
				InputElement inputElement = (InputElement) ctx.getBindContext()
						.getValidatorArg("component");
				String string = inputElement.getText();
				ShaEncoding shaEncoding = new ShaEncoding(string);
				System.out.println(string);
				try {
					string = shaEncoding.encodingPassword();
					System.out.println(string);
				} catch (NoSuchAlgorithmException e) {
					// password don't encoding
					e.printStackTrace();
				}
				System.out.println(user.getPassword());
				
				if (user.getPassword().compareTo(string) != 0){
					throw new WrongValueException(inputElement,
							"Contraseña invalida.");
				}
			}
		};
	}

	public Validator getNoEqualPassword() {
		return new AbstractValidator() {
			@Override
			public void validate(ValidationContext ctx) {
				InputElement inputElement = (InputElement) ctx.getBindContext()
						.getValidatorArg("component");
				String string = inputElement.getText();				
				if (confirmPassword.compareTo(string) != 0){
					throw new WrongValueException(inputElement,
							"Las contraseñas no coinciden.");
				}
			}
		};
	}

	@Command
	public void save(@BindingParam("component") Window passWindow){
		ShaEncoding encoding = new ShaEncoding(newPassword);
		try {
			user.setPassword(encoding.encodingPassword());
		} catch (NoSuchAlgorithmException e) {
			Messagebox.show("No se pudo encriptar la contraseña", "Error",
					Messagebox.OK, Messagebox.ERROR);
			e.printStackTrace();
			return;
		}
		DaoSecurityUser daoSecurityUser = new DaoSecurityUser();
		if (!daoSecurityUser.save(user)) {
			Messagebox.show("No se puedo guardar usuario", "Error",
					Messagebox.OK, Messagebox.ERROR);
			return;
		} else
			Messagebox.show("Datos guardados", "Information", Messagebox.OK,
					Messagebox.INFORMATION);
		passWindow.detach();
	}
}