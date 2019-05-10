package br.com.mauryoshiro.clinicaCSC.models.log;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import br.com.mauryoshiro.clinicaCSC.models.PortadorSaldo;

@Entity
public class PortadorSaldoLog {

	@Id
	@GeneratedValue(generator = "increment")
	private Long id;

	@OneToOne
	private Log log;

	@OneToOne
	private PortadorSaldo portadorSaldo;

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

	public PortadorSaldo getPortadorSaldo() {
		return portadorSaldo;
	}

	public void setPortadorSaldo(PortadorSaldo portadorSaldo) {
		this.portadorSaldo = portadorSaldo;
	}

	public PortadorSaldoLog(Long id, Log log, PortadorSaldo portadorSaldo) {
		this.id = id;
		this.log = log;
		this.portadorSaldo = portadorSaldo;
	}

	public PortadorSaldoLog() {

	}
}
