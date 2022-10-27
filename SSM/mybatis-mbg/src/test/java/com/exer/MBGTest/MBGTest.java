package com.exer.MBGTest;

import com.exer.mapper.EmpMapper;
import com.exer.pojo.Emp;
import com.exer.pojo.EmpExample;
import com.exer.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class MBGTest {
    @Test
    public void test1(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        //根据id查询数据
//        Emp emp = mapper.selectByPrimaryKey(1);
//        System.out.println(emp.toString());
        //查询所有数据
//        List<Emp> emps = mapper.selectByExample(null);
//        emps.forEach(System.out::println);

        //根据条件查询
//        EmpExample empExample = new EmpExample();
//        empExample.createCriteria().andEmpNameEqualTo("张三");
//        empExample.or().andAgeEqualTo(3);
//        List<Emp> emps = mapper.selectByExample(empExample);
//        emps.forEach(System.out::println);

        //普通修改
//        Emp emp = new Emp(1,"张三",null,"女");
//        int i = mapper.updateByPrimaryKey(emp);
//        System.out.println(i);

        //选择性修改
        Emp emp = new Emp(1,"张三",null,"女");
        int i = mapper.updateByPrimaryKeySelective(emp);
        System.out.println(i);


    }
}
