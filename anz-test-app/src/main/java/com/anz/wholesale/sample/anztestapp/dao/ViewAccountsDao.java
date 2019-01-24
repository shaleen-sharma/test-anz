package com.anz.wholesale.sample.anztestapp.dao;

import java.util.List;

import com.anz.wholesale.sample.anztestapp.model.Account;
import com.anz.wholesale.sample.anztestapp.model.Transaction;

public interface ViewAccountsDao {

	 public List<Account> getAccountsById(String custId) ;
	 
	 public List<Transaction> getTransactionsByAccNum(String accountNumber);
}
