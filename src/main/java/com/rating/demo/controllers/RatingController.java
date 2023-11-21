package com.rating.demo.controllers;

import com.rating.demo.beans.Account;
import com.rating.demo.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/account")
public class RatingController
{
    AccountService accountService;
    @Autowired
    public RatingController(AccountService accountService)
    {
        this.accountService = accountService;
    }

    @PostMapping()
    public ResponseEntity<Account> createAccount(@RequestBody Account account)
    {
        return ResponseEntity.ok().body(accountService.createAccount(account));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Account> getAccount(@PathVariable(value = "id") Long accountId)
    {
        Optional<Account> maybeAccount = accountService.getAccount(accountId);
        if (maybeAccount.isEmpty())
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok().body(maybeAccount.get());
    }
}
