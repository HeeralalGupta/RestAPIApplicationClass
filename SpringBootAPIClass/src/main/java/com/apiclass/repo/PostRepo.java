package com.apiclass.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apiclass.binding.Post;

@Repository
public interface PostRepo extends JpaRepository<Post, Integer> {

}
