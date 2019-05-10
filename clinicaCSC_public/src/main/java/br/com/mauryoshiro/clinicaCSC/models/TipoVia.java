package br.com.mauryoshiro.clinicaCSC.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TipoVia {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idTipoVia;

	private String descricaoTipoVia;

	public Long getIdTipoVia() {
		return idTipoVia;
	}

	public void setIdTipoVia(Long idTipoVia) {
		this.idTipoVia = idTipoVia;
	}

	public String getDescricaoTipoVia() {
		return descricaoTipoVia;
	}

	public void setDescricaoTipoVia(String descricaoTipoVia) {
		this.descricaoTipoVia = descricaoTipoVia;
	}

	public TipoVia(Long idTipoVia, String descricaoTipoVia) {
		this.idTipoVia = idTipoVia;
		this.descricaoTipoVia = descricaoTipoVia;
	}

	public TipoVia() {
	}

}
