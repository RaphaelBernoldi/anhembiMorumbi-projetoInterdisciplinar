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
	
	private static final Integer CAMPEAO = 0;
	private static final Integer PERDEDOR = 1;
	private static final Integer EMPATE = 2;

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
	
	private void atualizaResultados(final Partida partida,final List<Resultado>resultados){
		
		if(partida.getGolsMandante() >  partida.getGolsVisitante()){
			preencheResultado(partida.getTimeMandante(), partida.getGolsMandante(), resultados, CAMPEAO);
			preencheResultado(partida.getTimeVisitante(), partida.getGolsVisitante(), resultados, PERDEDOR);
		}
		
		if(partida.getGolsMandante() < partida.getGolsVisitante()){
			preencheResultado(partida.getTimeVisitante(), partida.getGolsVisitante(), resultados, CAMPEAO);
			preencheResultado(partida.getTimeMandante(), partida.getGolsMandante(), resultados, PERDEDOR);
		}
		if(partida.getGolsMandante() == partida.getGolsVisitante()){
			preencheResultado(partida.getTimeVisitante(), partida.getGolsMandante(), resultados, EMPATE);
			preencheResultado(partida.getTimeMandante(), partida.getGolsMandante(), resultados, EMPATE);

		}
	}
	
	private Resultado preencheResultado(Time time, Integer gols, List<Resultado>resultados, Integer status){
		for (Resultado resultado : resultados) {
			if(resultado.getTime().getId() == time.getId()){
				resultado.setTime(time);
				resultado.setSaldoGols(resultado.getSaldoGols() + gols);

				if(status == CAMPEAO){
					resultado.setVitorias(resultado.getVitorias() + 1);
					resultado.setPontos(resultado.getPontos() + 3);

				}
				if(status == PERDEDOR){
					resultado.setDerrotas(resultado.getDerrotas() + 1);

				}
				if(status == EMPATE){
					resultado.setPontos(resultado.getPontos() + 1);
					resultado.setEmpates(resultado.getEmpates() + 1);
				}
				return resultado;
			}
		}
		return null;
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
