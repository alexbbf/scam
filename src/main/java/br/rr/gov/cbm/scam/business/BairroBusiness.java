package br.rr.gov.cbm.scam.business;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.rr.gov.cbm.scam.bean.Bairro;
import br.rr.gov.cbm.scam.dao.BairroDao;

@LocalBean
@Stateless
public class BairroBusiness {
	
	@PersistenceContext
	private EntityManager em;
	
	private BairroDao dao;
	
	
	@PostConstruct
	private void init() {
		dao = new BairroDao(em);

	}


	public List<Bairro> autoCompleteBairro(String s) {
		return dao.autoCompleteBairro(s);
	}


	public void salvar(Bairro bairroObj) {
		dao.salvar(bairroObj);
		
	}


	
}
