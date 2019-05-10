package br.com.mauryoshiro.clinicaCSC.interfaces.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

public interface ControllerSistema<T> {

	/*
	 * ATENÇÃO!
	 * 
	 * Como o métodos preparaViewErro() recebe quantidade de
	 * parâmetros diferentes, este método não entra em nenhuma interface. Portanto
	 * é necessário cria-lo manualmente.
	 * 
	 * Lembrando que preparaViewErro() devolve uma ModelAndView e recebe todos os
	 * objetos necessários para montar a respectiva view. Já o método cadastrar()
	 * recebe como parâmetros os objetos que estão vindo do form da view mais as
	 * interfaces Errors e o RedirectAttributes.
	 */

	public Boolean salvar(T objeto);
	
	public Boolean remover(T objeto);
	
	public ModelAndView salvar(T objeto, RedirectAttributes attributes);

	public ModelAndView preparaView();

	public ModelAndView redirecionar(RedirectAttributes attributes, String mensagem, Boolean erro);

	public ModelAndView editar(T objeto);

	public ModelAndView remover(T objeto, RedirectAttributes attributes);
}
