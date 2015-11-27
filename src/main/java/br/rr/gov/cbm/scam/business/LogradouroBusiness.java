package br.rr.gov.cbm.scam.business;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.rr.gov.cbm.scam.bean.Logradouro;
import br.rr.gov.cbm.scam.bean.TipoLogradouro;
import br.rr.gov.cbm.scam.dao.LogradouroDao;

@LocalBean
@Stateless
public class LogradouroBusiness {

	@PersistenceContext
	private EntityManager em;

	private LogradouroDao dao;

	@PostConstruct
	private void init() {
		dao = new LogradouroDao(em);

	}

	public List<Logradouro> autoCompleteLogra(String s,TipoLogradouro tipoLogradouro) {
		return dao.autoCompleteLogra(s, tipoLogradouro);
	}

	public void salvar(Logradouro logradouroParaSalvar) {
		dao.salvar(logradouroParaSalvar);
		
	}

}
