package com.buzzle.springboot.service;

import com.buzzle.springboot.entity.Blog;

import java.util.List;

public interface BlogService {

    List<Blog> findAll();

}
