package br.com.anhembi.simcamp.facade;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.anhembi.simcamp.entity.EntidadeGenerica;
import br.com.anhembi.simcamp.entity.Time;
import br.com.anhembi.simcamp.repository.TimeRepository;

@Service(value="timeFacade")
public class TimeFacadeImpl implements TimeFacade {

	@Resource
	private TimeRepository timeRepository;
	
	@Transactional
	@Override
	public Time save(Time time) {
		try{
		return timeRepository.save(time);
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}

	@Override
	@Transactional
	public List<EntidadeGenerica> buscarTodos() {
		List<EntidadeGenerica>lsEntidadeGenerica = new ArrayList<>();
			lsEntidadeGenerica.addAll(timeRepository.findAll());
		return lsEntidadeGenerica;
	}
	
	

}
