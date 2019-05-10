package br.com.mauryoshiro.clinicaCSC.controller.frontController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.mauryoshiro.clinicaCSC.controller.EstadoController;
import br.com.mauryoshiro.clinicaCSC.controller.IndexController;
import br.com.mauryoshiro.clinicaCSC.controller.PacienteController;
import br.com.mauryoshiro.clinicaCSC.controller.PaisController;
import br.com.mauryoshiro.clinicaCSC.controller.TesteFrontController;
import br.com.mauryoshiro.clinicaCSC.filter.Filtro;
import br.com.mauryoshiro.clinicaCSC.models.Estado;
import br.com.mauryoshiro.clinicaCSC.models.Pais;

@Controller
@RequestMapping("/front")
public class FrontController {

	@Autowired
	TesteFrontController testeFrontController;

	@Autowired
	IndexController indexController;

	@Autowired
	PaisController paisController;

	@Autowired
	EstadoController estadoController;

	@Autowired
	PacienteController pacienteController;

	@RequestMapping(value = "/cadastrarTesteFrontController", method = RequestMethod.POST)
	public ModelAndView cadastrarTesteFrontController(@Validated Estado estado, Errors estadoErrors,
			@Validated Pais pais, Errors paisErros, RedirectAttributes attributes) {
		String mensagem = "";
		Boolean erro = true;

		if (estadoErrors.hasErrors() || paisErros.hasErrors()) {
			mensagem = "Os campos com informações inválidas estão destacadas em vermelho.";
		} else {
			erro = paisController.salvar(pais);
			if (erro) {
				mensagem = "Erro ao salvar país!";
			} else {
				erro = estadoController.salvar(estado, pais);
				if (erro) {
					mensagem = "Erro ao salvar estado!";
				} else {
					mensagem = "País e estado salvos com sucesso!";
					return testeFrontController.redirecionar(attributes, mensagem, erro);
				}
			}
		}

		return testeFrontController.preparaViewErro(estado, pais, mensagem, erro);
	}
	
	@RequestMapping(value = "/pais/cadastrarPais", method = RequestMethod.POST)
	public ModelAndView cadastrarPais(@Validated Pais pais, Errors errors, RedirectAttributes attributes) {
		String mensagem = "";
		Boolean erro = true;
		
		if(errors.hasErrors()) {
			mensagem = "Os campos com informações inválidas estão destacadas em vermelho.";
		} else {
			erro = paisController.salvar(pais);
			if(erro) {
				mensagem = "Erro ao salvar pais!";
			} else {
				mensagem = "País salvo com sucesso: " + pais.getNomePais();
				return paisController.redirecionar(attributes, mensagem, erro);
			}
		}
		
		return paisController.preparaViewErro(pais, mensagem, erro);
	}
	
	@RequestMapping(value = "/pais/{id}", method = RequestMethod.POST, params = "acao=editar")
	public ModelAndView editarPais(@PathVariable("id") Pais pais) {
		return paisController.editar(pais);
	}
	
	@RequestMapping(value = "/pais/{id}", method = RequestMethod.POST, params = "acao=remover")
	public ModelAndView removerPais(@PathVariable("id") Pais pais, RedirectAttributes attributes) {
		return paisController.remover(pais, attributes);
	}
	
	@RequestMapping(value = "/pais/pesquisar", method = RequestMethod.POST)
	public ModelAndView pesquisarPais(@ModelAttribute("filtro") Filtro filtro) {
		return paisController.pesquisar(filtro);
	}
	
	@RequestMapping(value = "/pais", method = RequestMethod.GET)
	public ModelAndView viewPais() {
		return paisController.preparaView();
	}
}
