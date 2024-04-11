package com.apiclass.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apiclass.binding.Post;
import com.apiclass.dto.PostRequestData;
import com.apiclass.repo.PostRepo;

@Service
public class PostService {
	
	@Autowired
	private PostRepo postRepo;
	
	// inserting and 
	public int savePostData(PostRequestData postRequestData) {
		Post post = new Post();
		post.setCategory(postRequestData.getCategory());
		post.setContent(postRequestData.getContent());
		post.setPostBy(postRequestData.getPostBy());
		post.setDate(postRequestData.getDate());
		
		Post save = postRepo.save(post);
		return save.getId();
	}
	
	// delete post data
	public boolean delete(int id) {
		postRepo.deleteById(id);
		return true;
	}
	
	
	// Finding all post data
	public List<Post> findAllPostData() {
		List<Post> post = postRepo.findAll();
		return post;
	}
	
	// Finding post data by id
	public Post findPostDataById(int id) {
		Optional<Post> post = postRepo.findById(id);
		if(post.isPresent()) {
			Post post2 = post.get();
			return post2;
		}else {
			return null;
		}
	}
	
}
	
