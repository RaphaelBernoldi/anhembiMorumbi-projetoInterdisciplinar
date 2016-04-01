package br.com.anhembi.simcamp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.anhembi.simcamp.entity.Teste;
import br.com.anhembi.simcamp.repository.TesteDAO;

@Controller
public class IndexController {
	
	@Autowired
	private TesteDAO testeDAO;
	
	@RequestMapping("/")
	public String index(){
		Teste teste = new Teste();
		teste.setTeste("Teste executado com sucesso");
		Teste save = testeDAO.save(teste);
		System.out.println(save);
		System.out.println(testeDAO.count());
		return "index";
	}

}
