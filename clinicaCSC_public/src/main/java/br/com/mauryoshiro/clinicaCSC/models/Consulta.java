package br.com.mauryoshiro.clinicaCSC.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Consulta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idConsulta;

	@OneToOne
	private Agendamento agendamento;

	private Boolean presencaConsulta;

	private Boolean canceladoConsulta;

	private String observacaoConsulta;

	@OneToOne
	private TipoConsulta tipoConsulta;

	public Long getIdConsulta() {
		return idConsulta;
	}

	public void setIdConsulta(Long idConsulta) {
		this.idConsulta = idConsulta;
	}

	public Agendamento getAgendamento() {
		return agendamento;
	}

	public void setAgendamento(Agendamento agendamento) {
		this.agendamento = agendamento;
	}

	public Boolean getPresencaConsulta() {
		return presencaConsulta;
	}

	public void setPresencaConsulta(Boolean presencaConsulta) {
		this.presencaConsulta = presencaConsulta;
	}

	public Boolean getCanceladoConsulta() {
		return canceladoConsulta;
	}

	public void setCanceladoConsulta(Boolean canceladoConsulta) {
		this.canceladoConsulta = canceladoConsulta;
	}

	public String getObservacaoConsulta() {
		return observacaoConsulta;
	}

	public void setObservacaoConsulta(String observacaoConsulta) {
		this.observacaoConsulta = observacaoConsulta;
	}

	public TipoConsulta getTipoConsulta() {
		return tipoConsulta;
	}

	public void setTipoConsulta(TipoConsulta tipoConsulta) {
		this.tipoConsulta = tipoConsulta;
	}

	public Consulta(Long idConsulta, Agendamento agendamento, Boolean presencaConsulta, Boolean canceladoConsulta,
			String observacaoConsulta, TipoConsulta tipoConsulta) {
		this.idConsulta = idConsulta;
		this.agendamento = agendamento;
		this.presencaConsulta = presencaConsulta;
		this.canceladoConsulta = canceladoConsulta;
		this.observacaoConsulta = observacaoConsulta;
		this.tipoConsulta = tipoConsulta;
	}

	public Consulta() {
	}

}
