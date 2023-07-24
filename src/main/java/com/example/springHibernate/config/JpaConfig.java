package com.example.springHibernate.config;

import jakarta.persistence.EntityManagerFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JpaConfig {

    @Autowired
    private EntityManagerFactory entityManagerFactory;

    @Bean
    public Session getSession(){
        System.out.println("Creando Bean Session"); //Ver por consola en que momento de la ejecución se muestra.
        SessionFactory sessionFactory = entityManagerFactory.unwrap(SessionFactory.class);

        return sessionFactory.openSession();
    }

}
