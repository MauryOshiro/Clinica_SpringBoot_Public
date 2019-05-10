package br.com.mauryoshiro.clinicaCSC.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class PessoaJuridica {

	@Id
	@GeneratedValue(generator = "increment")
	private Long idPessoaJuridica;

	private String cnpjPessoaJuridica;

	private String razaoSocialPessoaJuridica;

	private String nomeFantasiaPessoaJuridica;

	private String iePessoaJuridica;

	private String imPessoaJuridica;

	@OneToOne
	private EnderecoAntigo endereco;

	public Long getIdPessoaJuridica() {
		return idPessoaJuridica;
	}

	public void setIdPessoaJuridica(Long idPessoaJuridica) {
		this.idPessoaJuridica = idPessoaJuridica;
	}

	public String getCnpjPessoaJuridica() {
		return cnpjPessoaJuridica;
	}

	public void setCnpjPessoaJuridica(String cnpjPessoaJuridica) {
		this.cnpjPessoaJuridica = cnpjPessoaJuridica;
	}

	public String getRazaoSocialPessoaJuridica() {
		return razaoSocialPessoaJuridica;
	}

	public void setRazaoSocialPessoaJuridica(String razaoSocialPessoaJuridica) {
		this.razaoSocialPessoaJuridica = razaoSocialPessoaJuridica;
	}

	public String getNomeFantasiaPessoaJuridica() {
		return nomeFantasiaPessoaJuridica;
	}

	public void setNomeFantasiaPessoaJuridica(String nomeFantasiaPessoaJuridica) {
		this.nomeFantasiaPessoaJuridica = nomeFantasiaPessoaJuridica;
	}

	public String getIePessoaJuridica() {
		return iePessoaJuridica;
	}

	public void setIePessoaJuridica(String iePessoaJuridica) {
		this.iePessoaJuridica = iePessoaJuridica;
	}

	public String getImPessoaJuridica() {
		return imPessoaJuridica;
	}

	public void setImPessoaJuridica(String imPessoaJuridica) {
		this.imPessoaJuridica = imPessoaJuridica;
	}

	public EnderecoAntigo getEndereco() {
		return endereco;
	}

	public void setEndereco(EnderecoAntigo endereco) {
		this.endereco = endereco;
	}

	public PessoaJuridica(Long idPessoaJuridica, String cnpjPessoaJuridica, String razaoSocialPessoaJuridica,
			String nomeFantasiaPessoaJuridica, String iePessoaJuridica, String imPessoaJuridica,
			EnderecoAntigo endereco) {
		this.idPessoaJuridica = idPessoaJuridica;
		this.cnpjPessoaJuridica = cnpjPessoaJuridica;
		this.razaoSocialPessoaJuridica = razaoSocialPessoaJuridica;
		this.nomeFantasiaPessoaJuridica = nomeFantasiaPessoaJuridica;
		this.iePessoaJuridica = iePessoaJuridica;
		this.imPessoaJuridica = imPessoaJuridica;
		this.endereco = endereco;
	}

	public PessoaJuridica() {
	}

}
