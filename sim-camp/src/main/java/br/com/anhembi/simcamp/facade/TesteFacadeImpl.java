package br.com.anhembi.simcamp.facade;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import br.com.anhembi.simcamp.repository.TesteRepository;


@Service(value = "testeFacade")
public class TesteFacadeImpl implements TesteFacade {

	@Resource
	private TesteRepository testeRepository;
	
	@Override
	public void findTeste() {
		System.out.println("Teste");

	}

}
