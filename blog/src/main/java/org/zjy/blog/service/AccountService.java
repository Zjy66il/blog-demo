package org.zjy.blog.service;


import org.zjy.blog.entity.Account;

public interface AccountService {
    Account get(String username, String password);
}
