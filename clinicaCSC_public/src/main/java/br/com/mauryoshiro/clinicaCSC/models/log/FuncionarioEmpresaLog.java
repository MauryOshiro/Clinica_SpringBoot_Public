package br.com.mauryoshiro.clinicaCSC.models.log;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import br.com.mauryoshiro.clinicaCSC.models.FuncionarioEmpresa;

@Entity
public class FuncionarioEmpresaLog {

	@Id
	@GeneratedValue(generator = "increment")
	private Long id;

	@OneToOne
	private Log log;

	@OneToOne
	private FuncionarioEmpresa funcionarioEmpresa;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Log getLog() {
		return log;
	}

	public void setLog(Log log) {
		this.log = log;
	}

	public FuncionarioEmpresa getFuncionarioEmpresa() {
		return funcionarioEmpresa;
	}

	public void setFuncionarioEmpresa(FuncionarioEmpresa funcionarioEmpresa) {
		this.funcionarioEmpresa = funcionarioEmpresa;
	}

	public FuncionarioEmpresaLog(Long id, Log log, FuncionarioEmpresa funcionarioEmpresa) {
		this.id = id;
		this.log = log;
		this.funcionarioEmpresa = funcionarioEmpresa;
	}

	public FuncionarioEmpresaLog() {

	}
}
