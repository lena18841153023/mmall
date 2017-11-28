package com.company.service.impl;

import com.company.dao.idao.UserMapper;
import com.company.dao.pojo.User;
import com.company.service.iservice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Created by Whisper on 2017/11/28 0028.
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    @Qualifier("userMapper")
    private UserMapper userMapper;
    @Override
    public User selectByPrimaryKey(Integer id) {
        System.out.println(id  + "=========");
        return userMapper.selectByPrimaryKey(id);
    }
}
