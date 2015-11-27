package br.rr.gov.cbm.scam.business;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.rr.gov.cbm.scam.bean.Pais;
import br.rr.gov.cbm.scam.dao.PaisDao;

@LocalBean
@Stateless
public class PaisBusiness {

	@PersistenceContext
	private EntityManager em;
	
	private PaisDao dao;
	
	@PostConstruct
	private void init() {
		dao = new PaisDao(em);

	}
	
	public List<Pais> listar(){
		return dao.listar();
	}
	
}
