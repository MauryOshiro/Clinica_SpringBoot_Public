package br.com.mauryoshiro.clinicaCSC.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mauryoshiro.clinicaCSC.models.Estado;

public interface EstadoRepository extends JpaRepository<Estado, Long>{

	List<Estado> findByNomeEstado(String nome);
	
	List<Estado> findByNomeEstadoContaining(String nome);
}
