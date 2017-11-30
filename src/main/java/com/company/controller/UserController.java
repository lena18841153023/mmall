package com.company.controller;

import com.company.common.Const;
import com.company.common.ServerResponse;
import com.company.dao.pojo.User;
import com.company.service.iservice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * Created by Administrator on 2017/11/29.
 */
@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userservice;

    //登录
    @RequestMapping(value = "login.do",method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<User> login(String username, String password, HttpSession session){
       ServerResponse<User> responseResult=userservice.login(username,password);
        if(responseResult.isSuccess()){
            session.setAttribute(Const.CURRENT_USER,responseResult.getData());
       }
        return responseResult;
    }

}
