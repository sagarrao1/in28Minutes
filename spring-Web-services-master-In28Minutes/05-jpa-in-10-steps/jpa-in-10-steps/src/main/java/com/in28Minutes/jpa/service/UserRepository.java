package com.in28Minutes.jpa.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.in28Minutes.jpa.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
