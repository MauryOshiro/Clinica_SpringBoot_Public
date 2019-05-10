package br.com.mauryoshiro.clinicaCSC.models.relatorio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import br.com.mauryoshiro.clinicaCSC.models.FuncionarioEmpresa;

@Entity
public class AgendaFuncionarioEmpresaRelatorio {

	@Id
	@GeneratedValue(generator = "increment")
	private Long id;

	@OneToOne
	private FuncionarioEmpresa funcionarioEmpresa;

	private String funcionarioEmpNome;

	private String funcionarioEmpSobrenome;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public FuncionarioEmpresa getFuncionarioEmpresa() {
		return funcionarioEmpresa;
	}

	public void setFuncionarioEmpresa(FuncionarioEmpresa funcionarioEmpresa) {
		this.funcionarioEmpresa = funcionarioEmpresa;
	}

	public String getFuncionarioEmpNome() {
		return funcionarioEmpNome;
	}

	public void setFuncionarioEmpNome(String funcionarioEmpNome) {
		this.funcionarioEmpNome = funcionarioEmpNome;
	}

	public String getFuncionarioEmpSobrenome() {
		return funcionarioEmpSobrenome;
	}

	public void setFuncionarioEmpSobrenome(String funcionarioEmpSobrenome) {
		this.funcionarioEmpSobrenome = funcionarioEmpSobrenome;
	}

	public AgendaFuncionarioEmpresaRelatorio(Long id, FuncionarioEmpresa funcionarioEmpresa, String funcionarioEmpNome,
			String funcionarioEmpSobrenome) {
		this.id = id;
		this.funcionarioEmpresa = funcionarioEmpresa;
		this.funcionarioEmpNome = funcionarioEmpNome;
		this.funcionarioEmpSobrenome = funcionarioEmpSobrenome;
	}

	public AgendaFuncionarioEmpresaRelatorio() {
	}
}
