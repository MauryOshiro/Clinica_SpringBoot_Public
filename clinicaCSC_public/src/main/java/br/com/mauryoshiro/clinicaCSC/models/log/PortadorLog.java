package br.com.mauryoshiro.clinicaCSC.models.log;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import br.com.mauryoshiro.clinicaCSC.models.Portador;

@Entity
public class PortadorLog {

	@Id
	@GeneratedValue(generator = "increment")
	private Long id;

	@OneToOne
	private Log log;

	@OneToOne
	private Portador portador;

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

	public Portador getPortador() {
		return portador;
	}

	public void setPortador(Portador portador) {
		this.portador = portador;
	}

	public PortadorLog(Long id, Log log, Portador portador) {
		this.id = id;
		this.log = log;
		this.portador = portador;
	}

	public PortadorLog() {

	}
}
