package com.lixiaopeng.toolbox.service.impl;

import com.lixiaopeng.toolbox.entity.Password;
import com.lixiaopeng.toolbox.mapper.PasswordMapper;
import com.lixiaopeng.toolbox.service.IPasswordService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 密码信息记录表 服务实现类
 * </p>
 *
 * @author lixiaopeng
 * @since 2022-09-28
 */
@Service
public class PasswordServiceImpl extends ServiceImpl<PasswordMapper, Password> implements IPasswordService {

}
