package br.rr.gov.cbm.scam.dao;

import java.text.Normalizer;
import java.util.List;

import javax.persistence.EntityManager;

import br.rr.gov.cbm.scam.bean.Estado;
import br.rr.gov.cbm.scam.bean.Municipio;

public class MunicipioDao {

	private EntityManager em;

	public MunicipioDao(EntityManager em) {
		this.em = em;
	}

	public List<Municipio> listarPorEstado(Estado estado) {
		String hql = "select m from Municipio m where m.estado = :estado order by m.descricao";
		return em.createQuery(hql, Municipio.class)
				.setParameter("estado", estado).getResultList();
	}

	public List<Municipio> autoCompleteMunicipio(String s) {
		s = Normalizer.normalize(s, Normalizer.Form.NFD)
				.replaceAll("[^\\p{ASCII}]", "").toUpperCase();
		System.out.println(s);
		return em
				.createQuery(
						"SELECT m FROM Municipio m WHERE UPPER(TRANSLATE(m.descricao,'ÁÃÂÀáãâàÉÈÊéêèÍìÓóÔôÕõÚúÇç','AAAAaaaaEEEeeeIiOoOoOoUuCc')) LIKE '"
								+ s + "%' ORDER BY m.descricao ASC",
						Municipio.class).getResultList();

	}

	public List<Municipio> listaMunicipioRR() {
		String hql = "select m from Municipio m where m.estado.sigla = 'RR' order by m.descricao";
		return em.createQuery(hql, Municipio.class).getResultList();
	}

	public List<Municipio> autoCompleteMunicipioRR(String s) {
		s = Normalizer.normalize(s, Normalizer.Form.NFD)
				.replaceAll("[^\\p{ASCII}]", "").toUpperCase();
		System.out.println(s);
		return em
				.createQuery(
						"SELECT m FROM Municipio m WHERE UPPER(TRANSLATE(m.descricao,'ÁÃÂÀáãâàÉÈÊéêèÍìÓóÔôÕõÚúÇç','AAAAaaaaEEEeeeIiOoOoOoUuCc')) LIKE '"
								+ s
								+ "%' AND m.estado.sigla = 'RR' ORDER BY m.descricao ASC",
						Municipio.class).getResultList();
	}

}
