package br.com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.domain.Passagem;

@Repository
@Transactional
public class PassagemDaoImpl implements PassagemDao{

	@PersistenceContext
	  private EntityManager entityManager;
	
	@SuppressWarnings("unchecked")
	public List<Passagem> findAllPassagem() {
		return entityManager.createQuery(" from "+Passagem.class.getName()).getResultList();
	}

}
