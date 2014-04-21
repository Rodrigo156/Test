package br.com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.domain.Pessoa;

@Repository
@Transactional
public class PessoaDaoImpl implements PessoaDao{

	
	  @PersistenceContext
	  private EntityManager entityManager;
	
	

	public Pessoa getById(Integer id) {
		return entityManager.find(Pessoa.class,id);
	}

	@SuppressWarnings("unchecked")
	public List<Pessoa> findAll() {
		return entityManager.createQuery(" from "+Pessoa.class.getName()).getResultList();
	}

	public void save(Pessoa pessoa) {
		entityManager.persist(pessoa);
		
	}

	public void update(Pessoa pessoa) {
		entityManager.merge(pessoa);
		
	}

}
