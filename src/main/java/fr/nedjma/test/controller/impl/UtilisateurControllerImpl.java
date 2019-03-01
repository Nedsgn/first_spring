//anciennement la servlet qui agit désormais comme les autres packages avec une implementation


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

	@Autowired UtilisateurServiceImpl utilisateurService;//c'est le nom qu'on donne qu'on a l'objet de type UtilisateurServiceImpl. On l'injecte avec Autowired
	@Override
	@RequestMapping("/utilisateurs")
	public String getAllUser(Model model) {
		
		ArrayList<Utilisateur> liste = utilisateurService.getAllUsers();
		//on récupère la méthode qui est dans le buisness (service) s'apellant get all user qui contient une liste d'utilisateurs que 'lont injecte dans une variable liste qui est elle me eun tableau
		
		// on veut transmettre à la page html un tableau d'utilisateurs
		model.addAttribute("listeDesUtilisateurs",liste);
		return "utilisateurs";
	}
	@Override
	@RequestMapping("/utilisateurs-infos")
	public String getUtilisateur(Model model) {
		Utilisateur user = utilisateurService.getOne();//on apppele la methode getOne qui se trouve dans l'utilisateurServiceImpl @override
		model.addAttribute("utilisateurAEnvoyer",user);
		//utilisateur c'est le nom qu'on lui donne pour le html/thymeleaf /expression language
		return "utilisateurInfo";
	}

}
