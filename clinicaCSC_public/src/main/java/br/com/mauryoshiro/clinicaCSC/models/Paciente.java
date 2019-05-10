package br.com.mauryoshiro.clinicaCSC.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Paciente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPaciente;

	private Boolean conveniadoPaciente;

	@ManyToOne
	private Profissional profissional;

	private String prontuarioPaciente;

	private Boolean ativoPaciente;

	@OneToOne
	private ClinicaParceira clinica;

	private String observacaoPaciente;

	@OneToOne
	private PessoaFisica pessoaFisica;

	public Long getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(Long idPaciente) {
		this.idPaciente = idPaciente;
	}

	public Boolean getConveniadoPaciente() {
		return conveniadoPaciente;
	}

	public void setConveniadoPaciente(Boolean conveniadoPaciente) {
		this.conveniadoPaciente = conveniadoPaciente;
	}

	public Profissional getProfissional() {
		return profissional;
	}

	public void setProfissional(Profissional profissional) {
		this.profissional = profissional;
	}

	public String getProntuarioPaciente() {
		return prontuarioPaciente;
	}

	public void setProntuarioPaciente(String prontuarioPaciente) {
		this.prontuarioPaciente = prontuarioPaciente;
	}

	public Boolean getAtivoPaciente() {
		return ativoPaciente;
	}

	public void setAtivoPaciente(Boolean ativoPaciente) {
		this.ativoPaciente = ativoPaciente;
	}

	public ClinicaParceira getClinica() {
		return clinica;
	}

	public void setClinica(ClinicaParceira clinica) {
		this.clinica = clinica;
	}

	public String getObservacaoPaciente() {
		return observacaoPaciente;
	}

	public void setObservacaoPaciente(String observacaoPaciente) {
		this.observacaoPaciente = observacaoPaciente;
	}

	public PessoaFisica getPessoaFisica() {
		return pessoaFisica;
	}

	public void setPessoaFisica(PessoaFisica pessoaFisica) {
		this.pessoaFisica = pessoaFisica;
	}

	public Paciente(Long idPaciente, Boolean conveniadoPaciente, Profissional profissional, String prontuarioPaciente,
			Boolean ativoPaciente, ClinicaParceira clinica, String observacaoPaciente, PessoaFisica pessoaFisica) {
		this.idPaciente = idPaciente;
		this.conveniadoPaciente = conveniadoPaciente;
		this.profissional = profissional;
		this.prontuarioPaciente = prontuarioPaciente;
		this.ativoPaciente = ativoPaciente;
		this.clinica = clinica;
		this.observacaoPaciente = observacaoPaciente;
		this.pessoaFisica = pessoaFisica;
	}

	public Paciente() {
	}

	/*
	 * public Paciente(Boolean conveniado, String prontuario, String nome, String
	 * sobrenome, String rg, BigInteger cpf, LocalDate dataNascimento, String
	 * observacao, Endereco endereco, Boolean ativo, Contato contato, String sexo,
	 * String nivelEscolaridade, Integer idade) {
	 * super(nome,sobrenome,rg,cpf,dataNascimento,observacao,endereco,contato,sexo,
	 * nivelEscolaridade,idade); this.conveniado = conveniado; this.prontuario =
	 * prontuario; this.ativo = ativo;
	 * 
	 * //System.out.println("Nome no construtor: "+nome);
	 * //System.out.println("Nome na classe mãe: "+getNome());
	 * 
	 * //setNome(nome); //setSobrenome(sobrenome); //setRg(rg); //setCpf(cpf);
	 * //setDataNascimento(dataNascimento); //setObservacao(observacao);
	 * //setEndereco(endereco); //setContato(contato); //setSexo(sexo);
	 * //setNivelEscolaridade(nivelEscolaridade); //setIdade(idade);
	 * 
	 * }
	 */

	/*
	 * public Paciente(Long id, String nome, String sobrenome, BigInteger cpf) {
	 * this.id = id; this.setNome(nome); this.setSobrenome(sobrenome);
	 * this.setCpf(cpf); }
	 */

}
