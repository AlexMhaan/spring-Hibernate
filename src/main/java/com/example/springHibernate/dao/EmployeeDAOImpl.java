package com.example.springHibernate.dao;

import com.example.springHibernate.entities.Employee;
import jakarta.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
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

    @Override
    public List<Employee> findAllLimit25() {
        int size = 20;
        String HQLQuery = "SELECT COUNT (e.id) FROM Employee e";
        Long countQueryTotal = (Long) session.createQuery(HQLQuery).uniqueResult();
        int lastEmployees = (int) Math.ceil(countQueryTotal / size);


        Query query = session.createQuery("FROM Employee");
        query.setFirstResult((lastEmployees - 1) * size);
        query.setMaxResults(size);

        return (List<Employee>) query.list();
    }

    @Override
    public Employee saveEmployee(Employee employee) {

        try {
            session.beginTransaction();
            session.persist(employee);
            session.getTransaction().commit();
        }catch (Exception e) {
            e.printStackTrace();
        }

        return employee;
    }
}
