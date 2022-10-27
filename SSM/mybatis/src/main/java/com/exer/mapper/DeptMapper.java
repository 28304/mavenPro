package com.exer.mapper;

import com.exer.pojo.Dept;
import org.apache.ibatis.annotations.Param;

public interface DeptMapper {
    /**
     * 通过id分步查询员工及部门信息(第二步)
     * @return
     */
    Dept getEmpAndDeptByStepTwo(@Param("deptId") Integer deptId);

    /**
     * 查询部门及部门中员工的信息
     * @param deptId
     * @return
     */
    Dept getDeptAndEmpByDeptId(@Param("deptId") Integer deptId);
    /**
     * 分步查询部门及部门中员工的信息（第一步）
     */
    Dept getDeptAndEmpByStepOne(@Param("deptId") Integer deptId);
}
