package com.example.admin_fintech;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value={"com.example.admin_fintech.mapper"})
public class AdminFintechApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdminFintechApplication.class, args);
	}

}
