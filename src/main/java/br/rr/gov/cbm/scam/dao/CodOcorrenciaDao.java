package br.rr.gov.cbm.scam.dao;

import java.text.Normalizer;
import java.util.List;

import javax.persistence.EntityManager;

import br.rr.gov.cbm.scam.bean.CodigoOcorrencia;

public class CodOcorrenciaDao {

	private EntityManager em;

	public CodOcorrenciaDao(EntityManager em) {
		this.em = em;
	}

	public List<CodigoOcorrencia> autoCompleteCodOcorrencia(String s) {
		s = Normalizer.normalize(s, Normalizer.Form.NFD)
				.replaceAll("[^\\p{ASCII}]", "").toUpperCase();

		return em
				.createQuery(
						"SELECT c FROM CodigoOcorrencia c WHERE (UPPER(TRANSLATE(c.descricao,'ÁÃÂÀáãâàÉÈÊéêèÍìÓóÔôÕõÚúÇç','AAAAaaaaEEEeeeIiOoOoOoUuCc')) LIKE '"
								+ s + "%') OR (c.codigo LIKE '"+s+"')", CodigoOcorrencia.class).getResultList();
	}

}
