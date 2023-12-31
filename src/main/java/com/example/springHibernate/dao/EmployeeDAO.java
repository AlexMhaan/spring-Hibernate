package com.example.springHibernate.dao;

import com.example.springHibernate.entities.Employee;

import java.util.List;

public interface EmployeeDAO    {

    List<Employee> findAllEmployees();

    List<Employee> findAllLimit25();

    Employee saveEmployee(Employee employee);


}
