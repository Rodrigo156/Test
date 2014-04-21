package br.com.facade;

import java.util.List;

import br.com.domain.Pessoa;

public interface PessoaServiceFacade {
	
	public void save(Pessoa pessoa);
	
	public Pessoa getById(Integer id);
	
	public List<Pessoa>findAll();

}
