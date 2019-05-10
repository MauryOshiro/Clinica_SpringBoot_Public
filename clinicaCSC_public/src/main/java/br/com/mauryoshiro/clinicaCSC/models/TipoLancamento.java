package br.com.mauryoshiro.clinicaCSC.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TipoLancamento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idTipoLancamento;

	private String descricaoTipoLancamento;

	public Long getIdTipoLancamento() {
		return idTipoLancamento;
	}

	public void setIdTipoLancamento(Long idTipoLancamento) {
		this.idTipoLancamento = idTipoLancamento;
	}

	public String getDescricaoTipoLancamento() {
		return descricaoTipoLancamento;
	}

	public void setDescricaoTipoLancamento(String descricaoTipoLancamento) {
		this.descricaoTipoLancamento = descricaoTipoLancamento;
	}

	public TipoLancamento(Long idTipoLancamento, String descricaoTipoLancamento) {
		this.idTipoLancamento = idTipoLancamento;
		this.descricaoTipoLancamento = descricaoTipoLancamento;
	}

	public TipoLancamento() {
	}

}
