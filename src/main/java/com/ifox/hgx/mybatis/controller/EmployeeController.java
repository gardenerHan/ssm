package com.ifox.hgx.mybatis.controller;

import com.ifox.hgx.mybatis.entities.Employee;
import com.ifox.hgx.mybatis.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService ;

    @RequestMapping("/emps")
    public String getEmps(Map<String,Object> map){
       List<Employee> employees =  employeeService.getEmpAll() ;
        map.put("emps",employees) ;
        return "emps" ;
    }
}
