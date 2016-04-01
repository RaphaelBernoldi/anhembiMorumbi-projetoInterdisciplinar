package br.com.anhembi.simcamp.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import br.com.anhembi.simcamp.entity.Teste;

public interface TesteDAO extends JpaRepository<Teste, Long> {

}
