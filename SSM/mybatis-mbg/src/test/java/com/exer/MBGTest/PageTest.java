package com.exer.MBGTest;

import com.exer.mapper.EmpMapper;
import com.exer.pojo.Emp;
import com.exer.utils.SqlSessionUtil;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class PageTest {
    @Test
    public void test1(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        //启动分页,page继承了ArrayList，并保存了查询的数据
        Page<Object> page = PageHelper.startPage(1, 4);
        List<Emp> emps = mapper.selectByExample(null);
        //查询功能之后可以获取分页相关的所有数据,5标识导航分页的页码
        PageInfo<Emp> pageInfo = new PageInfo<>(emps,5);
        emps.forEach(System.out::println);
        System.out.println(pageInfo);


    }
}
