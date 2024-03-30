package net.aya.expjpa.Repisitory;

import net.aya.expjpa.entities.Role;
import net.aya.expjpa.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
    public interface RoleRepisitory extends JpaRepository<Role,Long> {

public Role findByrolename(String rolename);
}
