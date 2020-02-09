package com.crh.sboot.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.crh.sboot.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
    User queryUser();
}
