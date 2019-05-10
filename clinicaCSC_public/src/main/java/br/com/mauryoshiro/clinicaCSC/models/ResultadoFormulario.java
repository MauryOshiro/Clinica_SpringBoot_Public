package br.com.mauryoshiro.clinicaCSC.models;

public class ResultadoFormulario {

	/*
	 * erro true significa que HÁ erro. erro false significa que NÃO há erro.
	 */
	private Boolean erro;

	private String mensagem;

	public Boolean getErro() {
		return erro;
	}

	public void setErro(Boolean erro) {
		this.erro = erro;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public ResultadoFormulario(Boolean erro, String mensagem) {
		this.erro = erro;
		this.mensagem = mensagem;
	}

	public ResultadoFormulario() {
	}

}
