package cn.codeyang.oauth2.service.impl;

import cn.codeyang.oauth2.service.RoleService;
import cn.codeyang.pojo.Role;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by yangzhongyang on 17/11/13
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class RoleServiceImplTest {

    @Autowired
    private RoleService roleService;

    @Test
    public void findByUser() throws Exception {
        Long userId = 1L;
        List<Role> users = roleService.findByUser(userId);
        System.out.println(users);
    }

}