package cn.codeyang.oauth2.controller;


import cn.codeyang.oauth2.domain.User;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yangzhongyang on 17/11/7
 */
@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping
    public ModelAndView list(Model model) {

        List<User> list = new ArrayList<>();	// 当前所在页面数据列表
        list.add(new User(1L, "waylau", 30));
        list.add(new User(2L,"老卫", 29));
        model.addAttribute("title", "用户管理");
        model.addAttribute("userList", list);
        return new ModelAndView("users/list", "userModel", model);
    }
}
