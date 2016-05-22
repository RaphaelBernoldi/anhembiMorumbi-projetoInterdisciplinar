package br.com.anhembi.simcamp.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="CAMPEONATO")
public class Campeonato extends EntidadeGenerica implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	@Column(unique=true)
	private String nome;
	
	@OneToMany(fetch=FetchType.EAGER)
	private List<Time>times;
	
	@OneToMany(fetch=FetchType.EAGER)
	private List<Partida>partidas;
	
	@OneToMany(fetch=FetchType.EAGER)
	private List<Resultado>resultados;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Time> getTimes() {
		if(times == null){
			times = new ArrayList<>();
		}
		return times;
	}

	public void setTimes(List<Time> times) {
		this.times = times;
	}

	public List<Partida> getPartidas() {
		if(partidas == null){
			partidas = new ArrayList<>();
		}
		return partidas;
	}

	public void setPartidas(List<Partida> partidas) {
		this.partidas = partidas;
	}

	public List<Resultado> getResultados() {
		if(resultados == null){
			resultados = new ArrayList<>();
		}
		return resultados;
	}

	public void setResultados(List<Resultado> resultados) {
		this.resultados = resultados;
	}
	
	
}
