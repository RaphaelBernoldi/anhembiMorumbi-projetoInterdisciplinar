package br.com.anhembi.simcamp.facade;

import java.util.List;

import br.com.anhembi.simcamp.entity.EntidadeGenerica;
import br.com.anhembi.simcamp.entity.Partida;
import br.com.anhembi.simcamp.model.PartidaRequest;

public interface PartidaFacade {
	
	public Partida save(PartidaRequest partidaRequest);
	
	public List<EntidadeGenerica>buscarPartidasPorCampeonato(Long idCampeonato);

}
