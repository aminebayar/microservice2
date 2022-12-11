package com.amine.user.service;

import java.util.List;

import com.amine.user.entities.Role;
import com.amine.user.entities.User;
public interface UserService {
User saveUser(User user);
User findUserByUsername (String username);
Role addRole(Role role);
User addRoleToUser(String username, String rolename);
}
