package com.stackroute.activitystream;

import org.hibernate.SessionFactory;
import org.hibernate.jpa.HibernateEntityManagerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages="com.stackroute.activitystream")
@EntityScan(basePackages={"com.stackroute.activitystream"})
@ComponentScan(basePackages="com.stackroute.activitystream")
@EnableAutoConfiguration
public class UserServiceApplication {
	
	@Bean  
    public SessionFactory sessionFactory(HibernateEntityManagerFactory hemf){  
        return hemf.getSessionFactory();  
    }

	public static void main(String[] args) {
		SpringApplication.run(UserServiceApplication.class, args);
	}
}
