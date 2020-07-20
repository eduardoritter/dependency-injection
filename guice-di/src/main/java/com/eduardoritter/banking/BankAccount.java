package com.eduardoritter.banking;

import com.google.inject.Inject;

public class BankAccount {

    @Inject
    private AccountType accountType;

    public String getAccountType() {
        return accountType.getType();
    }
}
