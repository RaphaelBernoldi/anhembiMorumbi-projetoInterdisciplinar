package br.com.anhembi.simcamp.model.constants;

public enum EnumStatusTimePartida {

	CAMPEAO(0),
	PERDEDOR(1),
	EMPATE(2);
	
	private EnumStatusTimePartida(Integer codigo) {
		this.codigo = codigo;
	}

	private Integer codigo;

	public Integer getCodigo() {
		return codigo;
	}
	
	
}
