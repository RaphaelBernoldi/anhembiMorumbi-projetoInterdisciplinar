package br.com.anhembi.simcamp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.anhembi.simcamp.entity.Resultado;

/*	
Interface implementada pelo Spring destinada
a realizar apenas acesso ao banco e busca de dados
*/


public interface ResultadoRepository extends JpaRepository<Resultado, Long> {
	
}
