package cn.codeyang.oauth2.service.impl;

import cn.codeyang.oauth2.service.AuthorityService;
import cn.codeyang.pojo.Authority;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by yangzhongyang on 17/11/12
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class AuthorityServiceImplTest {

    @Autowired
    private AuthorityService authorityService;

    @Test
    public void findByUser() throws Exception {
        List<Authority> authorities = authorityService.findByUser(1L);
        System.out.println(authorities);
    }

}