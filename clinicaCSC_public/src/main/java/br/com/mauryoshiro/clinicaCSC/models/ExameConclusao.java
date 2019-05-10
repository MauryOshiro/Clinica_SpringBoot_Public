package br.com.mauryoshiro.clinicaCSC.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ExameConclusao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idExameConclusao;

	private String conclusaoExameConclusao;

	public Long getIdExameConclusao() {
		return idExameConclusao;
	}

	public void setIdExameConclusao(Long idExameConclusao) {
		this.idExameConclusao = idExameConclusao;
	}

	public String getConclusaoExameConclusao() {
		return conclusaoExameConclusao;
	}

	public void setConclusaoExameConclusao(String conclusaoExameConclusao) {
		this.conclusaoExameConclusao = conclusaoExameConclusao;
	}

	public ExameConclusao(Long idExameConclusao, String conclusaoExameConclusao) {
		this.idExameConclusao = idExameConclusao;
		this.conclusaoExameConclusao = conclusaoExameConclusao;
	}

	public ExameConclusao() {
	}

}
