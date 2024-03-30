package net.aya.expjpa.Repisitory;

import net.aya.expjpa.entities.Consultation;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface ConsultationRepisitory extends JpaRepository<Consultation, Long> {

    /*@Query ("select c from Consultation c where c.ConsultationDate= :x")
    List<Consultation> search(@Param("x") Date dateConsultation);
*/}
