package fr.nedjma.test.controller.impl;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.nedjma.test.controller.IHelloControler;

@Controller

public class HelloControlerImpl implements IHelloControler{

	@Override
	@RequestMapping("/hello")
	public String direHello(Map<String, Object> model) {
		// TODO Auto-generated method stub
		return "hello";//nom de la page html qui se trouve dans le folder templates
	}

	@Override
	@RequestMapping("/test-url")//adresse a taper  ds le navigateur
	public String test(Map<String, Object> model) {
		// TODO Auto-generated method stub
		return "test";
	}

	@Override
	@RequestMapping("/spring-wiki")
	public String spring(Map<String, Object> model) {
		//on peut sois le stockzer dans une variable soit le mettre dans le model put
		String valeur = "Spring Framework";
		model.put("titre",valeur);
		model.put("cle",12345897);
		
		int a = 12;
		model.put("nombreA", a);
		
		double d = 153.12;
			model.put("doubleD", d);
		
			boolean b = true;
			model.put("booleanB", b);
			
			return "spring";
	}

}
