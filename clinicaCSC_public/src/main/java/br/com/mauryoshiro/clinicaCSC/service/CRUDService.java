package br.com.mauryoshiro.clinicaCSC.service;

import java.util.List;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import br.com.mauryoshiro.clinicaCSC.enums.TipoCRUD;
import br.com.mauryoshiro.clinicaCSC.filter.Filtro;
import br.com.mauryoshiro.clinicaCSC.interfaces.service.ServicoRepository;
import br.com.mauryoshiro.clinicaCSC.interfaces.service.ServicoUtilizaRepository;

@Service
public class CRUDService<T> implements ServicoUtilizaRepository<T> {

	public Boolean crud(T objeto, TipoCRUD tipoCRUD, ServicoRepository<T> service, PlatformTransactionManager ptm) {
		Boolean erro = true;

		DefaultTransactionDefinition def = new DefaultTransactionDefinition();
		def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
		TransactionStatus transactionStatus = null;

		try {
			transactionStatus = ptm.getTransaction(def);

			switch (tipoCRUD) {
			case Salvar:
				erro = service.salvar(objeto);
				break;
			case Remover:
				erro = service.remover(objeto);
			default:
				break;
			}
			
			if (erro)
				throw new Exception("Erro na operação de CRUD!");

			ptm.commit(transactionStatus);
		} catch (Exception e) {
			System.out.println("Rollback no método crud() com o objeto da classe " + objeto.getClass());
			System.out.println(e);

			ptm.rollback(transactionStatus);
		}

		return erro;
	}

	public List<T> filtrar(Filtro filtro, ServicoRepository<T> service) {
		List<T> lista = service.filtrar(filtro);
		
		return lista;
	}

	@Override
	public Boolean salvar(T objeto, ServicoRepository<T> service, PlatformTransactionManager ptm) {
		Boolean erro = true;
		DefaultTransactionDefinition def = new DefaultTransactionDefinition();
		def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
		TransactionStatus transactionStatus = null;
		
		try {
			transactionStatus = ptm.getTransaction(def);
			erro = service.salvar(objeto);
			
			if(erro)
				throw new RuntimeException("Erro no método salvar do CRUDService!");
			
			ptm.commit(transactionStatus);
		} catch (RuntimeException e) {
			System.out.println("Rollback no método salvar() com o objeto da classe " + objeto.getClass());
			System.out.println(e);
			
			ptm.rollback(transactionStatus);
		}
		
		return erro;
	}

	@Override
	public Boolean remover(T objeto, ServicoRepository<T> service, PlatformTransactionManager ptm) {
		Boolean erro = true;
		DefaultTransactionDefinition def = new DefaultTransactionDefinition();
		def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
		TransactionStatus transactionStatus = null;
		
		try {
			transactionStatus = ptm.getTransaction(def);
			erro = service.remover(objeto);
			
			if(erro)
				throw new RuntimeException("Erro no método remover do CRUDService!");
			
			ptm.commit(transactionStatus);
		} catch (DataIntegrityViolationException e){
			System.out.println(e);
			erro = true;
		} catch (RuntimeException e) {
			System.out.println("Rollback no método remover() com o objeto da classe " + objeto.getClass());
			System.out.println(e);
			
			ptm.rollback(transactionStatus);
			
			erro = true;
		}
		
		return erro;
	}

}
