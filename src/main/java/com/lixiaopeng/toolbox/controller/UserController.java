package com.lixiaopeng.toolbox.controller;


import com.lixiaopeng.toolbox.common.RespResult;
import com.lixiaopeng.toolbox.entity.User;
import com.lixiaopeng.toolbox.service.IUserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 用户账号表 前端控制器
 * </p>
 *
 * @author lixiaopeng
 * @since 2022-09-28
 */
@RestController
@RequestMapping("/user")
public class UserController {

    private IUserService userService;

    @PostMapping("login")
    public RespResult userLogin(User user){

        return null;
    }

}
