package br.com.mauryoshiro.clinicaCSC.models.log;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import br.com.mauryoshiro.clinicaCSC.models.PacienteConveniado;

@Entity
public class PacienteConveniadoLog {

	@Id
	@GeneratedValue(generator = "increment")
	private Long id;

	@OneToOne
	private Log log;

	@OneToOne
	private PacienteConveniado pacienteConveniado;

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

	public PacienteConveniado getPacienteConveniado() {
		return pacienteConveniado;
	}

	public void setPacienteConveniado(PacienteConveniado pacienteConveniado) {
		this.pacienteConveniado = pacienteConveniado;
	}

	public PacienteConveniadoLog(Long id, Log log, PacienteConveniado pacienteConveniado) {
		this.id = id;
		this.log = log;
		this.pacienteConveniado = pacienteConveniado;
	}

	public PacienteConveniadoLog() {

	}
}
