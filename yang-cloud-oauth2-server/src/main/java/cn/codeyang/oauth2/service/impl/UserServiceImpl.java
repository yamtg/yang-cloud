package cn.codeyang.oauth2.service.impl;

import cn.codeyang.mapper.UserDao;
import cn.codeyang.oauth2.service.UserService;
import cn.codeyang.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by yangzhongyang on 17/11/7
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public User findByUsername(String username) {
        return userDao.findByUsername(username);
    }
}
