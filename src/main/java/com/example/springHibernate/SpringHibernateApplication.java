package com.example.springHibernate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringHibernateApplication {

	public static void main(String[] args) {

//		ApplicationContext context = SpringApplication.run(SpringHibernateApplication.class, args);
//
//		EmployeeRepository repository = context.getBean(EmployeeRepository.class);

		ApplicationContext context = SpringApplication.run(SpringHibernateApplication.class, args);

		EmployeeRepository repository = context.getBean(EmployeeRepository.class);

		Employee employee0 = new Employee(null, "Juan Carlos", "juanca@employee.com", 25);
		Employee employee1 = new Employee(null, "Juan Carlos", "juanca@employee.com", 25);

		repository.save(employee0);
		repository.save(employee1);


	}

}
