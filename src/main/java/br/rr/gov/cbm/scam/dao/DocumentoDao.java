package br.rr.gov.cbm.scam.dao;

import java.text.Normalizer;
import java.util.List;

import javax.persistence.EntityManager;

import br.rr.gov.cbm.scam.bean.Documento;

public class DocumentoDao {
	
	private EntityManager em;

	public DocumentoDao(EntityManager em) {
		this.em = em;
	}
	
	public Documento salvar(Documento d){
		return em.merge(d);
	}
	
	public List<Documento> pesquisarPorAsssunto(String s){
		s = Normalizer.normalize(s, Normalizer.Form.NFD)
				.replaceAll("[^\\p{ASCII}]", "").toUpperCase();
		String hql = "SELECT d FROM Documento d where WHERE UPPER(TRANSLATE(d.assunto,'ÁÃÂÀáãâàÉÈÊéêèÍìÓóÔôÕõÚúÇç','AAAAaaaaEEEeeeIiOoOoOoUuCc'))  like '%"
				+ s + "%'";
		return em.createQuery(hql, Documento.class).getResultList();
	}
	
	public List<Documento> pesquisarPorIdentificacao(String s){
		s = Normalizer.normalize(s, Normalizer.Form.NFD)
				.replaceAll("[^\\p{ASCII}]", "").toUpperCase();
		String hql = "SELECT d FROM Documento d where WHERE UPPER(TRANSLATE(d.identificacaoDoDocumento,'ÁÃÂÀáãâàÉÈÊéêèÍìÓóÔôÕõÚúÇç','AAAAaaaaEEEeeeIiOoOoOoUuCc'))  like '%"
				+ s + "%'";
		return em.createQuery(hql, Documento.class).getResultList();
	}
	
	public List<Documento> pesquisarPorOrigem(String s){
		s = Normalizer.normalize(s, Normalizer.Form.NFD)
				.replaceAll("[^\\p{ASCII}]", "").toUpperCase();
		String hql = "SELECT d FROM Documento d where WHERE UPPER(TRANSLATE(d.origem,'ÁÃÂÀáãâàÉÈÊéêèÍìÓóÔôÕõÚúÇç','AAAAaaaaEEEeeeIiOoOoOoUuCc'))  like '%"
				+ s + "%'";
		return em.createQuery(hql, Documento.class).getResultList();
	}
	
	public List<Documento> pesquisarPorAssinadoPor(String s){
		s = Normalizer.normalize(s, Normalizer.Form.NFD)
				.replaceAll("[^\\p{ASCII}]", "").toUpperCase();
		String hql = "SELECT d FROM Documento d where WHERE UPPER(TRANSLATE(d.assinadoPor,'ÁÃÂÀáãâàÉÈÊéêèÍìÓóÔôÕõÚúÇç','AAAAaaaaEEEeeeIiOoOoOoUuCc'))  like '%"
				+ s + "%'";
		return em.createQuery(hql, Documento.class).getResultList();
	}



}
