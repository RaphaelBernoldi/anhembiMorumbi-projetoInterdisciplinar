package br.com.anhembi.simcamp.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.anhembi.simcamp.entity.Teste;
import br.com.anhembi.simcamp.facade.TesteFacade;

@Controller
public class IndexController {
	
	@Resource(name = "testeFacade")
	private TesteFacade testeFacade;
	
	@RequestMapping("/")
	public String index(){
		Teste teste = new Teste();
		teste.setTeste("Teste executado com sucesso");
		testeFacade.findTeste();
		return "index";
	}

}
