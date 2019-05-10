package br.com.mauryoshiro.clinicaCSC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.mauryoshiro.clinicaCSC.filter.Filtro;
import br.com.mauryoshiro.clinicaCSC.interfaces.controller.ControllerSistema;
import br.com.mauryoshiro.clinicaCSC.models.Estado;
import br.com.mauryoshiro.clinicaCSC.models.Pais;
import br.com.mauryoshiro.clinicaCSC.models.ResultadoFormulario;

@Controller
@RequestMapping("/testeFrontController")
public class TesteFrontController implements ControllerSistema<Estado>{

	private static final String VIEW = "cadastros/teste/gerenciarTeste";
	
	public ModelAndView preparaViewErro(Estado estado, Pais pais, String mensagem, Boolean erro) {
		ModelAndView mv = new ModelAndView(VIEW);
		mv.addObject("estado", estado);
		mv.addObject("pais", pais);
		mv.addObject("filtro", new Filtro());
		mv.addObject("resultado", new ResultadoFormulario(erro, mensagem));

		Filtro filtro = new Filtro();
		filtro.setDescricao("%");
		//List<Pais> paises = paisService.filtrar(filtro);

		return mv;
	}
	
	@Override
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView preparaView() {
		ModelAndView mv = new ModelAndView(VIEW);

		Estado estado = new Estado();
		Filtro filtro = new Filtro();
		filtro.setDescricao("%");;

		Pais pais = new Pais();

		mv.addObject("estado", estado);
		mv.addObject("pais", pais);

		return mv;
	}

	@Override
	public ModelAndView redirecionar(RedirectAttributes attributes, String mensagem, Boolean erro) {
		ModelAndView mvRedirecionado = new ModelAndView("redirect:/testeFrontController");
		attributes.addFlashAttribute("resultado", new ResultadoFormulario(erro, mensagem));

		return mvRedirecionado;
	}

	@Override
	public Boolean salvar(Estado objeto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean remover(Estado objeto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelAndView salvar(Estado objeto, RedirectAttributes attributes) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelAndView editar(Estado objeto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelAndView remover(Estado objeto, RedirectAttributes attributes) {
		// TODO Auto-generated method stub
		return null;
	}


}
