package com.anz.wholesale.sample.anztestapp.inttest;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.web.context.WebApplicationContext;

import com.anz.wholesale.sample.anztestapp.controller.ViewAccountsController;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ViewAccountControllerIntTest {
    // @Autowired
    MockMvc mockMvc;
    
    @Autowired
    protected WebApplicationContext wac;
    
    @Autowired
    ViewAccountsController viewAccountsController;
    
    @Before
    public void setup() throws Exception {
        this.mockMvc = standaloneSetup(this.viewAccountsController).build();// Standalone context
    }
    @Test
    public void testGetAccountList() throws Exception {
	 MvcResult mvcResult = mockMvc.perform(get("/account/list").contentType(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk()).andReturn();
	 String result = mvcResult.getResponse().getContentAsString();
	 assertThat(result, containsString("accountNumber=101010101010"));
    }
    
    @Test
    public void testGetAccountTransactions() throws Exception {
	 MvcResult mvcResult = mockMvc.perform(get("/account/transactions/101010101010").contentType(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk()).andReturn();
	 String result = mvcResult.getResponse().getContentAsString();
	 assertThat(result, containsString("accountNumber=101010101010"));
    }
}