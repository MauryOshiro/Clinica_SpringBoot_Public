package br.com.mauryoshiro.clinicaCSC.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class AgendaFuncionarioEmpresa {

	// Teste

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idAgendaFuncionarioEmpresa;

	@ManyToOne
	private FuncionarioEmpresa funcionario;

	private Boolean faturadoAgendaFuncionarioEmpresa;

	private Boolean presencaAgendaFuncionarioEmpresa;

	@OneToOne
	private Agendamento agendamento;

	public Long getIdAgendaFuncionarioEmpresa() {
		return idAgendaFuncionarioEmpresa;
	}

	public void setIdAgendaFuncionarioEmpresa(Long idAgendaFuncionarioEmpresa) {
		this.idAgendaFuncionarioEmpresa = idAgendaFuncionarioEmpresa;
	}

	public FuncionarioEmpresa getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(FuncionarioEmpresa funcionario) {
		this.funcionario = funcionario;
	}

	public Boolean getFaturadoAgendaFuncionarioEmpresa() {
		return faturadoAgendaFuncionarioEmpresa;
	}

	public void setFaturadoAgendaFuncionarioEmpresa(Boolean faturadoAgendaFuncionarioEmpresa) {
		this.faturadoAgendaFuncionarioEmpresa = faturadoAgendaFuncionarioEmpresa;
	}

	public Boolean getPresencaAgendaFuncionarioEmpresa() {
		return presencaAgendaFuncionarioEmpresa;
	}

	public void setPresencaAgendaFuncionarioEmpresa(Boolean presencaAgendaFuncionarioEmpresa) {
		this.presencaAgendaFuncionarioEmpresa = presencaAgendaFuncionarioEmpresa;
	}

	public Agendamento getAgendamento() {
		return agendamento;
	}

	public void setAgendamento(Agendamento agendamento) {
		this.agendamento = agendamento;
	}

	public AgendaFuncionarioEmpresa(Long idAgendaFuncionarioEmpresa, FuncionarioEmpresa funcionario,
			Boolean faturadoAgendaFuncionarioEmpresa, Boolean presencaAgendaFuncionarioEmpresa,
			Agendamento agendamento) {
		this.idAgendaFuncionarioEmpresa = idAgendaFuncionarioEmpresa;
		this.funcionario = funcionario;
		this.faturadoAgendaFuncionarioEmpresa = faturadoAgendaFuncionarioEmpresa;
		this.presencaAgendaFuncionarioEmpresa = presencaAgendaFuncionarioEmpresa;
		this.agendamento = agendamento;
	}

	public AgendaFuncionarioEmpresa() {
	}

}
