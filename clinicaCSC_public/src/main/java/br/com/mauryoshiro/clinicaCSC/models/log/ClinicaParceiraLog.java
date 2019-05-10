package br.com.mauryoshiro.clinicaCSC.models.log;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import br.com.mauryoshiro.clinicaCSC.models.ClinicaParceira;

@Entity
public class ClinicaParceiraLog {

	@Id
	@GeneratedValue(generator = "increment")
	private Long id;

	@OneToOne
	private Log log;

	@OneToOne
	private ClinicaParceira clinicaParceira;

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

	public ClinicaParceira getClinicaParceira() {
		return clinicaParceira;
	}

	public void setClinicaParceira(ClinicaParceira clinicaParceira) {
		this.clinicaParceira = clinicaParceira;
	}

	public ClinicaParceiraLog(Long id, Log log, ClinicaParceira clinicaParceira) {
		this.id = id;
		this.log = log;
		this.clinicaParceira = clinicaParceira;
	}

	public ClinicaParceiraLog() {

	}
}
