package com.example.springHibernate.entities;

import jakarta.persistence.*;

import java.io.Serializable;


@Entity
public class Employee implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_employee")
    private Long idEmployee;

    @Column(name = "employee_name")
    private String employeeName;

    @Column(name = "employee_email")
    private String employeeEmail;

    @Column(name = "employee_age")
    private Integer employeeAge;

    public Employee(){}

    public Employee(
            Long idEmployee,
            String employeeName,
            String employeeEmail,
            Integer employeeAge
    ) {
        this.idEmployee = idEmployee;
        this.employeeName = employeeName;
        this.employeeEmail = employeeEmail;
        this.employeeAge = employeeAge;
    }

    public Long getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(Long idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    public Integer getEmployeeAge() {
        return employeeAge;
    }

    public void setEmployeeAge(Integer employeeAge) {
        this.employeeAge = employeeAge;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + idEmployee +
                ", employeeName='" + employeeName + '\'' +
                ", employeeEmail='" + employeeEmail + '\'' +
                ", employeeAge=" + employeeAge + '\n' +
                '}';
    }
}
