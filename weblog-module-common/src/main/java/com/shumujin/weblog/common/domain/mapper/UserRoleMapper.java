package com.shumujin.weblog.common.domain.mapper;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.shumujin.weblog.common.domain.dos.UserRoleDO;

import java.util.List;

/**
 * @author: Administrator
 * @date: 2024/6/25 00:17
 * @description:
 **/
public interface UserRoleMapper extends BaseMapper<UserRoleDO> {
    /**
     * 根据用户名查询
     *
     * @param userName
     * @return
     */
    default List<UserRoleDO> selectByUserName(String userName) {
        LambdaQueryWrapper<UserRoleDO> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.eq(UserRoleDO::getUsername, userName);
        return selectList(lambdaQueryWrapper);
    }
}
