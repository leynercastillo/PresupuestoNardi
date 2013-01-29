package database;

// Generated 29/01/2013 03:29:50 PM by Hibernate Tools 3.6.0

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * SecurityUser generated by hbm2java
 */
@Entity
@Table(name = "security_user", catalog = "nardi")
public class SecurityUser implements java.io.Serializable {

	private Integer idSecurityUser;
	private String name;
	private String email;
	private String password;
	private byte status;
	private Set<SecurityGroup> securityGroups = new HashSet<SecurityGroup>(0);

	public SecurityUser() {
	}

	public SecurityUser(String name, String email, String password, byte status) {
		this.name = name;
		this.email = email;
		this.password = password;
		this.status = status;
	}

	public SecurityUser(String name, String email, String password,
			byte status, Set<SecurityGroup> securityGroups) {
		this.name = name;
		this.email = email;
		this.password = password;
		this.status = status;
		this.securityGroups = securityGroups;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_security_user", unique = true, nullable = false)
	public Integer getIdSecurityUser() {
		return this.idSecurityUser;
	}

	public void setIdSecurityUser(Integer idSecurityUser) {
		this.idSecurityUser = idSecurityUser;
	}

	@Column(name = "name", nullable = false, length = 40)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "email", nullable = false, length = 100)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "password", nullable = false, length = 50)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "status", nullable = false)
	public byte getStatus() {
		return this.status;
	}

	public void setStatus(byte status) {
		this.status = status;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "group_user", catalog = "nardi", joinColumns = { @JoinColumn(name = "id_security_user", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "id_security_group", nullable = false, updatable = false) })
	public Set<SecurityGroup> getSecurityGroups() {
		return this.securityGroups;
	}

	public void setSecurityGroups(Set<SecurityGroup> securityGroups) {
		this.securityGroups = securityGroups;
	}

}
