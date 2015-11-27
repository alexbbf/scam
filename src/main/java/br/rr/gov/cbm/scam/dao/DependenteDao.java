package br.rr.gov.cbm.scam.dao;

import javax.persistence.EntityManager;

import br.rr.gov.cbm.scam.bean.Dependente;

public class DependenteDao {

	private EntityManager em;

	public DependenteDao(EntityManager em) {
		this.em = em;
	}

	public Dependente salvar(Dependente dependente) {

		return em.merge(dependente);

	}

}
