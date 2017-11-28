package com.company.service.impl;

import com.company.dao.idao.UserMapper;
import com.company.dao.pojo.User;
import com.company.service.iservice.UserService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by Whisper on 2017/11/28 0028.
 */
public class UserServiceImplTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testSelectByPrimaryKey() throws Exception {
        UserService userService = (UserService) new ClassPathXmlApplicationContext("applicationContext.xml").getBean("userService");
        System.out.println(userService.selectByPrimaryKey(1));
    }
}