package br.com.mauryoshiro.clinicaCSC.models.log;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import br.com.mauryoshiro.clinicaCSC.models.EmpresaParceira;

@Entity
public class EmpresaParceiraLog {

	@Id
	@GeneratedValue(generator = "increment")
	private Long id;

	@OneToOne
	private Log log;

	@OneToOne
	private EmpresaParceira empresaParceira;

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

	public EmpresaParceira getEmpresaParceira() {
		return empresaParceira;
	}

	public void setEmpresaParceira(EmpresaParceira empresaParceira) {
		this.empresaParceira = empresaParceira;
	}

	public EmpresaParceiraLog(Long id, Log log, EmpresaParceira empresaParceira) {
		this.id = id;
		this.log = log;
		this.empresaParceira = empresaParceira;
	}

	public EmpresaParceiraLog() {

	}
}
