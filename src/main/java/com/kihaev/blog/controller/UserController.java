package com.kihaev.blog.controller;

import com.kihaev.blog.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "users")
public interface UserController {

    @PostMapping
    User createUser(User blogUser);

    @GetMapping
    List<User> listUsers();
}
