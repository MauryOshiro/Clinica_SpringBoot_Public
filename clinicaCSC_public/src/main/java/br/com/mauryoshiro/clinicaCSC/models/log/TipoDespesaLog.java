package br.com.mauryoshiro.clinicaCSC.models.log;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import br.com.mauryoshiro.clinicaCSC.models.TipoDespesa;

@Entity
public class TipoDespesaLog {

	@Id
	@GeneratedValue(generator = "increment")
	private Long id;

	@OneToOne
	private Log log;

	@OneToOne
	private TipoDespesa tipoDespesa;

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

	public TipoDespesa getTipoDespesa() {
		return tipoDespesa;
	}

	public void setTipoDespesa(TipoDespesa tipoDespesa) {
		this.tipoDespesa = tipoDespesa;
	}

	public TipoDespesaLog(Long id, Log log, TipoDespesa tipoDespesa) {
		this.id = id;
		this.log = log;
		this.tipoDespesa = tipoDespesa;
	}

	public TipoDespesaLog() {

	}
}
