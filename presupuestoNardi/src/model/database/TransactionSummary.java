package model.database;

// Generated 20-jun-2014 9:51:18 by Hibernate Tools 4.0.0

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

/**
 * TransactionSummary generated by hbm2java
 */
@Entity
@Table(name = "transaction_summary", schema = "public")
public class TransactionSummary implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -928787630417377608L;
	private int idTransactionSummary;
	private Quotation quotation;
	private String paymentTerms;
	private String barterTerms;
	private String notes;
	private char status;

	public TransactionSummary() {
	}

	public TransactionSummary(int idTransactionSummary, Quotation quotation, char status) {
		this.idTransactionSummary = idTransactionSummary;
		this.quotation = quotation;
		this.status = status;
	}

	public TransactionSummary(int idTransactionSummary, Quotation quotation, String paymentTerms, String barterTerms, String notes, char status) {
		this.idTransactionSummary = idTransactionSummary;
		this.quotation = quotation;
		this.paymentTerms = paymentTerms;
		this.barterTerms = barterTerms;
		this.notes = notes;
		this.status = status;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "id_transaction_summary_seq")
	@SequenceGenerator(name = "id_transaction_summary_seq", sequenceName = "transaction_summary_id_transaction_summary_seq")
	@Column(name = "id_transaction_summary", unique = true, nullable = false)
	public int getIdTransactionSummary() {
		return this.idTransactionSummary;
	}

	public void setIdTransactionSummary(int idTransactionSummary) {
		this.idTransactionSummary = idTransactionSummary;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_quotation", nullable = false)
	public Quotation getQuotation() {
		return this.quotation;
	}

	public void setQuotation(Quotation quotation) {
		this.quotation = quotation;
	}

	@Column(name = "payment_terms", length = 1500)
	public String getPaymentTerms() {
		return this.paymentTerms;
	}

	public void setPaymentTerms(String paymentTerms) {
		this.paymentTerms = paymentTerms;
	}

	@Column(name = "barter_terms", length = 1500)
	public String getBarterTerms() {
		return this.barterTerms;
	}

	public void setBarterTerms(String barterTerms) {
		this.barterTerms = barterTerms;
	}

	@Column(name = "notes", length = 2000)
	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	@Column(name = "status", nullable = false, length = 1)
	public char getStatus() {
		return this.status;
	}

	public void setStatus(char status) {
		this.status = status;
	}

}
