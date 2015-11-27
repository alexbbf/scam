package br.rr.gov.cbm.scam.dao;

import java.text.Normalizer;
import java.util.List;

import javax.persistence.EntityManager;

public class CursoDao {

	private EntityManager em;

	public CursoDao(EntityManager em) {
		this.em = em;
	}

	public List<String> autoCompleteNomeCurso(String s) {
		s = Normalizer.normalize(s, Normalizer.Form.NFD)
				.replaceAll("[^\\p{ASCII}]", "").toUpperCase();

		return em
				.createQuery(
						"SELECT c.nomeCurso FROM Curso c WHERE UPPER(TRANSLATE(c.nomeCurso,'ÁÃÂÀáãâàÉÈÊéêèÍìÓóÔôÕõÚúÇç','AAAAaaaaEEEeeeIiOoOoOoUuCc')) LIKE '"
								+s+"%'", String.class).getResultList();
	}

	public List<String> autoCompleteInstituicao(String s) {
		s = Normalizer.normalize(s, Normalizer.Form.NFD)
				.replaceAll("[^\\p{ASCII}]", "").toUpperCase();
		String hql = "select c.instituicao from Curso c where UPPER(TRANSLATE(c.instituicao,'ÁÃÂÀáãâàÉÈÊéêèÍìÓóÔôÕõÚúÇç','AAAAaaaaEEEeeeIiOoOoOoUuCc')) like '"
				+ s + "%'";
		return em.createQuery(hql, String.class).getResultList();
	}

}
