package br.com.mauryoshiro.clinicaCSC.models;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import br.com.mauryoshiro.clinicaCSC.interfaces.I_Lancamento;

@Entity
public class Lancamento implements I_Lancamento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idLancamento;

	private Integer numeroLancamentoLancamento;

	@ManyToOne
	private TipoLancamento tipoLancamento;

	private LocalDate dataLancamentoLancamento;

	private Double valorLancamento;

	private String descricaoLancamento;

	private String observacaoLancamento;

	@ManyToOne
	private Portador portador;

	private Boolean canceladoLancamento;

	private LocalDate dataCancelamentoLancamento;

	private LocalDate dataPagamentoLancamento;

	private String meioDePagamentoLancamento;

	@OneToOne
	private Parcela parcela;

	public Lancamento() {
	}

	public Lancamento(Long idLancamento, Integer numeroLancamentoLancamento, TipoLancamento tipoLancamento,
			LocalDate dataLancamentoLancamento, Double valorLancamento, String descricaoLancamento,
			String observacaoLancamento, Portador portador, Boolean canceladoLancamento,
			LocalDate dataCancelamentoLancamento, LocalDate dataPagamentoLancamento, String meioDePagamentoLancamento,
			Parcela parcela) {
		this.idLancamento = idLancamento;
		this.numeroLancamentoLancamento = numeroLancamentoLancamento;
		this.tipoLancamento = tipoLancamento;
		this.dataLancamentoLancamento = dataLancamentoLancamento;
		this.valorLancamento = valorLancamento;
		this.descricaoLancamento = descricaoLancamento;
		this.observacaoLancamento = observacaoLancamento;
		this.portador = portador;
		this.canceladoLancamento = canceladoLancamento;
		this.dataCancelamentoLancamento = dataCancelamentoLancamento;
		this.dataPagamentoLancamento = dataPagamentoLancamento;
		this.meioDePagamentoLancamento = meioDePagamentoLancamento;
		this.parcela = parcela;
	}

	public Long getIdLancamento() {
		return idLancamento;
	}

	public void setIdLancamento(Long idLancamento) {
		this.idLancamento = idLancamento;
	}

	public Integer getNumeroLancamentoLancamento() {
		return numeroLancamentoLancamento;
	}

	public void setNumeroLancamentoLancamento(Integer numeroLancamentoLancamento) {
		this.numeroLancamentoLancamento = numeroLancamentoLancamento;
	}

	public TipoLancamento getTipoLancamento() {
		return tipoLancamento;
	}

	public void setTipoLancamento(TipoLancamento tipoLancamento) {
		this.tipoLancamento = tipoLancamento;
	}

	public LocalDate getDataLancamentoLancamento() {
		return dataLancamentoLancamento;
	}

	public void setDataLancamentoLancamento(LocalDate dataLancamentoLancamento) {
		this.dataLancamentoLancamento = dataLancamentoLancamento;
	}

	public Double getValorLancamento() {
		return valorLancamento;
	}

	public void setValorLancamento(Double valorLancamento) {
		this.valorLancamento = valorLancamento;
	}

	public String getDescricaoLancamento() {
		return descricaoLancamento;
	}

	public void setDescricaoLancamento(String descricaoLancamento) {
		this.descricaoLancamento = descricaoLancamento;
	}

	public String getObservacaoLancamento() {
		return observacaoLancamento;
	}

	public void setObservacaoLancamento(String observacaoLancamento) {
		this.observacaoLancamento = observacaoLancamento;
	}

	public Portador getPortador() {
		return portador;
	}

	public void setPortador(Portador portador) {
		this.portador = portador;
	}

	public Boolean getCanceladoLancamento() {
		return canceladoLancamento;
	}

	public void setCanceladoLancamento(Boolean canceladoLancamento) {
		this.canceladoLancamento = canceladoLancamento;
	}

	public LocalDate getDataCancelamentoLancamento() {
		return dataCancelamentoLancamento;
	}

	public void setDataCancelamentoLancamento(LocalDate dataCancelamentoLancamento) {
		this.dataCancelamentoLancamento = dataCancelamentoLancamento;
	}

	public LocalDate getDataPagamentoLancamento() {
		return dataPagamentoLancamento;
	}

	public void setDataPagamentoLancamento(LocalDate dataPagamentoLancamento) {
		this.dataPagamentoLancamento = dataPagamentoLancamento;
	}

	public String getMeioDePagamentoLancamento() {
		return meioDePagamentoLancamento;
	}

	public void setMeioDePagamentoLancamento(String meioDePagamentoLancamento) {
		this.meioDePagamentoLancamento = meioDePagamentoLancamento;
	}

	public Parcela getParcela() {
		return parcela;
	}

	public void setParcela(Parcela parcela) {
		this.parcela = parcela;
	}

	public void cancelar() {
		// TODO Auto-generated method stub

	}

	public void ativar() {
		// TODO Auto-generated method stub

	}

	public void editar() {
		// TODO Auto-generated method stub

	}

}
