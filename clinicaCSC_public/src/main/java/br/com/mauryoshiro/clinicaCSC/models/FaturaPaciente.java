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
public class FaturaPaciente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idFaturaPaciente;

	@ManyToOne
	private Paciente paciente;

	@OneToMany
	private Collection<AgendaPaciente> agendasPaciente;

	@OneToOne
	private Fatura fatura;

	public Long getIdFaturaPaciente() {
		return idFaturaPaciente;
	}

	public void setIdFaturaPaciente(Long idFaturaPaciente) {
		this.idFaturaPaciente = idFaturaPaciente;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Collection<AgendaPaciente> getAgendasPaciente() {
		return agendasPaciente;
	}

	public void setAgendasPaciente(Collection<AgendaPaciente> agendasPaciente) {
		this.agendasPaciente = agendasPaciente;
	}

	public Fatura getFatura() {
		return fatura;
	}

	public void setFatura(Fatura fatura) {
		this.fatura = fatura;
	}

	public FaturaPaciente(Long idFaturaPaciente, Paciente paciente, Collection<AgendaPaciente> agendasPaciente,
			Fatura fatura) {
		this.idFaturaPaciente = idFaturaPaciente;
		this.paciente = paciente;
		this.agendasPaciente = agendasPaciente;
		this.fatura = fatura;
	}

	public FaturaPaciente() {
	}

}
