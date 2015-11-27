package br.rr.gov.cbm.scam.dao;

import java.text.Normalizer;
import java.util.List;

import javax.persistence.EntityManager;

import br.rr.gov.cbm.scam.bean.Bairro;

public class BairroDao {

	private EntityManager em;

	public BairroDao(EntityManager em) {
		this.em = em;
	}

	public List<Bairro> autoCompleteBairro(String s) {
		s = Normalizer.normalize(s, Normalizer.Form.NFD)
				.replaceAll("[^\\p{ASCII}]", "").toUpperCase();
		System.out.println(s);
		return em
				.createQuery(
						"SELECT b FROM Bairro b WHERE UPPER(TRANSLATE(b.descricao,'ÁÃÂÀáãâàÉÈÊéêèÍìÓóÔôÕõÚúÇç','AAAAaaaaEEEeeeIiOoOoOoUuCc')) LIKE '"
								+ s + "%' ORDER BY b.descricao ASC",
						Bairro.class).getResultList();

	}

	public void salvar(Bairro bairroObj) {
		bairroObj.setDescricao(bairroObj.getDescricao().trim().toUpperCase());
		em.merge(bairroObj);
		
	}
}
