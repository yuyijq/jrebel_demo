package com.myapp.demo.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.myapp.demo"})
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
