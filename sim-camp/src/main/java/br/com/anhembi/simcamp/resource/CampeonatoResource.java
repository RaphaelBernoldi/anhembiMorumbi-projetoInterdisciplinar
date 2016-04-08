package br.com.anhembi.simcamp.resource;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import br.com.anhembi.simcamp.model.RespostaResquest;


@Path("/campeotado")
public class CampeonatoResource {
	
	@Produces(value="application/json")
	@POST
	public RespostaResquest save(){
		System.out.println("salvando campeonato");
		return null;
	}
	
}
