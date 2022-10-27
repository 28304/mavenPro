package com.exer.mapper;

import com.exer.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    /**
     * 添加用户信息
     * @return
     */
//    Integer insertUser();

    /**
     * 修改用户信息
     */
    void updateUser();
    /**
     * 删除用户信息
     */
    Integer deleteUser();

    /**
     * 根据id查询用户信息
     * @return
     */
    User getUserById();
    /**
     * 查询所有用户信息
     */
    List<User> getAllUser();

    /**
     * 根据用户名查询信息
     */
    User getUserByUsername(String username);
    /**
     * 验证登录
     */
    User checkLogin(String username,String password);
    User checkLoginByMap(Map<String,Object> map);
    User checkLoginByParam(@Param("username") String username,@Param("password") String password);
    int insertUser(User user);
}
