package net.aya.expjpa.Repisitory;

import net.aya.expjpa.entities.Medecin;
import net.aya.expjpa.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedecinRepisitory extends JpaRepository<Medecin,Long> {
    Medecin findByNom(String nom);
}
