package com.amine.user.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amine.user.entities.Role;
public interface RoleRepository extends JpaRepository<Role, Long> {
Role findByRole(String role);
}