package br.com.mauryoshiro.clinicaCSC.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class EnderecoAntigo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idEnderecoAntigo;

	@OneToOne
	private TipoVia tipoVia;

	private String logradouroEnderecoAntigo;

	private String cepEnderecoAntigo;

	private Integer numeroEnderecoAntigo;

	private String complementoEnderecoAntigo;

	private String bairroEnderecoAntigo;

	private String cidadeEnderecoAntigo;

	private String ufEnderecoAntigo;

	public Long getIdEnderecoAntigo() {
		return idEnderecoAntigo;
	}

	public void setIdEnderecoAntigo(Long idEnderecoAntigo) {
		this.idEnderecoAntigo = idEnderecoAntigo;
	}

	public TipoVia getTipoVia() {
		return tipoVia;
	}

	public void setTipoVia(TipoVia tipoVia) {
		this.tipoVia = tipoVia;
	}

	public String getLogradouroEnderecoAntigo() {
		return logradouroEnderecoAntigo;
	}

	public void setLogradouroEnderecoAntigo(String logradouroEnderecoAntigo) {
		this.logradouroEnderecoAntigo = logradouroEnderecoAntigo;
	}

	public String getCepEnderecoAntigo() {
		return cepEnderecoAntigo;
	}

	public void setCepEnderecoAntigo(String cepEnderecoAntigo) {
		this.cepEnderecoAntigo = cepEnderecoAntigo;
	}

	public Integer getNumeroEnderecoAntigo() {
		return numeroEnderecoAntigo;
	}

	public void setNumeroEnderecoAntigo(Integer numeroEnderecoAntigo) {
		this.numeroEnderecoAntigo = numeroEnderecoAntigo;
	}

	public String getComplementoEnderecoAntigo() {
		return complementoEnderecoAntigo;
	}

	public void setComplementoEnderecoAntigo(String complementoEnderecoAntigo) {
		this.complementoEnderecoAntigo = complementoEnderecoAntigo;
	}

	public String getBairroEnderecoAntigo() {
		return bairroEnderecoAntigo;
	}

	public void setBairroEnderecoAntigo(String bairroEnderecoAntigo) {
		this.bairroEnderecoAntigo = bairroEnderecoAntigo;
	}

	public String getCidadeEnderecoAntigo() {
		return cidadeEnderecoAntigo;
	}

	public void setCidadeEnderecoAntigo(String cidadeEnderecoAntigo) {
		this.cidadeEnderecoAntigo = cidadeEnderecoAntigo;
	}

	public String getUfEnderecoAntigo() {
		return ufEnderecoAntigo;
	}

	public void setUfEnderecoAntigo(String ufEnderecoAntigo) {
		this.ufEnderecoAntigo = ufEnderecoAntigo;
	}

	public EnderecoAntigo(Long idEnderecoAntigo, TipoVia tipoVia, String logradouroEnderecoAntigo,
			String cepEnderecoAntigo, Integer numeroEnderecoAntigo, String complementoEnderecoAntigo,
			String bairroEnderecoAntigo, String cidadeEnderecoAntigo, String ufEnderecoAntigo) {
		this.idEnderecoAntigo = idEnderecoAntigo;
		this.tipoVia = tipoVia;
		this.logradouroEnderecoAntigo = logradouroEnderecoAntigo;
		this.cepEnderecoAntigo = cepEnderecoAntigo;
		this.numeroEnderecoAntigo = numeroEnderecoAntigo;
		this.complementoEnderecoAntigo = complementoEnderecoAntigo;
		this.bairroEnderecoAntigo = bairroEnderecoAntigo;
		this.cidadeEnderecoAntigo = cidadeEnderecoAntigo;
		this.ufEnderecoAntigo = ufEnderecoAntigo;
	}

	public EnderecoAntigo() {
	}

}
