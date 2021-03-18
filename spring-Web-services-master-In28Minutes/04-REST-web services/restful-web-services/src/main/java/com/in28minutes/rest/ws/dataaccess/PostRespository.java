package com.in28minutes.rest.ws.dataaccess;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.in28minutes.rest.ws.domain.Post;

@Repository
public interface PostRespository extends JpaRepository<Post, Integer> {

}
