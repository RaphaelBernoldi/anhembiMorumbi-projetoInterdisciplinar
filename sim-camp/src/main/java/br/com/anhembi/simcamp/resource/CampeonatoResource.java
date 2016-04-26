package br.com.anhembi.simcamp.resource;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.web.bind.annotation.ResponseBody;

import br.com.anhembi.simcamp.entity.Campeonato;
import br.com.anhembi.simcamp.model.RespostaResquest;

/*
 * Classe de serviço rest
*/
@Path("/campeonato")
public class CampeonatoResource {
	
	@Path(value = "/save")
	@POST
	@Produces(value=MediaType.APPLICATION_JSON)
	public RespostaResquest save(){
		System.out.println("salvando campeonato ");

		return new RespostaResquest();
	}
	
}
