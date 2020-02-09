package com.crh.sboot.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.crh.sboot.entity.User;
import com.crh.sboot.mapper.UserMapper;
import com.crh.sboot.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @ClassName UserServiceImpl
 * @Description 〈用户服务层实现类〉
 * @Author chaui
 * @CreateDate 2020-02-09 17:48
 * @Version 1.0
 * @ModifyBY
 * @ModifyDate
 */
@Service("userService")
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
   
    @Override
    public User getUser() {
        return baseMapper.queryUser();
    }
}
