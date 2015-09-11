package com.laszloz.apartment;

import java.util.Currency;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Document {

	@Id
	@Column(name = "id")
	private int documentNumber;

	@Column(name = "document_date")
	private Date documentDate;

	@Column(name = "posting_date")
	private Date postingDate;

	@Column(name = "currency")
	private Currency currency;

	@Column(name = "amount")
	private float amount;

	@Column(name = "debit_credit_indicator")
	private char debitCreditIndicator;

	public int getDocumentNumber() {
		return documentNumber;
	}

	public void setDocumentNumber(int documentNumber) {
		this.documentNumber = documentNumber;
	}

	public Date getDocumentDate() {
		return documentDate;
	}

	public void setDocumentDate(Date documentDate) {
		this.documentDate = documentDate;
	}

	public Date getPostingDate() {
		return postingDate;
	}

	public void setPostingDate(Date postingDate) {
		this.postingDate = postingDate;
	}

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public char getDebitCreditIndicator() {
		return debitCreditIndicator;
	}

	public void setDebitCreditIndicator(char debitCreditIndicator) {
		this.debitCreditIndicator = debitCreditIndicator;
	}

}
