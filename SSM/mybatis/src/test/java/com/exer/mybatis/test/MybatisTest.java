package com.exer.mybatis.test;

import com.exer.mapper.UserMapper;
import com.exer.pojo.User;
import com.exer.util.SqlSessionUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MybatisTest {
//    @Test
//    public void testInsert() throws IOException {
//        //获取核心配置的输入流
//        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
//        //获取一个能执行sql语句的对象
//        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
//        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
//        //获取sql会话对象SqlSession，是mybatis提供的操作数据库的对象
//        SqlSession sqlSession = sqlSessionFactory.openSession();
//        //获取UserMapper的代理实现类对象
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        Integer ret = mapper.insertUser();
//        System.out.println(ret);
////        sqlSession.commit();
//        sqlSession.close();
//    }
    @Test
    public void testSqlSession(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.updateUser();
        sqlSession.close();
    }
    @Test
    public void deleteTest(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Integer integer = mapper.deleteUser();
        sqlSession.close();
        System.out.println(integer);
    }
    @Test
    public void testGetUserById(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserById();
        sqlSession.close();
        System.out.println(user);
    }
    @Test
    public void testGetAllUser(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> allUser = mapper.getAllUser();
        allUser.forEach(System.out::println);
        sqlSession.close();
    }
    @Test
    public void testGetUserByUsername(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User root = mapper.getUserByUsername("root");
        System.out.println(root);
        sqlSession.close();
    }

    @Test
    public void testCheckLogin(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User root = mapper.checkLogin("root", "123456789");
        System.out.println(root);
        sqlSession.close();
    }
    @Test
    public void testCheckLoginByMap(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map<String,Object> map = new HashMap<>();
        map.put("username","root");
        map.put("password","123456789");
//        System.out.println(map);
        User root = mapper.checkLoginByMap(map);
        System.out.println(root);
        sqlSession.close();
    }
    @Test
    public void testInsertUser(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User(null,"username","password",10,"男","123@123");
        int i = mapper.insertUser(user);
        System.out.println(i);
    }
    @Test
    public void testCheckLoginByParam(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        User user = new User(null,"username","password",10,"男","123@123");
        User user = mapper.checkLoginByParam("username", "password");
        System.out.println(user);
    }
}
