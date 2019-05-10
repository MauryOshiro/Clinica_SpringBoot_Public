package br.com.mauryoshiro.clinicaCSC.models.relatorio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import br.com.mauryoshiro.clinicaCSC.models.Exame;

@Entity
public class ExameRelatorio {

	@Id
	@GeneratedValue(generator = "increment")
	private Long id;
	
	@OneToOne
	private Exame exame;
	
	private String profissionalNome;
	
	private String profissionalSobrenome;
	
	private String profissionalCrp;
	
	private String pacienteNome;
	
	private String pacienteSobrenome;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Exame getExame() {
		return exame;
	}

	public void setExame(Exame exame) {
		this.exame = exame;
	}

	public String getProfissionalNome() {
		return profissionalNome;
	}

	public void setProfissionalNome(String profissionalNome) {
		this.profissionalNome = profissionalNome;
	}

	public String getProfissionalSobrenome() {
		return profissionalSobrenome;
	}

	public void setProfissionalSobrenome(String profissionalSobrenome) {
		this.profissionalSobrenome = profissionalSobrenome;
	}

	public String getProfissionalCrp() {
		return profissionalCrp;
	}

	public void setProfissionalCrp(String profissionalCrp) {
		this.profissionalCrp = profissionalCrp;
	}

	public String getPacienteNome() {
		return pacienteNome;
	}

	public void setPacienteNome(String pacienteNome) {
		this.pacienteNome = pacienteNome;
	}

	public String getPacienteSobrenome() {
		return pacienteSobrenome;
	}

	public void setPacienteSobrenome(String pacienteSobrenome) {
		this.pacienteSobrenome = pacienteSobrenome;
	}

	public ExameRelatorio(Long id, Exame exame, String profissionalNome, String profissionalSobrenome,
			String profissionalCrp, String pacienteNome, String pacienteSobrenome) {
		this.id = id;
		this.exame = exame;
		this.profissionalNome = profissionalNome;
		this.profissionalSobrenome = profissionalSobrenome;
		this.profissionalCrp = profissionalCrp;
		this.pacienteNome = pacienteNome;
		this.pacienteSobrenome = pacienteSobrenome;
	}

	public ExameRelatorio() {
	}
}
