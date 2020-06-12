package com.zy24.demo.Service;

import com.zy24.demo.DemoApplicationTests;
import com.zy24.demo.Dto.AccountDto;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class LoginServiceTest extends DemoApplicationTests {

    @Autowired
    private LoginService loginService;

    @Test
    public void testDataBase(){
        AccountDto login = loginService.login("root", "root");
        System.out.println(login.getState());
    }

}
