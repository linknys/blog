package com.spring.codeblog.utils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.codeblog.model.Post;
import com.spring.codeblog.repository.CodeblogRepository;

@Component
public class DummyData {
	
	@Autowired
	CodeblogRepository codeblogRepository;
	
	//@PostConstruct
	public void savePosts() {
		
		List<Post> postList = new ArrayList<>();
		
		Post post1 = new Post();
		post1.setAutor("Autor1");
		post1.setData(LocalDate.now());
		post1.setTitulo("Titulo1");
		post1.setTexto("Texto nao tao grande mas deveria ser maior 1!");
		
		Post post2 = new Post();
		post2.setAutor("Autor2");
		post2.setData(LocalDate.now());
		post2.setTitulo("Titulo2");
		post2.setTexto("Texto nao tao grande mas deveria ser maior 2!");
		
		postList.add(post1);
		postList.add(post2);
		
		for(Post post: postList) {
			Post postSaved = codeblogRepository.save(post);
			System.out.println("SAVED Post - Id: " + postSaved.getId());
		}
	}
}
