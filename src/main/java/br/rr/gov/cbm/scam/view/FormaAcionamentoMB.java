package br.rr.gov.cbm.scam.view;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.rr.gov.cbm.scam.bean.FormaAcionamento;
import br.rr.gov.cbm.scam.business.FormaAcionamentoBusiness;

@ManagedBean
@ViewScoped
public class FormaAcionamentoMB {
	
	@EJB
	private FormaAcionamentoBusiness business;
	
	private List<FormaAcionamento> formasAcionamento;

	public List<FormaAcionamento> getFormasAcionamento() {
		return formasAcionamento;
	}

	public void setFormasAcionamento(List<FormaAcionamento> formasAcionamento) {
		this.formasAcionamento = formasAcionamento;
	}
	
	
	public List<FormaAcionamento> autoCompleteFormaAc(String s){
		return business.autoCompleteFormaAc(s);
	}
	
	
	

}
