package br.com.mauryoshiro.clinicaCSC.models;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class FaturaConvenio {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idFaturaConvenio;

	@ManyToOne
	private Convenio convenio;

	@OneToMany
	private Collection<GuiaConvenio> guias;

	@OneToOne
	private Fatura fatura;

	public Long getIdFaturaConvenio() {
		return idFaturaConvenio;
	}

	public void setIdFaturaConvenio(Long idFaturaConvenio) {
		this.idFaturaConvenio = idFaturaConvenio;
	}

	public Convenio getConvenio() {
		return convenio;
	}

	public void setConvenio(Convenio convenio) {
		this.convenio = convenio;
	}

	public Collection<GuiaConvenio> getGuias() {
		return guias;
	}

	public void setGuias(Collection<GuiaConvenio> guias) {
		this.guias = guias;
	}

	public Fatura getFatura() {
		return fatura;
	}

	public void setFatura(Fatura fatura) {
		this.fatura = fatura;
	}

	public FaturaConvenio(Long idFaturaConvenio, Convenio convenio, Collection<GuiaConvenio> guias, Fatura fatura) {
		this.idFaturaConvenio = idFaturaConvenio;
		this.convenio = convenio;
		this.guias = guias;
		this.fatura = fatura;
	}

	public FaturaConvenio() {
	}

}
