package com.lixiaopeng.toolbox.controller;


import com.lixiaopeng.toolbox.service.IPasswordService;
import com.lixiaopeng.toolbox.service.IPastPasswordService;
import com.lixiaopeng.toolbox.service.IUserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * toolbox 前端控制器
 * </p>
 *
 * @author lixiaopeng
 * @since 2022-09-28
 */
@RestController
@RequestMapping("/toolbox")
public class ToolBoxController {

    private IUserService userService;
    private IPasswordService passwordService;
    private IPastPasswordService pastPasswordService;



}
