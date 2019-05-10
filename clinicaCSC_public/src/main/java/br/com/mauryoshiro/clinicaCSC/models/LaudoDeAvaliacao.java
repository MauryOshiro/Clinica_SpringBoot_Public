package br.com.mauryoshiro.clinicaCSC.models;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class LaudoDeAvaliacao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idLaudoDeAvaliacao;

	@OneToOne
	private Exame exame;

	private String laudoLaudoDeAvaliacao;

	private LocalDate dataEmissaoLaudoDeAvaliacao;

	@ManyToOne
	private FuncionarioEmpresa funcionarioEmpresa;

	private Boolean finalizadoLaudoDeAvaliacao;

	private Boolean canceladoLaudoDeAvaliacao;

	public Long getIdLaudoDeAvaliacao() {
		return idLaudoDeAvaliacao;
	}

	public void setIdLaudoDeAvaliacao(Long idLaudoDeAvaliacao) {
		this.idLaudoDeAvaliacao = idLaudoDeAvaliacao;
	}

	public Exame getExame() {
		return exame;
	}

	public void setExame(Exame exame) {
		this.exame = exame;
	}

	public String getLaudoLaudoDeAvaliacao() {
		return laudoLaudoDeAvaliacao;
	}

	public void setLaudoLaudoDeAvaliacao(String laudoLaudoDeAvaliacao) {
		this.laudoLaudoDeAvaliacao = laudoLaudoDeAvaliacao;
	}

	public LocalDate getDataEmissaoLaudoDeAvaliacao() {
		return dataEmissaoLaudoDeAvaliacao;
	}

	public void setDataEmissaoLaudoDeAvaliacao(LocalDate dataEmissaoLaudoDeAvaliacao) {
		this.dataEmissaoLaudoDeAvaliacao = dataEmissaoLaudoDeAvaliacao;
	}

	public FuncionarioEmpresa getFuncionarioEmpresa() {
		return funcionarioEmpresa;
	}

	public void setFuncionarioEmpresa(FuncionarioEmpresa funcionarioEmpresa) {
		this.funcionarioEmpresa = funcionarioEmpresa;
	}

	public Boolean getFinalizadoLaudoDeAvaliacao() {
		return finalizadoLaudoDeAvaliacao;
	}

	public void setFinalizadoLaudoDeAvaliacao(Boolean finalizadoLaudoDeAvaliacao) {
		this.finalizadoLaudoDeAvaliacao = finalizadoLaudoDeAvaliacao;
	}

	public Boolean getCanceladoLaudoDeAvaliacao() {
		return canceladoLaudoDeAvaliacao;
	}

	public void setCanceladoLaudoDeAvaliacao(Boolean canceladoLaudoDeAvaliacao) {
		this.canceladoLaudoDeAvaliacao = canceladoLaudoDeAvaliacao;
	}

	public LaudoDeAvaliacao(Long idLaudoDeAvaliacao, Exame exame, String laudoLaudoDeAvaliacao,
			LocalDate dataEmissaoLaudoDeAvaliacao, FuncionarioEmpresa funcionarioEmpresa,
			Boolean finalizadoLaudoDeAvaliacao, Boolean canceladoLaudoDeAvaliacao) {
		this.idLaudoDeAvaliacao = idLaudoDeAvaliacao;
		this.exame = exame;
		this.laudoLaudoDeAvaliacao = laudoLaudoDeAvaliacao;
		this.dataEmissaoLaudoDeAvaliacao = dataEmissaoLaudoDeAvaliacao;
		this.funcionarioEmpresa = funcionarioEmpresa;
		this.finalizadoLaudoDeAvaliacao = finalizadoLaudoDeAvaliacao;
		this.canceladoLaudoDeAvaliacao = canceladoLaudoDeAvaliacao;
	}

	public LaudoDeAvaliacao() {
	}

}
