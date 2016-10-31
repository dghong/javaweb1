package com.gfbwff.module.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Administrator on 2016/9/17 0017.
 */
@Controller
public class regsiter {
    @RequestMapping(value = "/register",method=RequestMethod.GET)
    public String register(){

        return "register/register";
    }

    @RequestMapping(value = "/register/success",method= RequestMethod.GET)
    public String success(){

        return "success";
    }


}
