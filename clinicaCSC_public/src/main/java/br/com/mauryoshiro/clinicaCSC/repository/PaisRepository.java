package br.com.mauryoshiro.clinicaCSC.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mauryoshiro.clinicaCSC.models.Pais;

public interface PaisRepository extends JpaRepository<Pais, Long>{

	public List<Pais> findByNomePaisContaining(String nome);
	
	public List<Pais> findByNomePais(String nome);
}
