package com.example.springHibernate;

import com.example.springHibernate.dao.EmployeeDAO;
import com.example.springHibernate.entities.Employee;
import com.example.springHibernate.repository.EmployeeRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@SpringBootApplication
public class SpringHibernateApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringHibernateApplication.class, args);
		EmployeeRepository repository = context.getBean(EmployeeRepository.class);

//		Employee employee0 = new Employee(null, "Trufis", "trufa@employee.com", 44);
//		Employee employee1 = new Employee(null, "Juan Carlos", "juanca@employee.com", 25);
//		repository.save(employee0);
//		repository.save(employee1);


		List<Employee> employeeFiller = new ArrayList<>();

		for (int i = 0; i < 50000; i++)
			employeeFiller.add(new Employee(
					null,
					"name " + i,
					"employee" + i + "@employee.com",
					(int)((Math.random() * (65 - 18 + 1)) + 18),
					LocalDate.of(((int)(Math.random() * (2024 - 1999 + 1)) + 1999), ((int)(Math.random() * 12 + 1)), ((int)(Math.random() * 28 + 1))),
					true,
					Math.floor(Math.random() * (61000 - 30000 + 1) + 30000))
			);

		for (int i = 50000; i < 100000; i++)
			employeeFiller.add(new Employee(
					null,
					"name " + i,
					"employee" + i + "@employee.com",
					(int)((Math.random() * (65 - 18 + 1)) + 18),
					LocalDate.of(((int)(Math.random() * (2024 - 1999 + 1)) + 1999), ((int)(Math.random() * 12 + 1)), ((int)(Math.random() * 28 + 1))),
					false,
					Math.floor(Math.random() * (91000 - 60000 + 1) + 60000))
			);

		for (int i = 100000; i < 150000; i++)
			employeeFiller.add(new Employee(
					null,
					"name " + i,
					"employee" + i + "@employee.com",
					(int)((Math.random() * (65 - 18 + 1)) + 18),
					LocalDate.of(((int)(Math.random() * (2024 - 1999 + 1)) + 1999), ((int)(Math.random() * 12 + 1)), ((int)(Math.random() * 28 + 1))),
					true,
					Math.floor(Math.random() * (121000 + 90000 + 1) + 90000))
			);


		repository.saveAll(employeeFiller);
	}
}
