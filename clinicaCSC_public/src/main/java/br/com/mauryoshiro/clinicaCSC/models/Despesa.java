package br.com.mauryoshiro.clinicaCSC.models;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import br.com.mauryoshiro.clinicaCSC.interfaces.I_ContaPagavel;

@Entity
public class Despesa implements I_ContaPagavel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idDespesa;

	private String descricaoDespesa;

	@ManyToOne
	private TipoDespesa tipoDespesa;

	private Double valorDespesa;

	private Boolean quitadoDespesa;

	// private Integer qtdParcelas;

	private Boolean canceladoDespesa;

	@OneToMany
	private Collection<Parcela> parcelas;

	@ManyToOne
	private UnidadeDaEmpresa unidade;

	/*
	 * public Integer getQtdParcelas() { return qtdParcelas; }
	 * 
	 * public void setQtdParcelas(Integer qtdParcelas) { this.qtdParcelas =
	 * qtdParcelas; }
	 */

	public void pagar(Parcela p) {
		// TODO Auto-generated method stub

	}

	public Despesa() {
	}

	public Despesa(Long idDespesa, String descricaoDespesa, TipoDespesa tipoDespesa, Double valorDespesa,
			Boolean quitadoDespesa, Boolean canceladoDespesa, Collection<Parcela> parcelas, UnidadeDaEmpresa unidade) {
		this.idDespesa = idDespesa;
		this.descricaoDespesa = descricaoDespesa;
		this.tipoDespesa = tipoDespesa;
		this.valorDespesa = valorDespesa;
		this.quitadoDespesa = quitadoDespesa;
		this.canceladoDespesa = canceladoDespesa;
		this.parcelas = parcelas;
		this.unidade = unidade;
	}

	public Long getIdDespesa() {
		return idDespesa;
	}

	public void setIdDespesa(Long idDespesa) {
		this.idDespesa = idDespesa;
	}

	public String getDescricaoDespesa() {
		return descricaoDespesa;
	}

	public void setDescricaoDespesa(String descricaoDespesa) {
		this.descricaoDespesa = descricaoDespesa;
	}

	public TipoDespesa getTipoDespesa() {
		return tipoDespesa;
	}

	public void setTipoDespesa(TipoDespesa tipoDespesa) {
		this.tipoDespesa = tipoDespesa;
	}

	public Double getValorDespesa() {
		return valorDespesa;
	}

	public void setValorDespesa(Double valorDespesa) {
		this.valorDespesa = valorDespesa;
	}

	public Boolean getQuitadoDespesa() {
		return quitadoDespesa;
	}

	public void setQuitadoDespesa(Boolean quitadoDespesa) {
		this.quitadoDespesa = quitadoDespesa;
	}

	public Boolean getCanceladoDespesa() {
		return canceladoDespesa;
	}

	public void setCanceladoDespesa(Boolean canceladoDespesa) {
		this.canceladoDespesa = canceladoDespesa;
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

	public void setUnidade(UnidadeDaEmpresa unidade) {
		this.unidade = unidade;
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

}
