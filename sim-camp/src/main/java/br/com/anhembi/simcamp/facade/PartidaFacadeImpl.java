package br.com.anhembi.simcamp.facade;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.anhembi.simcamp.entity.Campeonato;
import br.com.anhembi.simcamp.entity.EntidadeGenerica;
import br.com.anhembi.simcamp.entity.Partida;
import br.com.anhembi.simcamp.entity.Resultado;
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
		Campeonato campeonato = campeonatoRepository.findOne(partidaRequest.getIdCampeonato());
		partida.setCampeonato(campeonato);
		partida.setGolsMandante(partidaRequest.getGolsMandante());
		partida.setGolsVisitante(partidaRequest.getGolsVisitante());
		partida.setTimeMandante(timeRepository.findOne(partidaRequest.getIdTimeMandante()));
		partida.setTimeVisitante(timeRepository.findOne(partidaRequest.getIdTimeVisitante()));
		atualizaResultado(partida, campeonato.getResultados());
		
		return partidaRepository.save(partida);
		
	}
	
	private void atualizaResultado(final Partida partida,final List<Resultado>resultados){
	/*	Resultado resultado = new Resultado();
		resultado.setDerrotas(0);
		resultado.setEmpates(0);
		resultado.setPontos(0);
		resultado.setSaldoGols(0);
		resultado.setTime(null);
		resultado.setVitorias(0); */
		for (Resultado resultado : resultados) {
		/*	if(resultado.getTime().getId() == partida.){
				
			}*/
			
		}
		
		if(partida.getGolsMandante() >  partida.getGolsVisitante()){
			resultado.setTime(partida.getTimeMandante());
			resultado.setVitorias(resultado.getVitorias()+1);
			resultado.setSaldoGols(resultado.getSaldoGols()+partida.getGolsMandante());
		}
		
		
	}
	
	
	@Override
	@Transactional
	public List<EntidadeGenerica> buscarPartidasPorCampeonato(Long idCampeonato) {
		Campeonato campeonato = campeonatoRepository.findById(idCampeonato);
		 List<Partida> partidas = partidaRepository.findPartidaByCampeonato(campeonato);
		 List<EntidadeGenerica>lsObjetosEncontrados = new ArrayList<>();
		 for (Partida partida : partidas) {
			 lsObjetosEncontrados.add(partida);
		}
		
		return lsObjetosEncontrados;
	}

}
