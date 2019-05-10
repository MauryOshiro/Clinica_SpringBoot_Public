package br.com.mauryoshiro.clinicaCSC.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.mauryoshiro.clinicaCSC.filter.Filtro;
import br.com.mauryoshiro.clinicaCSC.interfaces.service.ServicoRepository;
import br.com.mauryoshiro.clinicaCSC.models.Convenio;
import br.com.mauryoshiro.clinicaCSC.repository.ConvenioRepository;

@Service
public class ConvenioService implements ServicoRepository<Convenio>{

	@Autowired
	private ConvenioRepository convenioRepository;

	public Boolean salvar(Convenio convenio) {
		try {
			convenioRepository.save(convenio);

			// false indica que não houve erro para salvar.
			return false;
		} catch (Exception e) {
			System.out.println("Erro no método salvar de ConvenioService!");
			System.out.println(e);
			
			// true indica que houve erro para salvar.			
			return true;
		}
	}

	public Boolean remover(Convenio paciente) {
		try {
			convenioRepository.delete(paciente);

			// false indica que não houve erro para salvar.
			return false;
		} catch (Exception e) {
			System.out.println("Erro no método remover de ConvenioService!");
			System.out.println(e);
			
			// true indica que houve erro para salvar.
			return true;
		}
	}

	public List<Convenio> filtrar(Filtro filtro) {
		// TODO Auto-generated method stub
		return null;
	}
}
