package br.com.anhembi.simcamp.facade;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.anhembi.simcamp.entity.Campeonato;
import br.com.anhembi.simcamp.entity.EntidadeGenerica;
import br.com.anhembi.simcamp.repository.CampeonatoRepository;

@Service(value = "campeonatoFacade")
public class CampeonatoFacadeImpl implements CampeonatoFacade {
	
	private CampeonatoRepository campeonatoRepository;

	@Override
	public Campeonato save(Campeonato campeonato) {
		return campeonatoRepository.save(campeonato);
	}

	@Override
	public List<EntidadeGenerica> buscarTodos() {
		List<EntidadeGenerica>lsEntidadeGenerica = new ArrayList<>();
		lsEntidadeGenerica.addAll(campeonatoRepository.findAll());
		return lsEntidadeGenerica;
	}

}
