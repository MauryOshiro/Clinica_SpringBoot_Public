package br.com.mauryoshiro.clinicaCSC.models.relatorio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import br.com.mauryoshiro.clinicaCSC.models.Agendamento;

@Entity
public class AgendamentoRelatorio {

	@Id
	@GeneratedValue(generator = "increment")
	private Long id;

	@OneToOne
	private Agendamento agendamento;

	private String profissionalCrp;

	private String profissionalDepartamento;

	private String profissionalCargo;

	private String profissionalNome;

	private String profissionalSobrenome;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Agendamento getAgendamento() {
		return agendamento;
	}

	public void setAgendamento(Agendamento agendamento) {
		this.agendamento = agendamento;
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

	public AgendamentoRelatorio(Long id, Agendamento agendamento, String profissionalCrp,
			String profissionalDepartamento, String profissionalCargo, String profissionalNome,
			String profissionalSobrenome) {
		this.id = id;
		this.agendamento = agendamento;
		this.profissionalCrp = profissionalCrp;
		this.profissionalDepartamento = profissionalDepartamento;
		this.profissionalCargo = profissionalCargo;
		this.profissionalNome = profissionalNome;
		this.profissionalSobrenome = profissionalSobrenome;
	}

	public AgendamentoRelatorio() {
	}

}
