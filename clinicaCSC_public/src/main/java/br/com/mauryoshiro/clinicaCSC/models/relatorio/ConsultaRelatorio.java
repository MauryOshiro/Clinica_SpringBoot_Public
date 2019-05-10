package br.com.mauryoshiro.clinicaCSC.models.relatorio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import br.com.mauryoshiro.clinicaCSC.models.Consulta;

@Entity
public class ConsultaRelatorio {

	@Id
	@GeneratedValue(generator = "increment")
	private Long id;

	@OneToOne
	private Consulta consulta;

	private String profissionalCrp;

	private String profissionalDepartamento;

	private String profissionalCargo;

	private String profissionalNome;

	private String profissionalSobrenome;

	private String pacienteNome;

	private String pacienteSobrenome;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Consulta getConsulta() {
		return consulta;
	}

	public void setConsulta(Consulta consulta) {
		this.consulta = consulta;
	}

	public String getProfissionalCrp() {
		return profissionalCrp;
	}

	public void setProfissionalCrp(String profissionalCrp) {
		this.profissionalCrp = profissionalCrp;
	}

	public String getProfissionalDepartamento() {
		return profissionalDepartamento;
	}

	public void setProfissionalDepartamento(String profissionalDepartamento) {
		this.profissionalDepartamento = profissionalDepartamento;
	}

	public String getProfissionalCargo() {
		return profissionalCargo;
	}

	public void setProfissionalCargo(String profissionalCargo) {
		this.profissionalCargo = profissionalCargo;
	}

	public String getProfissionalNome() {
		return profissionalNome;
	}

	public void setProfissionalNome(String profissionalNome) {
		this.profissionalNome = profissionalNome;
	}

	public String getProfissionalSobrenome() {
		return profissionalSobrenome;
	}

	public void setProfissionalSobrenome(String profissionalSobrenome) {
		this.profissionalSobrenome = profissionalSobrenome;
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

	public ConsultaRelatorio(Long id, Consulta consulta, String profissionalCrp, String profissionalDepartamento,
			String profissionalCargo, String profissionalNome, String profissionalSobrenome, String pacienteNome,
			String pacienteSobrenome) {
		this.id = id;
		this.consulta = consulta;
		this.profissionalCrp = profissionalCrp;
		this.profissionalDepartamento = profissionalDepartamento;
		this.profissionalCargo = profissionalCargo;
		this.profissionalNome = profissionalNome;
		this.profissionalSobrenome = profissionalSobrenome;
		this.pacienteNome = pacienteNome;
		this.pacienteSobrenome = pacienteSobrenome;
	}

	public ConsultaRelatorio() {
	}

}
