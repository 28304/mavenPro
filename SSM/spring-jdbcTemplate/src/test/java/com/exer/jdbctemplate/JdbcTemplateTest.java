package com.exer.jdbctemplate;

import com.exer.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

//指定当前测试类在spring的测设环境中执行，此时可以通过注入的方式直接获取ioc中的bean
@RunWith(SpringJUnit4ClassRunner.class)
//设置spring测设环境的配置文件
@ContextConfiguration("classpath:spring-jdbc.xml")
public class JdbcTemplateTest {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Test
    public void testInsert(){
        String sql="insert into t_user values(null,?,?,?,?,?)";
        int update = jdbcTemplate.update(sql, "akhd", "123456", 123, "男", "123@123");
        System.out.println(update);
    }
    @Test
    public void testSelect(){
        String sql="select * from t_user where id = ?";
        User user = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(User.class), 1);
        System.out.println(user);
    }
    @Test
    public void testSelectAll(){
        String sql="select * from t_user";
        List<User> query = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(User.class));
        query.forEach(System.out::println);
    }
    @Test
    public void testSelectCount(){
        String sql="select count(*) from t_user";
        Integer count = jdbcTemplate.queryForObject(sql, Integer.class);
        System.out.println(count);
    }
}
