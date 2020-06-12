package com.zy24.demo.Mapper;

import com.zy24.demo.domain.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface LoginMapper {

    Account login(@Param("loginName") String loginName,@Param("password") String password);

}
