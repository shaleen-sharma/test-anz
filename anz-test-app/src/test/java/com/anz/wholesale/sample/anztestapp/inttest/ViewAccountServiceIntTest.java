package com.anz.wholesale.sample.anztestapp.inttest;
import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.anz.wholesale.sample.anztestapp.model.Account;
import com.anz.wholesale.sample.anztestapp.model.Transaction;
import com.anz.wholesale.sample.anztestapp.service.ViewAccountsService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ViewAccountServiceIntTest {
    @Autowired
    private ViewAccountsService viewAccountsService;

    @Test
    public void testGetAccountList() {
	List<Account> accountList = viewAccountsService.getAccountsList("1");
	assertThat(accountList).isNotNull().isNotEmpty();
    }
    
    @Test
    public void testGetAccountTransactions() {
	List<Transaction> transactions = viewAccountsService.getAccountTransactions("101010101010");
	assertThat(transactions).isNotNull().isNotEmpty();
    }
}