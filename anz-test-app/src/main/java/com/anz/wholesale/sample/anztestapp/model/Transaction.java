package com.anz.wholesale.sample.anztestapp.model;

public class Transaction {

    private String accountNumber;

    private String accountName;

    private String valueDate;

    private String currency;

    private String debitAmount;

    private String creditAmount;

    private String debitCredit;

    private String transactionNarrative;

    public String getAccountNumber() {
	return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
	this.accountNumber = accountNumber;
    }

    public String getAccountName() {
	return accountName;
    }

    public void setAccountName(String accountName) {
	this.accountName = accountName;
    }

    public String getValueDate() {
	return valueDate;
    }

    public void setValueDate(String valueDate) {
	this.valueDate = valueDate;
    }

    public String getCurrency() {
	return currency;
    }

    public void setCurrency(String currency) {
	this.currency = currency;
    }

    public String getDebitAmount() {
	return debitAmount;
    }

    public void setDebitAmount(String debitAmount) {
	this.debitAmount = debitAmount;
    }

    public String getCreditAmount() {
	return creditAmount;
    }

    public void setCreditAmount(String creditAmount) {
	this.creditAmount = creditAmount;
    }

    public String getDebitCredit() {
        return debitCredit;
    }

    public void setDebitCredit(String debitCredit) {
        this.debitCredit = debitCredit;
    }

    public String getTransactionNarrative() {
        return transactionNarrative;
    }

    public void setTransactionNarrative(String transactionNarrative) {
        this.transactionNarrative = transactionNarrative;
    }

    @Override
    public String toString() {
	return "Transaction {accountNumber=" + accountNumber + ", accountName=" + accountName + ", valueDate="
		+ valueDate + ", currency=" + currency + ", debitAmount=" + debitAmount + ", creditAmount="
		+ creditAmount + ", debitCredit=" + debitCredit + ", transactionNarrative=" + transactionNarrative
		+ "}";
    }



}
