package com.ifox.hgx.mybatis.service;

import com.ifox.hgx.mybatis.dao.EmployeeMapper;
import com.ifox.hgx.mybatis.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper ;

    public List<Employee> getEmpAll(){
        return employeeMapper.getEmpAll() ;
    }



}
