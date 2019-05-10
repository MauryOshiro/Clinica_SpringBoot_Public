package br.com.mauryoshiro.clinicaCSC.models.log;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import br.com.mauryoshiro.clinicaCSC.models.DataFuncionamento;

@Entity
public class DataFuncionamentoLog {

	@Id
	@GeneratedValue(generator = "increment")
	private Long id;

	@OneToOne
	private Log log;

	@OneToOne
	private DataFuncionamento dataFuncionamento;

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

	public DataFuncionamento getDataFuncionamento() {
		return dataFuncionamento;
	}

	public void setDataFuncionamento(DataFuncionamento dataFuncionamento) {
		this.dataFuncionamento = dataFuncionamento;
	}

	public DataFuncionamentoLog(Long id, Log log, DataFuncionamento dataFuncionamento) {
		this.id = id;
		this.log = log;
		this.dataFuncionamento = dataFuncionamento;
	}

	public DataFuncionamentoLog() {

	}
}
