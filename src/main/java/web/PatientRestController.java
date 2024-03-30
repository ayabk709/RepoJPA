package web;

import net.aya.expjpa.Repisitory.PatientRepisitory;
import net.aya.expjpa.entities.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
//on a cree un controller rest pour recuperer la liste des patients
//khayba car on va avoir une dependance cycliqe c-a-d que nous avons many to one
@RestController
// Le contrôleur UserController utilise le service UserService pour obtenir la liste des utilisateurs à renvoyer en réponse à la requête HTTP GET.
public class PatientRestController {
    @Autowired
    private PatientRepisitory patientRepisitory;
   @GetMapping("/listPatients")
    public List<Patient> list(){
        return patientRepisitory.findAll();
    }

}
