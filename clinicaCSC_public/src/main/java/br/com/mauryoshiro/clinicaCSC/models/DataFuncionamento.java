package br.com.mauryoshiro.clinicaCSC.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class DataFuncionamento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idDataFuncionamento;

	/*
	 * Exemplo de tipoData: Fim de semana, feriado, dia comum.
	 */
	private String tipoDataDataFuncionamento;

	@ManyToOne
	private HorarioFuncionamento horarioFuncionamento;

	public Long getIdDataFuncionamento() {
		return idDataFuncionamento;
	}

	public void setIdDataFuncionamento(Long idDataFuncionamento) {
		this.idDataFuncionamento = idDataFuncionamento;
	}

	public String getTipoDataDataFuncionamento() {
		return tipoDataDataFuncionamento;
	}

	public void setTipoDataDataFuncionamento(String tipoDataDataFuncionamento) {
		this.tipoDataDataFuncionamento = tipoDataDataFuncionamento;
	}

	public HorarioFuncionamento getHorarioFuncionamento() {
		return horarioFuncionamento;
	}

	public void setHorarioFuncionamento(HorarioFuncionamento horarioFuncionamento) {
		this.horarioFuncionamento = horarioFuncionamento;
	}

	public DataFuncionamento(Long idDataFuncionamento, String tipoDataDataFuncionamento,
			HorarioFuncionamento horarioFuncionamento) {
		this.idDataFuncionamento = idDataFuncionamento;
		this.tipoDataDataFuncionamento = tipoDataDataFuncionamento;
		this.horarioFuncionamento = horarioFuncionamento;
	}

	public DataFuncionamento() {
	}

}
