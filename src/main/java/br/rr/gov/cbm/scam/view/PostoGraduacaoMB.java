package br.rr.gov.cbm.scam.view;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import br.rr.gov.cbm.scam.bean.PostoGraduacao;
import br.rr.gov.cbm.scam.business.PostoGraduacaoBusiness;

@ManagedBean
@ApplicationScoped
public class PostoGraduacaoMB {
	
	@EJB
	private PostoGraduacaoBusiness business;
	
	private List<PostoGraduacao> postos;

	public void listar() {
		postos =  business.listar();
	}
	
	@PostConstruct
	private void init() {
		listar();
	}

	public List<PostoGraduacao> getPostos() {
		return postos;
	}

	public void setPostos(List<PostoGraduacao> postos) {
		this.postos = postos;
	}
	
	
	

}
