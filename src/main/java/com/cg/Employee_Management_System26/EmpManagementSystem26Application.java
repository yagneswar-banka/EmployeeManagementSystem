package com.cg.Employee_Management_System26;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class EmpManagementSystem26Application {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(EmpManagementSystem26Application.class);
        app.setDefaultProperties(Collections.singletonMap("server.port", "3066"));
        app.run(args);
    }
}

