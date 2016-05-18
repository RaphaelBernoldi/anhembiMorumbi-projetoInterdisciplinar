package br.com.anhembi.simcamp.facade;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.anhembi.simcamp.entity.Partida;
import br.com.anhembi.simcamp.model.PartidaRequest;
import br.com.anhembi.simcamp.repository.CampeonatoRepository;
import br.com.anhembi.simcamp.repository.PartidaRepository;
import br.com.anhembi.simcamp.repository.TimeRepository;

@Service(value = "partidaFacade")
public class PartidaFacadeImpl implements PartidaFacade{

	@Resource
	private PartidaRepository partidaRepository;
	
	@Resource
	private CampeonatoRepository campeonatoRepository;
	
	@Resource
	private TimeRepository timeRepository;
	
	@Override
	@Transactional
	public Partida save(PartidaRequest partidaRequest) {
		Partida partida = new Partida();
		partida.setCampeonato(campeonatoRepository.findOne(partidaRequest.getIdCampeonato()));
		partida.setGolsMandante(partidaRequest.getGolsMandante());
		partida.setGolsVisitante(partidaRequest.getGolsVisitante());
		partida.setTimeMandante(timeRepository.findOne(partidaRequest.getIdTimeMandante()));
		partida.setTimeVisitante(timeRepository.findOne(partidaRequest.getIdTimeVisitante()));
		return partidaRepository.save(partida);
		
	}

}
