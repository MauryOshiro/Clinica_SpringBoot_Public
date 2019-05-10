package br.com.mauryoshiro.clinicaCSC.models;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class HorarioFuncionamento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idHorarioFuncionamento;

	private LocalDate inicioManhaHorarioFuncionamento;

	private LocalDate inicioAlmocoHorarioFuncionamento;

	private LocalDate inicioTardeHorarioFuncionamento;

	private LocalDate fimExpedienteHorarioFuncionamento;

	public Long getIdHorarioFuncionamento() {
		return idHorarioFuncionamento;
	}

	public void setIdHorarioFuncionamento(Long idHorarioFuncionamento) {
		this.idHorarioFuncionamento = idHorarioFuncionamento;
	}

	public LocalDate getInicioManhaHorarioFuncionamento() {
		return inicioManhaHorarioFuncionamento;
	}

	public void setInicioManhaHorarioFuncionamento(LocalDate inicioManhaHorarioFuncionamento) {
		this.inicioManhaHorarioFuncionamento = inicioManhaHorarioFuncionamento;
	}

	public LocalDate getInicioAlmocoHorarioFuncionamento() {
		return inicioAlmocoHorarioFuncionamento;
	}

	public void setInicioAlmocoHorarioFuncionamento(LocalDate inicioAlmocoHorarioFuncionamento) {
		this.inicioAlmocoHorarioFuncionamento = inicioAlmocoHorarioFuncionamento;
	}

	public LocalDate getInicioTardeHorarioFuncionamento() {
		return inicioTardeHorarioFuncionamento;
	}

	public void setInicioTardeHorarioFuncionamento(LocalDate inicioTardeHorarioFuncionamento) {
		this.inicioTardeHorarioFuncionamento = inicioTardeHorarioFuncionamento;
	}

	public LocalDate getFimExpedienteHorarioFuncionamento() {
		return fimExpedienteHorarioFuncionamento;
	}

	public void setFimExpedienteHorarioFuncionamento(LocalDate fimExpedienteHorarioFuncionamento) {
		this.fimExpedienteHorarioFuncionamento = fimExpedienteHorarioFuncionamento;
	}

	public HorarioFuncionamento(Long idHorarioFuncionamento, LocalDate inicioManhaHorarioFuncionamento,
			LocalDate inicioAlmocoHorarioFuncionamento, LocalDate inicioTardeHorarioFuncionamento,
			LocalDate fimExpedienteHorarioFuncionamento) {
		this.idHorarioFuncionamento = idHorarioFuncionamento;
		this.inicioManhaHorarioFuncionamento = inicioManhaHorarioFuncionamento;
		this.inicioAlmocoHorarioFuncionamento = inicioAlmocoHorarioFuncionamento;
		this.inicioTardeHorarioFuncionamento = inicioTardeHorarioFuncionamento;
		this.fimExpedienteHorarioFuncionamento = fimExpedienteHorarioFuncionamento;
	}

	public HorarioFuncionamento() {
	}

}
