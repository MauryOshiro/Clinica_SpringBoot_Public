package br.com.mauryoshiro.clinicaCSC.models.log;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import br.com.mauryoshiro.clinicaCSC.models.ContatoNaPessoaJuridica;

@Entity
public class ContatoNaPessoaJuridicaLog {

	@Id
	@GeneratedValue(generator = "increment")
	private Long id;

	@OneToOne
	private Log log;

	@OneToOne
	private ContatoNaPessoaJuridica contato;

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

	public ContatoNaPessoaJuridica getContato() {
		return contato;
	}

	public void setContato(ContatoNaPessoaJuridica contato) {
		this.contato = contato;
	}

	public ContatoNaPessoaJuridicaLog(Long id, Log log, ContatoNaPessoaJuridica contato) {
		this.id = id;
		this.log = log;
		this.contato = contato;
	}

	public ContatoNaPessoaJuridicaLog() {

	}
}
