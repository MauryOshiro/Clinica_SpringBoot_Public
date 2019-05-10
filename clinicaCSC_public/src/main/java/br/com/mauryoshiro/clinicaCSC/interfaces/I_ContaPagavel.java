package br.com.mauryoshiro.clinicaCSC.interfaces;

import br.com.mauryoshiro.clinicaCSC.models.Parcela;

public interface I_ContaPagavel {
	public void pagar(Parcela p);

	public void cancelarPagamento(Parcela p);

	public void parcelar();

	public void cancelarConta();

	public void ativarConta();

	public void editar();
}
