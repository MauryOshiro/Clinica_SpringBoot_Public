package br.com.mauryoshiro.clinicaCSC.models.log;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import br.com.mauryoshiro.clinicaCSC.models.PessoaFisica;

@Entity
public class PessoaFisicaLog {

	@Id
	@GeneratedValue(generator = "increment")
	private Long id;

	@OneToOne
	private Log log;

	@OneToOne
	private PessoaFisica pessoaFisica;

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

	public PessoaFisica getPessoaFisica() {
		return pessoaFisica;
	}

	public void setPessoaFisica(PessoaFisica pessoaFisica) {
		this.pessoaFisica = pessoaFisica;
	}

	public PessoaFisicaLog(Long id, Log log, PessoaFisica pessoaFisica) {
		this.id = id;
		this.log = log;
		this.pessoaFisica = pessoaFisica;
	}

	public PessoaFisicaLog() {

	}
}
