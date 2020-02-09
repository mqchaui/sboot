package com.crh.sboot.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.crh.sboot.entity.User;

/**
 * @ClassName UserService
 * @Description 〈用户服务层接口〉
 * @Author chaui
 * @CreateDate 2020-02-09 17:35
 * @Version 1.0
 * @ModifyBY
 * @ModifyDate
 */
public interface  UserService extends IService<User> {

    User getUser();
    
}
