package br.com.mauryoshiro.clinicaCSC.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.mauryoshiro.clinicaCSC.filter.Filtro;
import br.com.mauryoshiro.clinicaCSC.interfaces.service.ServicoRepository;
import br.com.mauryoshiro.clinicaCSC.models.Estado;
import br.com.mauryoshiro.clinicaCSC.repository.EstadoRepository;

@Service
public class EstadoService implements ServicoRepository<Estado> {

	@Autowired
	private EstadoRepository estadoRepository;

	public Boolean salvar(Estado estado) {
		try {
			estadoRepository.save(estado);

			// false indica que não houve erro para salvar.
			return false;
		} catch (Exception e) {
			System.out.println("Erro no método salvar de EstadoService!");
			System.out.println(e);
			
			// true indica que houve erro para salvar.			
			return true;
		}
	}

	public Boolean remover(Estado estado) {
		try {
			estadoRepository.delete(estado);

			// false indica que não houve erro para salvar.
			return false;
		} catch (Exception e) {
			System.out.println("Erro no método remover de EstadoService!");
			System.out.println(e);
			
			// true indica que houve erro para salvar.
			return true;
		}
	}

	public List<Estado> filtrar(Filtro filtro) {
		// TODO Auto-generated method stub
		return null;
	}

}
