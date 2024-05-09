package com.example.oktaspringbootsso2.config.security;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Value("${okta.oauth2.logoutURL}")
    private String logoutUrl;

    @Bean
    public SecurityFilterChain configure(HttpSecurity httpSecurity) throws Exception {

        //Authenticate all/any requests
        httpSecurity.authorizeHttpRequests(auth -> auth.anyRequest().authenticated());

        //Handle logout
        httpSecurity.logout(logout-> logout.logoutSuccessHandler(new OktaLogoutHandler(logoutUrl)));

        return httpSecurity.build();
    }
}
