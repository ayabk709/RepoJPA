package net.aya.expjpa.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RendezVous {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Date dateRDV;
    Date heureRDV;
    @ManyToOne
    private Medecin medecin;
    @ManyToOne
    //tu va convertir le patient en json
    //mni t3tini rendez vous ne me donner pas la liste des patients
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Patient patient;
    @OneToOne
    private Consultation consultation;
    @Enumerated(EnumType.STRING)
    private StatusRDV statusRDV;
    @Override
    public String toString() {
        return "RendezVous{" +
                "id=" + id +
                ", dateRDV=" + dateRDV +
                ", heureRDV=" + heureRDV +
                '}';
    }
}
