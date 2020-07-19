package com.eduardoritter.springdi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BillingProcess implements CommandLineRunner{
	
	@Autowired
	private Billing billing;
	
    @Override
    public void run(String... args) {
    	
    	billing.invoice(100.99f, "BRL");
    	billing.invoice(29.50f, "USD");
    	
    }

}
