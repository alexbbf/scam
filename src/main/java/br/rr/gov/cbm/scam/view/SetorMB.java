package br.rr.gov.cbm.scam.view;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import br.rr.gov.cbm.scam.bean.Setor;
import br.rr.gov.cbm.scam.business.SetorBusiness;

@ManagedBean
public class SetorMB {

	@EJB
	private SetorBusiness business;

	private List<Setor> setores;

	@PostConstruct
	private void init() {
		listar();
	}

	public List<Setor> getSetores() {
		return setores;
	}

	public void setSetores(List<Setor> setores) {
		this.setores = setores;
	}

	public void listar() {
		setores = business.listar();
	}

}
