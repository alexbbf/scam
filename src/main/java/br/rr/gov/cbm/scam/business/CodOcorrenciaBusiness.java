package br.rr.gov.cbm.scam.business;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.rr.gov.cbm.scam.bean.CodigoOcorrencia;
import br.rr.gov.cbm.scam.dao.CodOcorrenciaDao;

@LocalBean
@Stateless
public class CodOcorrenciaBusiness {

	@PersistenceContext
	private EntityManager em;
	
	private CodOcorrenciaDao dao;
	
	@PostConstruct
	private void init() {
		dao = new CodOcorrenciaDao(em);

	}

	public List<CodigoOcorrencia> autoCompleteCodOcorrencia(String s) {
		
		return dao.autoCompleteCodOcorrencia(s);
	}


}
