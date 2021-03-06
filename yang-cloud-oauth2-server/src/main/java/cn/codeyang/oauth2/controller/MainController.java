package cn.codeyang.oauth2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;

/**
 * Created by yangzhongyang on 17/11/7
 */
@Controller
public class MainController {

    @GetMapping("/")
    public String root(){
        //return "redirect:/index";
        return "index";
    }

    @GetMapping("/index")
    public String index(){
        return "index";
    }

    @GetMapping("/login")
    public String login(HttpServletRequest request){
        return "login";
    }

    @GetMapping("/login-error")
    public String loginError(Model model) {
        model.addAttribute("loginError", true);
        model.addAttribute("errorMsg", "登陆失败，用户名或者密码错误！");
        return "login";
    }

    @GetMapping("/403")
    public String accesssDenied() {
        return "403";
    }


}
