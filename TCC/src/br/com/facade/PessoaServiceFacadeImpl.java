package br.com.facade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.dao.PessoaDao;
import br.com.domain.Pessoa;

@Service
public class PessoaServiceFacadeImpl implements PessoaServiceFacade{


	@Autowired
	private PessoaDao pessoaDao;
	
	
	public void save(Pessoa pessoa) {
		pessoaDao.save(pessoa);
	}


	public Pessoa getById(Integer  id) {
		return pessoaDao.getById(id);
	}


	public List<Pessoa> findAll() {
		return pessoaDao.findAll();
	}
	
	

	public PessoaDao getPessoaDao() {
		return pessoaDao;
	}


	public void setPessoaDao(PessoaDao pessoaDao) {
		this.pessoaDao = pessoaDao;
	}



}
