package com.exer.mapper;

import com.exer.pojo.Emp;

import java.util.List;

public interface DynamicSQLMapper {
    /**
     * 根据条件查询员工信息
     * @param emp
     * @return
     */
    List<Emp> getEmpByCondition(Emp emp);
}
