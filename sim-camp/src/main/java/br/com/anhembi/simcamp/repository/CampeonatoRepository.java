package br.com.anhembi.simcamp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.anhembi.simcamp.entity.Campeonato;


/*	
Interface implementada pelo Spring destinada
a realizar apenas acesso ao banco e busca de dados
*/

public interface CampeonatoRepository extends JpaRepository<Campeonato, Long>{
	
	Campeonato findById(Long id);

}
