package br.rr.gov.cbm.scam.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.rr.gov.cbm.scam.bean.Quadro;

public class QuadroDao {

	private EntityManager em;

	public QuadroDao(EntityManager em) {
		this.em = em;
	}

	public List<Quadro> listar() {
		return em.createQuery("SELECT q FROM Quadro q", Quadro.class)
				.getResultList();
	}

}
