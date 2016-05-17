package br.com.anhembi.simcamp.facade;

import java.util.List;

import br.com.anhembi.simcamp.entity.Campeonato;
import br.com.anhembi.simcamp.entity.EntidadeGenerica;

public interface CampeonatoFacade {
	
	Campeonato save(Campeonato campeonato);
	List<EntidadeGenerica>buscarTodos();

}
