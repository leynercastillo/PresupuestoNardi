package database;

// Generated 18/02/2013 11:33:51 AM by Hibernate Tools 3.6.0

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * SecurityRole generated by hbm2java
 */
@Entity
@Table(name = "security_role", catalog = "ascensor_nardi")
public class SecurityRole implements java.io.Serializable {

	private Integer idSecurityRole;
	private String name;
	private char status;
	private Set<SecurityGroup> securityGroups = new HashSet<SecurityGroup>(0);

	public SecurityRole() {
	}

	public SecurityRole(String name, char status) {
		this.name = name;
		this.status = status;
	}

	public SecurityRole(String name, char status,
			Set<SecurityGroup> securityGroups) {
		this.name = name;
		this.status = status;
		this.securityGroups = securityGroups;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_security_role", unique = true, nullable = false)
	public Integer getIdSecurityRole() {
		return this.idSecurityRole;
	}

	public void setIdSecurityRole(Integer idSecurityRole) {
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
