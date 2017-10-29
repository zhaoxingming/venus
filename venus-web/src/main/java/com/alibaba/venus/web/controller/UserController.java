package com.alibaba.venus.web.controller;

import javax.annotation.Resource;

import com.alibaba.venus.model.User;
import com.alibaba.venus.service.UserService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author zhaoxingming on 17/10/24.
 * @version 1.0
 */
@Controller
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping(value="/getUserId",method = RequestMethod.GET)
    @ResponseBody
    public User getUserById(@RequestParam Long id){
        return userService.getUserById(id);
    }
}
