package br.com.anhembi.simcamp.resource;

import javax.annotation.Resource;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.anhembi.simcamp.entity.Time;
import br.com.anhembi.simcamp.facade.TimeFacade;
import br.com.anhembi.simcamp.model.RespostaResquest;

@Path("/time")
public class TimeResource {
	
	@Resource
	private TimeFacade timeFacade; 
	
	@POST
	@Path(value = "/save")
	@Produces(value=MediaType.APPLICATION_JSON)
	@Consumes(value=MediaType.APPLICATION_JSON)
	public RespostaResquest save(Time time){
		RespostaResquest respostaResquest = new RespostaResquest();

		try{
			Time timeSaved = timeFacade.save(time);
			respostaResquest.setMessage("Time salvo com sucesso!");
			
		}catch(Exception e){
			respostaResquest.setMessage("Falha ao persistir os dados "+e.getMessage());
			e.printStackTrace();
		}
		
		return respostaResquest;
	}

}
