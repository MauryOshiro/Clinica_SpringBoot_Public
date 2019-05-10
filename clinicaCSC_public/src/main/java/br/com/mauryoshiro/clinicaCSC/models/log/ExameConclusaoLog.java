package br.com.mauryoshiro.clinicaCSC.models.log;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import br.com.mauryoshiro.clinicaCSC.models.ExameConclusao;

@Entity
public class ExameConclusaoLog {

	@Id
	@GeneratedValue(generator = "increment")
	private Long id;

	@OneToOne
	private Log log;

	@OneToOne
	private ExameConclusao conclusao;

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

	public ExameConclusao getConclusao() {
		return conclusao;
	}

	public void setConclusao(ExameConclusao conclusao) {
		this.conclusao = conclusao;
	}

	public ExameConclusaoLog(Long id, Log log, ExameConclusao conclusao) {
		this.id = id;
		this.log = log;
		this.conclusao = conclusao;
	}

	public ExameConclusaoLog() {

	}
}
