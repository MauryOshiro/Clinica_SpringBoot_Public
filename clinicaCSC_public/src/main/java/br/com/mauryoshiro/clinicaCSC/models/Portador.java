package br.com.mauryoshiro.clinicaCSC.models;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class Portador {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPortador;

	private String tipoPortador;

	private String nomePortador;

	private String descricaoPortador;

	// private LocalDate dataConciliacao;

	@OneToOne
	private Conciliacao conciliacao;

	private Boolean ativoPortador;

	private Integer sequenciaLancamentoPortador;

	@OneToOne
	private PortadorSaldo saldo;

	private Boolean podeTerSaldoNegativo;

	@ManyToMany
	private Collection<UnidadeDaEmpresa> unidades;

	public Long getIdPortador() {
		return idPortador;
	}

	public void setIdPortador(Long idPortador) {
		this.idPortador = idPortador;
	}

	public String getTipoPortador() {
		return tipoPortador;
	}

	public void setTipoPortador(String tipoPortador) {
		this.tipoPortador = tipoPortador;
	}

	public String getNomePortador() {
		return nomePortador;
	}

	public void setNomePortador(String nomePortador) {
		this.nomePortador = nomePortador;
	}

	public String getDescricaoPortador() {
		return descricaoPortador;
	}

	public void setDescricaoPortador(String descricaoPortador) {
		this.descricaoPortador = descricaoPortador;
	}

	public Conciliacao getConciliacao() {
		return conciliacao;
	}

	public void setConciliacao(Conciliacao conciliacao) {
		this.conciliacao = conciliacao;
	}

	public Boolean getAtivoPortador() {
		return ativoPortador;
	}

	public void setAtivoPortador(Boolean ativoPortador) {
		this.ativoPortador = ativoPortador;
	}

	public Integer getSequenciaLancamentoPortador() {
		return sequenciaLancamentoPortador;
	}

	public void setSequenciaLancamentoPortador(Integer sequenciaLancamentoPortador) {
		this.sequenciaLancamentoPortador = sequenciaLancamentoPortador;
	}

	public PortadorSaldo getSaldo() {
		return saldo;
	}

	public void setSaldo(PortadorSaldo saldo) {
		this.saldo = saldo;
	}

	public Boolean getPodeTerSaldoNegativo() {
		return podeTerSaldoNegativo;
	}

	public void setPodeTerSaldoNegativo(Boolean podeTerSaldoNegativo) {
		this.podeTerSaldoNegativo = podeTerSaldoNegativo;
	}

	public Collection<UnidadeDaEmpresa> getUnidades() {
		return unidades;
	}

	public void setUnidades(Collection<UnidadeDaEmpresa> unidades) {
		this.unidades = unidades;
	}

	public Portador(Long idPortador, String tipoPortador, String nomePortador, String descricaoPortador,
			Conciliacao conciliacao, Boolean ativoPortador, Integer sequenciaLancamentoPortador, PortadorSaldo saldo,
			Boolean podeTerSaldoNegativo, Collection<UnidadeDaEmpresa> unidades) {
		this.idPortador = idPortador;
		this.tipoPortador = tipoPortador;
		this.nomePortador = nomePortador;
		this.descricaoPortador = descricaoPortador;
		this.conciliacao = conciliacao;
		this.ativoPortador = ativoPortador;
		this.sequenciaLancamentoPortador = sequenciaLancamentoPortador;
		this.saldo = saldo;
		this.podeTerSaldoNegativo = podeTerSaldoNegativo;
		this.unidades = unidades;
	}

	public Portador() {
	}

}
