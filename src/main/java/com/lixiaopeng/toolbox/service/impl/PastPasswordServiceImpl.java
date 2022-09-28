package com.lixiaopeng.toolbox.service.impl;

import com.lixiaopeng.toolbox.entity.PastPassword;
import com.lixiaopeng.toolbox.mapper.PastPasswordMapper;
import com.lixiaopeng.toolbox.service.IPastPasswordService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 以往的密码记录表 服务实现类
 * </p>
 *
 * @author lixiaopeng
 * @since 2022-09-28
 */
@Service
public class PastPasswordServiceImpl extends ServiceImpl<PastPasswordMapper, PastPassword> implements IPastPasswordService {

}
