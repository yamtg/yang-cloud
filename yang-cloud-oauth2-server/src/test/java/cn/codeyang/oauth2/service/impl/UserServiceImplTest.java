package cn.codeyang.oauth2.service.impl;

import cn.codeyang.oauth2.service.UserService;
import cn.codeyang.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by yangzhongyang on 17/11/11
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class UserServiceImplTest {

    @Autowired
    private UserService userService;


    @Test
    public void findAll() throws Exception {
        List<User> list = userService.findAll();
        System.out.println(list);
    }

    @Test
    public void findByUsername(){
        User zhangsan = userService.findByUsername("zhangsan");
        System.out.println(zhangsan);
    }

}