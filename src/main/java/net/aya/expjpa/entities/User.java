package net.aya.expjpa.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCrypt;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Users")
@Data @AllArgsConstructor @NoArgsConstructor
public class User {

    @Id
    @Column(length = 36) // Length to accommodate UUID values
    private String userid;

    @Column(name = "USER_NAME", unique = true, length = 20)
    private String name;
    @Column(unique = true)
    private String password;

    @ManyToMany(mappedBy = "users", fetch = FetchType.EAGER)
    private List<Role> roles = new ArrayList<>();

    public void setPassword(String password) {
        // You can use any secure hashing algorithm such as BCrypt, SCrypt, etc.
        // Here, we'll use BCrypt for demonstration.
        this.password = BCrypt.hashpw(password, BCrypt.gensalt());
    }
}
