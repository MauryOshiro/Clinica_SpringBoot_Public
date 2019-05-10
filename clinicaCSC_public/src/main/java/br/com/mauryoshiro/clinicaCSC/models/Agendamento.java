package br.com.mauryoshiro.clinicaCSC.models;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Agendamento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idAgendamento;

	private LocalDate dataAgendamento;

	private LocalTime horararioAgendamento;

	// private HorarioFuncionamento hora;

	// @OneToOne
	// private DataFuncionamento dataFuncionamento;

	@OneToOne
	private TipoAgendamento tipoAtendimento;

	@OneToOne
	private Profissional profissional;

	private Boolean ativo;

	@OneToOne
	private UnidadeDaEmpresa unidade;

	public Long getIdAgendamento() {
		return idAgendamento;
	}

	public void setIdAgendamento(Long idAgendamento) {
		this.idAgendamento = idAgendamento;
	}

	public LocalDate getDataAgendamento() {
		return dataAgendamento;
	}

	public void setDataAgendamento(LocalDate dataAgendamento) {
		this.dataAgendamento = dataAgendamento;
	}

	public LocalTime getHorararioAgendamento() {
		return horararioAgendamento;
	}

	public void setHorararioAgendamento(LocalTime horararioAgendamento) {
		this.horararioAgendamento = horararioAgendamento;
	}

	public TipoAgendamento getTipoAtendimento() {
		return tipoAtendimento;
	}

	public void setTipoAtendimento(TipoAgendamento tipoAtendimento) {
		this.tipoAtendimento = tipoAtendimento;
	}

	public Profissional getProfissional() {
		return profissional;
	}

	public void setProfissional(Profissional profissional) {
		this.profissional = profissional;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	public UnidadeDaEmpresa getUnidade() {
		return unidade;
	}

	public void setUnidade(UnidadeDaEmpresa unidade) {
		this.unidade = unidade;
	}

	public Agendamento(Long idAgendamento, LocalDate dataAgendamento, LocalTime horararioAgendamento,
			TipoAgendamento tipoAtendimento, Profissional profissional, Boolean ativo, UnidadeDaEmpresa unidade) {
		this.idAgendamento = idAgendamento;
		this.dataAgendamento = dataAgendamento;
		this.horararioAgendamento = horararioAgendamento;
		this.tipoAtendimento = tipoAtendimento;
		this.profissional = profissional;
		this.ativo = ativo;
		this.unidade = unidade;
	}

	public Agendamento() {
	}

	/*
	 * public Agenda(LocalDate data, HorarioFuncionamento horario, String tipo,
	 * Profissional p, Boolean ativo) { this.data = data; this.hora = horario;
	 * this.tipoAtendimento = tipo; this.profissional = p; this.ativo = ativo; }
	 */

	/*
	 * public Agenda(LocalDate data, HorarioFuncionamento horario, Profissional p) {
	 * this.data = data; this.hora = horario; this.profissional = p; }
	 */

}
