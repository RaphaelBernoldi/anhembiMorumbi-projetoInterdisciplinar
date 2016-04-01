package br.com.anhembi.simcamp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.anhembi.simcamp.entity.Time;

public interface TimeDAO extends JpaRepository<Time, Long> {

}
