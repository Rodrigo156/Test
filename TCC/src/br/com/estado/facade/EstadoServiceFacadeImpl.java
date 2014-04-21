package br.com.estado.facade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.estado.dao.EstadoDao;
import br.com.estado.domain.Estado;

@Service
public class EstadoServiceFacadeImpl implements EstadoServiceFacade{
	
	@Autowired
	private EstadoDao estadoDao;

	@Override
	public List<Estado> listarEstado() {
		return estadoDao.listarEstado();
	}

}
