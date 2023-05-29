package com.masai.spotify.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.spotify.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
