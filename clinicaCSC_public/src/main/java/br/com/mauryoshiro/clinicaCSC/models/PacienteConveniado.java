package br.com.mauryoshiro.clinicaCSC.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class PacienteConveniado {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPacienteConveniado;

	@OneToOne
	private Paciente paciente;

	@OneToOne
	private Convenio convenio;

	private String numeroConvenioPacienteConveniado;

	public Long getIdPacienteConveniado() {
		return idPacienteConveniado;
	}

	public void setIdPacienteConveniado(Long idPacienteConveniado) {
		this.idPacienteConveniado = idPacienteConveniado;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Convenio getConvenio() {
		return convenio;
	}

	public void setConvenio(Convenio convenio) {
		this.convenio = convenio;
	}

	public String getNumeroConvenioPacienteConveniado() {
		return numeroConvenioPacienteConveniado;
	}

	public void setNumeroConvenioPacienteConveniado(String numeroConvenioPacienteConveniado) {
		this.numeroConvenioPacienteConveniado = numeroConvenioPacienteConveniado;
	}

	public PacienteConveniado(Long idPacienteConveniado, Paciente paciente, Convenio convenio,
			String numeroConvenioPacienteConveniado) {
		this.idPacienteConveniado = idPacienteConveniado;
		this.paciente = paciente;
		this.convenio = convenio;
		this.numeroConvenioPacienteConveniado = numeroConvenioPacienteConveniado;
	}

	public PacienteConveniado() {
	}

}
