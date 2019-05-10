package br.com.mauryoshiro.clinicaCSC.models;

import java.time.LocalDate;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class EmpresaParceira {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idEmpresaParceira;

	private String observacaoEmpresaParceira;

	private LocalDate dataInicioParceriaEmpresaParceira;

	private Boolean ativoEmpresaParceira;

	@OneToMany
	private Collection<ContatoNaPessoaJuridica> contatos;

	@OneToMany
	private Collection<FuncionarioEmpresa> funcionarios;

	@OneToOne
	private PessoaJuridica pessoaJuridica;

	public Long getIdEmpresaParceira() {
		return idEmpresaParceira;
	}

	public void setIdEmpresaParceira(Long idEmpresaParceira) {
		this.idEmpresaParceira = idEmpresaParceira;
	}

	public String getObservacaoEmpresaParceira() {
		return observacaoEmpresaParceira;
	}

	public void setObservacaoEmpresaParceira(String observacaoEmpresaParceira) {
		this.observacaoEmpresaParceira = observacaoEmpresaParceira;
	}

	public LocalDate getDataInicioParceriaEmpresaParceira() {
		return dataInicioParceriaEmpresaParceira;
	}

	public void setDataInicioParceriaEmpresaParceira(LocalDate dataInicioParceriaEmpresaParceira) {
		this.dataInicioParceriaEmpresaParceira = dataInicioParceriaEmpresaParceira;
	}

	public Boolean getAtivoEmpresaParceira() {
		return ativoEmpresaParceira;
	}

	public void setAtivoEmpresaParceira(Boolean ativoEmpresaParceira) {
		this.ativoEmpresaParceira = ativoEmpresaParceira;
	}

	public Collection<ContatoNaPessoaJuridica> getContatos() {
		return contatos;
	}

	public void setContatos(Collection<ContatoNaPessoaJuridica> contatos) {
		this.contatos = contatos;
	}

	public Collection<FuncionarioEmpresa> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(Collection<FuncionarioEmpresa> funcionarios) {
		this.funcionarios = funcionarios;
	}

	public PessoaJuridica getPessoaJuridica() {
		return pessoaJuridica;
	}

	public void setPessoaJuridica(PessoaJuridica pessoaJuridica) {
		this.pessoaJuridica = pessoaJuridica;
	}

	public EmpresaParceira(Long idEmpresaParceira, String observacaoEmpresaParceira,
			LocalDate dataInicioParceriaEmpresaParceira, Boolean ativoEmpresaParceira,
			Collection<ContatoNaPessoaJuridica> contatos, Collection<FuncionarioEmpresa> funcionarios,
			PessoaJuridica pessoaJuridica) {
		this.idEmpresaParceira = idEmpresaParceira;
		this.observacaoEmpresaParceira = observacaoEmpresaParceira;
		this.dataInicioParceriaEmpresaParceira = dataInicioParceriaEmpresaParceira;
		this.ativoEmpresaParceira = ativoEmpresaParceira;
		this.contatos = contatos;
		this.funcionarios = funcionarios;
		this.pessoaJuridica = pessoaJuridica;
	}

	public EmpresaParceira() {
	}

}
