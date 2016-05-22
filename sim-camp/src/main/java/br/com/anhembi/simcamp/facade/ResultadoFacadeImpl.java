package br.com.anhembi.simcamp.facade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.anhembi.simcamp.entity.Resultado;
import br.com.anhembi.simcamp.entity.Time;
import br.com.anhembi.simcamp.model.constants.EnumStatusTimePartida;
import br.com.anhembi.simcamp.repository.ResultadoRepository;


@Service(value = "resultadoFacade")
public class ResultadoFacadeImpl implements ResultadoFacade {
	
	@Autowired
	public ResultadoRepository resultadoRepository;

	@Override
	public Resultado buscaResultadoDoTime(Time time, List<Resultado> resultados) {
		for (Resultado resultado : resultados) {
			if(resultado.getTime().getId() == time.getId()){
				return resultado;
			}
		}
		return null;
	}
	
	@Override
	@Transactional
	public Resultado salva(Resultado resultado){
		return resultadoRepository.save(resultado);
	}
	
	@Override
	public Resultado atualizaPontos(Resultado resultado, Integer gols, Time time, EnumStatusTimePartida status){
		resultado.setTime(time);
		resultado.setSaldoGols(resultado.getSaldoGols() + gols);

		if(status.equals(EnumStatusTimePartida.CAMPEAO)){
			resultado.setVitorias(resultado.getVitorias() + 1);
			resultado.setPontos(resultado.getPontos() + 3);

		}
		if(status.equals(EnumStatusTimePartida.PERDEDOR)){
			resultado.setDerrotas(resultado.getDerrotas() + 1);

		}
		if(status.equals(EnumStatusTimePartida.EMPATE)){
			resultado.setPontos(resultado.getPontos() + 1);
			resultado.setEmpates(resultado.getEmpates() + 1);
		}
		return resultado;
	}

}
