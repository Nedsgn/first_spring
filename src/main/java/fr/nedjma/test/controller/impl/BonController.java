package fr.nedjma.test.controller.impl;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.nedjma.test.controller.IBonController;
@Controller
public class BonController implements IBonController{

	@Override
	@RequestMapping("/bonjour")
	public String bonjour(Model model) {
		String nom ="Jack";
		model.addAttribute("nom",nom);
		model.addAttribute("cle", 123456789);
		boolean b = false;
		model.addAttribute("b", b);
		return "bonjourPage";
	}

	@Override
	@RequestMapping("/boucle")
	public String boucle(Model model) {
		ArrayList<String> noms = new ArrayList<>();
		noms.add("Jack");
		noms.add("James");
		noms.add("Thomas");
		noms.add("Eric");
		
		model.addAttribute("lesNoms", noms); //je lui envoie le tableau à la jsp
		return "boucle";
	}

}
