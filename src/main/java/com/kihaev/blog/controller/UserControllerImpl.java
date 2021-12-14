package com.kihaev.blog.controller;

import com.kihaev.blog.entity.User;
import com.kihaev.blog.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class UserControllerImpl implements UserController {

    private final UserService userService;

    @Override
    public User createUser(@RequestBody User blogUser) {
        return userService.createUser(blogUser);
    }

    @Override
    public List<User> listUsers() {
        return userService.listUsers();
    }
}
