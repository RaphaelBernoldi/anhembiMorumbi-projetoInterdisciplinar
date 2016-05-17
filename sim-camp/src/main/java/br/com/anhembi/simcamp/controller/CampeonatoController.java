package br.com.anhembi.simcamp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.anhembi.simcamp.entity.Campeonato;
import br.com.anhembi.simcamp.facade.CampeonatoFacade;
import br.com.anhembi.simcamp.model.RespostaResquest;

@Controller
@RequestMapping(value="/campeonato")
public class CampeonatoController {
	
	@Autowired
	private CampeonatoFacade campeonatoFacade;

	@RequestMapping(path="/cadastrarCampeonato")
	public String cadastrarCampeonato(){
		return "/cadastrarCampeonato";
	}
	

	@RequestMapping(path="/salvar", method=RequestMethod.POST)
	public @ResponseBody RespostaResquest salvarCampeonato(@RequestBody Campeonato campeonato){
		RespostaResquest respostaResquest = new RespostaResquest();
		try{
			respostaResquest.setObjetoEncontrado(campeonatoFacade.save(campeonato));
			respostaResquest.setMessage("Campeonato salvo com sucesso!");
			
		}catch(Exception e){
			respostaResquest.setMessage("Falha ao persistir os dados "+e.getMessage());
			e.printStackTrace();
		}
		return respostaResquest;
	}
	
	@RequestMapping(path="/buscarTodos", method=RequestMethod.POST)
	public @ResponseBody RespostaResquest buscarCampeonatos(){
		RespostaResquest respostaResquest = new RespostaResquest();
		try{
			
			respostaResquest.setLsObjetosEncontrados(campeonatoFacade.buscarTodos());

		}catch(Exception e){
			respostaResquest.setMessage("Falha ao buscar os dados "+e.getMessage());
			e.printStackTrace();
		}
		return respostaResquest;
	}
	
	
	
}
