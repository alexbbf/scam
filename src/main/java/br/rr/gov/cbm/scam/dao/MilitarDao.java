package br.rr.gov.cbm.scam.dao;

import java.text.Normalizer;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;

import br.rr.gov.cbm.scam.bean.Militar;
import br.rr.gov.cbm.scam.dto.MilitarDTO;

public class MilitarDao {

	private EntityManager em;

	public MilitarDao(EntityManager em) {
		this.em = em;
	}

	public Militar selecionar(Integer id) {
		String hql = "select m from Militar m where m.id = :id";
		try {
			return em.createQuery(hql, Militar.class).setParameter("id", id)
					.getSingleResult();
		} catch (NoResultException npe) {
			return null;
		}
	}
	
	public Militar selecionaPorCpf(String cpf) {
		String hql = "select m from Militar m where m.cpfSemMascara = :cpf";
		try {
			return em.createQuery(hql, Militar.class).setParameter("cpf", cpf)
					.getSingleResult();
		} catch (NoResultException npe) {
			return null;
		}
	}

	public Militar salvar(Militar militar) {
		return em.merge(militar);
	}

	public List<MilitarDTO> pesquisarNome(String s) {

		s = Normalizer.normalize(s, Normalizer.Form.NFD)
				.replaceAll("[^\\p{ASCII}]", "").toUpperCase();
		String hql = "SELECT new br.rr.gov.cbm.scam.dto.MilitarDTO(c.id,c.nomeCompleto) from Militar c where c.nomeCompleto like '"
				+ s + "%'";
		return em.createQuery(hql, MilitarDTO.class).getResultList();

	}

	public List<MilitarDTO> pesquisarRg(String rg) {
		try {
			return em
					.createQuery(
							"SELECT new br.rr.gov.cbm.scam.dto.MilitarDTO(m.id,m.nomeCompleto,m.postoGraduacao,m.nomeGuerra) FROM Militar m WHERE m.rg = :reg",
							MilitarDTO.class).setParameter("reg", rg)
					.getResultList();
		} catch (NoResultException e) {
			return null;
		}
	}

	public List<MilitarDTO> pesquisarCpf(String cpf) {
		try {
			return em
					.createQuery(
							"SELECT new br.rr.gov.cbm.scam.dto.MilitarDTO(m.id,m.nomeCompleto,m.postoGraduacao,m.nomeGuerra) FROM Militar m WHERE m.cpf = :reg",
							MilitarDTO.class).setParameter("reg", cpf)
					.getResultList();
		} catch (NoResultException e) {
			return null;
		}
	}

	public List<MilitarDTO> pesquisarNomeGuerra(String nome) {
		try {
			return em
					.createQuery(
							"SELECT new br.rr.gov.cbm.scam.dto.MilitarDTO(m.id,m.nomeCompleto,m.postoGraduacao,m.nomeGuerra) FROM Militar m WHERE UPPER(TRANSLATE(m.nomeGuerra,'ÁÃÂÀáãâàÉÈÊéêèÍìÓóÔôÕõÚúÇç','AAAAaaaaEEEeeeIiOoOoOoUuCc')) = UPPER(TRANSLATE(:reg,'ÁÃÂÀáãâàÉÈÊéêèÍìÓóÔôÕõÚúÇç','AAAAaaaaEEEeeeIiOoOoOoUuCc'))",
							MilitarDTO.class)
					.setParameter("reg", nome.toUpperCase()).getResultList();
		} catch (NoResultException e) {
			return null;
		}
	}

	public List<MilitarDTO> pesquisarMatriculaE(String mat) {
		try {
			return em
					.createQuery(
							"SELECT new br.rr.gov.cbm.scam.dto.MilitarDTO(m.id,m.nomeCompleto,m.postoGraduacao,m.nomeGuerra) FROM Militar m WHERE m.matricula = :reg",
							MilitarDTO.class).setParameter("reg", mat)
					.getResultList();
		} catch (NoResultException e) {
			return null;
		}
	}

	public List<MilitarDTO> pesquisarMatriculaF(String mat) {
		try {
			return em
					.createQuery(
							"SELECT new br.rr.gov.cbm.scam.dto.MilitarDTO(m.id,m.nomeCompleto,m.postoGraduacao,m.nomeGuerra) FROM Militar m WHERE m.siape = :reg",
							MilitarDTO.class).setParameter("reg", mat)
					.getResultList();
		} catch (NoResultException e) {
			return null;
		}
	}
}
