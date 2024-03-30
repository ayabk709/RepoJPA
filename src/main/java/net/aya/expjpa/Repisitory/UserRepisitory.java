package net.aya.expjpa.Repisitory;

import net.aya.expjpa.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepisitory extends JpaRepository <User,String>{
    public User findByname(String name);




}
