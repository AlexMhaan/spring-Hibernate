package com.example.springHibernate.dao;

import com.example.springHibernate.entities.Employee;

import java.util.List;

public interface EmployeeDAO    {

    List<Employee> findAllEmployees();


    List<Employee> findAtEmployeesLimit25();
}
