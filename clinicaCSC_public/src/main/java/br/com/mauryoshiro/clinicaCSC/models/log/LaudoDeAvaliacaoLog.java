package br.com.mauryoshiro.clinicaCSC.models.log;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import br.com.mauryoshiro.clinicaCSC.models.LaudoDeAvaliacao;

@Entity
public class LaudoDeAvaliacaoLog {

	@Id
	@GeneratedValue(generator = "increment")
	private Long id;

	@OneToOne
	private Log log;

	@OneToOne
	private LaudoDeAvaliacao laudo;

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

	public LaudoDeAvaliacao getLaudo() {
		return laudo;
	}

	public void setLaudo(LaudoDeAvaliacao laudo) {
		this.laudo = laudo;
	}

	public LaudoDeAvaliacaoLog(Long id, Log log, LaudoDeAvaliacao laudo) {
		this.id = id;
		this.log = log;
		this.laudo = laudo;
	}

	public LaudoDeAvaliacaoLog() {

	}
}
