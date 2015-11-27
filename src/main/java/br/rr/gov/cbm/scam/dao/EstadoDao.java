package br.rr.gov.cbm.scam.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.rr.gov.cbm.scam.bean.Estado;
import br.rr.gov.cbm.scam.bean.Pais;

public class EstadoDao {

	private EntityManager em;

	public EstadoDao(EntityManager em) {
		this.em = em;
	}

	public List<Estado> listarPorPais(Pais pais) {

		String hql = "select e from Estado e where e.pais = :pais order by e.descricao ";
		return em.createQuery(hql, Estado.class).setParameter("pais", pais)
				.getResultList();
	}

}
