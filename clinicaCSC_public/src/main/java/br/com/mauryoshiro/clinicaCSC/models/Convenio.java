package br.com.mauryoshiro.clinicaCSC.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Convenio {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idConvenio;

	private Double valorConsultaConvenio;

	private Boolean ativoConvenio;

	private String observacaoConvenio;

	@OneToOne
	private PessoaJuridica pessoaJuridica;

	public Long getIdConvenio() {
		return idConvenio;
	}

	public void setIdConvenio(Long idConvenio) {
		this.idConvenio = idConvenio;
	}

	public Double getValorConsultaConvenio() {
		return valorConsultaConvenio;
	}

	public void setValorConsultaConvenio(Double valorConsultaConvenio) {
		this.valorConsultaConvenio = valorConsultaConvenio;
	}

	public Boolean getAtivoConvenio() {
		return ativoConvenio;
	}

	public void setAtivoConvenio(Boolean ativoConvenio) {
		this.ativoConvenio = ativoConvenio;
	}

	public String getObservacaoConvenio() {
		return observacaoConvenio;
	}

	public void setObservacaoConvenio(String observacaoConvenio) {
		this.observacaoConvenio = observacaoConvenio;
	}

	public PessoaJuridica getPessoaJuridica() {
		return pessoaJuridica;
	}

	public void setPessoaJuridica(PessoaJuridica pessoaJuridica) {
		this.pessoaJuridica = pessoaJuridica;
	}

	public Convenio(Long idConvenio, Double valorConsultaConvenio, Boolean ativoConvenio, String observacaoConvenio,
			PessoaJuridica pessoaJuridica) {
		this.idConvenio = idConvenio;
		this.valorConsultaConvenio = valorConsultaConvenio;
		this.ativoConvenio = ativoConvenio;
		this.observacaoConvenio = observacaoConvenio;
		this.pessoaJuridica = pessoaJuridica;
	}

	public Convenio() {
	}

}
