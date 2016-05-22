package br.com.anhembi.simcamp.facade;

import java.util.List;

import br.com.anhembi.simcamp.entity.EntidadeGenerica;
import br.com.anhembi.simcamp.entity.Partida;
import br.com.anhembi.simcamp.entity.Resultado;
import br.com.anhembi.simcamp.entity.Time;
import br.com.anhembi.simcamp.model.PartidaRequest;
import br.com.anhembi.simcamp.model.constants.EnumStatusTimePartida;

public interface PartidaFacade {
	
	Partida save(PartidaRequest partidaRequest);
	List<EntidadeGenerica>buscarPartidasPorCampeonato(Long idCampeonato);
	void atualizaResultados(final Partida partida,final List<Resultado>resultados);
	void preencheResultado(Time time, Integer gols, List<Resultado>resultados, EnumStatusTimePartida status);

}
