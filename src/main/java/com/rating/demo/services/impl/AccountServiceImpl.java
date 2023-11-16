package com.rating.demo.services.impl;

import com.rating.demo.beans.Account;
import com.rating.demo.services.AccountService;
import com.rating.demo.repositories.AccountRepository;

public class AccountServiceImpl implements AccountService
{
    AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository)
    {
        this.accountRepository = accountRepository;
    }

    public Account createAuthor(Account author)
    {
        return accountRepository.save(author);
    }

    public Account updateAccount(Long id, Account account)
    {
        Account update = accountRepository.findById(id).get();
        update.setStudentId(account.getStudentId());
        update.setEmail(account.getEmail());
        update.setFullname(account.getFullname());
        update.setUsername(account.getUsername());
        update.setPassword(account.getPassword());
        return accountRepository.save(update);
    }

    public void deleteAccount(Long id)
    {
        Account delete = accountRepository.findById(id).get();
        accountRepository.delete(delete);
    }
}
