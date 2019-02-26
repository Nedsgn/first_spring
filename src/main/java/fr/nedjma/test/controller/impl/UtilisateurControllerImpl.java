package fr.nedjma.test.controller.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.nedjma.test.controller.IUtilisateurController;
import fr.nedjma.test.domain.Utilisateur;
import fr.nedjma.test.service.impl.UtilisateurServiceImpl;
@Controller
public class UtilisateurControllerImpl implements IUtilisateurController {

	@Autowired UtilisateurServiceImpl us;//c'est le nom qu'on donne qu'on a l'objet de type UtilisateurServiceImpl. On l'injecte avec Autowired
	@Override
	@RequestMapping("/utilisateurs")
	public String getAllUser(Model model) {
		
		ArrayList<Utilisateur> liste = us.getAllUsers();
		//on récupère la méthode qui est dans le buisness (service) s'apellant get all user qui contient une liste d'utilisateurs que 'lont injecte dans une variable liste qui est elle me eun tableau
		
		// on veut transmettre à la page html un tableau d'utilisateurs
		model.addAttribute("listeDesUtilisateurs",liste);
		return "utilisateurs";
	}

}
