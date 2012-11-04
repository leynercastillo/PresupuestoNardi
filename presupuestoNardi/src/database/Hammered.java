package database;

// Generated 02/11/2012 09:47:33 PM by Hibernate Tools 3.6.0

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Hammered generated by hbm2java
 */
@Entity
@Table(name = "hammered", schema = "public")
public class Hammered implements java.io.Serializable {

	private int idhammered;
	private Budget budget;
	private Basicdata basicdata;
	private String description;

	public Hammered() {
	}

	public Hammered(int idhammered, Budget budget, Basicdata basicdata) {
		this.idhammered = idhammered;
		this.budget = budget;
		this.basicdata = basicdata;
	}

	public Hammered(int idhammered, Budget budget, Basicdata basicdata,
			String description) {
		this.idhammered = idhammered;
		this.budget = budget;
		this.basicdata = basicdata;
		this.description = description;
	}

	@Id
	@Column(name = "idhammered", unique = true, nullable = false)
	public int getIdhammered() {
		return this.idhammered;
	}

	public void setIdhammered(int idhammered) {
		this.idhammered = idhammered;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idbudget", nullable = false)
	public Budget getBudget() {
		return this.budget;
	}

	public void setBudget(Budget budget) {
		this.budget = budget;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idbasic", nullable = false)
	public Basicdata getBasicdata() {
		return this.basicdata;
	}

	public void setBasicdata(Basicdata basicdata) {
		this.basicdata = basicdata;
	}

	@Column(name = "description", length = 200)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
