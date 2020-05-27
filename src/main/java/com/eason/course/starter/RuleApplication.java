package com.eason.course.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath:/spring-context.xml"})
public class RuleApplication {
    public static void main(String[] args) {
        SpringApplication.run(RuleApplication.class, args);
    }
}
