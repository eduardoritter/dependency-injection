package com.eduardoritter.banking;

import com.google.inject.AbstractModule;

public class BasicModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(AccountType.class).to(CurrentAccount.class);
    }
}
