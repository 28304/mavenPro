package com.exer.ssm.service;


import com.exer.ssm.pojo.Emp;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface EmpService {
    /**
     * 查询所有员工信息
     * @return
     */
    List<Emp> getAllEmp();

    /**
     * 获取员工的分页信息
     * @param pageNum
     * @return
     */
    PageInfo<Emp> getEmpPage(Integer pageNum);
}
