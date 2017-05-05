package br.rr.gov.cbm.scam.business;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.rr.gov.cbm.scam.bean.FormaAcionamento;
import br.rr.gov.cbm.scam.dao.FormaAcionamentoDao;

@LocalBean
@Stateless
public class FormaAcionamentoBusiness {
	
	@PersistenceContext
	private EntityManager em;
	
	private FormaAcionamentoDao dao;
	
	@PostConstruct
	private void init() {
		dao = new FormaAcionamentoDao(em);
	}

	public List<FormaAcionamento> autoCompleteFormaAc(String s) {
		return dao.autoCompleteFormaAc(s);
	}

}
