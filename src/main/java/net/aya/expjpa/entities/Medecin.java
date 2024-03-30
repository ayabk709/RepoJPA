package net.aya.expjpa.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;
import java.util.List;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Medecin {
    //a chaque fois on incremente la valeur de id
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String nom;
    String email;
    String specialite;
    //puisique c'est une relation oneto many on doit creer une liste de Rendezvous
    //cle etrangere est vers la classe rendezvous
    //il va pas charger la liste des rendezvous a chaque fois juste si je met un get
    @OneToMany(mappedBy = "medecin" , fetch = FetchType.LAZY)

    private Collection<RendezVous> rendezVous;

    @Override
    public String toString() {
        return "Medecin{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", email='" + email + '\'' +
                ", specialite='" + specialite + '\'' +
                '}';
    }
}
