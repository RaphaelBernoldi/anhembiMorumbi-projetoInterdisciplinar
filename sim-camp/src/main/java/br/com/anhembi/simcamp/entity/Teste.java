package br.com.anhembi.simcamp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Teste  {
	
	@Id
	private Long ig;
	@Column
	private String teste;
	public Long getIg() {
		return ig;
	}
	public void setIg(Long ig) {
		this.ig = ig;
	}
	public String getTeste() {
		return teste;
	}
	public void setTeste(String teste) {
		this.teste = teste;
	}
	

}
