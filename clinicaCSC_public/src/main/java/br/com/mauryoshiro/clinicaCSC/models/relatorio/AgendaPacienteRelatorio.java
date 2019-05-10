package br.com.mauryoshiro.clinicaCSC.models.relatorio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import br.com.mauryoshiro.clinicaCSC.models.AgendaPaciente;

@Entity
public class AgendaPacienteRelatorio {

	@Id
	@GeneratedValue(generator = "increment")
	private Long id;

	@OneToOne
	private AgendaPaciente agendaPaciente;

	private String pacienteNome;

	private String pacienteSobrenome;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public AgendaPaciente getAgendaPaciente() {
		return agendaPaciente;
	}

	public void setAgendaPaciente(AgendaPaciente agendaPaciente) {
		this.agendaPaciente = agendaPaciente;
	}

	public String getPacienteNome() {
		return pacienteNome;
	}

	public void setPacienteNome(String pacienteNome) {
		this.pacienteNome = pacienteNome;
	}

	public String getPacienteSobrenome() {
		return pacienteSobrenome;
	}

	public void setPacienteSobrenome(String pacienteSobrenome) {
		this.pacienteSobrenome = pacienteSobrenome;
	}

	public AgendaPacienteRelatorio(Long id, AgendaPaciente agendaPaciente, String pacienteNome,
			String pacienteSobrenome) {
		this.id = id;
		this.agendaPaciente = agendaPaciente;
		this.pacienteNome = pacienteNome;
		this.pacienteSobrenome = pacienteSobrenome;
	}

	public AgendaPacienteRelatorio() {
	}
}
