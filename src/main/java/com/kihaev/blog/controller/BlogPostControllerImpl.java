package com.kihaev.blog.controller;

import com.kihaev.blog.entity.BlogPost;
import com.kihaev.blog.service.BlogPostService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class BlogPostControllerImpl implements BlogPostController{
    private final BlogPostService blogPostService;
    @Override
    public BlogPost createPost(@RequestBody BlogPost blogPost) {
        return blogPostService.createPost(blogPost);
    }

    @Override
    public List<BlogPost> listPost() {
        return blogPostService.listPosts();
    }
}
