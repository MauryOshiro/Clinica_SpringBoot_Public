package br.com.mauryoshiro.clinicaCSC.models.log;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import br.com.mauryoshiro.clinicaCSC.models.FaturaPaciente;

@Entity
public class FaturaPacienteLog {

	@Id
	@GeneratedValue(generator = "increment")
	private Long id;

	@OneToOne
	private Log log;

	@OneToOne
	private FaturaPaciente faturaPaciente;

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

	public FaturaPaciente getFaturaPaciente() {
		return faturaPaciente;
	}

	public void setFaturaPaciente(FaturaPaciente faturaPaciente) {
		this.faturaPaciente = faturaPaciente;
	}

	public FaturaPacienteLog(Long id, Log log, FaturaPaciente faturaPaciente) {
		this.id = id;
		this.log = log;
		this.faturaPaciente = faturaPaciente;
	}

	public FaturaPacienteLog() {

	}
}
