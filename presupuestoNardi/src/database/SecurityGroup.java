package database;

// Generated 12-mar-2013 15:01:36 by Hibernate Tools 3.4.0.CR1

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
 * SecurityGroup generated by hbm2java
 */
@Entity
@Table(name = "security_group", catalog = "ascensor_nardi")
public class SecurityGroup implements java.io.Serializable {

	private Integer idSecurityGroup;
	private String name;
	private char status;
	private Set<SecurityRole> securityRoles = new HashSet<SecurityRole>(0);
	private Set<SecurityUser> securityUsers = new HashSet<SecurityUser>(0);

	public SecurityGroup() {
	}

	public SecurityGroup(String name, char status) {
		this.name = name;
		this.status = status;
	}

	public SecurityGroup(String name, char status,
			Set<SecurityRole> securityRoles, Set<SecurityUser> securityUsers) {
		this.name = name;
		this.status = status;
		this.securityRoles = securityRoles;
		this.securityUsers = securityUsers;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_security_group", unique = true, nullable = false)
	public Integer getIdSecurityGroup() {
		return this.idSecurityGroup;
	}

	public void setIdSecurityGroup(Integer idSecurityGroup) {
		this.idSecurityGroup = idSecurityGroup;
	}

	@Column(name = "name", nullable = false, length = 40)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "status", nullable = false, length = 1)
	public char getStatus() {
		return this.status;
	}

	public void setStatus(char status) {
		this.status = status;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "role_group", catalog = "ascensor_nardi", joinColumns = { @JoinColumn(name = "id_security_group", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "id_security_role", nullable = false, updatable = false) })
	public Set<SecurityRole> getSecurityRoles() {
		return this.securityRoles;
	}

	public void setSecurityRoles(Set<SecurityRole> securityRoles) {
		this.securityRoles = securityRoles;
	}

	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "securityGroups")
	public Set<SecurityUser> getSecurityUsers() {
		return this.securityUsers;
	}

	public void setSecurityUsers(Set<SecurityUser> securityUsers) {
		this.securityUsers = securityUsers;
	}

}
