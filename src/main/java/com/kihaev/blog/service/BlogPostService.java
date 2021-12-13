package com.kihaev.blog.service;

import com.kihaev.blog.entity.BlogPost;

import java.util.List;

public interface BlogPostService {
    BlogPost createPost(BlogPost blogPost);

    List<BlogPost> listPosts();
}
