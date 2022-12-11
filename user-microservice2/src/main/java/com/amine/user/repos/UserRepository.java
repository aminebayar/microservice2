package com.amine.user.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amine.user.entities.User;
public interface UserRepository extends JpaRepository<User, Long> {
User findByUsername(String username);
}