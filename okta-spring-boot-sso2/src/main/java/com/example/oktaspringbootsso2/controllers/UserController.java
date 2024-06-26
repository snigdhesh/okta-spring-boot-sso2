package com.example.oktaspringbootsso2.controllers;

import com.example.oktaspringbootsso2.models.User;
import com.example.oktaspringbootsso2.services.UserService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

@RestController
public class UserController {

    @Value("${okta.oauth2.logoutURL}")
    private String logoutUrl;

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> getUsers() {
        return userService.getUsers();
    }

    @GetMapping("/profile")
    public ModelAndView userDetails(OAuth2AuthenticationToken authentication) {
        return new ModelAndView("profile" , Collections.singletonMap("details", authentication.getPrincipal().getAttributes()));
    }
}
