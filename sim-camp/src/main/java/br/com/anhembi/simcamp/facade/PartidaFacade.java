package br.com.anhembi.simcamp.facade;

import br.com.anhembi.simcamp.entity.Partida;
import br.com.anhembi.simcamp.model.PartidaRequest;

public interface PartidaFacade {
	
	public Partida save(PartidaRequest partidaRequest);

}
