package cn.codeyang.oauth2.controller;


import cn.codeyang.oauth2.service.UserService;
import cn.codeyang.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.security.Principal;
import java.util.List;

/**
 * Created by yangzhongyang on 17/11/7
 */
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public ModelAndView list(Model model) {

        List<User> list = userService.findAll();
        model.addAttribute("title", "用户管理");
        model.addAttribute("userList", list);
        return new ModelAndView("users/list", "userModel", model);
    }


    @GetMapping("/me")
    public Principal me(Principal principal){
        return principal;
    }
}
