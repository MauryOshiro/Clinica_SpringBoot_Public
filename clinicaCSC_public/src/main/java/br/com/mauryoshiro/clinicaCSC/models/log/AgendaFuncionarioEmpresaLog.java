package br.com.mauryoshiro.clinicaCSC.models.log;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import br.com.mauryoshiro.clinicaCSC.models.AgendaFuncionarioEmpresa;

@Entity
public class AgendaFuncionarioEmpresaLog {

	@Id
	@GeneratedValue(generator = "increment")
	private Long id;

	@OneToOne
	private Log log;

	@OneToOne
	private AgendaFuncionarioEmpresa agendaFuncionarioEmpresa;

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

	public AgendaFuncionarioEmpresa getAgendaFuncionarioEmpresa() {
		return agendaFuncionarioEmpresa;
	}

	public void setAgendaFuncionarioEmpresa(AgendaFuncionarioEmpresa agendaFuncionarioEmpresa) {
		this.agendaFuncionarioEmpresa = agendaFuncionarioEmpresa;
	}

	public AgendaFuncionarioEmpresaLog(Long id, Log log, AgendaFuncionarioEmpresa agendaFuncionarioEmpresa) {
		this.id = id;
		this.log = log;
		this.agendaFuncionarioEmpresa = agendaFuncionarioEmpresa;
	}

	public AgendaFuncionarioEmpresaLog() {

	}
}
