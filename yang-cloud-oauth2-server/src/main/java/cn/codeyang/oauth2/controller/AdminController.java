package cn.codeyang.oauth2.controller;

import cn.codeyang.oauth2.service.UserService;
import cn.codeyang.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by yangzhongyang on 17/11/7
 */
@RestController
@RequestMapping("/admins")
public class AdminController {

    @Autowired
    private UserService userService;

    /**
     * 查询所用用户
     * @return
     */
    @GetMapping
    public ModelAndView list(Model model) {

        List<User> list = userService.findAll();// 当前所在页面数据列表

        model.addAttribute("title", "管理员管理");
        model.addAttribute("userList", list);
        return new ModelAndView("users/list", "userModel", model);
    }
}
