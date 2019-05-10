package br.com.mauryoshiro.clinicaCSC.models.log;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import br.com.mauryoshiro.clinicaCSC.models.FaturaConvenio;

@Entity
public class FaturaConvenioLog {

	@Id
	@GeneratedValue(generator = "increment")
	private Long id;

	@OneToOne
	private Log log;

	@OneToOne
	private FaturaConvenio faturaConvenio;

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

	public FaturaConvenio getFaturaConvenio() {
		return faturaConvenio;
	}

	public void setFaturaConvenio(FaturaConvenio faturaConvenio) {
		this.faturaConvenio = faturaConvenio;
	}

	public FaturaConvenioLog(Long id, Log log, FaturaConvenio faturaConvenio) {
		this.id = id;
		this.log = log;
		this.faturaConvenio = faturaConvenio;
	}

	public FaturaConvenioLog() {

	}
}
