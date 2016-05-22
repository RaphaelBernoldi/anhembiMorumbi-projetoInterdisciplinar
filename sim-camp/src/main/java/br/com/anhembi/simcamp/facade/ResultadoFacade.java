package br.com.anhembi.simcamp.facade;

import java.util.List;

import br.com.anhembi.simcamp.entity.Resultado;
import br.com.anhembi.simcamp.entity.Time;
import br.com.anhembi.simcamp.model.constants.EnumStatusTimePartida;

public interface ResultadoFacade {
	
	Resultado buscaResultadoDoTime(Time time, List<Resultado>resultados);
	Resultado atualizaPontos(Resultado resultado, Integer gols, Time time, EnumStatusTimePartida status);
	Resultado salva(Resultado resultado);
}
