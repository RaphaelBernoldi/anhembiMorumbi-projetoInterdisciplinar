package br.com.anhembi.simcamp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.anhembi.simcamp.entity.Partida;
import br.com.anhembi.simcamp.facade.PartidaFacade;
import br.com.anhembi.simcamp.model.PartidaRequest;
import br.com.anhembi.simcamp.model.RespostaResquest;

@Controller
@RequestMapping(path="/partida")
public class PartidaController {
	
	@Autowired
	private PartidaFacade partidaFacade;
	
	@RequestMapping(path="/cadastrarPartida")
	public String cadastrarPartida(){
		return "/cadastrarPartida";
	}
	
	@RequestMapping(path="/listaPartidas")
	public String listaPartidas(){
		return "/listaPartidas";
	}

	@RequestMapping(path="/salvar", method=RequestMethod.POST)
	public @ResponseBody RespostaResquest salvarPartida(@RequestBody PartidaRequest partidaRequest){
		RespostaResquest respostaResquest = new RespostaResquest();
		System.out.println("idCampeonato = "+partidaRequest.getIdCampeonato());
		try{
			Partida save = partidaFacade.save(partidaRequest);
			respostaResquest.setObjetoEncontrado(save);
			respostaResquest.setMessage("Partida "+save.getId()+" salva com sucesso");
			
		}catch(Exception e){
			respostaResquest.setMessage("Falha ao persistir os dados "+e.getMessage());
			e.printStackTrace();
		}
		return respostaResquest;
	}
	
}
