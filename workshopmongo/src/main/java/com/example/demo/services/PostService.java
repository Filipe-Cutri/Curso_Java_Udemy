package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Post;
import com.example.demo.repository.PostRepository;
import com.example.demo.services.exceptions.ObjectNotFoundException;

@Service 
public class PostService {
	
	@Autowired
	private PostRepository repo;
	
	
	public Post findById(String id) {
	    return repo.findById(id)
	               .orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado. ID: " + id));
	}
}
