package org.zjy.blog.controller;

import org.zjy.blog.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.zjy.blog.dto.UserDto;
import org.zjy.blog.entity.Account;
import org.zjy.blog.service.AccountService;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    AccountService accountService;

    @PostMapping("/")
    public int login(@RequestBody User requestUser) {
        System.out.println(requestUser.getUsername());
        String username = requestUser.getUsername();
        String pwd = requestUser.getPassword();
        UserDto userDto = accountService.get(username, pwd);

        if (null == userDto) {
            return 400;
        } else {
            return 200;
        }
    }

}