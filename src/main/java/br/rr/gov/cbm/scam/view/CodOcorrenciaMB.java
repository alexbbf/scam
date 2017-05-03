package br.rr.gov.cbm.scam.view;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.rr.gov.cbm.scam.bean.CodigoOcorrencia;
import br.rr.gov.cbm.scam.business.CodOcorrenciaBusiness;

@ManagedBean
@ViewScoped
public class CodOcorrenciaMB {
	
	@EJB
	private CodOcorrenciaBusiness business;
	
	private CodigoOcorrencia codigo;

	public CodigoOcorrencia getCodigo() {
		return codigo;
	}

	public void setCodigo(CodigoOcorrencia codigo) {
		this.codigo = codigo;
	}
	
	public List<CodigoOcorrencia> autoCompleteCodOcorrencia(String s){
		return business.autoCompleteCodOcorrencia(s);
	}

}
