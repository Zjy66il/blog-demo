package org.zjy.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.zjy.blog.entity.Account;
import org.zjy.blog.service.AccountService;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    AccountService accountService;

    @PostMapping("/")
    public int login(@RequestBody Account requestUser) {
        String username = requestUser.getUser();
        Account account = accountService.get(username, requestUser.getPwd());

        if (null == account) {
            return 400;
        } else {
            return 200;
        }
    }

}