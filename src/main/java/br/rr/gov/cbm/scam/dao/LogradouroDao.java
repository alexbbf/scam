package br.rr.gov.cbm.scam.dao;

import java.text.Normalizer;
import java.util.List;

import javax.persistence.EntityManager;

import br.rr.gov.cbm.scam.bean.Logradouro;
import br.rr.gov.cbm.scam.bean.TipoLogradouro;

public class LogradouroDao {
	private EntityManager em;

	public LogradouroDao(EntityManager em) {
		this.em = em;
	}

	public List<Logradouro> autoCompleteLogra(String s,
			TipoLogradouro tipoLogradouro) {
		s = Normalizer.normalize(s, Normalizer.Form.NFD)
				.replaceAll("[^\\p{ASCII}]", "").toUpperCase();
		return em
				.createQuery(
						"SELECT l FROM Logradouro l WHERE (UPPER(TRANSLATE(l.descricao,'ÁÃÂÀáãâàÉÈÊéêèÍìÓóÔôÕõÚúÇç','AAAAaaaaEEEeeeIiOoOoOoUuCc')) LIKE '"
								+ s
								+ "%' ) and (l.tipoLogradouro like '"
								+ tipoLogradouro
								+ "') ORDER BY l.descricao ASC",
						Logradouro.class).getResultList();
	}

	public void salvar(Logradouro logradouroParaSalvar) {
		logradouroParaSalvar.setDescricao(logradouroParaSalvar.getDescricao().trim().toUpperCase());
		em.merge(logradouroParaSalvar);
		
	}
}
