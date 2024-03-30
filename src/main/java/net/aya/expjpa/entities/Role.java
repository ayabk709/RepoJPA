package net.aya.expjpa.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
@Entity @Data @AllArgsConstructor @NoArgsConstructor //ce sont des methodes lombock
public class Role {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    @Column(length = 20,unique = true)
    private String rolename;
    @ManyToMany(fetch = FetchType.EAGER)
    @ToString.Exclude
    //Role includes users
    //User includes roles
    //Role includes users
 //...
    //This circular reference can lead to infinite loops when generating the toString()
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private List<User> users=new ArrayList<>();
}
