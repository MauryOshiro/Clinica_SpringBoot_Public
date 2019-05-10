package br.com.mauryoshiro.clinicaCSC.models.log;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import br.com.mauryoshiro.clinicaCSC.models.AgendaPaciente;

@Entity
public class AgendaPacienteLog {

	@Id
	@GeneratedValue(generator = "increment")
	private Long id;

	@OneToOne
	private Log log;

	@OneToOne
	private AgendaPaciente agendaPaciente;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Log getLog() {
		return log;
	}

	public void setLog(Log log) {
		this.log = log;
	}

	public AgendaPaciente getAgendaPaciente() {
		return agendaPaciente;
	}

	public void setAgendaPaciente(AgendaPaciente agendaPaciente) {
		this.agendaPaciente = agendaPaciente;
	}

	public AgendaPacienteLog(Long id, Log log, AgendaPaciente agendaPaciente) {
		this.id = id;
		this.log = log;
		this.agendaPaciente = agendaPaciente;
	}

	public AgendaPacienteLog() {

	}
}
