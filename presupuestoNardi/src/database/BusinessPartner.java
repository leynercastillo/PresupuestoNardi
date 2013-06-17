package database;

// Generated 17-jun-2013 14:24:15 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * BusinessPartner generated by hbm2java
 */
@Entity
@Table(name = "business_partner", schema = "public")
public class BusinessPartner implements java.io.Serializable {

    private static final long serialVersionUID = -8226898077750640075L;
    private int idBusinessPartner;
    private BasicData basicData;
    private String rif;
    private String name;
    private String address;
    private char status;
    private Set<Budget> budgets = new HashSet<Budget>(0);
    private Set<Quotation> quotations = new HashSet<Quotation>(0);

    public BusinessPartner() {
    }

    public BusinessPartner(int idBusinessPartner, BasicData basicData, String rif, String name, char status) {
	this.idBusinessPartner = idBusinessPartner;
	this.basicData = basicData;
	this.rif = rif;
	this.name = name;
	this.status = status;
    }

    public BusinessPartner(int idBusinessPartner, BasicData basicData, String rif, String name, String address, char status, Set<Budget> budgets, Set<Quotation> quotations) {
	this.idBusinessPartner = idBusinessPartner;
	this.basicData = basicData;
	this.rif = rif;
	this.name = name;
	this.address = address;
	this.status = status;
	this.budgets = budgets;
	this.quotations = quotations;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "business_partner_seq")
    @SequenceGenerator(name = "business_partner_seq", sequenceName = "business_partner_id_business_partner_seq")
    @Column(name = "id_business_partner", unique = true, nullable = false)
    public int getIdBusinessPartner() {
	return this.idBusinessPartner;
    }

    public void setIdBusinessPartner(int idBusinessPartner) {
	this.idBusinessPartner = idBusinessPartner;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "rif_type", nullable = false)
    public BasicData getBasicData() {
	return this.basicData;
    }

    public void setBasicData(BasicData basicData) {
	this.basicData = basicData;
    }

    @Column(name = "rif", nullable = false, length = 15)
    public String getRif() {
	return this.rif;
    }

    public void setRif(String rif) {
	this.rif = rif;
    }

    @Column(name = "name", nullable = false, length = 100)
    public String getName() {
	return this.name;
    }

    public void setName(String name) {
	this.name = name;
    }

    @Column(name = "address", length = 200)
    public String getAddress() {
	return this.address;
    }

    public void setAddress(String address) {
	this.address = address;
    }

    @Column(name = "status", nullable = false, length = 1)
    public char getStatus() {
	return this.status;
    }

    public void setStatus(char status) {
	this.status = status;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "businessPartner")
    public Set<Budget> getBudgets() {
	return this.budgets;
    }

    public void setBudgets(Set<Budget> budgets) {
	this.budgets = budgets;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "businessPartner")
    public Set<Quotation> getQuotations() {
	return this.quotations;
    }

    public void setQuotations(Set<Quotation> quotations) {
	this.quotations = quotations;
    }

}
