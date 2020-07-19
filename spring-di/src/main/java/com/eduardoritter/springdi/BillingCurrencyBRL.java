package com.eduardoritter.springdi;

import org.springframework.stereotype.Component;

@Component("BRL")
public class BillingCurrencyBRL implements BillingCurrency{
	
	@Override
	public String amount(Float amount) {
		return "BRL " + amount.toString();
	}

}
