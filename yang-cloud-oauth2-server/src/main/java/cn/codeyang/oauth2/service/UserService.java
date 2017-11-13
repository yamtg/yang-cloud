package cn.codeyang.oauth2.service;


import cn.codeyang.pojo.User;

import java.util.List;

/**
 * Created by yangzhongyang on 17/11/7
 */
public interface UserService {

    List<User> findAll();
    User findByUsername(String username);
}
