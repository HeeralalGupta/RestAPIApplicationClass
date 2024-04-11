package com.apiclass.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.apiclass.binding.Post;
import com.apiclass.dto.PostRequestData;
import com.apiclass.service.PostService;

import jakarta.validation.Valid;

@RestController
public class PostController {
	
	@Autowired
	private PostService postSerivce;
	
	@PostMapping("save-post-data")
	public ResponseEntity<String> savePostData(@RequestBody @Valid PostRequestData postRequestData) {
		
		int status = postSerivce.savePostData(postRequestData);
		if(status > 0) {
			System.out.println("Data saved successfully...");
		}else {
			System.out.println("Something went wrong...");
		}
		return new ResponseEntity<>("Post data inserted successfully", HttpStatus.OK);
	}
	
	@GetMapping("/find-post-data-by-id/{id}")
	public ResponseEntity<Post> getPostData(@PathVariable int id) {
		Post postData = postSerivce.findPostDataById(id);
		return new ResponseEntity<>(postData, HttpStatus.OK);
	}
	
}
