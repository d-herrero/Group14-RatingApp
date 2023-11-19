package com.rating.demo.controllers;

import com.rating.demo.beans.Account;
import com.rating.demo.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/rating")
public class RatingController
{
    private final AccountService accountService;
    @Autowired
    public RatingController(AccountService accountService)
    {
        this.accountService = accountService;
    }

    @PostMapping("/account")
    public ResponseEntity<Account> createAccount(@RequestBody Account account)
    {
        return ResponseEntity.ok().body(accountService.createAuthor(account));
    }

}
