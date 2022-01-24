package com.haizhi.westudy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.haizhi.westudy.service.UserService;
import com.haizhi.westudy.utils.ResultUtil;

/**
 * @author xiaoying
 * @create 2022-01-24 下午 4:47
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/login")
    ResultUtil login(String username , String password){
        return userService.login(username , password);
    }

    @PostMapping("/adduser")
    ResultUtil adduser(String username , String password){
        return userService.addUser(username , password);
    }

}
