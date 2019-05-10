package br.com.mauryoshiro.clinicaCSC.models;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import br.com.mauryoshiro.clinicaCSC.enums.TipoUsuario;

@Entity
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idUsuario;

	private String loginUsuario;

	private String senhaUsuario;

	private TipoUsuario tipoUsuario;

	private Boolean ativoUsuario;

	@OneToMany
	private Collection<Modulo> modulos;

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getLoginUsuario() {
		return loginUsuario;
	}

	public void setLoginUsuario(String loginUsuario) {
		this.loginUsuario = loginUsuario;
	}

	public String getSenhaUsuario() {
		return senhaUsuario;
	}

	public void setSenhaUsuario(String senhaUsuario) {
		this.senhaUsuario = senhaUsuario;
	}

	public TipoUsuario getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(TipoUsuario tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	public Boolean getAtivoUsuario() {
		return ativoUsuario;
	}

	public void setAtivoUsuario(Boolean ativoUsuario) {
		this.ativoUsuario = ativoUsuario;
	}

	public Collection<Modulo> getModulos() {
		return modulos;
	}

	public void setModulos(Collection<Modulo> modulos) {
		this.modulos = modulos;
	}

	public Usuario(Long idUsuario, String loginUsuario, String senhaUsuario, TipoUsuario tipoUsuario,
			Boolean ativoUsuario, Collection<Modulo> modulos) {
		this.idUsuario = idUsuario;
		this.loginUsuario = loginUsuario;
		this.senhaUsuario = senhaUsuario;
		this.tipoUsuario = tipoUsuario;
		this.ativoUsuario = ativoUsuario;
		this.modulos = modulos;
	}

	public Usuario() {
	}

}
