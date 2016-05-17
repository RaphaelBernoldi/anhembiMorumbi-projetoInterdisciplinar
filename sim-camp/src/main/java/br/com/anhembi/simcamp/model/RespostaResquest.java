package br.com.anhembi.simcamp.model;

import java.util.List;

import br.com.anhembi.simcamp.entity.EntidadeGenerica;

/*
	Classe destinada a ser um modelo
	padronizado de resposta para o front
	
*/
	
public class RespostaResquest {
	
	private String message;
	
	private EntidadeGenerica objetoEncontrado;
	
	private List<EntidadeGenerica>lsObjetosEncontrados;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public EntidadeGenerica getObjetoEncontrado() {
		return objetoEncontrado;
	}

	public void setObjetoEncontrado(EntidadeGenerica objetoEncontrado) {
		this.objetoEncontrado = objetoEncontrado;
	}

	public List<EntidadeGenerica> getLsObjetosEncontrados() {
		return lsObjetosEncontrados;
	}

	public void setLsObjetosEncontrados(List<EntidadeGenerica> lsObjetosEncontrados) {
		this.lsObjetosEncontrados = lsObjetosEncontrados;
	}
	
	

}
