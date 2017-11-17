package cn.codeyang.controller;

import cn.codeyang.service.HelloService;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yangzhongyang on 17/11/14
 */
@RestController
public class HelloController implements HelloService{

    @Override
    public String sayHello() {
        return "hello";
    }
}
