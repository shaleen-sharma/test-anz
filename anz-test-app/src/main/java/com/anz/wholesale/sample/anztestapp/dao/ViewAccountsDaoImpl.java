package com.anz.wholesale.sample.anztestapp.dao;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.anz.wholesale.sample.anztestapp.model.Account;
import com.anz.wholesale.sample.anztestapp.model.Transaction;

@Repository
public class ViewAccountsDaoImpl extends JdbcDaoSupport implements ViewAccountsDao {

    @Autowired
    DataSource dataSource;

    @Autowired
    JdbcTemplate jdbcTemplate;

    @PostConstruct
    private void initialize() {
	setDataSource(dataSource);
    }

    public List<Account> getAccountsById(String id) {

	List<Account> accounts = jdbcTemplate.query("SELECT * FROM account where custId=?", new Object[] { id },
		new BeanPropertyRowMapper(Account.class));
	return accounts;
    }

    public List<Transaction> getTransactionsByAccNum(String accountNumber) {

	List<Transaction> transactions = jdbcTemplate.query("SELECT * FROM transaction where accountNumber=?",
		new Object[] { accountNumber }, new BeanPropertyRowMapper(Transaction.class));
	return transactions;
    }
}
