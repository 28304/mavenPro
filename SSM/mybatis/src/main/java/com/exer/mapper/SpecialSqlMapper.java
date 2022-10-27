package com.exer.mapper;

import com.exer.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SpecialSqlMapper {
    /**
     * sql语句模糊查询
     * @param name
     * @return
     */
    List<User> getUserByLike(@Param("name") String name);
    /**
     * 根据id批量删除
     */
    Integer deleteMoreUser(@Param("ids") String ids);
    /**
     *
     * 动态设置表名
     */
    List<User> getUserList(@Param("tableName") String tableName);
    /**
     * 在添加时获取自增的主键
     */
    Integer insertUser(User user);
}
