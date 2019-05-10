package br.com.mauryoshiro.clinicaCSC.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;

//import com.google.gson.annotations.Expose;

@Entity
public class Estado {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idEstado;

	@NotBlank(message = "Nome do estado com apenas espaços ou em branco. Digite o nome do estado.")
	private String nomeEstado;

	@NotBlank(message = "Sigla do estado com apenas espaços ou em branco. Digite a sigla.")
	private String siglaEstado;

	/*
	 * @OneToMany(mappedBy = "estado")
	 * 
	 * @Expose(serialize = false, deserialize = false) private transient
	 * List<Cidade> cidades;
	 */

	// @NotNull(message = "Informe o país.")
	@ManyToOne
	private Pais pais;

	public Estado() {
	}

	public Estado(Long idEstado, String nomeEstado, String siglaEstado, Pais pais) {
		this.idEstado = idEstado;
		this.nomeEstado = nomeEstado;
		this.siglaEstado = siglaEstado;
		this.pais = pais;
	}

	public Long getIdEstado() {
		return idEstado;
	}

	public void setIdEstado(Long idEstado) {
		this.idEstado = idEstado;
	}

	public String getNomeEstado() {
		return nomeEstado;
	}

	public void setNomeEstado(String nomeEstado) {
		this.nomeEstado = nomeEstado;
	}

	public String getSiglaEstado() {
		return siglaEstado;
	}

	public void setSiglaEstado(String siglaEstado) {
		this.siglaEstado = siglaEstado;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idEstado == null) ? 0 : idEstado.hashCode());
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
		Estado other = (Estado) obj;
		if (idEstado == null) {
			if (other.idEstado != null)
				return false;
		} else if (!idEstado.equals(other.idEstado))
			return false;
		return true;
	}

}
