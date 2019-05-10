package br.com.mauryoshiro.clinicaCSC.models.log;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import br.com.mauryoshiro.clinicaCSC.models.TipoLancamento;

@Entity
public class TipoLancamentoLog {

	@Id
	@GeneratedValue(generator = "increment")
	private Long id;

	@OneToOne
	private Log log;

	@OneToOne
	private TipoLancamento tipoLancamento;

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

	public TipoLancamento getTipoLancamento() {
		return tipoLancamento;
	}

	public void setTipoLancamento(TipoLancamento tipoLancamento) {
		this.tipoLancamento = tipoLancamento;
	}

	public TipoLancamentoLog(Long id, Log log, TipoLancamento tipoLancamento) {
		this.id = id;
		this.log = log;
		this.tipoLancamento = tipoLancamento;
	}

	public TipoLancamentoLog() {

	}
}
