package model.database;

// Generated 01-abr-2014 10:16:16 by Hibernate Tools 4.0.0

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Contact generated by hbm2java
 */
@Entity
@Table(name = "contact", schema = "public")
public class Contact implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7032410861771343300L;
	private int idContact;
	private SecurityUser securityUser;
	private String partnerName;
	private String contactName;
	private String city;
	private String address;
	private String phone;
	private Date date;
	private String contactEmail;
	private String comment;
	private char status;

	public Contact() {
	}

	public Contact(int idContact, SecurityUser securityUser, String partnerName, String contactName, String city, String address, Date date, String contactEmail, char status) {
		this.idContact = idContact;
		this.securityUser = securityUser;
		this.partnerName = partnerName;
		this.contactName = contactName;
		this.city = city;
		this.address = address;
		this.date = date;
		this.contactEmail = contactEmail;
		this.status = status;
	}

	public Contact(int idContact, SecurityUser securityUser, String partnerName, String contactName, String city, String address, String phone, Date date, String contactEmail, String comment, char status) {
		this.idContact = idContact;
		this.securityUser = securityUser;
		this.partnerName = partnerName;
		this.contactName = contactName;
		this.city = city;
		this.address = address;
		this.phone = phone;
		this.date = date;
		this.contactEmail = contactEmail;
		this.comment = comment;
		this.status = status;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "contact_seq")
	@SequenceGenerator(name = "contact_seq", sequenceName = "contact_id_contact_seq")
	@Column(name = "id_contact", unique = true, nullable = false)
	public int getIdContact() {
		return this.idContact;
	}

	public void setIdContact(int idContact) {
		this.idContact = idContact;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "security_user", nullable = false)
	public SecurityUser getSecurityUser() {
		return this.securityUser;
	}

	public void setSecurityUser(SecurityUser securityUser) {
		this.securityUser = securityUser;
	}

	@Column(name = "partner_name", nullable = false, length = 100)
	public String getPartnerName() {
		return this.partnerName;
	}

	public void setPartnerName(String partnerName) {
		this.partnerName = partnerName;
	}

	@Column(name = "contact_name", nullable = false, length = 100)
	public String getContactName() {
		return this.contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	@Column(name = "city", nullable = false, length = 100)
	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Column(name = "address", nullable = false, length = 200)
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "phone", length = 100)
	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date", nullable = false, length = 29)
	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Column(name = "contact_email", nullable = false, length = 100)
	public String getContactEmail() {
		return this.contactEmail;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	@Column(name = "comment", length = 700)
	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@Column(name = "status", nullable = false, length = 1)
	public char getStatus() {
		return this.status;
	}

	public void setStatus(char status) {
		this.status = status;
	}

}
