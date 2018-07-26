package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@MapperScan("com.example.demo.dao")
@SpringBootApplication
/*@ComponentScan(basePackages = {"com.example.demo.dao","com.example.demo.service","com.example.demo.controller","mapper"})*/
public class RiskEvaluationApplication {

	public static void main(String[] args) {
		SpringApplication.run(RiskEvaluationApplication.class, args);
	}
}
