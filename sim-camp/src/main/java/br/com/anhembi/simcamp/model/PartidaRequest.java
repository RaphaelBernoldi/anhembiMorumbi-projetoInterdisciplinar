package br.com.anhembi.simcamp.model;

public class PartidaRequest {

	private Long idCampeonato;
	private Long idTimeMandante;
	private Long idTimeVisitante;
	private Integer golsMandante;
	private Integer golsVisitante;
	public Long getIdCampeonato() {
		return idCampeonato;
	}
	public void setIdCampeonato(Long idCampeonato) {
		this.idCampeonato = idCampeonato;
	}
	public Long getIdTimeMandante() {
		return idTimeMandante;
	}
	public void setIdTimeMandante(Long idTimeMandante) {
		this.idTimeMandante = idTimeMandante;
	}
	public Long getIdTimeVisitante() {
		return idTimeVisitante;
	}
	public void setIdTimeVisitante(Long idTimeVisitante) {
		this.idTimeVisitante = idTimeVisitante;
	}
	public Integer getGolsMandante() {
		return golsMandante;
	}
	public void setGolsMandante(Integer golsMandante) {
		this.golsMandante = golsMandante;
	}
	public Integer getGolsVisitante() {
		return golsVisitante;
	}
	public void setGolsVisitante(Integer golsVisitante) {
		this.golsVisitante = golsVisitante;
	}
	
	
}
