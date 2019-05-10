package br.com.mauryoshiro.clinicaCSC.models.relatorio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import br.com.mauryoshiro.clinicaCSC.models.FaturaConvenio;

@Entity
public class FaturaConvenioRelatorio {

	@Id
	@GeneratedValue(generator = "increment")
	private Long id;

	@OneToOne
	private FaturaConvenio faturaConvenio;

	private String convenioNomeFantasia;

	private String convenioRazaoSocial;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public FaturaConvenio getFaturaConvenio() {
		return faturaConvenio;
	}

	public void setFaturaConvenio(FaturaConvenio faturaConvenio) {
		this.faturaConvenio = faturaConvenio;
	}

	public String getConvenioNomeFantasia() {
		return convenioNomeFantasia;
	}

	public void setConvenioNomeFantasia(String convenioNomeFantasia) {
		this.convenioNomeFantasia = convenioNomeFantasia;
	}

	public String getConvenioRazaoSocial() {
		return convenioRazaoSocial;
	}

	public void setConvenioRazaoSocial(String convenioRazaoSocial) {
		this.convenioRazaoSocial = convenioRazaoSocial;
	}

	public FaturaConvenioRelatorio(Long id, FaturaConvenio faturaConvenio, String convenioNomeFantasia,
			String convenioRazaoSocial) {
		this.id = id;
		this.faturaConvenio = faturaConvenio;
		this.convenioNomeFantasia = convenioNomeFantasia;
		this.convenioRazaoSocial = convenioRazaoSocial;
	}

	public FaturaConvenioRelatorio() {
	}
}
