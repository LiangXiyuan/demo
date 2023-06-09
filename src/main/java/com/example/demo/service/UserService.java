package com.example.demo.service;

import com.example.demo.common.utils.UUIDUtil;
import com.example.demo.dao.entity.UserEntity;
import com.example.demo.dao.UserEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("userService")
public class UserService {
    @Autowired
    private UserEntityMapper userEntityMapper;

    /**
     * 登录
     */
    public List<UserEntity> selectUserInfo(UserEntity userEntity){
        System.out.println(222);
        List<UserEntity> result=userEntityMapper.selectUserInfo(userEntity);
        return result;
    }

    /**
     * 查询用户列表
     */
    public List<UserEntity> queryUserList(UserEntity userEntity){
        List<UserEntity> result=userEntityMapper.queryUserList(userEntity);
        return result;
    }

    /**
     * 创建用户
     */
    public int addUserInfo(UserEntity userEntity){
        userEntity.setId(UUIDUtil.getOneUUID());
        int userResult=userEntityMapper.insert(userEntity);
        if(userResult!=0){
            return 3;//数字3代表用户存在
        }else {
            return userResult;
        }
    }

    /**
     * 修改用户信息
     */
    public  int modifyUserInfo(UserEntity userEntity){
        int userResult=userEntityMapper.updateByPrimaryKeySelective(userEntity);
        //查询用户是否存在
        return userResult;
    }

    /**
     * 删除用户信息(By Name)
     */
    public int deleteUserByName(UserEntity userEntity){
        int userResult = userEntityMapper.deleteUserByName(userEntity);
        //查询用户是否存在
        return userResult;

    }

    /*public int deleteUserById(UserEntity userEntity){
        int userResult = userEntityMapper.deleteUserById(userEntity);
        //查询用户是否存在
        return userResult;

    }*/
}

