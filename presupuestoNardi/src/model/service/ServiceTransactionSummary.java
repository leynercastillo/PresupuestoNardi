package model.service;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import model.dao.DaoTransactionSummary;
import model.database.Quotation;
import model.database.TransactionSummary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Entity
@Service
public class ServiceTransactionSummary {

	@ManyToOne
	@Autowired
	private DaoTransactionSummary daoTransactionSummary;

	@Transactional
	public Boolean save(TransactionSummary transactionSummary) {
		if (transactionSummary.getIdTransactionSummary() == 0)
			return daoTransactionSummary.save(transactionSummary);
		else
			return daoTransactionSummary.update(transactionSummary);
	}

	@Transactional(readOnly = true)
	public TransactionSummary findByQuotation(Quotation quotation) {
		return daoTransactionSummary.findByField("quotation", quotation);
	}
}