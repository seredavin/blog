package com.kihaev.blog.controller;

import com.kihaev.blog.entity.Post;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "posts")
public interface PostController {

    @PostMapping
    Post createPost(Post blogPost);

    @GetMapping
    List<Post> listPost();
}
