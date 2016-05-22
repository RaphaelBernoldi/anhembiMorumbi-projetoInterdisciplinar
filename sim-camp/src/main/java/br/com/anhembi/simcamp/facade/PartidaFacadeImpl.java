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
import br.com.anhembi.simcamp.entity.Time;
import br.com.anhembi.simcamp.model.PartidaRequest;
import br.com.anhembi.simcamp.model.constants.EnumStatusTimePartida;
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
	private ResultadoFacade resultadoFacade;
	
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
		atualizaResultados(partida, campeonato.getResultados());
		
		return partidaRepository.save(partida);
		
	}
	
	@Override
	@Transactional
	public void atualizaResultados(final Partida partida,final List<Resultado>resultados){
		
		if(partida.getGolsMandante() >  partida.getGolsVisitante()){
			preencheResultado(partida.getTimeMandante(), partida.getGolsMandante(), resultados, EnumStatusTimePartida.CAMPEAO);
			preencheResultado(partida.getTimeVisitante(), partida.getGolsVisitante(), resultados, EnumStatusTimePartida.PERDEDOR);
		}
		
		if(partida.getGolsMandante() < partida.getGolsVisitante()){
			preencheResultado(partida.getTimeVisitante(), partida.getGolsVisitante(), resultados, EnumStatusTimePartida.CAMPEAO);
			preencheResultado(partida.getTimeMandante(), partida.getGolsMandante(), resultados, EnumStatusTimePartida.PERDEDOR);
		}
		if(partida.getGolsMandante() == partida.getGolsVisitante()){
			preencheResultado(partida.getTimeVisitante(), partida.getGolsMandante(), resultados, EnumStatusTimePartida.EMPATE);
			preencheResultado(partida.getTimeMandante(), partida.getGolsMandante(), resultados, EnumStatusTimePartida.EMPATE);

		}
	}
	
	@Override
	@Transactional
	public void preencheResultado(Time time, Integer gols, List<Resultado>resultados, EnumStatusTimePartida status){
		
		Resultado resultado = resultadoFacade.buscaResultadoDoTime(time, resultados);
		if(resultado == null){
			resultado = new Resultado();
			resultadoFacade.atualizaPontos(resultado, gols, time, status);
			Resultado resultadoSalvo = resultadoFacade.salva(resultado);
			resultados.add(resultadoSalvo);
			
		}else{
			resultadoFacade.atualizaPontos(resultado, gols, time, status);
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
