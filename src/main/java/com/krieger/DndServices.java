package com.krieger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan (basePackages = "com.krieger")
@EnableAutoConfiguration
public class DndServices {
    public static void main(String[] args) {
        SpringApplication.run(DndServices.class,args);
    }
}
