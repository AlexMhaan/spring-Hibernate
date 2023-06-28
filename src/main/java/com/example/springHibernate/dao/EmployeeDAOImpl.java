package com.example.springHibernate.dao;

import com.example.springHibernate.entities.Employee;
import jakarta.persistence.EntityManager;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

    private Session session;
    private EntityManager manager;

    public EmployeeDAOImpl(Session session, EntityManager manager) {
        this.session = session;
        this.manager = manager;
    }


    @Override
    public List<Employee> findAllEmployees() {
        return session.createQuery("FROM Employee", Employee.class).list();
    }
}
