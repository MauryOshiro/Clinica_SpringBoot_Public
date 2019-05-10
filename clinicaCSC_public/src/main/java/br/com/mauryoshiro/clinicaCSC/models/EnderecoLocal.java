package br.com.mauryoshiro.clinicaCSC.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Range;

@Entity
public class EnderecoLocal {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idEnderecoLocal;

	@OneToOne
	private Endereco endereco;

	@NotNull(message = "Informe o número")
	@Range(min = 1, max = 999999, message = "Informe um número de 1 a 999999")
	private Long numeroEnderecoLocal;

	@NotEmpty(message = "Informe o complemento")
	@NotNull(message = "Informe o complemento")
	private String complementoEnderecoLocal;

	// private boolean principal;

	/*
	 * public boolean isPrincipal() { return principal; }
	 * 
	 * public void setPrincipal(boolean principal) { this.principal = principal; }
	 */

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idEnderecoLocal == null) ? 0 : idEnderecoLocal.hashCode());
		return result;
	}

	public EnderecoLocal() {
	}

	public EnderecoLocal(Long idEnderecoLocal, Endereco endereco, Long numeroEnderecoLocal,
			String complementoEnderecoLocal) {
		this.idEnderecoLocal = idEnderecoLocal;
		this.endereco = endereco;
		this.numeroEnderecoLocal = numeroEnderecoLocal;
		this.complementoEnderecoLocal = complementoEnderecoLocal;
	}

	public Long getIdEnderecoLocal() {
		return idEnderecoLocal;
	}

	public void setIdEnderecoLocal(Long idEnderecoLocal) {
		this.idEnderecoLocal = idEnderecoLocal;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Long getNumeroEnderecoLocal() {
		return numeroEnderecoLocal;
	}

	public void setNumeroEnderecoLocal(Long numeroEnderecoLocal) {
		this.numeroEnderecoLocal = numeroEnderecoLocal;
	}

	public String getComplementoEnderecoLocal() {
		return complementoEnderecoLocal;
	}

	public void setComplementoEnderecoLocal(String complementoEnderecoLocal) {
		this.complementoEnderecoLocal = complementoEnderecoLocal;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EnderecoLocal other = (EnderecoLocal) obj;
		if (idEnderecoLocal == null) {
			if (other.idEnderecoLocal != null)
				return false;
		} else if (!idEnderecoLocal.equals(other.idEnderecoLocal))
			return false;
		return true;
	}

}
