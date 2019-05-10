package br.com.mauryoshiro.clinicaCSC.models.log;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import br.com.mauryoshiro.clinicaCSC.models.EnderecoAntigo;

@Entity
public class EnderecoLog {

	@Id
	@GeneratedValue(generator = "increment")
	private Long id;

	@OneToOne
	private Log log;

	@OneToOne
	private EnderecoAntigo endereco;

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

	public EnderecoAntigo getEndereco() {
		return endereco;
	}

	public void setEndereco(EnderecoAntigo endereco) {
		this.endereco = endereco;
	}

	public EnderecoLog(Long id, Log log, EnderecoAntigo endereco) {
		this.id = id;
		this.log = log;
		this.endereco = endereco;
	}

	public EnderecoLog() {

	}
}
