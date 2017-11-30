package com.company.service.iservice;

import com.company.common.ServerResponse;
import com.company.dao.idao.UserMapper;
import com.company.dao.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/11/29.
 */

public interface UserService {

    //登录
    ServerResponse<User> login(String username,String password);


}
