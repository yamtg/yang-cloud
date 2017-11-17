package cn.codeyang.cms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yangzhongyang on 17/11/14
 */
@RestController
public class MainController {
    @GetMapping("/")
    public String hello(){
        return "hello";
    }
}
