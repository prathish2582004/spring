package com.hey.online.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hey.online.model.User;

public interface UserRepo extends JpaRepository<User,Integer>{
    
}




