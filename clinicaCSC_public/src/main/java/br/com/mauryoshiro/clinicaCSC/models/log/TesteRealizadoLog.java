package br.com.mauryoshiro.clinicaCSC.models.log;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import br.com.mauryoshiro.clinicaCSC.models.TesteRealizado;

@Entity
public class TesteRealizadoLog {

	@Id
	@GeneratedValue(generator = "increment")
	private Long id;

	@OneToOne
	private Log log;

	@OneToOne
	private TesteRealizado testeRealizado;

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

	public TesteRealizado getTesteRealizado() {
		return testeRealizado;
	}

	public void setTesteRealizado(TesteRealizado testeRealizado) {
		this.testeRealizado = testeRealizado;
	}

	public TesteRealizadoLog(Long id, Log log, TesteRealizado testeRealizado) {
		this.id = id;
		this.log = log;
		this.testeRealizado = testeRealizado;
	}

	public TesteRealizadoLog() {

	}
}
