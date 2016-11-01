package com.gfbwff.module.user.controller;

import com.gfbwff.module.user.pojo.User;
import com.gfbwff.module.user.service.UserService;
import com.gfbwff.module.user.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by gfbaiwff on 2016/10/27.
 */

@Controller
@RequestMapping("/login")
public class loginController {

    @Autowired
    private UserService userService;

    @RequestMapping("/index")
    public String index(){

        return "login/login";
    }

    @RequestMapping("/showUserToJspById/{userId}")
    public String showUser(Model model,@PathVariable("userId") Long userId){
        User user = this.userService.selectByPrimaryKey(userId);
        model.addAttribute("user", user);
        return "showUser";
    }

    @RequestMapping("/login")
    public String login(User user,Model model){
        List<User> userList = userService.selectAll();
        if(user.getUsername() == "" || user.getUsername() == null){
            model.addAttribute("message","用户名不能为空");
            return "login/login";
        }
        if(user.getUserpassword() == "" || user.getUserpassword() == null){
            model.addAttribute("message","密码不能为空");
            return "login/login";
        }
        for (User users : userList){
            if(user.getUsername().equals(users.getUsername()) && user.getUserpassword().equals(users.getUserpassword())){
                model.addAttribute("username",user.getUsername());
                return "showUser";
            }
        }
        return "login/login";
    }
}
