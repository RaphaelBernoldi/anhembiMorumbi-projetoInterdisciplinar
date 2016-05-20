package br.com.anhembi.simcamp.facade;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.anhembi.simcamp.entity.Campeonato;
import br.com.anhembi.simcamp.entity.EntidadeGenerica;
import br.com.anhembi.simcamp.entity.Resultado;
import br.com.anhembi.simcamp.entity.Time;
import br.com.anhembi.simcamp.repository.CampeonatoRepository;

@Service(value = "campeonatoFacade")
public class CampeonatoFacadeImpl implements CampeonatoFacade {
	
	@Resource
	private CampeonatoRepository campeonatoRepository;

	@Override
	@Transactional
	public Campeonato save(Campeonato campeonato) {
		return campeonatoRepository.save(campeonato);
	}

	@Override
	@Transactional
	public List<EntidadeGenerica> buscarTodos() {
		List<EntidadeGenerica>lsEntidadeGenerica = new ArrayList<>();
		lsEntidadeGenerica.addAll(campeonatoRepository.findAll());
		return lsEntidadeGenerica;
	}
	
	
	@Override
	@Transactional
	public void addTime(Long idCampeonato,Time time){
		Campeonato campeonato = campeonatoRepository.findOne(idCampeonato);
		campeonato.getTimes().add(time);
	}
	
	@Override
	@Transactional
	public List<EntidadeGenerica> buscarResultadosPorIDCampeonato(Long idCampeonato){
		Campeonato campeonato = campeonatoRepository.findOne(idCampeonato);
		List<EntidadeGenerica>resultados = new ArrayList<>();
		for (Resultado resultado : campeonato.getResultados()) {
			resultados.add(resultado);
		}
		return resultados;
		 
		 
	}

}
