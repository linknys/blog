package com.spring.codeblog.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.codeblog.model.Post;
import com.spring.codeblog.repository.CodeblogRepository;
import com.spring.codeblog.service.CodeblogService;

@Service
public class CodeblogServiceImpl implements CodeblogService {
	
	@Autowired
	CodeblogRepository CodeblogRepository;

	@Override
	public List<Post> findAll() {
		return CodeblogRepository.findAll();
	}

	@Override
	public Post findById(long id) {
		return CodeblogRepository.findById(id).get();
	}

	@Override
	public Post save(Post post) {
		return CodeblogRepository.save(post);
	}

}
