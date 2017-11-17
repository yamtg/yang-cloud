package cn.codeyang.service;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by yangzhongyang on 17/11/14
 */
@RequestMapping("/hello")
public interface HelloService {
    @RequestMapping("/sayHello")
    String sayHello();
}
