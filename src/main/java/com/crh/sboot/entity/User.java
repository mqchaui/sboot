package com.crh.sboot.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * @ClassName User
 * @Description 〈用户实体类〉
 * @Author chaui
 * @CreateDate 2020-02-09 17:25
 * @Version 1.0
 * @ModifyBY
 * @ModifyDate
 */
@Data
@TableName("tb_user")
public class User {
    private static final long serialVersionUID = 1L;

    /**
     * 用户ID
     */
    @TableId
    private Long userId;
    /**
     * 用户名
     */
    private String username;
    /**
     * 手机号
     */
    private String mobile;
    /**
     * 密码
     */
    private String password;
    /**
     * 创建时间
     */
    private Date createTime;
}
