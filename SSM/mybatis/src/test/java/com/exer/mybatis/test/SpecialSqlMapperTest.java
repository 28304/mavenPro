package com.exer.mybatis.test;

import com.exer.mapper.SpecialSqlMapper;
import com.exer.pojo.User;
import com.exer.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class SpecialSqlMapperTest {
    @Test
    public void testGetUserByLike(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialSqlMapper mapper = sqlSession.getMapper(SpecialSqlMapper.class);
        List<User> list = mapper.getUserByLike("r");
        list.forEach(System.out::println);
        sqlSession.close();
    }

    @Test
    public void testDeleteMoreUser(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialSqlMapper mapper = sqlSession.getMapper(SpecialSqlMapper.class);
        Integer integer = mapper.deleteMoreUser("5,6");
        System.out.println(integer);
        sqlSession.close();
    }

    @Test
    public void testGetUserList(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialSqlMapper mapper = sqlSession.getMapper(SpecialSqlMapper.class);
        List<User> t_user = mapper.getUserList("t_user");
        t_user.forEach(System.out::println);
        sqlSession.close();
    }
    @Test
    public void testInsertUser(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialSqlMapper mapper = sqlSession.getMapper(SpecialSqlMapper.class);
        User user = new User(null,"2","2",2,"男","2");
        Integer integer = mapper.insertUser(user);
        System.out.println(integer);
        System.out.println(user);
        sqlSession.close();
    }
}
