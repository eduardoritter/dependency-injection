package com.eduardoritter;

import com.eduardoritter.banking.BankAccount;
import com.eduardoritter.banking.BasicModule;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class RunGuice {

    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new BasicModule());
        BankAccount bankAccount = injector.getInstance(BankAccount.class);

        System.out.println(bankAccount.getAccountType());

    }
}
