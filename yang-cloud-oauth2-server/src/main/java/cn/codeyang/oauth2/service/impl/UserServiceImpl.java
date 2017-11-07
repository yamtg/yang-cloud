package cn.codeyang.oauth2.service.impl;

import cn.codeyang.oauth2.domain.User;
import cn.codeyang.oauth2.service.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by yangzhongyang on 17/11/7
 */
@Service
public class UserServiceImpl implements UserService {

    private static final Map<Long, User> userRepository = new ConcurrentHashMap<>();

    public UserServiceImpl() {
        userRepository.put(1L, new User(1L, "waylau", 30));
        userRepository.put(2L, new User(2L,"老卫", 29));
        userRepository.put(3L, new User(3L,"doufe", 109));
    }

    @Override
    public void removeUser(Long id) {
        userRepository.remove(id);
    }

    @Override
    public List<User> listUsers() {
        List<User> users = null;
        users = new ArrayList<User>(userRepository.values());
        return users;
    }
}
