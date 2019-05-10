package br.com.mauryoshiro.clinicaCSC.models;

import java.time.LocalDate;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class ClinicaParceira {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idClinicaParceira;

	private String observacaoClinicaParceira;

	private LocalDate dataInicioParceriaClinicaParceira;

	private Boolean ativoClinicaParceira;

	@OneToMany
	private Collection<ContatoNaPessoaJuridica> contatos;

	@OneToMany
	private Collection<Paciente> pacientes;

	@OneToOne
	private PessoaJuridica pessoaJuridica;

	public Long getIdClinicaParceira() {
		return idClinicaParceira;
	}

	public void setIdClinicaParceira(Long idClinicaParceira) {
		this.idClinicaParceira = idClinicaParceira;
	}

	public String getObservacaoClinicaParceira() {
		return observacaoClinicaParceira;
	}

	public void setObservacaoClinicaParceira(String observacaoClinicaParceira) {
		this.observacaoClinicaParceira = observacaoClinicaParceira;
	}

	public LocalDate getDataInicioParceriaClinicaParceira() {
		return dataInicioParceriaClinicaParceira;
	}

	public void setDataInicioParceriaClinicaParceira(LocalDate dataInicioParceriaClinicaParceira) {
		this.dataInicioParceriaClinicaParceira = dataInicioParceriaClinicaParceira;
	}

	public Boolean getAtivoClinicaParceira() {
		return ativoClinicaParceira;
	}

	public void setAtivoClinicaParceira(Boolean ativoClinicaParceira) {
		this.ativoClinicaParceira = ativoClinicaParceira;
	}

	public Collection<ContatoNaPessoaJuridica> getContatos() {
		return contatos;
	}

	public void setContatos(Collection<ContatoNaPessoaJuridica> contatos) {
		this.contatos = contatos;
	}

	public Collection<Paciente> getPacientes() {
		return pacientes;
	}

	public void setPacientes(Collection<Paciente> pacientes) {
		this.pacientes = pacientes;
	}

	public PessoaJuridica getPessoaJuridica() {
		return pessoaJuridica;
	}

	public void setPessoaJuridica(PessoaJuridica pessoaJuridica) {
		this.pessoaJuridica = pessoaJuridica;
	}

	public ClinicaParceira(Long idClinicaParceira, String observacaoClinicaParceira,
			LocalDate dataInicioParceriaClinicaParceira, Boolean ativoClinicaParceira,
			Collection<ContatoNaPessoaJuridica> contatos, Collection<Paciente> pacientes,
			PessoaJuridica pessoaJuridica) {
		this.idClinicaParceira = idClinicaParceira;
		this.observacaoClinicaParceira = observacaoClinicaParceira;
		this.dataInicioParceriaClinicaParceira = dataInicioParceriaClinicaParceira;
		this.ativoClinicaParceira = ativoClinicaParceira;
		this.contatos = contatos;
		this.pacientes = pacientes;
		this.pessoaJuridica = pessoaJuridica;
	}

	public ClinicaParceira() {
	}

}
