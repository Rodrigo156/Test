package br.com.estado.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.domain.Passagem;
import br.com.estado.domain.Estado;

@Repository
@Transactional
public class EstadoDaoImpl implements EstadoDao{
	
	  @PersistenceContext
	  private EntityManager entityManager;

	@SuppressWarnings("unchecked")
	public List<Estado> listarEstado() {
		return entityManager.createQuery(" from "+Estado.class.getName()).getResultList();
	}	

}
