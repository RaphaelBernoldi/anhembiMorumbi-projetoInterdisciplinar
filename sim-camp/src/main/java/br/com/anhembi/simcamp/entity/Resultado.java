package br.com.anhembi.simcamp.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="RESULTADO")
public class Resultado extends EntidadeGenerica implements Serializable  {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	@OneToOne
	private Time time;
	@Column
	private Integer saldoGols;
	@Column
	private Integer pontos;
	@Column
	private Integer vitorias;
	@Column
	private Integer derrotas;
	@Column
	private Integer empates;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Time getTime() {
		return time;
	}
	public void setTime(Time time) {
		this.time = time;
	}
	public Integer getSaldoGols() {
		return saldoGols;
	}
	public void setSaldoGols(Integer saldoGols) {
		this.saldoGols = saldoGols;
	}
	public Integer getPontos() {
		return pontos;
	}
	public void setPontos(Integer pontos) {
		this.pontos = pontos;
	}
	public Integer getVitorias() {
		return vitorias;
	}
	public void setVitorias(Integer vitorias) {
		this.vitorias = vitorias;
	}
	public Integer getDerrotas() {
		return derrotas;
	}
	public void setDerrotas(Integer derrotas) {
		this.derrotas = derrotas;
	}
	public Integer getEmpates() {
		return empates;
	}
	public void setEmpates(Integer empates) {
		this.empates = empates;
	}	
}
