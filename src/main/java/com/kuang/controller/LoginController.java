package com.kuang.controller;

import com.kuang.config.ResponseResult;
import com.kuang.entity.User;
import com.kuang.service.LoginService;
import com.kuang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping("/user/login")
    public String login(@RequestBody User user){
        ResponseResult result = loginService.login(user);
        if(result.getCode() ==200)
        {
            return "redirect:/main";
        }else{
            return "index";
        }
    }

    @RequestMapping("/hello")
    public String terst()
    {
        return "success";
    }



}
