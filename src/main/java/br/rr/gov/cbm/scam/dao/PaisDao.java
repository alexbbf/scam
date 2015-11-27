package br.rr.gov.cbm.scam.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.rr.gov.cbm.scam.bean.Pais;

public class PaisDao {
	
	EntityManager em;
	public PaisDao(EntityManager em) {
		this.em = em;
	}
	
	public List<Pais> listar(){
		String hql = "select p from Pais p";
		return em.createQuery(hql, Pais.class).getResultList();
	}

}
