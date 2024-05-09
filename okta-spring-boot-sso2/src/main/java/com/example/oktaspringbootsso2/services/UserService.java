package com.example.oktaspringbootsso2.services;

import com.example.oktaspringbootsso2.models.User;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UserService {
    public List<User> getUsers() {
        return Arrays.asList(
                new User("John Doe", "johndoe@gmail.com"),
                new User("Jane Doe", "janedoe@gmail.com")
        );
    }
}
