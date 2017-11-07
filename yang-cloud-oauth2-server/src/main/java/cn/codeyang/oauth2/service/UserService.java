package cn.codeyang.oauth2.service;

import cn.codeyang.oauth2.domain.User;

import java.util.List;

/**
 * Created by yangzhongyang on 17/11/7
 */
public interface UserService {
    void removeUser(Long id);

    List<User> listUsers();
}
