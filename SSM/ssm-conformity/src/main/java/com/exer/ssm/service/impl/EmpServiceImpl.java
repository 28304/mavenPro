package com.exer.ssm.service.impl;

import com.exer.ssm.mapper.EmpMapper;
import com.exer.ssm.pojo.Emp;
import com.exer.ssm.service.EmpService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpMapper empMapper;

    @Override
    public List<Emp> getAllEmp() {
        return empMapper.getAllEmp();
    }

    @Override
    public PageInfo<Emp> getEmpPage(Integer pageNum) {
        //开启分页功能
        List<Emp> list = empMapper.getAllEmp();
        //查询所有员工信息
        PageHelper.startPage(pageNum,4);
        //获取分页相关数据
        PageInfo<Emp> pageInfo = new PageInfo<>(list,5);
        return pageInfo;
    }
}
