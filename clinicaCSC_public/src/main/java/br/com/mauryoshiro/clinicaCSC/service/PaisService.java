package br.com.mauryoshiro.clinicaCSC.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.mauryoshiro.clinicaCSC.filter.Filtro;
import br.com.mauryoshiro.clinicaCSC.interfaces.service.ServicoRepository;
import br.com.mauryoshiro.clinicaCSC.models.Pais;
import br.com.mauryoshiro.clinicaCSC.repository.PaisRepository;

@Service
public class PaisService implements ServicoRepository<Pais> {

	@Autowired
	private PaisRepository paisRepository;
	
	public Boolean salvar(Pais pais) {
		try {
			
			paisRepository.save(pais);
			//throw new RuntimeException("Erro");
			
			// false indica que não houve erro para salvar.
			return false;

		} catch (RuntimeException e) {
			System.out.println("Erro no método salvar de PaisService!");
			System.out.println(e);
			
			// true indica que houve erro ao salvar
			return true;
		}
	}

	public Boolean remover(Pais pais) {
		try {
			paisRepository.delete(pais);

			// false indica que não houve erro para remover.
			return false;
		} catch (Exception e) {
			System.out.println("Erro no método remover de PaisService!");
			System.out.println(e);
			
			// true indica que houve erro para remover.
			return true;
		}
	}

	public List<Pais> filtrar(Filtro filtro) {
		List<Pais> listaPaises = new ArrayList<Pais>();
		listaPaises = paisRepository.findByNomePaisContaining(filtro.getDescricao());

		return listaPaises;
	}

	public Boolean verificaSeExistePeloNome(String nome) {
		try {
			List<Pais> p = new ArrayList<Pais>();
			p = paisRepository.findByNomePais(nome);

			if (p.isEmpty())
				return false;
			else
				return true;
		} catch (Exception e) {
			System.out.println("Erro no método verificaSeExiste(Pais pais)!");
		}
		return true;
	}
}
