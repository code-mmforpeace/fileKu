package com.zy24.demo.Mapper;

import com.zy24.demo.DemoApplicationTests;
import com.zy24.demo.Mapper.LoginMapper;
import com.zy24.demo.domain.Account;
import com.zy24.demo.domain.File;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MapperTest extends DemoApplicationTests {

    @Autowired
    private LoginMapper loginMapper;

    @Autowired
    private FileMapper fileMapper;

    @Test
    public void testDatabase(){
        Account login = loginMapper.login("root", "root");
        System.out.println(login.getState());
        System.out.println(login.getCode());
    }

    @Test
    public void testGetFile(){
//        Integer integer = fileMapper.queryFilesCount();
//        List<File> allFiles = fileMapper.findAllFiles(0, 5);
        File file = new File();
        file.setFileName("测试|1");
        List<File> files = fileMapper.selectRelated(file);
        System.out.println(files.size());
        //System.out.println(allFiles.get(0).getId());
        //System.out.println(integer);
    }

}
