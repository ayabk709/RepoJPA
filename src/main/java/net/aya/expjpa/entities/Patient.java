package net.aya.expjpa.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;
import java.util.Date;
@Entity @Data
@NoArgsConstructor @AllArgsConstructor
public class Patient {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Date datenaissance;
    boolean malade;
    int score;
    @OneToMany(mappedBy = "patient" , fetch = FetchType.LAZY)
    //donc cle etranger va etre dans rendezvous
    private Collection<RendezVous> rendezVous;

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", datenaissance=" + datenaissance +
                ", malade=" + malade +
                ", score=" + score +
                '}';
    }
}
