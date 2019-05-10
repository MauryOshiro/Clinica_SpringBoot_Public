package br.com.mauryoshiro.clinicaCSC.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.mauryoshiro.clinicaCSC.filter.Filtro;
import br.com.mauryoshiro.clinicaCSC.interfaces.service.ServicoRepository;
import br.com.mauryoshiro.clinicaCSC.models.Paciente;
import br.com.mauryoshiro.clinicaCSC.repository.PacienteRepository;

@Service
public class PacienteService implements ServicoRepository<Paciente> {

	@Autowired
	private PacienteRepository pacienteRepository;

	public Boolean salvar(Paciente paciente) {
		try {
			pacienteRepository.save(paciente);

			// false indica que não houve erro para salvar.
			return false;
		} catch (Exception e) {
			System.out.println("Erro no método salvar de PacienteService!");
			System.out.println(e);
			
			// true indica que houve erro para salvar.			
			return true;
		}
	}

	public Boolean remover(Paciente paciente) {
		try {
			pacienteRepository.delete(paciente);

			// false indica que não houve erro para salvar.
			return false;
		} catch (Exception e) {
			System.out.println("Erro no método remover de PacienteService!");
			System.out.println(e);
			
			// true indica que houve erro para salvar.
			return true;
		}
	}

	public List<Paciente> filtrar(Filtro filtro) {
		// TODO Auto-generated method stub
		return null;
	}

}
