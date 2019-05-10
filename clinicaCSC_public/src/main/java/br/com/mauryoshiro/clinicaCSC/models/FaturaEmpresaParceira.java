package br.com.mauryoshiro.clinicaCSC.models;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class FaturaEmpresaParceira {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idFaturaEmpresaParceira;

	@ManyToOne
	private EmpresaParceira empresa;

	@OneToMany
	private Collection<AgendaFuncionarioEmpresa> agendasFuncionario;

	@OneToOne
	private Fatura fatura;

	public Long getIdFaturaEmpresaParceira() {
		return idFaturaEmpresaParceira;
	}

	public void setIdFaturaEmpresaParceira(Long idFaturaEmpresaParceira) {
		this.idFaturaEmpresaParceira = idFaturaEmpresaParceira;
	}

	public EmpresaParceira getEmpresa() {
		return empresa;
	}

	public void setEmpresa(EmpresaParceira empresa) {
		this.empresa = empresa;
	}

	public Collection<AgendaFuncionarioEmpresa> getAgendasFuncionario() {
		return agendasFuncionario;
	}

	public void setAgendasFuncionario(Collection<AgendaFuncionarioEmpresa> agendasFuncionario) {
		this.agendasFuncionario = agendasFuncionario;
	}

	public Fatura getFatura() {
		return fatura;
	}

	public void setFatura(Fatura fatura) {
		this.fatura = fatura;
	}

	public FaturaEmpresaParceira(Long idFaturaEmpresaParceira, EmpresaParceira empresa,
			Collection<AgendaFuncionarioEmpresa> agendasFuncionario, Fatura fatura) {
		this.idFaturaEmpresaParceira = idFaturaEmpresaParceira;
		this.empresa = empresa;
		this.agendasFuncionario = agendasFuncionario;
		this.fatura = fatura;
	}

	public FaturaEmpresaParceira() {
	}

}
