package br.rr.gov.cbm.scam.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.rr.gov.cbm.scam.bean.PostoGraduacao;

public class PostoGraduacaoDao {
	
	private EntityManager em;

	public PostoGraduacaoDao(EntityManager em) {
		this.em = em;
	}
	
	public List<PostoGraduacao> listar(){
		return em.createQuery("SELECT p FROM PostoGraduacao p", PostoGraduacao.class).getResultList();
	}
	
	
}
