package br.com.dao;

import javax.persistence.EntityManager;

public class TesteDao<T> {
	
	private EntityManager em;
	private Class<T>classe;
	
	private TesteDao(EntityManager em){
		this.em = em;
	}
	
	public void adiciona(T t){
		this.em.persist(t);
	}
	
	public void remove(T t){
		this.em.remove(t);
	}
	
	public T busca(Integer id){
		return em.getReference(classe,id);
	}

}
