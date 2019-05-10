package br.com.mauryoshiro.clinicaCSC.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.mauryoshiro.clinicaCSC.filter.Filtro;
import br.com.mauryoshiro.clinicaCSC.interfaces.controller.ControllerSistema;
import br.com.mauryoshiro.clinicaCSC.models.Pais;
import br.com.mauryoshiro.clinicaCSC.models.ResultadoFormulario;
import br.com.mauryoshiro.clinicaCSC.service.CRUDService;
import br.com.mauryoshiro.clinicaCSC.service.PaisService;
import br.com.mauryoshiro.clinicaCSC.util.Ferramentas;

@Controller
//@RequestMapping("/pais")
public class PaisController implements ControllerSistema<Pais> {

	@Autowired
	private PaisService paisService;

	@Autowired
	private PlatformTransactionManager ptm;
	
	@Autowired
	private CRUDService<Pais> paisCRUD;

	private static final String VIEW_PAIS = "cadastros/pais/gerenciarPais";

	//@RequestMapping(method = RequestMethod.GET)
	public ModelAndView preparaView() {
		ModelAndView mv = new ModelAndView(VIEW_PAIS);
		Pais pais = new Pais();

		mv.addObject("pais", pais);
		mv.addObject("filtro", new Filtro());

		// PaisFilter filtro = new PaisFilter();
		// filtro.setDescricao("%");
		// mv.addObject("paises", cadastroPaisService.filtrar(filtro));
		return mv;
	}

	public ModelAndView preparaViewErro(Pais pais, String mensagem, Boolean erro) {
		ModelAndView mv = new ModelAndView(VIEW_PAIS);

		mv.addObject("pais", pais);
		mv.addObject("filtro", new Filtro());
		mv.addObject("resultado", new ResultadoFormulario(erro, mensagem));

		Filtro filtro = new Filtro();
		filtro.setDescricao("%");
		// mv.addObject("paises", cadastroPaisService.filtrar(filtro));
		return mv;
	}

	/*
	 * O "redirect:" faz com que o usuário seja redirecionado para uma página. Se
	 * for redirecionado para a mesma página, os campos do formulário estarão em
	 * branco porque o navegador está acessando novamente esta página. Isso evita o
	 * reenvio do formulário.
	 */
	public ModelAndView redirecionar(RedirectAttributes attributes, String mensagem, Boolean erro) {
		ModelAndView mvRedirecionado = new ModelAndView("redirect:/front/pais");
		attributes.addFlashAttribute("resultado", new ResultadoFormulario(erro, mensagem));

		return mvRedirecionado;
	}

	/*
	@RequestMapping(value = "/cadastrar", method = RequestMethod.POST)
	public ModelAndView cadastrar(@Validated Pais pais, Errors errors, RedirectAttributes attributes) {
		String mensagem = "";
		Boolean erro = true;
		
		if (errors.hasErrors()) {
			mensagem = "Os campos com informações inválidas estão destacadas em vermelho.";
			return preparaViewErro(pais, mensagem, true);
		} else {
			pais.setNomePais(Ferramentas.tratarString(pais.getNomePais()));
			erro = paisCRUD.crud(pais, TipoCRUD.Salvar, this.paisService, this.ptm);

			if (erro) {
				mensagem = "Erro ao salvar o país!";
				return preparaViewErro(pais, mensagem, erro);
			} else {
				mensagem = "País salvo com sucesso: " + pais.getNomePais();
				return redirecionar(attributes, mensagem, erro);
			}
		}
	}
	*/
	
	@Override
	public ModelAndView salvar(Pais pais, RedirectAttributes attributes) {
		String mensagem = "";
		Boolean erro = true;
		
		erro = salvar(pais);
		
		if(erro) {
			mensagem = "Erro ao salvar pais!";
		} else {
			mensagem = "País salvo com sucesso: " + pais.getNomePais();
			return redirecionar(attributes, mensagem, erro);
		}
		
		return preparaViewErro(pais, mensagem, erro);
	}

	/*
	@RequestMapping(value = "/pesquisar", method = RequestMethod.POST)
	public ModelAndView pesquisar(@ModelAttribute("filtro") Filtro filtro) {
		ModelAndView mv = new ModelAndView(VIEW_PAIS);
		//List<Pais> paises = paisService.filtrar(filtro);
		List<Pais> paises = paisCRUD.filtrar(filtro, paisService);

		mv.addObject("filtro", new Filtro());
		mv.addObject("pais", new Pais());
		mv.addObject("paises", paises);
		
		return mv;
	}
	*/
	
	public ModelAndView pesquisar(Filtro filtro) {
		ModelAndView mv = new ModelAndView(VIEW_PAIS);
		List<Pais> paises = paisCRUD.filtrar(filtro, paisService);

		mv.addObject("filtro", new Filtro());
		mv.addObject("pais", new Pais());
		mv.addObject("paises", paises);
		
		return mv;
	}

	/*
	@RequestMapping(value = "{id}", method = RequestMethod.POST, params = "acao=editar")
	public ModelAndView editar(@PathVariable("id") Pais pais) {
		ModelAndView mv = new ModelAndView(VIEW_PAIS);
		mv.addObject("filtro", new Filtro());
		mv.addObject("pais", new Pais());
		mv.addObject(pais);
		
		return mv;
	}
	*/
	
	@Override
	public ModelAndView editar(Pais pais) {
		ModelAndView mv = new ModelAndView(VIEW_PAIS);
		mv.addObject("filtro", new Filtro());
		mv.addObject("pais", new Pais());
		mv.addObject(pais);
		
		return mv;
	}

	/*
	@RequestMapping(value = "{id}", method = RequestMethod.POST, params = "acao=remover")
	public ModelAndView remover(@PathVariable("id") Pais pais, RedirectAttributes attributes) {
		String mensagem = "";
		Boolean erro = true;
		
		try {
			erro = paisCRUD.crud(pais, TipoCRUD.Remover, this.paisService, this.ptm);

			if (erro)
				mensagem = "Não é possível remover este país está sendo usado um cadastro";
			else
				mensagem = "País removido com sucesso: " + pais.getNomePais();

		} catch (Exception e) {
			mensagem = "Erro não tratado no método remover de PaisController!";
			System.out.println(e);
		}
		
		return redirecionar(attributes, mensagem, erro);
	}
	*/
	
	@Override
	public ModelAndView remover(Pais pais, RedirectAttributes attributes) {
		String mensagem = "";
		Boolean erro = true;
		
		erro = remover(pais);
		
		if (erro)
			mensagem = "Não é possível remover este país está sendo usado um cadastro";
		else
			mensagem = "País removido com sucesso: " + pais.getNomePais();
			
		return redirecionar(attributes, mensagem, erro);
	}

	@Override
	public Boolean remover(Pais pais) {
		Boolean erro = true;
		
		erro = paisCRUD.remover(pais, paisService, ptm);
		
		return erro;
	}

	@Override
	public Boolean salvar(Pais pais) {
		pais.setNomePais(Ferramentas.tratarString(pais.getNomePais()));
		Boolean erro = true;
		
		erro = paisCRUD.salvar(pais, paisService, ptm);
		
		return erro;
	}
}
