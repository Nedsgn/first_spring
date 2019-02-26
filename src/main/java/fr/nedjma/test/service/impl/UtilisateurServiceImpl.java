package fr.nedjma.test.service.impl;


import java.util.ArrayList;

import org.springframework.stereotype.Service;

import fr.nedjma.test.domain.Utilisateur;
import fr.nedjma.test.service.IUtilisateurService;

@Service
public class UtilisateurServiceImpl implements IUtilisateurService{

	@Override
	public ArrayList<Utilisateur> getAllUsers() {
	ArrayList<Utilisateur> listeUsers = new ArrayList<>();
	Utilisateur u1 = new Utilisateur("james","jack",15);
	Utilisateur u2 = new Utilisateur("jack","jonk",75);
	Utilisateur u3 = new Utilisateur("jallys","julie",45);
	
		return listeUsers;
	}

}
