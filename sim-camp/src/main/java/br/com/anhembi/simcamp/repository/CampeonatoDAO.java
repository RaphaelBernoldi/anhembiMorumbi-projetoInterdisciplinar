package br.com.anhembi.simcamp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.anhembi.simcamp.entity.Campeonato;

public interface CampeonatoDAO extends JpaRepository<Campeonato, Long>{

}
