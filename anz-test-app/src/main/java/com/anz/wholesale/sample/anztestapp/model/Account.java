package com.anz.wholesale.sample.anztestapp.model;

public class Account {

    private int custId;

    private String accountNumber;
    
    private String accountName;
    
    private String accountType;
    
    private String balanceDate;
    
    private String currency;
    
    private String openingBalance;


    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

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

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getBalanceDate() {
        return balanceDate;
    }

    public void setBalanceDate(String balanceDate) {
        this.balanceDate = balanceDate;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getOpeningBalance() {
        return openingBalance;
    }

    public void setOpeningBalance(String openingBalance) {
        this.openingBalance = openingBalance;
    }
    
    @Override
    public String toString() {
	return "Account {custId=" + custId + ", accountNumber=" + accountNumber + ", accountName=" + accountName
		+ ", accountType=" + accountType + ", balanceDate=" + balanceDate + ", currency=" + currency
		+ ", openingBalance=" + openingBalance + "}";
    }
}
