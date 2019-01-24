package com.anz.wholesale.sample.anztestapp.service;

import java.util.List;

import com.anz.wholesale.sample.anztestapp.model.Account;
import com.anz.wholesale.sample.anztestapp.model.Transaction;

public interface ViewAccountsService {
	
	 public List<Account> getAccountsList(String custId);
	 
	 public List<Transaction> getAccountTransactions(String accountNumber);
	 
}
