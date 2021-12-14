package com.kihaev.blog.service;

import com.kihaev.blog.entity.Post;
import com.kihaev.blog.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService {

    private final PostRepository postRepository;

    @Override
    public Post createPost(Post blogPost) {
        blogPost.setDate(new Date());
        return postRepository.save(blogPost);
    }

    @Override
    public List<Post> listPosts() {
        return postRepository.findAll();
    }
}
