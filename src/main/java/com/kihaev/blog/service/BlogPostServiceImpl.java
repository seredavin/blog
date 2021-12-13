package com.kihaev.blog.service;

import com.kihaev.blog.entity.BlogPost;
import com.kihaev.blog.repository.BlogPostRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BlogPostServiceImpl implements BlogPostService{
    private final BlogPostRepository blogPostRepository;

    @Override
    public BlogPost createPost(BlogPost blogPost) {
        blogPost.setDate(new Date());
        return blogPostRepository.save(blogPost);
    }

    @Override
    public List<BlogPost> listPosts() {
        return blogPostRepository.findAll();
    }
}
