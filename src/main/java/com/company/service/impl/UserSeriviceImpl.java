package com.company.service.impl;

import com.company.common.ServerResponse;
import com.company.dao.idao.UserMapper;
import com.company.dao.pojo.User;
import com.company.service.iservice.UserService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Administrator on 2017/11/29.
 */
@Service("userservice")
public class UserSeriviceImpl  implements UserService{
    @Autowired
    private UserMapper userMapper;

    @Transactional(readOnly = true)
    @Override
    public ServerResponse<User> login(String username, String password) {
        int resulCount=userMapper.checkUsername(username);
        if(resulCount==0){
            return ServerResponse.createErrorMessageResponse("用户名不存在！");
        }
        User user=userMapper.login(username,password);
        if(user==null){
            return ServerResponse.createErrorMessageResponse("密码不正确");
        }
        user.setPassword(StringUtils.EMPTY);

       return  ServerResponse.createSuccessMessageResponse("登录成功！");
    }
}
