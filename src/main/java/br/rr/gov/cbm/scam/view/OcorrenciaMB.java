package br.rr.gov.cbm.scam.view;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.rr.gov.cbm.scam.bean.Ocorrencia;


@ManagedBean
@SessionScoped
public class OcorrenciaMB {

	
	 
	private Ocorrencia ocorrencia;

	public Ocorrencia getOcorrencia() {
		return ocorrencia;
	}

	public void setOcorrencia(Ocorrencia ocorrencia) {
		this.ocorrencia = ocorrencia;
	}
	 
	 
}
