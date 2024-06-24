package com.shumujin.weblog.common.domain.mapper;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.shumujin.weblog.common.domain.dos.UserDO;

public interface UserMapper extends BaseMapper<UserDO> {

    default UserDO findByUserName(String userName) {
        LambdaQueryWrapper<UserDO> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(UserDO::getUsername, userName);
        return selectOne(wrapper);
    }
}
