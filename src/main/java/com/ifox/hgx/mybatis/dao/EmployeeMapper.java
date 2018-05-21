package com.ifox.hgx.mybatis.dao;

import com.ifox.hgx.mybatis.entities.Employee;

import java.util.List;


public interface EmployeeMapper {

    Employee getEmpById(Integer id);

    List<Employee> getEmpAll() ;
}
