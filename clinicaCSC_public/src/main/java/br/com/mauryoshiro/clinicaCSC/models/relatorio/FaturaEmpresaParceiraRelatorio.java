package br.com.mauryoshiro.clinicaCSC.models.relatorio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import br.com.mauryoshiro.clinicaCSC.models.FaturaEmpresaParceira;

@Entity
public class FaturaEmpresaParceiraRelatorio {

	@Id
	@GeneratedValue(generator = "increment")
	private Long id;

	@OneToOne
	private FaturaEmpresaParceira faturaEmpresaParceira;

	private String empParcNomeFantasia;

	private String empParcRazaoSocial;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public FaturaEmpresaParceira getFaturaEmpresaParceira() {
		return faturaEmpresaParceira;
	}

	public void setFaturaEmpresaParceira(FaturaEmpresaParceira faturaEmpresaParceira) {
		this.faturaEmpresaParceira = faturaEmpresaParceira;
	}

	public String getEmpParcNomeFantasia() {
		return empParcNomeFantasia;
	}

	public void setEmpParcNomeFantasia(String empParcNomeFantasia) {
		this.empParcNomeFantasia = empParcNomeFantasia;
	}

	public String getEmpParcRazaoSocial() {
		return empParcRazaoSocial;
	}

	public void setEmpParcRazaoSocial(String empParcRazaoSocial) {
		this.empParcRazaoSocial = empParcRazaoSocial;
	}

	public FaturaEmpresaParceiraRelatorio(Long id, FaturaEmpresaParceira faturaEmpresaParceira,
			String empParcNomeFantasia, String empParcRazaoSocial) {
		this.id = id;
		this.faturaEmpresaParceira = faturaEmpresaParceira;
		this.empParcNomeFantasia = empParcNomeFantasia;
		this.empParcRazaoSocial = empParcRazaoSocial;
	}

	public FaturaEmpresaParceiraRelatorio() {
	}
}
