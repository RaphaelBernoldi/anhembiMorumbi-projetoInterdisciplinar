package br.com.anhembi.simcamp.facade;

import java.util.List;

import br.com.anhembi.simcamp.entity.EntidadeGenerica;
import br.com.anhembi.simcamp.entity.Time;

public interface TimeFacade {
	
	Time save(Time time);
	List<EntidadeGenerica>buscarTodos();

}
