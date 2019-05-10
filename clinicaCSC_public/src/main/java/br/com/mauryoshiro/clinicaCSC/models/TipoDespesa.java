package br.com.mauryoshiro.clinicaCSC.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TipoDespesa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idTipoDespesa;

	private String descricaoTipoDespesa;

	private String observacaoTipoDespesa;

	public Integer getIdTipoDespesa() {
		return idTipoDespesa;
	}

	public void setIdTipoDespesa(Integer idTipoDespesa) {
		this.idTipoDespesa = idTipoDespesa;
	}

	public String getDescricaoTipoDespesa() {
		return descricaoTipoDespesa;
	}

	public void setDescricaoTipoDespesa(String descricaoTipoDespesa) {
		this.descricaoTipoDespesa = descricaoTipoDespesa;
	}

	public String getObservacaoTipoDespesa() {
		return observacaoTipoDespesa;
	}

	public void setObservacaoTipoDespesa(String observacaoTipoDespesa) {
		this.observacaoTipoDespesa = observacaoTipoDespesa;
	}

	public TipoDespesa(Integer idTipoDespesa, String descricaoTipoDespesa, String observacaoTipoDespesa) {
		this.idTipoDespesa = idTipoDespesa;
		this.descricaoTipoDespesa = descricaoTipoDespesa;
		this.observacaoTipoDespesa = observacaoTipoDespesa;
	}

	public TipoDespesa() {
	}

}
