package com.buzzle.springboot.service.impl;

import com.buzzle.springboot.entity.Blog;
import com.buzzle.springboot.repository.BlogRepository;
import com.buzzle.springboot.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BlogServiceImpl implements BlogService {

    @Autowired
    private BlogRepository blogRepository;

    @Override
    public List<Blog> findAll() {
        var blogs = (List<Blog>) blogRepository.findAll();
        return blogs;
    }
}
