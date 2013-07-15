package database;

// Generated 08-jul-2013 15:07:39 by Hibernate Tools 3.4.0.CR1

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
 * Item generated by hbm2java
 */
@Entity
@Table(name = "item", schema = "public")
public class Item implements java.io.Serializable {

    private static final long serialVersionUID = 794900053845942242L;
    private int idItem;
    private String code;
    private String name;
    private float cost;
    private float price;
    private char status;
    private Set<Quotation> quotations = new HashSet<Quotation>(0);
    private Set<BasicData> basicDatas = new HashSet<BasicData>(0);

    public Item() {
    }

    public Item(int idItem, String code, String name, float cost, float price, char status) {
	this.idItem = idItem;
	this.code = code;
	this.name = name;
	this.cost = cost;
	this.price = price;
	this.status = status;
    }

    public Item(int idItem, String code, String name, float cost, float price, char status, Set<Quotation> quotations, Set<BasicData> basicDatas) {
	this.idItem = idItem;
	this.code = code;
	this.name = name;
	this.cost = cost;
	this.price = price;
	this.status = status;
	this.quotations = quotations;
	this.basicDatas = basicDatas;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "item_id_seq")
    @SequenceGenerator(name = "item_id_seq", sequenceName = "item_id_item_seq")
    @Column(name = "id_item", unique = true, nullable = false)
    public int getIdItem() {
	return this.idItem;
    }

    public void setIdItem(int idItem) {
	this.idItem = idItem;
    }

    @Column(name = "code", nullable = false, length = 15)
    public String getCode() {
	return this.code;
    }

    public void setCode(String code) {
	this.code = code;
    }

    @Column(name = "name", nullable = false, length = 100)
    public String getName() {
	return this.name;
    }

    public void setName(String name) {
	this.name = name;
    }

    @Column(name = "cost", nullable = false, precision = 8, scale = 8)
    public float getCost() {
	return this.cost;
    }

    public void setCost(float cost) {
	this.cost = cost;
    }

    @Column(name = "price", nullable = false, precision = 8, scale = 8)
    public float getPrice() {
	return this.price;
    }

    public void setPrice(float price) {
	this.price = price;
    }

    @Column(name = "status", nullable = false, length = 1)
    public char getStatus() {
	return this.status;
    }

    public void setStatus(char status) {
	this.status = status;
    }

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "item_by_quotation", schema = "public", joinColumns = { @JoinColumn(name = "id_item", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "id_quotation", nullable = false, updatable = false) })
    public Set<Quotation> getQuotations() {
	return this.quotations;
    }

    public void setQuotations(Set<Quotation> quotations) {
	this.quotations = quotations;
    }

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "item_basic_data", schema = "public", joinColumns = { @JoinColumn(name = "id_item", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "id_basic", nullable = false, updatable = false) })
    public Set<BasicData> getBasicDatas() {
	return this.basicDatas;
    }

    public void setBasicDatas(Set<BasicData> basicDatas) {
	this.basicDatas = basicDatas;
    }

}
