package br.com.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="pessoas")
public class Pessoa {
	
	@Id
	@GeneratedValue
	private Integer  id;
	@Column
	private String nome;
	@Column
	private Integer idade;
	@Column
	private String email;
	@Column
	private String informacoes;
	
	
	public Pessoa(){
	}

	public Pessoa(Integer id,String nome,Integer idade ,String email,String informacoes){
		this.id = id;
		this.nome= nome;
		this.idade = idade;
		this.email = email;
		this.informacoes = informacoes ;
	}
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getInformacoes() {
		return informacoes;
	}
	public void setInformacoes(String informacoes) {
		this.informacoes = informacoes;
	}
	

	
	

}
