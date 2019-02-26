package fr.nedjma.test.controller;

import java.util.Map;

public interface IHelloControler {
	
	public String direHello(Map<String, Object> model);//equivalent de la servlet
	public String test(Map<String, Object> model);
	public String spring(Map<String, Object> model);
}
