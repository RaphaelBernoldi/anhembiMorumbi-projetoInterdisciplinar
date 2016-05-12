package br.com.anhembi.simcamp.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.anhembi.simcamp.entity.EntidadeGenerica;
import br.com.anhembi.simcamp.entity.Time;
import br.com.anhembi.simcamp.facade.TimeFacade;
import br.com.anhembi.simcamp.model.RespostaResquest;

@Controller
@RequestMapping(path="/time")
public class TimeController {
	
	@Resource
	private TimeFacade timeFacade;
	
	@RequestMapping(path="/cadastrarTime")
	public String cadastrarTime(){
		return "/cadastrarTime";
	}
	
	@RequestMapping(path="/salvar", method=RequestMethod.POST)
	public @ResponseBody RespostaResquest salvarTime(@RequestBody Time time){
		RespostaResquest respostaResquest = new RespostaResquest();
		try{
			Time timeSaved = timeFacade.save(time);
			respostaResquest.setMessage("Time "+timeSaved.getId()+" salvo com sucesso!");
			
		}catch(Exception e){
			respostaResquest.setMessage("Falha ao persistir os dados "+e.getMessage());
			e.printStackTrace();
		}
		return respostaResquest;
	}
	
	@RequestMapping(path="/buscarTodos", method=RequestMethod.POST)
	public @ResponseBody RespostaResquest buscarTimes(){
		RespostaResquest respostaResquest = new RespostaResquest();
		try{
			List<EntidadeGenerica> times = timeFacade.buscarTodos();
			respostaResquest.setLsObjetosEncontrados(times);
			
		}catch(Exception e){
			respostaResquest.setMessage("Falha ao persistir os dados "+e.getMessage());
			e.printStackTrace();
		}
		return respostaResquest;
	}
	
}
