package br.com.anhembi.simcamp.facade;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import br.com.anhembi.simcamp.entity.Time;
import br.com.anhembi.simcamp.repository.TimeRepository;

@Service(value="timeFacade")
public class TimeFacadeImpl implements TimeFacade {

	@Resource
	private TimeRepository timeRepository;
	
	@Override
	public Time save(Time time) {
		return timeRepository.save(time);
	}

}
