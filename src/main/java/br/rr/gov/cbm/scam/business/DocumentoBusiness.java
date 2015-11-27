package br.rr.gov.cbm.scam.business;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.rr.gov.cbm.scam.bean.Documento;
import br.rr.gov.cbm.scam.dao.DocumentoDao;


@LocalBean
@Stateless
public class DocumentoBusiness {
	
	@PersistenceContext
	private EntityManager em;
	
	private DocumentoDao dao;
	
	@PostConstruct
	private void init() {
		dao = new DocumentoDao(em);
	}

	public Documento salvar(Documento d) {
		return dao.salvar(d);
	}

	public List<Documento> pesquisarPorAsssunto(String s) {
		return dao.pesquisarPorAsssunto(s);
	}

	public List<Documento> pesquisarPorIdentificacao(String s) {
		return dao.pesquisarPorIdentificacao(s);
	}

	public List<Documento> pesquisarPorOrigem(String s) {
		return dao.pesquisarPorOrigem(s);
	}

	public List<Documento> pesquisarPorAssinadoPor(String s) {
		return dao.pesquisarPorAssinadoPor(s);
	}
	
	

}
