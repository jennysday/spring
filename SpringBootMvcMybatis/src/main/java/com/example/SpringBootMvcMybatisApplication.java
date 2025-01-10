package com.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.example"})
@MapperScan("com.example.mapper")  // MyBatis 매퍼가 위치한 패키지
public class SpringBootMvcMybatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMvcMybatisApplication.class, args);
	}

}
