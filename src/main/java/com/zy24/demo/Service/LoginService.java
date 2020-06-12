package com.zy24.demo.Service;

import com.zy24.demo.Dto.AccountDto;

public interface LoginService {

    AccountDto login(String username,String password);

}
