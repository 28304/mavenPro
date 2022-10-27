package com.exer.jdbctemplate.tx;

import com.exer.controller.BookController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-jdbc.xml")
public class TxTest {
    @Autowired
    private BookController bookController;
    @Test
    public void test1(){
        bookController.buyBook(1,1);
    }
}
