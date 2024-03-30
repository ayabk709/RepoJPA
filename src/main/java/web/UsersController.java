package web;

import net.aya.expjpa.Repisitory.PatientRepisitory;
import net.aya.expjpa.entities.User;
import net.aya.expjpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
//// Le contrôleur UserController utilise le service UserService pour obtenir la liste des utilisateurs à renvoyer en réponse à la requête HTTP GET.
@RestController
public class UsersController {
    @Autowired
    private UserService userService;
//GET requests to the /users/{username} endpoint.
    @GetMapping("/users/{username}")
    public User user(@PathVariable String username){

        User user= userService.findUserName(username);
        if (user != null) {
            System.out.println("User found: " + user.getName());
        } else {
            System.out.println("User not found for username: " + username);
        }
        return user;
    }


}
