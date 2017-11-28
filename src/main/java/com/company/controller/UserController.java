package com.company.controller;

import com.company.dao.pojo.User;
import com.company.service.iservice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Whisper on 2017/11/28 0028.
 */
@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping(value = "find.do", method = RequestMethod.GET)
    @ResponseBody
    public User findById(Integer id){
        System.out.println(id + "========");
        return userService.selectByPrimaryKey(id);
    }
}
