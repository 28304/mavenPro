package com.exer.mapper;

import com.exer.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmpMapper {
    Emp getEmpByEmpId(@Param("empId") Integer empId);

    /**
     * 通过id获取员工及部门信息
     * @param empId
     * @return
     */
    Emp getEmpAndDeptByEmpId(@Param("empId") Integer empId);

    /**
     * 通过id分步查询员工及部门信息(第一步)
     */
    Emp getEmpAndDeptByStepOnt(@Param("empId") Integer empId);
    /**
     *分步查询部门及部门中员工的信息（第二步）
     */
    List<Emp> getDeptAndEmpByStepTwo(@Param("deptId") Integer deptId);
}
