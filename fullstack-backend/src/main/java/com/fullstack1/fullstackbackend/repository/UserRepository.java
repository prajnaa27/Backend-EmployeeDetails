package com.fullstack1.fullstackbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fullstack1.fullstackbackend.model.User;

public interface UserRepository extends JpaRepository<User,Long> {

}
