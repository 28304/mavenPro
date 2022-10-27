package com.exer.mapper;

import com.exer.pojo.User;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface SelectMapper {
    /**
     * 根据id查询一个用户
     * @param id
     * @return
     */
    User getUserById(@Param("id") Integer id);

    /**
     * 查询所有用户信息
     * @return
     */
    List<User> getAllUser();
    /**
     * 查询用户的总数量
     */
    Integer getCount();

    List<Map<String,Object>> getAllUserToMap();
    //注解表示：id作为map的键
    @MapKey("id")
    Map<String,Object> getAllUserToMap2();

}
