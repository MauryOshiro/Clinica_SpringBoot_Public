package br.com.mauryoshiro.clinicaCSC.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

//import com.google.gson.annotations.Expose;

@Entity
public class Cidade {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCidade;

	@NotNull(message = "Informe o nome da cidade")
	@NotEmpty(message = "Informe o nome da cidade")
	private String nomeCidade;

	@NotNull(message = "Informe o estado")
	@ManyToOne
	private Estado estado;

	// @OneToMany(mappedBy="cidade")
	// @Expose(serialize = false, deserialize = false)
	// private transient List<Endereco> endereco;

	public String getEstadoDescricao() {
		try {
			return this.getEstado().getNomeEstado();
		} catch (Exception e) {
			return "Selecione";
		}
	}

	/*
	 * public List<Endereco> getEndereco() { return endereco; }
	 * 
	 * public void setEndereco(List<Endereco> endereco) { this.endereco = endereco;
	 * }
	 */

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idCidade == null) ? 0 : idCidade.hashCode());
		return result;
	}

	public Cidade() {
	}

	public Cidade(Long idCidade, String nomeCidade, Estado estado) {
		this.idCidade = idCidade;
		this.nomeCidade = nomeCidade;
		this.estado = estado;
	}

	public Long getIdCidade() {
		return idCidade;
	}

	public void setIdCidade(Long idCidade) {
		this.idCidade = idCidade;
	}

	public String getNomeCidade() {
		return nomeCidade;
	}

	public void setNomeCidade(String nomeCidade) {
		this.nomeCidade = nomeCidade;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cidade other = (Cidade) obj;
		if (idCidade == null) {
			if (other.idCidade != null)
				return false;
		} else if (!idCidade.equals(other.idCidade))
			return false;
		return true;
	}

}
