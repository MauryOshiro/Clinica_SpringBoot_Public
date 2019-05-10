package br.com.mauryoshiro.clinicaCSC.models;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class GuiaConvenio {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idGuiaConvenio;

	@ManyToOne
	private PacienteConveniado pacienteConveniado;

	private LocalDate dataPedidoGuiaConvenio;

	private Boolean canceladoGuiaConvenio;

	private LocalTime horarioPedidoGuiaConvenio;

	@ManyToOne
	private FuncionarioClinica funcionarioClinica;

	private Boolean faturadoGuiaConvenio;

	public Long getIdGuiaConvenio() {
		return idGuiaConvenio;
	}

	public void setIdGuiaConvenio(Long idGuiaConvenio) {
		this.idGuiaConvenio = idGuiaConvenio;
	}

	public PacienteConveniado getPacienteConveniado() {
		return pacienteConveniado;
	}

	public void setPacienteConveniado(PacienteConveniado pacienteConveniado) {
		this.pacienteConveniado = pacienteConveniado;
	}

	public LocalDate getDataPedidoGuiaConvenio() {
		return dataPedidoGuiaConvenio;
	}

	public void setDataPedidoGuiaConvenio(LocalDate dataPedidoGuiaConvenio) {
		this.dataPedidoGuiaConvenio = dataPedidoGuiaConvenio;
	}

	public Boolean getCanceladoGuiaConvenio() {
		return canceladoGuiaConvenio;
	}

	public void setCanceladoGuiaConvenio(Boolean canceladoGuiaConvenio) {
		this.canceladoGuiaConvenio = canceladoGuiaConvenio;
	}

	public LocalTime getHorarioPedidoGuiaConvenio() {
		return horarioPedidoGuiaConvenio;
	}

	public void setHorarioPedidoGuiaConvenio(LocalTime horarioPedidoGuiaConvenio) {
		this.horarioPedidoGuiaConvenio = horarioPedidoGuiaConvenio;
	}

	public FuncionarioClinica getFuncionarioClinica() {
		return funcionarioClinica;
	}

	public void setFuncionarioClinica(FuncionarioClinica funcionarioClinica) {
		this.funcionarioClinica = funcionarioClinica;
	}

	public Boolean getFaturadoGuiaConvenio() {
		return faturadoGuiaConvenio;
	}

	public void setFaturadoGuiaConvenio(Boolean faturadoGuiaConvenio) {
		this.faturadoGuiaConvenio = faturadoGuiaConvenio;
	}

	public GuiaConvenio(Long idGuiaConvenio, PacienteConveniado pacienteConveniado, LocalDate dataPedidoGuiaConvenio,
			Boolean canceladoGuiaConvenio, LocalTime horarioPedidoGuiaConvenio, FuncionarioClinica funcionarioClinica,
			Boolean faturadoGuiaConvenio) {
		this.idGuiaConvenio = idGuiaConvenio;
		this.pacienteConveniado = pacienteConveniado;
		this.dataPedidoGuiaConvenio = dataPedidoGuiaConvenio;
		this.canceladoGuiaConvenio = canceladoGuiaConvenio;
		this.horarioPedidoGuiaConvenio = horarioPedidoGuiaConvenio;
		this.funcionarioClinica = funcionarioClinica;
		this.faturadoGuiaConvenio = faturadoGuiaConvenio;
	}

	public GuiaConvenio() {
	}

}
