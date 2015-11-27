package br.rr.gov.cbm.scam.business;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.rr.gov.cbm.scam.bean.Estado;
import br.rr.gov.cbm.scam.bean.Pais;
import br.rr.gov.cbm.scam.dao.EstadoDao;

@LocalBean
@Stateless
public class EstadoBusiness {
	
	@PersistenceContext
	private EntityManager em;
	
	private EstadoDao dao;
	
	@PostConstruct
	private void init() {
		dao = new EstadoDao(em);

	}

	public List<Estado> listarPorPais(Pais pais) {
		return dao.listarPorPais(pais);
	}
	
	

}
