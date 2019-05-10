package br.com.mauryoshiro.clinicaCSC.models.log;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import br.com.mauryoshiro.clinicaCSC.models.FaturaEmpresaParceira;

@Entity
public class FaturaEmpresaParceiraLog {

	@Id
	@GeneratedValue(generator = "increment")
	private Long id;

	@OneToOne
	private Log log;

	@OneToOne
	private FaturaEmpresaParceira faturaEmpresaParceira;

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

	public FaturaEmpresaParceira getFaturaEmpresaParceira() {
		return faturaEmpresaParceira;
	}

	public void setFaturaEmpresaParceira(FaturaEmpresaParceira faturaEmpresaParceira) {
		this.faturaEmpresaParceira = faturaEmpresaParceira;
	}

	public FaturaEmpresaParceiraLog(Long id, Log log, FaturaEmpresaParceira faturaEmpresaParceira) {
		this.id = id;
		this.log = log;
		this.faturaEmpresaParceira = faturaEmpresaParceira;
	}

	public FaturaEmpresaParceiraLog() {

	}
}
