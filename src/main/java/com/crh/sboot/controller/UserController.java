package com.crh.sboot.controller;

import com.crh.sboot.common.CommonController;
import com.crh.sboot.common.utils.R;
import com.crh.sboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName UserController
 * @Description 〈用户的控制类〉
 * @Author chaui
 * @CreateDate 2020-02-09 18:06
 * @Version 1.0
 * @ModifyBY
 * @ModifyDate
 */
@RestController
@RequestMapping("/api/user")
public class UserController extends CommonController {
    @Autowired
    private UserService userService;

    /**
     * 获取登录的用户信息
     */
    @GetMapping("/info")
    public R info(){
        return R.ok().put("user", userService.getUser());
    }
    
}
