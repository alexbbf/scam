package br.rr.gov.cbm.scam.business;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.rr.gov.cbm.scam.bean.Estado;
import br.rr.gov.cbm.scam.bean.Municipio;
import br.rr.gov.cbm.scam.dao.MunicipioDao;

@LocalBean
@Stateless
public class MunicipioBusiness {
	
	@PersistenceContext
	private EntityManager em;
	
	private MunicipioDao dao;
	
	@PostConstruct
	private void init() {
		dao = new MunicipioDao(em);
	}

	public List<Municipio> listarPorEstado(Estado estado) {
		return dao.listarPorEstado(estado);
	}

	public List<Municipio> autoCompleteMunicipio(String s) {
		return dao.autoCompleteMunicipio(s);
	}

}
