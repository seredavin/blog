package com.kihaev.blog.repository;

import com.kihaev.blog.entity.BlogPost;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BlogPostRepository extends CrudRepository<BlogPost, Long> {
    List<BlogPost> findAll();
}
