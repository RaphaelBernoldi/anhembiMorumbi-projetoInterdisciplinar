package br.com.anhembi.simcamp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	/*
	 * 
	Controller simples destinado
	a mostrar que a aplicação está no ar
	
	*/
	
	@RequestMapping("/")
	public String index(){
		return "/index";
	}

}
