package br.rr.gov.cbm.scam.business;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.rr.gov.cbm.scam.dao.CursoDao;

@LocalBean
@Stateless
public class CursoBusiness {

	@PersistenceContext
	private EntityManager em;

	private CursoDao dao;

	@PostConstruct
	private void init() {
		dao = new CursoDao(em);

	}

	public List<String> autoCompleteNomeCurso(String s) {
		return dao.autoCompleteNomeCurso(s);
	}

	public List<String> autoCompleteInstituicao(String s) {
		return dao.autoCompleteInstituicao(s);
	}
	
	
	
}
