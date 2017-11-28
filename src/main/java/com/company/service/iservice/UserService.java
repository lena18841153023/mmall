package com.company.service.iservice;

import com.company.dao.pojo.User;

/**
 * Created by Whisper on 2017/11/28 0028.
 */
public interface UserService {
    User selectByPrimaryKey(Integer id) ;
}
