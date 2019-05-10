package br.com.mauryoshiro.clinicaCSC.models.relatorio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import br.com.mauryoshiro.clinicaCSC.models.FaturaPaciente;

@Entity
public class FaturaPacienteRelatorio {

	@Id
	@GeneratedValue(generator = "increment")
	private Long id;
	
	@OneToOne
	private FaturaPaciente faturaPaciente;
	
	private String pacienteNome;
	
	private String pacienteSobrenome;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public FaturaPaciente getFaturaPaciente() {
		return faturaPaciente;
	}

	public void setFaturaPaciente(FaturaPaciente faturaPaciente) {
		this.faturaPaciente = faturaPaciente;
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

	public FaturaPacienteRelatorio(Long id, FaturaPaciente faturaPaciente, String pacienteNome,
			String pacienteSobrenome) {
		this.id = id;
		this.faturaPaciente = faturaPaciente;
		this.pacienteNome = pacienteNome;
		this.pacienteSobrenome = pacienteSobrenome;
	}

	public FaturaPacienteRelatorio() {
	}
}
