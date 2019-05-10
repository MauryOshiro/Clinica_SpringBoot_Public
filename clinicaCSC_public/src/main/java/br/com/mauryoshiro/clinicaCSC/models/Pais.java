package br.com.mauryoshiro.clinicaCSC.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.com.mauryoshiro.clinicaCSC.interfaces.constraint.NomePaisUnico;
import br.com.mauryoshiro.clinicaCSC.interfaces.constraint.StringComEspacos;

//import com.google.gson.annotations.Expose;

@Entity
public class Pais {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPais;

	@StringComEspacos(message = "Nome do país com apenas espaços ou em branco. Digite o nome do país.")
	// @NotNull
	// @Column(unique = true)
	// @NotEmpty(message = "Informe o nome do país.")
	//@NotBlank(message = "Nome do país com apenas espaços ou em branco. Digite o nome do país.")
	@NomePaisUnico
	private String nomePais;

	/*
	 * @OneToMany(mappedBy = "pais")
	 * 
	 * @Expose(serialize = false, deserialize = false) private transient
	 * List<Estado> estado;
	 */

	/*
	 * public List<Estado> getEstado() { return estado; }
	 * 
	 * public void setEstado(List<Estado> estado) { this.estado = estado; }
	 */

	public Long getIdPais() {
		return idPais;
	}

	public void setIdPais(Long idPais) {
		this.idPais = idPais;
	}

	public String getNomePais() {
		return nomePais;
	}

	public void setNomePais(String nomePais) {
		this.nomePais = nomePais;
	}

	public Pais(Long idPais, String nomePais) {
		this.idPais = idPais;
		this.nomePais = nomePais;
	}

	public Pais() {
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idPais == null) ? 0 : idPais.hashCode());
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
		Pais other = (Pais) obj;
		if (idPais == null) {
			if (other.idPais != null)
				return false;
		} else if (!idPais.equals(other.idPais))
			return false;
		return true;
	}

}
