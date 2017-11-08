package cn.codeyang.oauth2.controller;


import cn.codeyang.oauth2.domain.User;
import cn.codeyang.oauth2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.security.Principal;
import java.util.ArrayList;
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

        List<User> list = userService.listUsers();
        model.addAttribute("title", "用户管理");
        model.addAttribute("userList", list);
        return new ModelAndView("users/list", "userModel", model);
    }


    @PreAuthorize("hasAuthority('ROLE_USER')")
    @GetMapping(value = "/delete/{id}")
    public ModelAndView delete(@PathVariable("id") Long id, Model model){
        userService.removeUser(id);
        model.addAttribute("userList", userService.listUsers());
        model.addAttribute("title", "删除用户");
        return new ModelAndView("users/list", "userModel", model);
    }

    @GetMapping("/me")
    public Principal me(Principal principal){
        return principal;
    }
}
