package br.rr.gov.cbm.scam.business;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.rr.gov.cbm.scam.bean.Quadro;
import br.rr.gov.cbm.scam.dao.QuadroDao;

@LocalBean
@Stateless
public class QuadroBusiness {
	
	@PersistenceContext
	private EntityManager em;
	
	private QuadroDao dao;
	
	@PostConstruct
	private void init() {
		dao = new QuadroDao(em);

	}

	public List<Quadro> listar() {
		return dao.listar();
	}
	
	

}
