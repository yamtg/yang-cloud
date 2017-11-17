package cn.codeyang.controller;

import cn.codeyang.client.HelloClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yangzhongyang on 17/11/14
 */
@RestController
public class HelloController {
    @Autowired
    private HelloClient helloClient;

    @RequestMapping("/consumer")
    public String consumer(){
        return helloClient.sayHello();
    }
}
