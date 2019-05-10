package br.com.mauryoshiro.clinicaCSC.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class FuncionarioEmpresa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idFuncionarioEmpresa;

	private String funcaoFuncionarioEmpresa;

	private String observacaoFuncionarioEmpresa;

	@OneToOne
	private PessoaFisica pessoa;

	public Long getIdFuncionarioEmpresa() {
		return idFuncionarioEmpresa;
	}

	public void setIdFuncionarioEmpresa(Long idFuncionarioEmpresa) {
		this.idFuncionarioEmpresa = idFuncionarioEmpresa;
	}

	public String getFuncaoFuncionarioEmpresa() {
		return funcaoFuncionarioEmpresa;
	}

	public void setFuncaoFuncionarioEmpresa(String funcaoFuncionarioEmpresa) {
		this.funcaoFuncionarioEmpresa = funcaoFuncionarioEmpresa;
	}

	public String getObservacaoFuncionarioEmpresa() {
		return observacaoFuncionarioEmpresa;
	}

	public void setObservacaoFuncionarioEmpresa(String observacaoFuncionarioEmpresa) {
		this.observacaoFuncionarioEmpresa = observacaoFuncionarioEmpresa;
	}

	public PessoaFisica getPessoa() {
		return pessoa;
	}

	public void setPessoa(PessoaFisica pessoa) {
		this.pessoa = pessoa;
	}

	public FuncionarioEmpresa(Long idFuncionarioEmpresa, String funcaoFuncionarioEmpresa,
			String observacaoFuncionarioEmpresa, PessoaFisica pessoa) {
		this.idFuncionarioEmpresa = idFuncionarioEmpresa;
		this.funcaoFuncionarioEmpresa = funcaoFuncionarioEmpresa;
		this.observacaoFuncionarioEmpresa = observacaoFuncionarioEmpresa;
		this.pessoa = pessoa;
	}

	public FuncionarioEmpresa() {
	}

}
