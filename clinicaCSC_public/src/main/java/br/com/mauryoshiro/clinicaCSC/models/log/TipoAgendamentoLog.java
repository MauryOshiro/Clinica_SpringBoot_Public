package br.com.mauryoshiro.clinicaCSC.models.log;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import br.com.mauryoshiro.clinicaCSC.models.TipoAgendamento;

@Entity
public class TipoAgendamentoLog {

	@Id
	@GeneratedValue(generator = "increment")
	private Long id;

	@OneToOne
	private Log log;

	@OneToOne
	private TipoAgendamento tipoAgendamento;

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

	public TipoAgendamento getTipoAgendamento() {
		return tipoAgendamento;
	}

	public void setTipoAgendamento(TipoAgendamento tipoAgendamento) {
		this.tipoAgendamento = tipoAgendamento;
	}

	public TipoAgendamentoLog(Long id, Log log, TipoAgendamento tipoAgendamento) {
		this.id = id;
		this.log = log;
		this.tipoAgendamento = tipoAgendamento;
	}

	public TipoAgendamentoLog() {

	}
}
