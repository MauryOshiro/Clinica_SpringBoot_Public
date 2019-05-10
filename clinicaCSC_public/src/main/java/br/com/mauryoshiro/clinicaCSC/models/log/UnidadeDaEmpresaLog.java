package br.com.mauryoshiro.clinicaCSC.models.log;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import br.com.mauryoshiro.clinicaCSC.models.UnidadeDaEmpresa;

@Entity
public class UnidadeDaEmpresaLog {

	@Id
	@GeneratedValue(generator = "increment")
	private Long id;

	@OneToOne
	private Log log;

	@OneToOne
	private UnidadeDaEmpresa unidadeDaEmpresa;

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

	public UnidadeDaEmpresa getUnidadeDaEmpresa() {
		return unidadeDaEmpresa;
	}

	public void setUnidadeDaEmpresa(UnidadeDaEmpresa unidadeDaEmpresa) {
		this.unidadeDaEmpresa = unidadeDaEmpresa;
	}

	public UnidadeDaEmpresaLog(Long id, Log log, UnidadeDaEmpresa unidadeDaEmpresa) {
		this.id = id;
		this.log = log;
		this.unidadeDaEmpresa = unidadeDaEmpresa;
	}

	public UnidadeDaEmpresaLog() {

	}
}
