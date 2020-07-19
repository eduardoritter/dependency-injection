package com.eduardoritter.springdi;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Billing {

	@Autowired
	BeanFactory beans;

	public void invoice(Float amount, String currencyCode) {
		BillingCurrency billingCurrency = beans.getBean(currencyCode, BillingCurrency.class);
		System.out.println(billingCurrency.amount(amount));
	}

}
