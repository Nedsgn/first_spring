package fr.nedjma.test.repository;

import java.util.ArrayList;

import fr.nedjma.test.domain.Utilisateur;

public interface IUtilisateurRepository {
public ArrayList<Utilisateur> getAllUsers();
public Utilisateur getOne();


}
