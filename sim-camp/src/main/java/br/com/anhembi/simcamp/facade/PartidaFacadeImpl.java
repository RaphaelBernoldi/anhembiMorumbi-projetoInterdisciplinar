package br.com.anhembi.simcamp.facade;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import br.com.anhembi.simcamp.entity.Partida;
import br.com.anhembi.simcamp.repository.PartidaRepository;

@Service(value = "partidaFacade")
public class PartidaFacadeImpl implements PartidaFacade{

	@Resource
	private PartidaRepository partidaRepository;
	
	@Override
	public Partida save(Partida partida) {
		return partidaRepository.save(partida);
	}

}
