package com.exer.ssm.controller;

import com.exer.ssm.pojo.Emp;
import com.exer.ssm.service.EmpService;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class EmpController {

    @Autowired
    private EmpService empService;

    //无分页效果（该方法以不可用）
    @RequestMapping(value = "/emp",method = RequestMethod.GET)
    public String getAllEmp(Model model){
        //查询所有员工信息
        List<Emp> list = empService.getAllEmp();
        //将信息共享到域对象中
        model.addAttribute("empList",list);
        return "emp_list";
    }


    @RequestMapping(value = "/emp/page/{pageNum}",method = RequestMethod.GET)
    public String getEmpPage(@PathVariable("pageNum") Integer pageNum,Model model){
        //获取员工分页信息
        PageInfo<Emp> pageInfo = empService.getEmpPage(pageNum);
        //将分页数据共享到请求域中
        model.addAttribute("page",pageInfo);
        return "emp_list";
    }

}
