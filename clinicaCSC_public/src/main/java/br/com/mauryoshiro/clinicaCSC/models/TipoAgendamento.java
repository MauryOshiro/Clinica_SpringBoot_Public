package br.com.mauryoshiro.clinicaCSC.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TipoAgendamento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idTipoAgendamento;

	private String descricaoTipoAgendamento;

	public Long getIdTipoAgendamento() {
		return idTipoAgendamento;
	}

	public void setIdTipoAgendamento(Long idTipoAgendamento) {
		this.idTipoAgendamento = idTipoAgendamento;
	}

	public String getDescricaoTipoAgendamento() {
		return descricaoTipoAgendamento;
	}

	public void setDescricaoTipoAgendamento(String descricaoTipoAgendamento) {
		this.descricaoTipoAgendamento = descricaoTipoAgendamento;
	}

	public TipoAgendamento(Long idTipoAgendamento, String descricaoTipoAgendamento) {
		this.idTipoAgendamento = idTipoAgendamento;
		this.descricaoTipoAgendamento = descricaoTipoAgendamento;
	}

	public TipoAgendamento() {
	}

}
