package br.com.mauryoshiro.clinicaCSC.models.log;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import br.com.mauryoshiro.clinicaCSC.models.Conciliacao;

@Entity
public class ConciliacaoLog {

	@Id
	@GeneratedValue(generator = "increment")
	private Long id;

	@OneToOne
	private Log log;

	@OneToOne
	private Conciliacao conciliacao;

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

	public Conciliacao getConciliacao() {
		return conciliacao;
	}

	public void setConciliacao(Conciliacao conciliacao) {
		this.conciliacao = conciliacao;
	}

	public ConciliacaoLog(Long id, Log log, Conciliacao conciliacao) {
		this.id = id;
		this.log = log;
		this.conciliacao = conciliacao;
	}

	public ConciliacaoLog() {

	}
}
