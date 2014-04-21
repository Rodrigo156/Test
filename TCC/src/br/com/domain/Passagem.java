package br.com.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Passagem {
	
	@Id
	@GeneratedValue
	private Integer idPassagem;
	@Column
	private String origemPassagem;
	@Column
	private String destinoPassagem;
	@Column
	private String horarioSaida;
	@Column
	private String horarioChegada;
	@Column
	private String precoPassagem;
	@Column
	private String empresa;
	
	
	public Integer getIdPassagem() {
		return idPassagem;
	}
	public void setIdPassagem(Integer idPassagem) {
		this.idPassagem = idPassagem;
	}

	public String getHorarioSaida() {
		return horarioSaida;
	}
	public void setHorarioSaida(String horarioSaida) {
		this.horarioSaida = horarioSaida;
	}
	public String getHorarioChegada() {
		return horarioChegada;
	}
	public void setHorarioChegada(String horarioChegada) {
		this.horarioChegada = horarioChegada;
	}
	
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public String getOrigemPassagem() {
		return origemPassagem;
	}
	public void setOrigemPassagem(String origemPassagem) {
		this.origemPassagem = origemPassagem;
	}
	public String getDestinoPassagem() {
		return destinoPassagem;
	}
	public void setDestinoPassagem(String destinoPassagem) {
		this.destinoPassagem = destinoPassagem;
	}
	public String getPrecoPassagem() {
		return precoPassagem;
	}
	public void setPrecoPassagem(String precoPassagem) {
		this.precoPassagem = precoPassagem;
	}

	
	

}
