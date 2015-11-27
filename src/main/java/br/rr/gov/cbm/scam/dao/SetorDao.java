package br.rr.gov.cbm.scam.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.rr.gov.cbm.scam.bean.Setor;

public class SetorDao {
	
	private EntityManager em;

	public SetorDao(EntityManager em) {
		this.em = em;
	}
	
	public List<Setor> listar(){
		return em.createQuery("SELECT s FROM Setor s order by s.sigla", Setor.class).getResultList();
	}
	
	

}
