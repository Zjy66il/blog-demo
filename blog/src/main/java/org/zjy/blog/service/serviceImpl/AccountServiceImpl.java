package org.zjy.blog.service.serviceImpl;

import org.apache.ibatis.annotations.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zjy.blog.config.CustomMapper;
import org.zjy.blog.dto.UserDto;
import org.zjy.blog.entity.Account;
import org.zjy.blog.entity.AccountExample;
import org.zjy.blog.mapper.AccountMapper;
import org.zjy.blog.service.AccountService;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountMapper accountMapper;

    @Override
    public UserDto get(String username, String password) {
        AccountExample example = new AccountExample();
        AccountExample.Criteria criteria= example.createCriteria();
        criteria.andUserEqualTo(username);
        criteria.andPwdEqualTo(password);
        List<Account> account = accountMapper.selectByExample(example);
        if(!account.isEmpty()){
            UserDto userDto = Mappers.getMapper(CustomMapper.class).convert(account.get(0));
            return userDto;
        }
        return null;
    }

}
