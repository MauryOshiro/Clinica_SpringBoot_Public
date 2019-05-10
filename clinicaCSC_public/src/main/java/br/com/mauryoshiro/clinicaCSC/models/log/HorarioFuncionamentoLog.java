package br.com.mauryoshiro.clinicaCSC.models.log;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import br.com.mauryoshiro.clinicaCSC.models.HorarioFuncionamento;

@Entity
public class HorarioFuncionamentoLog {

	@Id
	@GeneratedValue(generator = "increment")
	private Long id;

	@OneToOne
	private Log log;

	@OneToOne
	private HorarioFuncionamento horarioFuncionamento;

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

	public HorarioFuncionamento getHorarioFuncionamento() {
		return horarioFuncionamento;
	}

	public void setHorarioFuncionamento(HorarioFuncionamento horarioFuncionamento) {
		this.horarioFuncionamento = horarioFuncionamento;
	}

	public HorarioFuncionamentoLog(Long id, Log log, HorarioFuncionamento horarioFuncionamento) {
		this.id = id;
		this.log = log;
		this.horarioFuncionamento = horarioFuncionamento;
	}

	public HorarioFuncionamentoLog() {

	}
}
