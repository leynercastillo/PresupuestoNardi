package model.database;

// Generated 09-sep-2013 15:28:18 by Hibernate Tools 4.0.0

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * SecurityGroup generated by hbm2java
 */
@Entity
@Table(name = "security_group", schema = "public")
public class SecurityGroup implements java.io.Serializable {

	private static final long serialVersionUID = 8859167423155062595L;
	private int idSecurityGroup;
	private String name;
	private char status;
	private Set<SecurityRole> securityRoles = new HashSet<SecurityRole>(0);
	private Set<SecurityUser> securityUsers = new HashSet<SecurityUser>(0);

	public SecurityGroup() {
	}

	public SecurityGroup(int idSecurityGroup, String name, char status) {
		this.idSecurityGroup = idSecurityGroup;
		this.name = name;
		this.status = status;
	}

	public SecurityGroup(int idSecurityGroup, String name, char status, Set<SecurityRole> securityRoles, Set<SecurityUser> securityUsers) {
		this.idSecurityGroup = idSecurityGroup;
		this.name = name;
		this.status = status;
		this.securityRoles = securityRoles;
		this.securityUsers = securityUsers;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "security_group_seq")
	@SequenceGenerator(name = "security_group_seq", sequenceName = "security_group_id_security_group_seq")
	@Column(name = "id_security_group", unique = true, nullable = false)
	public int getIdSecurityGroup() {
		return this.idSecurityGroup;
	}

	public void setIdSecurityGroup(int idSecurityGroup) {
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
	@JoinTable(name = "role_group", schema = "public", joinColumns = { @JoinColumn(name = "id_security_group", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "id_security_role", nullable = false, updatable = false) })
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
