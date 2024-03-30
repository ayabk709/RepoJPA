package net.aya.expjpa.service;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import net.aya.expjpa.Repisitory.RoleRepisitory;
import net.aya.expjpa.Repisitory.UserRepisitory;
import net.aya.expjpa.entities.Role;
import net.aya.expjpa.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;


@Service   //couche metier
@Transactional //tous les operation metier sont transactionelle

@AllArgsConstructor
public class UserServiceImpl implements UserService{

private RoleRepisitory roleRepisitory;
private UserRepisitory userRepisitory;



    @Override
    public User addNewUser(User user) {
        //unique id os there is non conflict
        user.setUserid(UUID.randomUUID().toString());
        return userRepisitory.save(user);
    }


    @Override
    public Role addNewRole(Role role) {
        return roleRepisitory.save(role);
    }

    @Override
    public User findUserName(String name) {
        return userRepisitory.findByname(name);
    }

    @Override
    public Role findRoleName(String name) {
        return roleRepisitory.findByrolename(name);
    }

    @Override
    public void addRoleToUser(String username, String rolename) {
    User user=findUserName(username);
    Role role=findRoleName(rolename);
        if (user == null) {
            System.out.println("User " + username + " not found.");
            return;
        }

        if (role == null) {
            System.out.println("Role " + rolename + " not found.");
            return;
        }
        System.out.println("User found: " + user.getName());
        System.out.println("Role found: " + role.getRolename());
//POURQUOI RECUPERER LA LISTE DES ROE PUIS AJOUTER
    user.getRoles().add(role);
    role.getUsers().add(user);
    //sans faire commit car on a deja transactional
  //userRepisitory.save(user);
        System.out.println("Role added successfully to user: " + user.getName());
    }

    @Override
    public User findUserById(String id) {
        return userRepisitory.findById(id).get();
    }


    @Override
    public User authenticate(String username, String password) {
        User user = userRepisitory.findByname(username);
        if (user == null) {
            throw new RuntimeException("User not found");
        }

        if (!user.getPassword().equals(password)) {
            throw new RuntimeException("Bad credentials");
        }
        return user;
    }
}
