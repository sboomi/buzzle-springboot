package com.buzzle.springboot.repository;

import com.buzzle.springboot.entity.Blog;
import org.springframework.data.repository.CrudRepository;

public interface BlogRepository extends CrudRepository<Blog, Long> {
}
