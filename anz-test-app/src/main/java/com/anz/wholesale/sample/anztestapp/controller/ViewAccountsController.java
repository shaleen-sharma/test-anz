package com.anz.wholesale.sample.anztestapp.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.anz.wholesale.sample.anztestapp.model.Account;
import com.anz.wholesale.sample.anztestapp.service.ViewAccountsService;


@RestController
public class ViewAccountsController {


	@Autowired
	ViewAccountsService viewAccountsService;

	private static final Logger LOGGER = LoggerFactory.getLogger(ViewAccountsController.class);
	
	@RequestMapping(value = "/account/list/{custId}", method = RequestMethod.GET)
	public String getAccountList(@PathVariable("custId") String custId) {
		LOGGER.info("Account list request received for customer Id : " + custId);
		List<Account> acc =  viewAccountsService.getAccountsList(custId);
		return acc.toString();
	}
	
	@RequestMapping(value = "/account/transactions/{accountNumber}", method = RequestMethod.GET)
	public String getAccountTransactions(@PathVariable("accountNumber") String accountNumber) {
	    LOGGER.info("Transaction list request received for accountNumber : " + accountNumber);
	    return viewAccountsService.getAccountTransactions(accountNumber).toString();
	}

}
