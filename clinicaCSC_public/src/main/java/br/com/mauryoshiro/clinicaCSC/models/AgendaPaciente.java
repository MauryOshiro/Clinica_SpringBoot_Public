package br.com.mauryoshiro.clinicaCSC.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class AgendaPaciente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idAgendaPaciente;

	@ManyToOne
	private Paciente paciente;

	private Boolean geradoGuia;

	private Boolean faturadoAgendaPaciente;

	private Boolean presencaAgendaPaciente;

	@OneToOne
	private Agendamento agendamento;

	public Long getIdAgendaPaciente() {
		return idAgendaPaciente;
	}

	public void setIdAgendaPaciente(Long idAgendaPaciente) {
		this.idAgendaPaciente = idAgendaPaciente;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Boolean getGeradoGuia() {
		return geradoGuia;
	}

	public void setGeradoGuia(Boolean geradoGuia) {
		this.geradoGuia = geradoGuia;
	}

	public Boolean getFaturadoAgendaPaciente() {
		return faturadoAgendaPaciente;
	}

	public void setFaturadoAgendaPaciente(Boolean faturadoAgendaPaciente) {
		this.faturadoAgendaPaciente = faturadoAgendaPaciente;
	}

	public Boolean getPresencaAgendaPaciente() {
		return presencaAgendaPaciente;
	}

	public void setPresencaAgendaPaciente(Boolean presencaAgendaPaciente) {
		this.presencaAgendaPaciente = presencaAgendaPaciente;
	}

	public Agendamento getAgendamento() {
		return agendamento;
	}

	public void setAgendamento(Agendamento agendamento) {
		this.agendamento = agendamento;
	}

	public AgendaPaciente(Long idAgendaPaciente, Paciente paciente, Boolean geradoGuia, Boolean faturadoAgendaPaciente,
			Boolean presencaAgendaPaciente, Agendamento agendamento) {
		this.idAgendaPaciente = idAgendaPaciente;
		this.paciente = paciente;
		this.geradoGuia = geradoGuia;
		this.faturadoAgendaPaciente = faturadoAgendaPaciente;
		this.presencaAgendaPaciente = presencaAgendaPaciente;
		this.agendamento = agendamento;
	}

	public AgendaPaciente() {
	}

}