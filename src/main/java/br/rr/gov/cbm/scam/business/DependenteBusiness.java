package br.rr.gov.cbm.scam.business;

import javax.annotation.PostConstruct;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.rr.gov.cbm.scam.bean.Dependente;
import br.rr.gov.cbm.scam.dao.DependenteDao;

@LocalBean
@Stateless
public class DependenteBusiness {
	
	@PersistenceContext
	private EntityManager em;
	
	private DependenteDao dao;
	
	@PostConstruct
	private void init() {
		dao = new DependenteDao(em);

	}

	public Dependente salvar(Dependente dependente) {
		return dao.salvar(dependente);
	}
	
	
	
	
	

}
