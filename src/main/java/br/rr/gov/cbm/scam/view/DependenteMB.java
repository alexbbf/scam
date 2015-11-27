package br.rr.gov.cbm.scam.view;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.rr.gov.cbm.scam.bean.Dependente;
import br.rr.gov.cbm.scam.business.DependenteBusiness;

@ManagedBean
@ViewScoped
public class DependenteMB {

	@EJB
	private DependenteBusiness business;

	private Dependente dependente = new Dependente();

	private List<Dependente> dependentes = new ArrayList<Dependente>();

	public Dependente getDependente() {
		return dependente;
	}
	
	public Dependente getDependenteNew() {
		Dependente d = dependente;
		dependente = new Dependente();
		return d;
	}

	public void setDependente(Dependente dependente) {
		this.dependente = dependente;
	}

	public void salvar(Dependente dependente) {
		business.salvar(dependente);
		dependente = new Dependente();
	}

	public List<Dependente> getDependentes() {
		return dependentes;
	}

	public void setDependentes(List<Dependente> dependentes) {
		this.dependentes = dependentes;
	}
	
	

	
}
