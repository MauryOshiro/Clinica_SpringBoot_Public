package br.com.mauryoshiro.clinicaCSC.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.mauryoshiro.clinicaCSC.filter.Filtro;
import br.com.mauryoshiro.clinicaCSC.interfaces.controller.ControllerSistema;
import br.com.mauryoshiro.clinicaCSC.models.Convenio;
import br.com.mauryoshiro.clinicaCSC.models.Paciente;
import br.com.mauryoshiro.clinicaCSC.models.PessoaFisica;
import br.com.mauryoshiro.clinicaCSC.service.CRUDService;
import br.com.mauryoshiro.clinicaCSC.service.ConvenioService;
import br.com.mauryoshiro.clinicaCSC.service.PacienteService;

@Controller
@RequestMapping("/paciente")
public class PacienteController implements ControllerSistema<Paciente> {

	@Autowired
	private PlatformTransactionManager ptm;

	@Autowired
	private PacienteService pacienteService;

	@Autowired
	private ConvenioService convenioService;

	@Autowired
	private CRUDService<Paciente> pacienteCRUD;

	@Autowired
	private CRUDService<Convenio> convenioCRUD;

	@Autowired
	private PaisController paisController;

	private static final String VIEW = "cadastros/paciente/gerenciarPaciente";

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView preparaView() {
		ModelAndView mv = new ModelAndView(VIEW);

		// Paciente paciente = new Paciente();
		PessoaFisica pf = new PessoaFisica();
		Convenio convenio = new Convenio();

		Filtro filtro = new Filtro();
		filtro.setDescricao("%");
		;
		// List<Convenio> convenios = convenioCRUD.filtrar(filtro, convenioService);
		List<Convenio> convenios = new ArrayList<Convenio>();

		mv.addObject("pessoaFisica", pf);
		mv.addObject("convenios", convenios);
		mv.addObject("convenio", convenio);

		return mv;
	}

	@Override
	public Boolean salvar(Paciente objeto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean remover(Paciente objeto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelAndView salvar(Paciente objeto, RedirectAttributes attributes) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelAndView redirecionar(RedirectAttributes attributes, String mensagem, Boolean erro) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelAndView editar(Paciente objeto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelAndView remover(Paciente objeto, RedirectAttributes attributes) {
		// TODO Auto-generated method stub
		return null;
	}

}
