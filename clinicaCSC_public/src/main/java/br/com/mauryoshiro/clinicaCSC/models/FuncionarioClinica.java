package br.com.mauryoshiro.clinicaCSC.models;

import java.time.LocalDate;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class FuncionarioClinica {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idFuncionarioClinica;

	private String departamentoFuncionarioClinica;

	@ManyToOne
	private Cargo cargo;

	private LocalDate dataAdmissaoFuncionarioClinica;

	private LocalDate dataDemissaoFuncionarioClinica;

	private Boolean ativoFuncionarioClinica;

	@OneToOne
	private Usuario usuario;

	@OneToMany
	private Collection<UnidadeDaEmpresa> unidades;

	private String observacaoFuncionarioClinica;

	@OneToOne
	private PessoaFisica pessoaFisica;

	public Long getIdFuncionarioClinica() {
		return idFuncionarioClinica;
	}

	public void setIdFuncionarioClinica(Long idFuncionarioClinica) {
		this.idFuncionarioClinica = idFuncionarioClinica;
	}

	public String getDepartamentoFuncionarioClinica() {
		return departamentoFuncionarioClinica;
	}

	public void setDepartamentoFuncionarioClinica(String departamentoFuncionarioClinica) {
		this.departamentoFuncionarioClinica = departamentoFuncionarioClinica;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public LocalDate getDataAdmissaoFuncionarioClinica() {
		return dataAdmissaoFuncionarioClinica;
	}

	public void setDataAdmissaoFuncionarioClinica(LocalDate dataAdmissaoFuncionarioClinica) {
		this.dataAdmissaoFuncionarioClinica = dataAdmissaoFuncionarioClinica;
	}

	public LocalDate getDataDemissaoFuncionarioClinica() {
		return dataDemissaoFuncionarioClinica;
	}

	public void setDataDemissaoFuncionarioClinica(LocalDate dataDemissaoFuncionarioClinica) {
		this.dataDemissaoFuncionarioClinica = dataDemissaoFuncionarioClinica;
	}

	public Boolean getAtivoFuncionarioClinica() {
		return ativoFuncionarioClinica;
	}

	public void setAtivoFuncionarioClinica(Boolean ativoFuncionarioClinica) {
		this.ativoFuncionarioClinica = ativoFuncionarioClinica;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Collection<UnidadeDaEmpresa> getUnidades() {
		return unidades;
	}

	public void setUnidades(Collection<UnidadeDaEmpresa> unidades) {
		this.unidades = unidades;
	}

	public String getObservacaoFuncionarioClinica() {
		return observacaoFuncionarioClinica;
	}

	public void setObservacaoFuncionarioClinica(String observacaoFuncionarioClinica) {
		this.observacaoFuncionarioClinica = observacaoFuncionarioClinica;
	}

	public PessoaFisica getPessoaFisica() {
		return pessoaFisica;
	}

	public void setPessoaFisica(PessoaFisica pessoaFisica) {
		this.pessoaFisica = pessoaFisica;
	}

	public FuncionarioClinica(Long idFuncionarioClinica, String departamentoFuncionarioClinica, Cargo cargo,
			LocalDate dataAdmissaoFuncionarioClinica, LocalDate dataDemissaoFuncionarioClinica,
			Boolean ativoFuncionarioClinica, Usuario usuario, Collection<UnidadeDaEmpresa> unidades,
			String observacaoFuncionarioClinica, PessoaFisica pessoaFisica) {
		this.idFuncionarioClinica = idFuncionarioClinica;
		this.departamentoFuncionarioClinica = departamentoFuncionarioClinica;
		this.cargo = cargo;
		this.dataAdmissaoFuncionarioClinica = dataAdmissaoFuncionarioClinica;
		this.dataDemissaoFuncionarioClinica = dataDemissaoFuncionarioClinica;
		this.ativoFuncionarioClinica = ativoFuncionarioClinica;
		this.usuario = usuario;
		this.unidades = unidades;
		this.observacaoFuncionarioClinica = observacaoFuncionarioClinica;
		this.pessoaFisica = pessoaFisica;
	}

	public FuncionarioClinica() {
	}

}
