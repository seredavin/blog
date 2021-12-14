package com.kihaev.blog.controller;

import com.kihaev.blog.entity.Post;
import com.kihaev.blog.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class PostControllerImpl implements PostController {

    private final PostService postService;

    @Override
    public Post createPost(@RequestBody Post blogPost) {
        return postService.createPost(blogPost);
    }

    @Override
    public List<Post> listPost() {
        return postService.listPosts();
    }
}
