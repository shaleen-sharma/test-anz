package com.anz.wholesale.sample.anztestapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anz.wholesale.sample.anztestapp.dao.ViewAccountsDao;
import com.anz.wholesale.sample.anztestapp.model.Account;
import com.anz.wholesale.sample.anztestapp.model.Transaction;

@Service
public class ViewAccountsServiceImpl implements ViewAccountsService {

    @Autowired
    ViewAccountsDao viewAccountsDao;
    
    @Override
    public List<Account> getAccountsList(String custId) {
	return viewAccountsDao.getAccountsById(custId);
    }

    @Override
    public List<Transaction> getAccountTransactions(String accountNumber) {
	return viewAccountsDao.getTransactionsByAccNum(accountNumber);
    }

}
