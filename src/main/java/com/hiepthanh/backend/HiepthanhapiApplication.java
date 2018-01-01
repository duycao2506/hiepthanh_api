package com.hiepthanh.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@ComponentScan("com.hiepthanh")
@EnableJpaRepositories("com.hiepthanh.repo")
@EntityScan(basePackages = "com.hiepthanh.model")
@EnableTransactionManagement
public class HiepthanhapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(HiepthanhapiApplication.class, args);
	}
}
