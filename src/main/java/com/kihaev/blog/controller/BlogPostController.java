package com.kihaev.blog.controller;

import com.kihaev.blog.entity.BlogPost;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "blog_posts")
public interface BlogPostController {

    @PostMapping
    BlogPost createPost(BlogPost blogPost);

    @GetMapping
    List<BlogPost> listPost();
}
