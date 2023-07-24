package com.example.springHibernate.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;


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

    @Column(name = "registration_date")
    private LocalDate registrationDate;

    private Boolean active;

    private Double salary;
    public Employee(){}

    public Employee(Long idEmployee,
                    String employeeName,
                    String employeeEmail,
                    Integer employeeAge,
                    LocalDate registrationDate,
                    Boolean active,
                    Double salary
    ) {
        this.idEmployee = idEmployee;
        this.employeeName = employeeName;
        this.employeeEmail = employeeEmail;
        this.employeeAge = employeeAge;
        this.registrationDate = registrationDate;
        this.active = active;
        this.salary = salary;
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

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "idEmployee=" + idEmployee +
                ", employeeName='" + employeeName + '\'' +
                ", employeeEmail='" + employeeEmail + '\'' +
                ", employeeAge=" + employeeAge +
                ", registrationDate=" + registrationDate +
                ", active=" + active +
                ", salary=" + salary + '\n' +
                '}';
    }
}
