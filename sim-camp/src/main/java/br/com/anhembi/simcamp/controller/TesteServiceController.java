package br.com.anhembi.simcamp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * Controller destinado a dar suporte aos testes
	das requisições que serão feitas pelo front end
*/
@Controller
public class TesteServiceController {
	
	@RequestMapping("/campeonato")
	public String campeonato(){
		return "testes/campeonato";
	}
	

}
