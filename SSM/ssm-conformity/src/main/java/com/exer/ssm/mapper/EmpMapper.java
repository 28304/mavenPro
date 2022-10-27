package com.exer.ssm.mapper;

import com.exer.ssm.pojo.Emp;

import java.util.List;

public interface EmpMapper {
    /**
     * 查询所有员工信息
     * @return
     */
    List<Emp> getAllEmp();
}
