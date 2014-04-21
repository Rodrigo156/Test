package br.com.facade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.dao.PassagemDao;
import br.com.domain.Passagem;

@Service
public class PassagemServiceFacadeImpl implements PassagemServiceFacade{

	@Autowired
	private PassagemDao passagemDao;
	
	
	@Override
	public List<Passagem> findAllPassagem() {
		return passagemDao.findAllPassagem();
	}

}
