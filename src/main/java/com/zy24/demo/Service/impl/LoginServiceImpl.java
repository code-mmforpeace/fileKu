package com.zy24.demo.Service.impl;

import com.zy24.demo.Dto.AccountDto;
import com.zy24.demo.Enum.LoginEnum;
import com.zy24.demo.Mapper.LoginMapper;
import com.zy24.demo.Service.LoginService;
import com.zy24.demo.domain.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginMapper loginMapper;


    @Override
    public AccountDto login(String username, String password) {
        AccountDto accountDto = new AccountDto();
        Account login = loginMapper.login(username, password);
        if(login.getCode() == LoginEnum.ROOT_ACCOUNT.getCode()){
            accountDto.setId(login.getId());
            accountDto.setUserName(login.getLoginName());
            accountDto.setState(login.getState());
        }else {
            accountDto.setState(LoginEnum.ILLEGAL_ACCOUNT.getMesage());
        }
        return accountDto;
    }
}
