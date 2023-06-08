package com.example.demo.dao;

import com.example.demo.dao.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
@Mapper
public interface UserEntityMapper {
    /**
     * 查询用户列表
     * @param
     */
    List<UserEntity> queryUserList(UserEntity userEntity);

    /**
     * 创建用户的基本信息
     */
    int insert(UserEntity userEntity);
    /**
     * 根据name删除用户信息
     */
    int deleteUserByName(UserEntity userEntity);

    /* int deleteUserById(UserEntity userEntity);*/

    /**
     * 编辑用户信息
     */
    int updateByPrimaryKeySelective(UserEntity userEntity);

    /**
     * 查询用户
     */
    List<UserEntity> selectUserInfo(UserEntity userEntity);


}
