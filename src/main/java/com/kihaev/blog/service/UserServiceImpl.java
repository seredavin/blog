package com.kihaev.blog.service;

import com.kihaev.blog.entity.User;
import com.kihaev.blog.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    @Override
    public User createUser(User blogUser) {
        return userRepository.save(blogUser);
    }

    @Override
    public List<User> listUsers() {
        return userRepository.findAll();
    }
}
