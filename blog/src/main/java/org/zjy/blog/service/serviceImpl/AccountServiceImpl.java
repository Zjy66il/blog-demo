package org.zjy.blog.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zjy.blog.entity.Account;
import org.zjy.blog.mapper.AccountMapper;
import org.zjy.blog.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountMapper accountMapper;

    @Override
    public Account get(String username, String password) {
        return accountMapper.selectByPrimaryKey(username);
    }

}
