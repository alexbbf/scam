package br.rr.gov.cbm.scam.view;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import br.rr.gov.cbm.scam.bean.Quadro;
import br.rr.gov.cbm.scam.business.QuadroBusiness;


@ManagedBean
@ApplicationScoped
public class QuadroMB {
	
	@EJB
	private QuadroBusiness business;
	
	private List<Quadro> quadros;

	public void listar() {
		quadros = business.listar();
	}
	@PostConstruct
	private void init() {
		listar();
	}

	public List<Quadro> getQuadros() {
		return quadros;
	}

	public void setQuadros(List<Quadro> quadros) {
		this.quadros = quadros;
	}
	

	

	
	
	
	
	

}
