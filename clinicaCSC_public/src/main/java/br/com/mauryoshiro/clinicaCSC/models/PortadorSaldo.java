package br.com.mauryoshiro.clinicaCSC.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PortadorSaldo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPortadorSaldo;

	private Double saldoDisponivelInicialPortadorSaldo;

	private Double saldoBrutoInicialPortadorSaldo;

	// private Double saldoDisponivelDataConciliacao;

	// private Double saldoBrutoDataConciliacao;

	private Double saldoDisponivelAtualPortadorSaldo;

	private Double saldoBrutoAtualPortadorSaldo;

	public Long getIdPortadorSaldo() {
		return idPortadorSaldo;
	}

	public void setIdPortadorSaldo(Long idPortadorSaldo) {
		this.idPortadorSaldo = idPortadorSaldo;
	}

	public Double getSaldoDisponivelInicialPortadorSaldo() {
		return saldoDisponivelInicialPortadorSaldo;
	}

	public void setSaldoDisponivelInicialPortadorSaldo(Double saldoDisponivelInicialPortadorSaldo) {
		this.saldoDisponivelInicialPortadorSaldo = saldoDisponivelInicialPortadorSaldo;
	}

	public Double getSaldoBrutoInicialPortadorSaldo() {
		return saldoBrutoInicialPortadorSaldo;
	}

	public void setSaldoBrutoInicialPortadorSaldo(Double saldoBrutoInicialPortadorSaldo) {
		this.saldoBrutoInicialPortadorSaldo = saldoBrutoInicialPortadorSaldo;
	}

	public Double getSaldoDisponivelAtualPortadorSaldo() {
		return saldoDisponivelAtualPortadorSaldo;
	}

	public void setSaldoDisponivelAtualPortadorSaldo(Double saldoDisponivelAtualPortadorSaldo) {
		this.saldoDisponivelAtualPortadorSaldo = saldoDisponivelAtualPortadorSaldo;
	}

	public Double getSaldoBrutoAtualPortadorSaldo() {
		return saldoBrutoAtualPortadorSaldo;
	}

	public void setSaldoBrutoAtualPortadorSaldo(Double saldoBrutoAtualPortadorSaldo) {
		this.saldoBrutoAtualPortadorSaldo = saldoBrutoAtualPortadorSaldo;
	}

	public PortadorSaldo(Long idPortadorSaldo, Double saldoDisponivelInicialPortadorSaldo,
			Double saldoBrutoInicialPortadorSaldo, Double saldoDisponivelAtualPortadorSaldo,
			Double saldoBrutoAtualPortadorSaldo) {
		this.idPortadorSaldo = idPortadorSaldo;
		this.saldoDisponivelInicialPortadorSaldo = saldoDisponivelInicialPortadorSaldo;
		this.saldoBrutoInicialPortadorSaldo = saldoBrutoInicialPortadorSaldo;
		this.saldoDisponivelAtualPortadorSaldo = saldoDisponivelAtualPortadorSaldo;
		this.saldoBrutoAtualPortadorSaldo = saldoBrutoAtualPortadorSaldo;
	}

	public PortadorSaldo() {
	}

	/*
	 * public Double getSaldoDisponivelDataConciliacao() { return
	 * saldoDisponivelDataConciliacao; }
	 * 
	 * public void setSaldoDisponivelDataConciliacao(Double
	 * saldoDisponivelDataConciliacao) { this.saldoDisponivelDataConciliacao =
	 * saldoDisponivelDataConciliacao; }
	 * 
	 * public Double getSaldoBrutoDataConciliacao() { return
	 * saldoBrutoDataConciliacao; }
	 * 
	 * public void setSaldoBrutoDataConciliacao(Double saldoBrutoDataConciliacao) {
	 * this.saldoBrutoDataConciliacao = saldoBrutoDataConciliacao; }
	 */

}
