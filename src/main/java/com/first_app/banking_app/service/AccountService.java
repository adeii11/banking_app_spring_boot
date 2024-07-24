package com.first_app.banking_app.service;

import com.first_app.banking_app.Dto.AccountDto;
import com.first_app.banking_app.entity.Account;

import java.util.List;

public interface AccountService {
    AccountDto createAccount(AccountDto accountDto);
    AccountDto getAccountById(Long id);
    AccountDto deposit(Long id,double amount);
    AccountDto withdraw(Long id,double amount);
    List<AccountDto> getAllAccounts();
    void deleteAccount(long id);
}
