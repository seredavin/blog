package com.kihaev.blog.service;

import com.kihaev.blog.entity.User;

import java.util.List;

public interface UserService {

    User createUser(User blogUser);

    List<User> listUsers();
}
