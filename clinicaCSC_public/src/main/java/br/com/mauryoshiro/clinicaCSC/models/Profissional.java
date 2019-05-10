package br.com.mauryoshiro.clinicaCSC.models;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Profissional {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idProfissional;

	private String crpProfissional;

	@ManyToOne
	private FuncionarioClinica funcionarioClinica;

	public Profissional() {
	}

	public Profissional(Long idProfissional, String crpProfissional, FuncionarioClinica funcionarioClinica) {
		this.idProfissional = idProfissional;
		this.crpProfissional = crpProfissional;
		this.funcionarioClinica = funcionarioClinica;
	}

	public Long getIdProfissional() {
		return idProfissional;
	}

	public void setIdProfissional(Long idProfissional) {
		this.idProfissional = idProfissional;
	}

	public String getCrpProfissional() {
		return crpProfissional;
	}

	public void setCrpProfissional(String crpProfissional) {
		this.crpProfissional = crpProfissional;
	}

	public FuncionarioClinica getFuncionarioClinica() {
		return funcionarioClinica;
	}

	public void setFuncionarioClinica(FuncionarioClinica funcionarioClinica) {
		this.funcionarioClinica = funcionarioClinica;
	}

	public static Profissional retornaPrimeiroProfissional(Collection<Profissional> profissionais) {
		// Cria um vetor do tipo Profissional.
		// O m�todo toArray() deve ter par�metro para alocar um espa�o de mem�ria do
		// tamanho da collection.
		Profissional[] p = profissionais.toArray(new Profissional[profissionais.size()]);
		Profissional profissional = p[0];
		return profissional;
	}
}
