package br.rr.gov.cbm.scam.view;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.rr.gov.cbm.scam.bean.Bairro;
import br.rr.gov.cbm.scam.business.BairroBusiness;

@ManagedBean
@ViewScoped
public class BairroMB {
	
	@EJB
	private BairroBusiness business;
	
	private List<Bairro> bairros;
	
	private Bairro bairroObj;
	
	private String bairroParaSalvar;
	
	
	public List<Bairro> autoCompleteBairro(String s) {
		bairros = business.autoCompleteBairro(s);
		return bairros;

	}

	public void salvar(){
		bairroObj = new Bairro();
		bairroObj.setDescricao(bairroParaSalvar);
		business.salvar(bairroObj);
	}
	
	public String getBairroParaSalvar() {
		return bairroParaSalvar;
	}



	public void setBairroParaSalvar(String bairroParaSalvar) {
		this.bairroParaSalvar = bairroParaSalvar;
	}



	public List<Bairro> getBairros() {
		return bairros;
	}

	public void setBairros(List<Bairro> bairros) {
		this.bairros = bairros;
	}

	public Bairro getBairroObj() {
		return bairroObj;
	}

	public void setBairroObj(Bairro bairroObj) {
		this.bairroObj = bairroObj;
	}


	
	
	
	
	

}
