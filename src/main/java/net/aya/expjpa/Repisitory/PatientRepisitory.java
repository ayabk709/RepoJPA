package net.aya.expjpa.Repisitory;

import net.aya.expjpa.entities.Patient;
import net.aya.expjpa.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepisitory extends JpaRepository<Patient,Long> {

}
