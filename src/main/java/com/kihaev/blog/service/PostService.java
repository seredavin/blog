package com.kihaev.blog.service;

import com.kihaev.blog.entity.Post;

import java.util.List;

public interface PostService {

    Post createPost(Post blogPost);

    List<Post> listPosts();
}
