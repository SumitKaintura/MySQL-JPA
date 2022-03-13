package com.example.mysql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.example.mysql.controller","controller"})
public class MysqlJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MysqlJpaApplication.class, args);
	}

}
