package br.com.mauryoshiro.clinicaCSC.models;

import java.math.BigInteger;
import java.time.LocalDate;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class PessoaFisica {

	@Id
	@GeneratedValue(generator = "increment")
	private Long idPessoaFisica;

	private String nomePessoaFisica;

	private String sobrenomePessoaFisica;

	private String rgPessoaFisica;

	private BigInteger cpfPessoaFisica;

	private LocalDate dataNascimentoPessoaFisica;

	// String observacao;

	@OneToOne
	private EnderecoLocal endereco;

	// Contato contato;

	@OneToMany
	private Collection<Contato> contatos;

	private String sexoPessoaFisica;

	private String nivelEscolaridadePessoaFisica;

	private Integer idadePessoaFisica;

	public Long getIdPessoaFisica() {
		return idPessoaFisica;
	}

	public void setIdPessoaFisica(Long idPessoaFisica) {
		this.idPessoaFisica = idPessoaFisica;
	}

	public String getNomePessoaFisica() {
		return nomePessoaFisica;
	}

	public void setNomePessoaFisica(String nomePessoaFisica) {
		this.nomePessoaFisica = nomePessoaFisica;
	}

	public String getSobrenomePessoaFisica() {
		return sobrenomePessoaFisica;
	}

	public void setSobrenomePessoaFisica(String sobrenomePessoaFisica) {
		this.sobrenomePessoaFisica = sobrenomePessoaFisica;
	}

	public String getRgPessoaFisica() {
		return rgPessoaFisica;
	}

	public void setRgPessoaFisica(String rgPessoaFisica) {
		this.rgPessoaFisica = rgPessoaFisica;
	}

	public BigInteger getCpfPessoaFisica() {
		return cpfPessoaFisica;
	}

	public void setCpfPessoaFisica(BigInteger cpfPessoaFisica) {
		this.cpfPessoaFisica = cpfPessoaFisica;
	}

	public LocalDate getDataNascimentoPessoaFisica() {
		return dataNascimentoPessoaFisica;
	}

	public void setDataNascimentoPessoaFisica(LocalDate dataNascimentoPessoaFisica) {
		this.dataNascimentoPessoaFisica = dataNascimentoPessoaFisica;
	}

	public EnderecoLocal getEndereco() {
		return endereco;
	}

	public void setEndereco(EnderecoLocal endereco) {
		this.endereco = endereco;
	}

	public Collection<Contato> getContatos() {
		return contatos;
	}

	public void setContatos(Collection<Contato> contatos) {
		this.contatos = contatos;
	}

	public String getSexoPessoaFisica() {
		return sexoPessoaFisica;
	}

	public void setSexoPessoaFisica(String sexoPessoaFisica) {
		this.sexoPessoaFisica = sexoPessoaFisica;
	}

	public String getNivelEscolaridadePessoaFisica() {
		return nivelEscolaridadePessoaFisica;
	}

	public void setNivelEscolaridadePessoaFisica(String nivelEscolaridadePessoaFisica) {
		this.nivelEscolaridadePessoaFisica = nivelEscolaridadePessoaFisica;
	}

	public Integer getIdadePessoaFisica() {
		return idadePessoaFisica;
	}

	public void setIdadePessoaFisica(Integer idadePessoaFisica) {
		this.idadePessoaFisica = idadePessoaFisica;
	}

	public PessoaFisica(Long idPessoaFisica, String nomePessoaFisica, String sobrenomePessoaFisica,
			String rgPessoaFisica, BigInteger cpfPessoaFisica, LocalDate dataNascimentoPessoaFisica,
			EnderecoLocal endereco, Collection<Contato> contatos, String sexoPessoaFisica,
			String nivelEscolaridadePessoaFisica, Integer idadePessoaFisica) {
		this.idPessoaFisica = idPessoaFisica;
		this.nomePessoaFisica = nomePessoaFisica;
		this.sobrenomePessoaFisica = sobrenomePessoaFisica;
		this.rgPessoaFisica = rgPessoaFisica;
		this.cpfPessoaFisica = cpfPessoaFisica;
		this.dataNascimentoPessoaFisica = dataNascimentoPessoaFisica;
		this.endereco = endereco;
		this.contatos = contatos;
		this.sexoPessoaFisica = sexoPessoaFisica;
		this.nivelEscolaridadePessoaFisica = nivelEscolaridadePessoaFisica;
		this.idadePessoaFisica = idadePessoaFisica;
	}

	public PessoaFisica() {
	}

	/*
	 * public String getObservacao() { return observacao; }
	 * 
	 * public void setObservacao(String observacao) { this.observacao = observacao;
	 * }
	 */

	/*
	 * public PessoaFisica(String nome, String sobrenome, String rg, BigInteger cpf,
	 * LocalDate dataNascimento, String observacao, Endereco endereco,
	 * ContatoPessoaFisica contato, String sexo, String nivelEscolaridade, Integer
	 * idade) { this.nome = nome; this.sobrenome = sobrenome; this.rg = rg; this.cpf
	 * = cpf; this.dataNascimento = dataNascimento; this.observacao = observacao;
	 * this.endereco = endereco; this.contato = contato; this.sexo = sexo;
	 * this.nivelEscolaridade = nivelEscolaridade; this.idade = idade; }
	 */

}
