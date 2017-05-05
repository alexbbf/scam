package br.rr.gov.cbm.scam.dao;

import java.text.Normalizer;
import java.util.List;

import javax.persistence.EntityManager;

import br.rr.gov.cbm.scam.bean.FormaAcionamento;

public class FormaAcionamentoDao {

	private EntityManager em;

	public FormaAcionamentoDao(EntityManager em) {
		this.em = em;
	}

	public List<FormaAcionamento> autoCompleteFormaAc(String s) {
		s = Normalizer.normalize(s, Normalizer.Form.NFD)
				.replaceAll("[^\\p{ASCII}]", "").toUpperCase();
		return em
				.createQuery(
						"SELECT l FROM FormaAcionamento l WHERE (UPPER(TRANSLATE(l.descricao,'ÁÃÂÀáãâàÉÈÊéêèÍìÓóÔôÕõÚúÇç','AAAAaaaaEEEeeeIiOoOoOoUuCc')) LIKE '"
								+ s + "%' ) ORDER BY l.descricao ASC",
						FormaAcionamento.class).getResultList();

	}

}
