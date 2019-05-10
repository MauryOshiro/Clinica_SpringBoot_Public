package br.com.mauryoshiro.clinicaCSC.models;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class UnidadeDaEmpresa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idUnidadeDaEmpresa;

	private String descricaoUnidadeDaEmpresa;

	private Boolean ativoUnidadeDaEmpresa;

	@OneToOne
	private PessoaJuridica pessoaJuridica;

	@ManyToMany
	private Collection<Portador> portadores;

	@OneToMany
	private Collection<ContatoNaPessoaJuridica> contatos;

	public UnidadeDaEmpresa() {
	}

	public UnidadeDaEmpresa(Long idUnidadeDaEmpresa, String descricaoUnidadeDaEmpresa, Boolean ativoUnidadeDaEmpresa,
			PessoaJuridica pessoaJuridica, Collection<Portador> portadores,
			Collection<ContatoNaPessoaJuridica> contatos) {
		this.idUnidadeDaEmpresa = idUnidadeDaEmpresa;
		this.descricaoUnidadeDaEmpresa = descricaoUnidadeDaEmpresa;
		this.ativoUnidadeDaEmpresa = ativoUnidadeDaEmpresa;
		this.pessoaJuridica = pessoaJuridica;
		this.portadores = portadores;
		this.contatos = contatos;
	}

	public UnidadeDaEmpresa(Long id, String descricao) {
		this.idUnidadeDaEmpresa = id;
		this.descricaoUnidadeDaEmpresa = descricao;
	}

	public Long getIdUnidadeDaEmpresa() {
		return idUnidadeDaEmpresa;
	}

	public void setIdUnidadeDaEmpresa(Long idUnidadeDaEmpresa) {
		this.idUnidadeDaEmpresa = idUnidadeDaEmpresa;
	}

	public String getDescricaoUnidadeDaEmpresa() {
		return descricaoUnidadeDaEmpresa;
	}

	public void setDescricaoUnidadeDaEmpresa(String descricaoUnidadeDaEmpresa) {
		this.descricaoUnidadeDaEmpresa = descricaoUnidadeDaEmpresa;
	}

	public Boolean getAtivoUnidadeDaEmpresa() {
		return ativoUnidadeDaEmpresa;
	}

	public void setAtivoUnidadeDaEmpresa(Boolean ativoUnidadeDaEmpresa) {
		this.ativoUnidadeDaEmpresa = ativoUnidadeDaEmpresa;
	}

	public PessoaJuridica getPessoaJuridica() {
		return pessoaJuridica;
	}

	public void setPessoaJuridica(PessoaJuridica pessoaJuridica) {
		this.pessoaJuridica = pessoaJuridica;
	}

	public Collection<Portador> getPortadores() {
		return portadores;
	}

	public void setPortadores(Collection<Portador> portadores) {
		this.portadores = portadores;
	}

	public Collection<ContatoNaPessoaJuridica> getContatos() {
		return contatos;
	}

	public void setContatos(Collection<ContatoNaPessoaJuridica> contatos) {
		this.contatos = contatos;
	}

	public static Collection<UnidadeDaEmpresa> preparaCollectionUnidadeDaEmpresa(Long idUnidade1,
			String descricaoUnidade1, Long idUnidade2, String descricaoUnidade2, Long idUnidade3,
			String descricaoUnidade3, Long idUnidade4, String descricaoUnidade4, Long idUnidade5,
			String descricaoUnidade5) {
		Collection<UnidadeDaEmpresa> unidades = new ArrayList<UnidadeDaEmpresa>();
		if (idUnidade1 != null)
			adicionaUnidadeDaEmpresaNaCollection(unidades, idUnidade1, descricaoUnidade1);

		if (idUnidade2 != null)
			adicionaUnidadeDaEmpresaNaCollection(unidades, idUnidade2, descricaoUnidade2);

		if (idUnidade3 != null)
			adicionaUnidadeDaEmpresaNaCollection(unidades, idUnidade3, descricaoUnidade3);

		if (idUnidade4 != null)
			adicionaUnidadeDaEmpresaNaCollection(unidades, idUnidade4, descricaoUnidade4);

		if (idUnidade5 != null)
			adicionaUnidadeDaEmpresaNaCollection(unidades, idUnidade5, descricaoUnidade5);

		return unidades;
	}

	private static void adicionaUnidadeDaEmpresaNaCollection(Collection<UnidadeDaEmpresa> unidades, Long id,
			String descricao) {
		UnidadeDaEmpresa unidade = new UnidadeDaEmpresa(id, descricao);
		unidades.add(unidade);
	}

	public static UnidadeDaEmpresa retornaPrimeiraUnidade(Collection<UnidadeDaEmpresa> unidades) {
		// Cria um vetor do tipo UnidadeDaEmpresa.
		// O m�todo toArray() deve ter par�metro para alocar um espa�o de mem�ria do
		// tamanho da collection.
		UnidadeDaEmpresa[] u = unidades.toArray(new UnidadeDaEmpresa[unidades.size()]);
		UnidadeDaEmpresa unidade = u[0];
		return unidade;
	}

}
