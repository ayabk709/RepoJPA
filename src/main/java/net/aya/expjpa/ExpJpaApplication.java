

package net.aya.expjpa;

import jakarta.transaction.Transactional;
import net.aya.expjpa.Repisitory.*;
import net.aya.expjpa.entities.*;
import net.aya.expjpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class ExpJpaApplication implements CommandLineRunner {
    @Autowired
private ProductRepisitory productRepisitory;
    @Autowired
    private PatientRepisitory patientRepisitory;
    @Autowired
    private MedecinRepisitory medecinRepisitory;
    @Autowired
    private RendezVousRepisitory rendezVousRepisitory;
    @Autowired
    private ConsultationRepisitory consultationRepisitory;
    @Autowired
    UserService userService;

    public static void main(String[] args) {
        SpringApplication.run(ExpJpaApplication.class, args);
    }
    @Transactional
    @Override
    public void run(String... args) throws Exception {


        /////////////////PATIENTTT

  /*   patientRepisitory.save(new Patient(null,"Aya",new Date(),true, 12,null));


            //chercher
            Patient pat= patientRepisitory.findById(Long.valueOf(1)).get();
            System.out.printf("**********\n");
            System.out.println(pat.getId());
            System.out.println(pat.getName());
            System.out.println(pat.getDatenaissance());
        System.out.println(pat.isMalade());
            System.out.println("**********\n");
    //chercher tout
            List<Patient> patients = patientRepisitory.findAll();
            patients.forEach(p -> {
                System.out.println(p.toString());
            });
            //supprimer
        patientRepisitory.deleteById(Long.valueOf(1));
            //mettre a jour

        pat.setName("AyABK");
        patientRepisitory.save(pat);

        System.out.printf("**********\n");
        System.out.println(pat.getId());
        System.out.println(pat.getName());
        System.out.println(pat.getDatenaissance());
        System.out.println(pat.isMalade());
        System.out.println("**********\n");*/


/////////////////MEDECINNN

// medecinRepisitory.save(new Medecin(null,"BK","akkadd@gmail.com","tbib",null));
//cherchebyid
/*       Medecin med= medecinRepisitory.findById(Long.valueOf(1)).get();
      System.out.printf("**********\n");
        System.out.println(med.getId());
        System.out.println(med.getEmail());
        System.out.println(med.getSpecialite());

        med.getRendezVous().forEach(r -> {
            System.out.println(r.toString());
        });
        System.out.println("**********\n");
//chercher tous
        List<Medecin> medecins = medecinRepisitory.findAll();
        medecins.forEach(p -> {
            System.out.println(p.toString());
        });
        //supprimer
        //medecinRepisitory.deleteById(Long.valueOf(1));
        //mettre a jour
        med.setNom("BK");
        medecinRepisitory.save(med);
        medecins.forEach(p -> {
            System.out.println(p.toString());
        });*/

        ///////rendezvous


  /* Medecin medecin = medecinRepisitory.findByNom("BK");
        Patient patient = patientRepisitory.findByName("Aya");

        RendezVous rendezVous = new RendezVous();
        rendezVous.setDateRDV(new Date());
        rendezVous.setHeureRDV(new Date());
        rendezVous.setMedecin(medecin);
        rendezVous.setPatient(patient);

        rendezVousRepisitory.save(rendezVous);*/
        //chercher
/*        RendezVous rdv= rendezVousRepisitory.findById(Long.valueOf(1)).get();
        System.out.printf("**********\n");
        System.out.println(rdv.getId());
        System.out.println(rdv.getDateRDV());
        System.out.println(rdv.getHeureRDV());
        System.out.println(rdv.getMedecin());
        System.out.println(rdv.getPatient());
        System.out.println("**********\n");

        //chercher tous
        List<RendezVous> rendezVous = rendezVousRepisitory.findAll();
        rendezVous.forEach(p -> {
            System.out.println(p.toString());
        });
        //supprimer
        //rendezVousRepisitory.deleteById(Long.valueOf(1));
        //mettre a jour
        rdv.setDateRDV(new Date());
        rendezVousRepisitory.save(rdv);
        rendezVous.forEach(p -> {
            System.out.println(p.toString());
        });*/




///////CONSULTATIONNNNN
        //chercher
/*
        Consultation con= consultationRepisitory.findById(Long.valueOf(3)).get();
        System.out.printf("**********\n");
        System.out.println(con.getId());
        System.out.println(con.getConsultationDate());
        System.out.println(con.getRapportConsultation());
        System.out.println(con.getRendezVous());
        System.out.println("**********\n");

        //chercher tous
        List<Consultation> consultations = consultationRepisitory.findAll();
        consultations.forEach(p -> {
            System.out.println(p.toString());
        });
        //supprimer
        //consultationRepisitory.deleteById(Long.valueOf(1));
        //mettre a jour
        con.setConsultationDate(new Date());
        consultationRepisitory.save(con);
        consultations.forEach(p -> {
            System.out.println(p.toString());
        });
*/


/*        RendezVous rendezVous = rendezVousRepisitory.findById(1L).orElse(null);
rendezVous.setStatusRDV(StatusRDV.DONE);*/

/*
      RendezVous rendezVous = rendezVousRepisitory.findById(1L).orElse(null);


        Consultation consultation = new Consultation();
        consultation.setConsultationDate(new Date()); // Set your consultation date
        consultation.setRapportConsultation(new Date());
        consultation.setRendezVous(rendezVous);// Set your rapport consultation date

// Save the Consultation entity
        consultation = consultationRepisitory.save(consultation);
*/



/*
        rendezVousRepisitory.save(new RendezVous(null,new Date(),new Date(),med,prod,null));



*/


      /*  consultationRepisitory.search(new Date()).forEach(p -> {
            System.out.println(p.toString());
        });
*/









































        //*//////////*PRODUCTTTTT


        //spring data methods avec une interface  ProductRepository il  gére la persistance des entités,
      /* productRepisitory.save(new Product(null, "Computer", 788, 12));
        productRepisitory.save(new Product(null, "printer", 1200, 12));
        productRepisitory.save(new Product(null, "smartphone", 5000, 12));
       //pour afficher



        //chercher
        Product prod= productRepisitory.findById(Long.valueOf(1)).get();
        System.out.printf("**********\n");
        System.out.println(prod.getId());
        System.out.println(prod.getName());
        System.out.println(prod.getQuantity());
        System.out.println("**********\n");

        List<Product> products = productRepisitory.findAll();
        products.forEach(p -> {
            System.out.println(p.toString());
        });


        System.out.println("***********apres suppression**********"   );

        //supprimer
        productRepisitory.deleteById(Long.valueOf(1));

        productRepisitory.findAll().forEach(p -> {
            System.out.println(p.toString());
        });


        System.out.println("******apres modification********"   );
        //modifier
        productRepisitory.save(new Product(3L, "phonry", 3000, 5));
        productRepisitory.findAll().forEach(p -> {
            System.out.println(p.toString());
        });


            //chercher un produit par son nom
            productRepisitory.search("%C%").forEach(p -> {
                System.out.println(p.toString());
            });*/



        /////////////////////////////ROLEEEE - USERRRRRRRR

    /*   User user = new User();
        user.setName("koko");
        user.setPassword("1234");
        userService.addNewUser(user);*/














//chercher
        User us = userService.findUserName("koko");
        if (us != null) {
            System.out.printf("**********\n");
            System.out.println(us.getUserid());
            System.out.println(us.getName());
        } else {
            System.out.println("User with username 'koko' not found.");
        }
    //chercher byid
        User us1 = userService.findUserById("0125cf68-74b2-4a4c-bfc5-76effbdc1d0d");

            System.out.println(us1.getName());







/*        Role role = new Role();
        role.setRolename("ADMIN");
        userService.addNewRole(role);

      userService.addRoleToUser("koko", "ADMIN");*/

/*
try {
    User user = userService.authenticate("NICOCO", "1234");
    System.out.println( user.getUserid());
    System.out.println(user.getName()    );
    System.out.println("Roles: ");
    user.getRoles().forEach(r -> {
        //r pointeur string
        System.out.println("Roles: "+r.toString());
    });

} catch (RuntimeException e) {
    System.out.println(e.getMessage());
}
*/

}


}
