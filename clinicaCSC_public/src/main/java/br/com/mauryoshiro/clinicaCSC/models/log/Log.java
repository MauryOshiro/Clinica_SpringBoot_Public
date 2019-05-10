package br.com.mauryoshiro.clinicaCSC.models.log;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import br.com.mauryoshiro.clinicaCSC.enums.TipoAcao;
import br.com.mauryoshiro.clinicaCSC.models.Usuario;

@Entity
public class Log {

	@Id
	@GeneratedValue(generator = "increment")
	private Long id;

	private LocalDate data;

	private LocalTime hora;

	@OneToOne
	private Usuario usuario;

	private String valoresAnteriores;

	private TipoAcao tipoAcao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public LocalTime getHora() {
		return hora;
	}

	public void setHora(LocalTime hora) {
		this.hora = hora;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getValoresAnteriores() {
		return valoresAnteriores;
	}

	public void setValoresAnteriores(String valoresAnteriores) {
		this.valoresAnteriores = valoresAnteriores;
	}

	public TipoAcao getTipoAcao() {
		return tipoAcao;
	}

	public void setTipoAcao(TipoAcao tipoAcao) {
		this.tipoAcao = tipoAcao;
	}

	public Log(Long id, LocalDate data, LocalTime hora, Usuario usuario, String valoresAnteriores, TipoAcao tipoAcao) {
		this.id = id;
		this.data = data;
		this.hora = hora;
		this.usuario = usuario;
		this.valoresAnteriores = valoresAnteriores;
		this.tipoAcao = tipoAcao;
	}

	public Log() {

	}
}
