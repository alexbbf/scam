package br.rr.gov.cbm.scam.business;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.rr.gov.cbm.scam.bean.PostoGraduacao;
import br.rr.gov.cbm.scam.dao.PostoGraduacaoDao;

@LocalBean
@Stateless
public class PostoGraduacaoBusiness {
	
	
	@PersistenceContext
	private EntityManager em;
	
	private PostoGraduacaoDao dao;
	
	@PostConstruct
	private void init() {
		dao = new PostoGraduacaoDao(em);

	}

	public List<PostoGraduacao> listar() {
		return dao.listar();
	}
	
	

}
