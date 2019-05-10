package br.com.mauryoshiro.clinicaCSC.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TipoConsulta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idTipoConsulta;

	private String tipoTipoConsulta;

	private Boolean ativoTipoConsulta;

	public Long getIdTipoConsulta() {
		return idTipoConsulta;
	}

	public void setIdTipoConsulta(Long idTipoConsulta) {
		this.idTipoConsulta = idTipoConsulta;
	}

	public String getTipoTipoConsulta() {
		return tipoTipoConsulta;
	}

	public void setTipoTipoConsulta(String tipoTipoConsulta) {
		this.tipoTipoConsulta = tipoTipoConsulta;
	}

	public Boolean getAtivoTipoConsulta() {
		return ativoTipoConsulta;
	}

	public void setAtivoTipoConsulta(Boolean ativoTipoConsulta) {
		this.ativoTipoConsulta = ativoTipoConsulta;
	}

	public TipoConsulta(Long idTipoConsulta, String tipoTipoConsulta, Boolean ativoTipoConsulta) {
		this.idTipoConsulta = idTipoConsulta;
		this.tipoTipoConsulta = tipoTipoConsulta;
		this.ativoTipoConsulta = ativoTipoConsulta;
	}

	public TipoConsulta() {
	}

}
