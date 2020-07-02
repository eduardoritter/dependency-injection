package com.eduardoritter.springdi;

import org.springframework.stereotype.Component;

@Component("USD")
public class BillingCurrencyUSD implements BillingCurrency {

	@Override
	public String amount(Float amount) {
		return "USD " + amount.toString();
	}
}
