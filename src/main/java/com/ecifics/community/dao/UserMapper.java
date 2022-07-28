package com.ecifics.community.dao;

import com.ecifics.community.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.jmx.export.annotation.ManagedOperationParameter;
import org.springframework.stereotype.Repository;

/**
 * @author Ecifics
 * @Description 用户mapper层
 * @date 7/28/2022-9:42 PM
 */
@Mapper
public interface UserMapper {

    /**
     * 根据id查询用户
     * @param id - 用户id
     * @return user - 用户对象
     */
    User selectById(@Param("id") int id);

    /**
     * 根据用户名查询用户
     * @param username - 用户名
     * @return user - 用户
     */
    User selectByName(@Param("username") String username);

    /**
     * 根据邮箱查询用户
     * @param email - 用户邮箱
     * @return user - 用户
     */
    User selectByEmail(@Param("email") String email);

    /**
     * 添加用户
     * @param user - 添加对俩
     * @return 影响行数
     */
    int insertUser(User user);

    /**
     * 更改用户状态
     * @param id - 用户id
     * @param status - 用户状态
     * @return 影响行数
     */
    int updateStatus(@Param("id") int id, @Param("status") int status);

    /**
     * 更换头像
     * @param id - 用户id
     * @param headerUrl - 更换的头像url
     * @return 影响的行数
     */
    int updateHeader(@Param("id") int id, @Param("headerUrl") String headerUrl);

    /**
     * 更新密码
     * @param id - 用户id
     * @param password - 新密码
     * @return 影响行数
     */
    int updatePassword(@Param("id") int id, @Param("password") String password);
}
