package com.lixiaopeng.toolbox.service.impl;

import com.lixiaopeng.toolbox.entity.User;
import com.lixiaopeng.toolbox.mapper.UserMapper;
import com.lixiaopeng.toolbox.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户账号表 服务实现类
 * </p>
 *
 * @author lixiaopeng
 * @since 2022-09-28
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
