package br.com.mauryoshiro.clinicaCSC.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import br.com.mauryoshiro.clinicaCSC.interfaces.constraint.CidadeSelecionada;

@Entity
public class Endereco {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idEndereco;

	@CidadeSelecionada(message = "Informe a cidade")
	@OneToOne
	private Cidade cidade;

	@NotNull(message = "Informe o logradouro")
	@NotEmpty(message = "Informe o logradouro")
	private String logradouroEndereco;

	@Pattern(regexp = "\\d{5}-\\d{3}", message = "Informe um CEP válido")
	private String cepEndereco;

	@NotNull(message = "Informe o bairro")
	@NotEmpty(message = "Informe o bairro")
	private String bairroEndereco;

	@ManyToOne
	@NotNull(message = "Informe o tipo da via")
	@NotEmpty(message = "Informe o tipo da via")
	private TipoVia tipoVia;

	public boolean estadoSelecionado(Endereco endereco) {
		try {
			if (endereco.getCidade().getEstado().getIdEstado() != 0) {
				return true;
			}
			return false;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean cidadeSelecionada(Endereco endereco) {
		try {
			if (endereco.getCidade().getIdCidade() != 0) {
				return true;
			}
			return false;
		} catch (Exception e) {
			return false;
		}
	}

	public String getCidadeDescricao() {
		try {
			return this.getCidade().getNomeCidade();
		} catch (Exception e) {
			return "Selecione";
		}
	}

	public Endereco() {
	}

	public Endereco(Long idEndereco, Cidade cidade, String logradouroEndereco, String cepEndereco,
			String bairroEndereco, TipoVia tipoVia) {
		this.idEndereco = idEndereco;
		this.cidade = cidade;
		this.logradouroEndereco = logradouroEndereco;
		this.cepEndereco = cepEndereco;
		this.bairroEndereco = bairroEndereco;
		this.tipoVia = tipoVia;
	}

	public Long getIdEndereco() {
		return idEndereco;
	}

	public void setIdEndereco(Long idEndereco) {
		this.idEndereco = idEndereco;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public String getLogradouroEndereco() {
		return logradouroEndereco;
	}

	public void setLogradouroEndereco(String logradouroEndereco) {
		this.logradouroEndereco = logradouroEndereco;
	}

	public String getCepEndereco() {
		return cepEndereco;
	}

	public void setCepEndereco(String cepEndereco) {
		this.cepEndereco = cepEndereco;
	}

	public String getBairroEndereco() {
		return bairroEndereco;
	}

	public void setBairroEndereco(String bairroEndereco) {
		this.bairroEndereco = bairroEndereco;
	}

	public TipoVia getTipoVia() {
		return tipoVia;
	}

	public void setTipoVia(TipoVia tipoVia) {
		this.tipoVia = tipoVia;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idEndereco == null) ? 0 : idEndereco.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Endereco other = (Endereco) obj;
		if (idEndereco == null) {
			if (other.idEndereco != null)
				return false;
		} else if (!idEndereco.equals(other.idEndereco))
			return false;
		return true;
	}

}
