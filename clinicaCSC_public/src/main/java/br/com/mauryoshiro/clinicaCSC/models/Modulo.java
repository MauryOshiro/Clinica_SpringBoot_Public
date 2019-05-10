package br.com.mauryoshiro.clinicaCSC.models;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Modulo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idModulo;

	private String nomeModulo;

	public static Collection<Modulo> preparaCollectionModulo(Long idModulo1, String nomeModulo1, Long idModulo2,
			String nomeModulo2, Long idModulo3, String nomeModulo3) {
		Collection<Modulo> modulos = new ArrayList<Modulo>();
		if (idModulo1 != null)
			adicionaModuloNaCollection(modulos, idModulo1, nomeModulo1);

		if (idModulo2 != null)
			adicionaModuloNaCollection(modulos, idModulo2, nomeModulo2);

		if (idModulo3 != null)
			adicionaModuloNaCollection(modulos, idModulo3, nomeModulo3);

		return modulos;
	}

	public static void adicionaModuloNaCollection(Collection<Modulo> modulos, Long id, String nome) {
		Modulo modulo = new Modulo(id, nome);
		modulos.add(modulo);
	}

	public Long getIdModulo() {
		return idModulo;
	}

	public void setIdModulo(Long idModulo) {
		this.idModulo = idModulo;
	}

	public String getNomeModulo() {
		return nomeModulo;
	}

	public void setNomeModulo(String nomeModulo) {
		this.nomeModulo = nomeModulo;
	}

	public Modulo(Long idModulo, String nomeModulo) {
		this.idModulo = idModulo;
		this.nomeModulo = nomeModulo;
	}

	public Modulo() {
	}

}
