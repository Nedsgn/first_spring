package fr.nedjma.test.service;

import java.util.ArrayList;

import fr.nedjma.test.domain.Utilisateur;

public interface IUtilisateurService {
public ArrayList<Utilisateur> getAllUsers();//on propose une methode getAllUsers qui renvoie une tableau qui contient une liste d'utilisateur
public Utilisateur getOne();
}
