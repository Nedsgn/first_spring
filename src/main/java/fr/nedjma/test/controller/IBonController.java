package fr.nedjma.test.controller;

import org.springframework.ui.Model;

public interface IBonController {
public String bonjour(Model model);//elle va prendre en parametre un model, c'est ce qui va permettre de rfaire le lien avec la page html Lien entre le controller et notre vue
public String boucle(Model model);
}
