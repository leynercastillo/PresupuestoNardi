package database;

// Generated 08-abr-2013 16:54:55 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * SecurityRole generated by hbm2java
 */
@Entity
@Table(name = "security_role", schema = "public")
public class SecurityRole implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5328166875548422724L;
	private int idSecurityRole;
	private String name;
	private char status;
	private Set<SecurityGroup> securityGroups = new HashSet<SecurityGroup>(0);

	public SecurityRole() {
	}

	public SecurityRole(int idSecurityRole, String name, char status) {
		this.idSecurityRole = idSecurityRole;
		this.name = name;
		this.status = status;
	}

	public SecurityRole(int idSecurityRole, String name, char status,
			Set<SecurityGroup> securityGroups) {
		this.idSecurityRole = idSecurityRole;
		this.name = name;
		this.status = status;
		this.securityGroups = securityGroups;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "security_role_seq")
	@SequenceGenerator(name = "security_role_seq", sequenceName = "security_role_id_security_role_seq")
	@Column(name = "id_security_role", unique = true, nullable = false)
	public int getIdSecurityRole() {
		return this.idSecurityRole;
	}

	public void setIdSecurityRole(int idSecurityRole) {
		this.idSecurityRole = idSecurityRole;
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

	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "securityRoles")
	public Set<SecurityGroup> getSecurityGroups() {
		return this.securityGroups;
	}

	public void setSecurityGroups(Set<SecurityGroup> securityGroups) {
		this.securityGroups = securityGroups;
	}

}
