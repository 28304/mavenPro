package com.exer.mybatis.test;

import com.exer.mapper.DeptMapper;
import com.exer.mapper.EmpMapper;
import com.exer.pojo.Dept;
import com.exer.pojo.Emp;
import com.exer.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class EmpTest {
    @Test
    public void getEmpByEmpIdTest(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp emp = mapper.getEmpByEmpId(1);
        System.out.println(emp);
        sqlSession.close();
    }
    @Test
    public void getEmpAndDeptByEmpIdTest(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp emp = mapper.getEmpAndDeptByEmpId(1);
        System.out.println(emp);
        sqlSession.close();
    }
    @Test
    public void getEmpAndDeptByStepTest(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp emp = mapper.getEmpAndDeptByStepOnt(1);
        System.out.println(emp);
        sqlSession.close();
    }
    @Test
    public void getDeptAndEmpByDeptIdTest(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
        Dept dept = mapper.getDeptAndEmpByDeptId(1);
        System.out.println(dept);
        sqlSession.close();
    }
    @Test
    public void getDeptAndEmpByStepTest(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
        Dept dept = mapper.getDeptAndEmpByStepOne(1);
        System.out.println(dept);
        sqlSession.close();
    }
}
