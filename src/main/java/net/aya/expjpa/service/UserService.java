package net.aya.expjpa.service;

import net.aya.expjpa.entities.Role;
import net.aya.expjpa.entities.User;

public interface UserService {

       User addNewUser(User user);
       Role addNewRole(Role role);
       User findUserName(String name);
       Role findRoleName(String name);
       void addRoleToUser(String username, String rolename);
User findUserById(String id);
    User authenticate(String username, String password);




}
