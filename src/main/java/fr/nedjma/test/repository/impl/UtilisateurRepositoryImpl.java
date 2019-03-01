package fr.nedjma.test.repository.impl;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import fr.nedjma.test.domain.Utilisateur;
import fr.nedjma.test.repository.IUtilisateurRepository;

@Repository
public class UtilisateurRepositoryImpl implements IUtilisateurRepository {

	@Override
	public ArrayList<Utilisateur> getAllUsers() {
		//la methode va créer tout d'abord un tableau vide
	ArrayList<Utilisateur> listeUsers = new ArrayList<>();
	Utilisateur u1 = new Utilisateur("james","jack",15);
	Utilisateur u2 = new Utilisateur("jack","jonk",75);
	Utilisateur u3 = new Utilisateur("jallys","julie",45);
	//on retourne la liste au tableau
	listeUsers.add(u1);
	listeUsers.add(u2);
	listeUsers.add(u3);
	
		return listeUsers;//on retourne cette liste au controller
	}
	@Override
	public Utilisateur getOne() {
		Utilisateur u = new Utilisateur("james","jack",15);
		return u;
	}

}
