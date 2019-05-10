package br.com.mauryoshiro.clinicaCSC.models;

import java.time.LocalDate;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import br.com.mauryoshiro.clinicaCSC.interfaces.I_ContaPagavel;

@Entity
public class Fatura implements I_ContaPagavel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idFatura;

	private String faturaPara;

	private Double valorTotalFatura;

	private Boolean canceladoFatura;

	private LocalDate mesReferenciaFatura;

	private String observacaoFatura;

	@OneToMany
	private Collection<Parcela> parcelas;

	@ManyToOne
	private UnidadeDaEmpresa unidade;

	public void setUnidade(UnidadeDaEmpresa unidade) {
		this.unidade = unidade;
	}

	public void pagar(Parcela p) {
		// TODO Auto-generated method stub

	}

	public void cancelarPagamento(Parcela p) {
		// TODO Auto-generated method stub

	}

	public void parcelar() {
		// TODO Auto-generated method stub

	}

	public void cancelarConta() {
		// TODO Auto-generated method stub

	}

	public void ativarConta() {
		// TODO Auto-generated method stub

	}

	public void editar() {
		// TODO Auto-generated method stub

	}

	public Integer qtdParcelas() {
		return this.parcelas.size();
	}

	public Long getIdFatura() {
		return idFatura;
	}

	public void setIdFatura(Long idFatura) {
		this.idFatura = idFatura;
	}

	public String getFaturaPara() {
		return faturaPara;
	}

	public void setFaturaPara(String faturaPara) {
		this.faturaPara = faturaPara;
	}

	public Double getValorTotalFatura() {
		return valorTotalFatura;
	}

	public void setValorTotalFatura(Double valorTotalFatura) {
		this.valorTotalFatura = valorTotalFatura;
	}

	public Boolean getCanceladoFatura() {
		return canceladoFatura;
	}

	public void setCanceladoFatura(Boolean canceladoFatura) {
		this.canceladoFatura = canceladoFatura;
	}

	public LocalDate getMesReferenciaFatura() {
		return mesReferenciaFatura;
	}

	public void setMesReferenciaFatura(LocalDate mesReferenciaFatura) {
		this.mesReferenciaFatura = mesReferenciaFatura;
	}

	public String getObservacaoFatura() {
		return observacaoFatura;
	}

	public void setObservacaoFatura(String observacaoFatura) {
		this.observacaoFatura = observacaoFatura;
	}

	public Collection<Parcela> getParcelas() {
		return parcelas;
	}

	public void setParcelas(Collection<Parcela> parcelas) {
		this.parcelas = parcelas;
	}

	public UnidadeDaEmpresa getUnidade() {
		return unidade;
	}

	public Fatura(Long idFatura, String faturaPara, Double valorTotalFatura, Boolean canceladoFatura,
			LocalDate mesReferenciaFatura, String observacaoFatura, Collection<Parcela> parcelas,
			UnidadeDaEmpresa unidade) {
		this.idFatura = idFatura;
		this.faturaPara = faturaPara;
		this.valorTotalFatura = valorTotalFatura;
		this.canceladoFatura = canceladoFatura;
		this.mesReferenciaFatura = mesReferenciaFatura;
		this.observacaoFatura = observacaoFatura;
		this.parcelas = parcelas;
		this.unidade = unidade;
	}

	public Fatura() {
	}

}
