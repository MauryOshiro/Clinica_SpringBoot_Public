package br.com.mauryoshiro.clinicaCSC.models.log;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import br.com.mauryoshiro.clinicaCSC.models.GuiaConvenio;

@Entity
public class GuiaConvenioLog {

	@Id
	@GeneratedValue(generator = "increment")
	private Long id;

	@OneToOne
	private Log log;

	@OneToOne
	private GuiaConvenio guiaConvenio;

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

	public GuiaConvenio getGuiaConvenio() {
		return guiaConvenio;
	}

	public void setGuiaConvenio(GuiaConvenio guiaConvenio) {
		this.guiaConvenio = guiaConvenio;
	}

	public GuiaConvenioLog(Long id, Log log, GuiaConvenio guiaConvenio) {
		this.id = id;
		this.log = log;
		this.guiaConvenio = guiaConvenio;
	}

	public GuiaConvenioLog() {

	}
}
