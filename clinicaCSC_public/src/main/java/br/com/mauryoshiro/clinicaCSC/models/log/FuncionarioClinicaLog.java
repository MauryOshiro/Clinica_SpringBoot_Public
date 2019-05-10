package br.com.mauryoshiro.clinicaCSC.models.log;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import br.com.mauryoshiro.clinicaCSC.models.FuncionarioClinica;

@Entity
public class FuncionarioClinicaLog {

	@Id
	@GeneratedValue(generator = "increment")
	private Long id;

	@OneToOne
	private Log log;

	@OneToOne
	private FuncionarioClinica funcionarioClinica;

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

	public FuncionarioClinica getFuncionarioClinica() {
		return funcionarioClinica;
	}

	public void setFuncionarioClinica(FuncionarioClinica funcionarioClinica) {
		this.funcionarioClinica = funcionarioClinica;
	}

	public FuncionarioClinicaLog(Long id, Log log, FuncionarioClinica funcionarioClinica) {
		this.id = id;
		this.log = log;
		this.funcionarioClinica = funcionarioClinica;
	}

	public FuncionarioClinicaLog() {

	}
}
