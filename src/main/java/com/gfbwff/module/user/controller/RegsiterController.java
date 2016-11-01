package com.gfbwff.module.user.controller;

import com.gfbwff.module.user.pojo.User;
import com.gfbwff.module.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by Administrator on 2016/9/17 0017.
 */
@Controller
@RequestMapping("/register")
public class RegsiterController {

    @Autowired
    private UserService userService;

    @RequestMapping("/register")
    public String register(){

        return "register/register";
    }

    @RequestMapping(value = "/success",method= RequestMethod.POST)
    public String success(Model model,User user){
        List<User> userList = userService.selectAll();
        if(user.getUsercollege().equals("请选择学院")){
            model.addAttribute("message","请选择学院");
            return "register/register";
        }
        if(user.getUsername() == "" || user.getUsername() == null || user.getUserpassword() == "" || user.getUserpassword() == null){
            model.addAttribute("message","用户名或密码不能为空");
            return "register/register";
        }
        userService.insert(user);
        return "register/success";
    }


}
