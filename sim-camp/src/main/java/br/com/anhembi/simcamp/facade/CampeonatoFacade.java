package br.com.anhembi.simcamp.facade;

import java.util.List;

import br.com.anhembi.simcamp.entity.Campeonato;
import br.com.anhembi.simcamp.entity.EntidadeGenerica;
import br.com.anhembi.simcamp.entity.Resultado;
import br.com.anhembi.simcamp.entity.Time;

public interface CampeonatoFacade {
	
	Campeonato save(Campeonato campeonato);
	List<EntidadeGenerica>buscarTodos();
	void addTime(Long idCampeonato,Time time);
	List<EntidadeGenerica> buscarResultadosPorIDCampeonato(Long idCampeonato);
}
