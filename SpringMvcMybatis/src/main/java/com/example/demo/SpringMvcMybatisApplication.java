package com.example.demo;

import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.boot.builder.SpringApplicationBuilder; 
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringMvcMybatisApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        // 내장 서버로 실행하는 경우에만 필요. 외부 Tomcat에서는 필요 없음.
        // SpringApplication.run(SpringMvcMybatisApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringMvcMybatisApplication.class);
    }
}

@RestController
class HelloController {

    @GetMapping("/")
    public String hello() {
        return "Hello, Spring Boot with Java 11 on External Tomcat!";
    }
}
