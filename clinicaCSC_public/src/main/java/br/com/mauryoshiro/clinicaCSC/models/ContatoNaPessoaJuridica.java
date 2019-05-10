package br.com.mauryoshiro.clinicaCSC.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class ContatoNaPessoaJuridica {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idContatoNaPessoaJuridica;

	// private String nome;

	// private Contato contato;

	@OneToOne
	private PessoaFisica pessoa;

	private String observacao;

	public Long getIdContatoNaPessoaJuridica() {
		return idContatoNaPessoaJuridica;
	}

	public void setIdContatoNaPessoaJuridica(Long idContatoNaPessoaJuridica) {
		this.idContatoNaPessoaJuridica = idContatoNaPessoaJuridica;
	}

	public PessoaFisica getPessoa() {
		return pessoa;
	}

	public void setPessoa(PessoaFisica pessoa) {
		this.pessoa = pessoa;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public ContatoNaPessoaJuridica(Long idContatoNaPessoaJuridica, PessoaFisica pessoa, String observacao) {
		this.idContatoNaPessoaJuridica = idContatoNaPessoaJuridica;
		this.pessoa = pessoa;
		this.observacao = observacao;
	}

	public ContatoNaPessoaJuridica() {
	}

	/*
	 * public String getNome() { return nome; }
	 * 
	 * public void setNome(String nome) { this.nome = nome; }
	 */

	/*
	 * public Contato getContato() { return contato; }
	 * 
	 * public void setContato(Contato contato) { this.contato = contato; }
	 */

}
