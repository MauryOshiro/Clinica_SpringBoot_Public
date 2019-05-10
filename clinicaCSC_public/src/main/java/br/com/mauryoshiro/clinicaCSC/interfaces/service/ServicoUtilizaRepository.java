package br.com.mauryoshiro.clinicaCSC.interfaces.service;

import java.util.List;

import org.springframework.transaction.PlatformTransactionManager;

import br.com.mauryoshiro.clinicaCSC.filter.Filtro;

public interface ServicoUtilizaRepository <T>{
	//public Boolean crud(T objeto, TipoCRUD tipoCRUD, ServicoRepository<T> service, PlatformTransactionManager ptm);
	
	public Boolean salvar(T objeto, ServicoRepository<T> service, PlatformTransactionManager ptm);
	
	public Boolean remover(T objeto, ServicoRepository<T> service, PlatformTransactionManager ptm);
	
	public List<T> filtrar(Filtro filtro, ServicoRepository<T> service);
}
