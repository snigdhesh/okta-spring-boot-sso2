package com.example.oktaspringbootsso2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableMethodSecurity
public class OktaSpringBootSso2Application {
    public static void main(String[] args) {
        SpringApplication.run(OktaSpringBootSso2Application.class, args);
    }

}
