package br.com.mauryoshiro.clinicaCSC.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.mauryoshiro.clinicaCSC.enums.TipoCRUD;
import br.com.mauryoshiro.clinicaCSC.filter.Filtro;
import br.com.mauryoshiro.clinicaCSC.interfaces.controller.ControllerSistema;
import br.com.mauryoshiro.clinicaCSC.models.Estado;
import br.com.mauryoshiro.clinicaCSC.models.Pais;
import br.com.mauryoshiro.clinicaCSC.models.ResultadoFormulario;
import br.com.mauryoshiro.clinicaCSC.service.CRUDService;
import br.com.mauryoshiro.clinicaCSC.service.EstadoService;
import br.com.mauryoshiro.clinicaCSC.service.PaisService;
import br.com.mauryoshiro.clinicaCSC.util.Ferramentas;



@Controller
@RequestMapping("/estado")
public class EstadoController implements ControllerSistema<Estado> {

	@Autowired
	private PlatformTransactionManager ptm;

	@Autowired
	private EstadoService estadoService;

	@Autowired
	private PaisService paisService;
	
	@Autowired
	private CRUDService<Estado> estadoCRUD;
	
	@Autowired
	private CRUDService<Pais> paisCRUD;

	private static final String VIEW_ESTADO = "cadastros/estado/gerenciarEstado";

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView preparaView() {
		ModelAndView mv = new ModelAndView(VIEW_ESTADO);

		Estado estado = new Estado();
		Filtro filtro = new Filtro();
		filtro.setDescricao("%");;
		List<Pais> paises = paisCRUD.filtrar(filtro, paisService);

		Pais pais = new Pais();

		mv.addObject("estado", estado);
		mv.addObject("paises", paises);
		mv.addObject("pais", pais);

		return mv;
	}

	public ModelAndView preparaViewErro(Estado estado, String mensagem, Boolean erro) {
		ModelAndView mv = new ModelAndView(VIEW_ESTADO);
		mv.addObject("estado", estado);
		mv.addObject("filtro", new Filtro());
		mv.addObject("resultado", new ResultadoFormulario(erro, mensagem));

		Filtro filtro = new Filtro();
		filtro.setDescricao("%");
		//List<Pais> paises = paisService.filtrar(filtro);
		List<Pais> paises = paisCRUD.filtrar(filtro, paisService);

		mv.addObject("paises", paises);
		return mv;
	}

	/*
	 * O "redirect:" faz com que o usuário seja redirecionado para uma página. Se
	 * for redirecionado para a mesma página, os campos do formulário estarão em
	 * branco porque o navegador está acessando novamente esta página. Isso evita o
	 * reenvio do formulário.
	 */
	public ModelAndView redirecionar(RedirectAttributes attributes, String mensagem, Boolean erro) {
		ModelAndView mvRedirecionado = new ModelAndView("redirect:/estado");
		attributes.addFlashAttribute("resultado", new ResultadoFormulario(erro, mensagem));

		return mvRedirecionado;
	}

	@RequestMapping(value = "/cadastrar", method = RequestMethod.POST)
	public ModelAndView cadastrar(@Validated Estado estado, Errors errors, Pais pais, RedirectAttributes attributes) {
		String mensagem = "";
		Boolean erro = true;

		if (errors.hasErrors()) {
			mensagem = "Os campos com informações inválidas estão destacadas em vermelho.";
			return preparaViewErro(estado, mensagem, true);
		} else {
			estado.setPais(pais);
			estado.setNomeEstado(Ferramentas.tratarString(estado.getNomeEstado()));
			estado.setSiglaEstado(Ferramentas.tratarString(estado.getSiglaEstado()));
			
			erro = estadoCRUD.crud(estado, TipoCRUD.Salvar, this.estadoService, this.ptm);

			if (erro) {
				mensagem = "Erro ao salvar o estado!";
				return preparaViewErro(estado, mensagem, erro);
			} else {
				mensagem = "Estado salvo com sucesso: " + estado.getNomeEstado();
				return redirecionar(attributes, mensagem, erro);
			}
		}
	}

	@RequestMapping(value = "/pesquisar", method = RequestMethod.POST)
	public ModelAndView pesquisar(@ModelAttribute("filtro") Filtro filtro) {
		ModelAndView mv = new ModelAndView(VIEW_ESTADO);

		mv.addObject("filtro", new Filtro());
		mv.addObject("estado", new Estado());
		//mv.addObject("estados", estadoService.filtrar(filtro));
		mv.addObject("estados", estadoCRUD.filtrar(filtro, estadoService));

		return mv;
	}

	@RequestMapping(value = "{id}", method = RequestMethod.POST, params = "acao=editar")
	public ModelAndView editar(@PathVariable("id") Estado estado) {
		ModelAndView mv = new ModelAndView(VIEW_ESTADO);
		mv.addObject("filtro", new Filtro());
		mv.addObject("estado", new Estado());
		mv.addObject(estado);
		return mv;
	}

	@RequestMapping(value = "{id}", method = RequestMethod.POST, params = "acao=remover")
	public ModelAndView remover(@PathVariable("id") Estado estado, RedirectAttributes attributes) {
		String mensagem = "";
		Boolean erro = true;

		try {
			erro = estadoCRUD.crud(estado, TipoCRUD.Remover, this.estadoService, this.ptm);

			if (erro)
				mensagem = "Não é possível remover este estado, pois está sendo usado um cadastro";
			else
				mensagem = "Estado removido com sucesso: " + estado.getNomeEstado();

		} catch (Exception e) {
			mensagem = "Erro não tratado no método remover de EstadoController!";
			System.out.println(e);
		}
		
		return redirecionar(attributes, mensagem, erro);
	}
	
	public Boolean salvar(Estado estado, Pais pais) {
		Boolean erro = true;
		
		estado.setPais(pais);
		estado.setNomeEstado(Ferramentas.tratarString(estado.getNomeEstado()));
		estado.setSiglaEstado(Ferramentas.tratarString(estado.getSiglaEstado()));
		
		erro = estadoCRUD.crud(estado, TipoCRUD.Salvar, this.estadoService, this.ptm);
		
		return erro;
	}
	
	public Boolean salvar(Estado estado) {
		Boolean erro = true;
		
		estado.setNomeEstado(Ferramentas.tratarString(estado.getNomeEstado()));
		estado.setSiglaEstado(Ferramentas.tratarString(estado.getSiglaEstado()));
		
		//erro = estadoCRUD.crud(estado, TipoCRUD.Salvar, this.estadoService, this.ptm);
		erro = estadoCRUD.salvar(estado, estadoService, ptm);
		
		return erro;
	}

	@Override
	public Boolean remover(Estado estado) {
		Boolean erro = true;
		
		erro = estadoCRUD.remover(estado, estadoService, ptm);
		
		return erro;
	}

	@Override
	public ModelAndView salvar(Estado objeto, RedirectAttributes attributes) {
		// TODO Auto-generated method stub
		return null;
	}
}
