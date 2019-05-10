package br.com.mauryoshiro.clinicaCSC.interfaces.service;

import java.util.List;

import br.com.mauryoshiro.clinicaCSC.filter.Filtro;

public interface ServicoRepository<T> {
	public Boolean salvar(T objeto);

	public Boolean remover(T objeto);

	public List<T> filtrar(Filtro filtro);
}
