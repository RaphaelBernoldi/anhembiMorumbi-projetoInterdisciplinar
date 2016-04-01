package br.com.anhembi.simcamp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.anhembi.simcamp.entity.Partida;

public interface PartidaDAO extends JpaRepository<Partida, Long> {

}
