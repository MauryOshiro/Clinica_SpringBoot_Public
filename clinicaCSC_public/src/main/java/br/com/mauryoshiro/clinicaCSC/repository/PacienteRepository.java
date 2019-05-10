package br.com.mauryoshiro.clinicaCSC.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mauryoshiro.clinicaCSC.models.Paciente;

public interface PacienteRepository extends JpaRepository<Paciente, Long>{

}
