package org.zjy.blog.service;


import org.zjy.blog.dto.UserDto;
import org.zjy.blog.entity.Account;

public interface AccountService {
    UserDto get(String username, String password);
}
