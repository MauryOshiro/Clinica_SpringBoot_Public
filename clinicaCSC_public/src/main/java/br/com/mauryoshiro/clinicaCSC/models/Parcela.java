package br.com.mauryoshiro.clinicaCSC.models;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Parcela {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idParcela;

	private Integer numeroParcela;

	private Double valorParcela;

	private Boolean pagoParcela;

	private LocalDate dataPagamentoParcela;

	private LocalDate vencimentoOriginalParcela;

	private LocalDate vencimentoRealParcela;

	private Double valorDescontoParcela;

	private Double valorJurosParcela;

	public Long getIdParcela() {
		return idParcela;
	}

	public void setIdParcela(Long idParcela) {
		this.idParcela = idParcela;
	}

	public Integer getNumeroParcela() {
		return numeroParcela;
	}

	public void setNumeroParcela(Integer numeroParcela) {
		this.numeroParcela = numeroParcela;
	}

	public Double getValorParcela() {
		return valorParcela;
	}

	public void setValorParcela(Double valorParcela) {
		this.valorParcela = valorParcela;
	}

	public Boolean getPagoParcela() {
		return pagoParcela;
	}

	public void setPagoParcela(Boolean pagoParcela) {
		this.pagoParcela = pagoParcela;
	}

	public LocalDate getDataPagamentoParcela() {
		return dataPagamentoParcela;
	}

	public void setDataPagamentoParcela(LocalDate dataPagamentoParcela) {
		this.dataPagamentoParcela = dataPagamentoParcela;
	}

	public LocalDate getVencimentoOriginalParcela() {
		return vencimentoOriginalParcela;
	}

	public void setVencimentoOriginalParcela(LocalDate vencimentoOriginalParcela) {
		this.vencimentoOriginalParcela = vencimentoOriginalParcela;
	}

	public LocalDate getVencimentoRealParcela() {
		return vencimentoRealParcela;
	}

	public void setVencimentoRealParcela(LocalDate vencimentoRealParcela) {
		this.vencimentoRealParcela = vencimentoRealParcela;
	}

	public Double getValorDescontoParcela() {
		return valorDescontoParcela;
	}

	public void setValorDescontoParcela(Double valorDescontoParcela) {
		this.valorDescontoParcela = valorDescontoParcela;
	}

	public Double getValorJurosParcela() {
		return valorJurosParcela;
	}

	public void setValorJurosParcela(Double valorJurosParcela) {
		this.valorJurosParcela = valorJurosParcela;
	}

	public Parcela(Long idParcela, Integer numeroParcela, Double valorParcela, Boolean pagoParcela,
			LocalDate dataPagamentoParcela, LocalDate vencimentoOriginalParcela, LocalDate vencimentoRealParcela,
			Double valorDescontoParcela, Double valorJurosParcela) {
		this.idParcela = idParcela;
		this.numeroParcela = numeroParcela;
		this.valorParcela = valorParcela;
		this.pagoParcela = pagoParcela;
		this.dataPagamentoParcela = dataPagamentoParcela;
		this.vencimentoOriginalParcela = vencimentoOriginalParcela;
		this.vencimentoRealParcela = vencimentoRealParcela;
		this.valorDescontoParcela = valorDescontoParcela;
		this.valorJurosParcela = valorJurosParcela;
	}

	public Parcela() {
	}

}
