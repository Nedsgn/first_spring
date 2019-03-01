package fr.nedjma.test.service.impl;


import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.nedjma.test.domain.Utilisateur;
import fr.nedjma.test.repository.impl.UtilisateurRepositoryImpl;
import fr.nedjma.test.service.IUtilisateurService;

@Service //annotation obligatoire
public class UtilisateurServiceImpl implements IUtilisateurService{

	//on fait appel au repository
	@Autowired
UtilisateurRepositoryImpl UtilisateurRepository;
	
	
	@Override
	public ArrayList<Utilisateur> getAllUsers() {
		//la methode va créer tout d'abord un tableau vide
	ArrayList<Utilisateur> listeUsers = UtilisateurRepository.getAllUsers();
	return listeUsers;
	}

	@Override
	public Utilisateur getOne() {
		Utilisateur u = UtilisateurRepository.getOne();
		return u;
	}

	
}
