package br.rr.gov.cbm.scam.view;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.rr.gov.cbm.scam.bean.Ocorrencia;


@ManagedBean
@SessionScoped
public class OcorrenciaMB {

	private List<Ocorrencia> ocorrencias = new ArrayList<Ocorrencia>();
	 
	private Ocorrencia ocorrencia;

	public Ocorrencia getOcorrencia() {
		return ocorrencia;
	}

	public void setOcorrencia(Ocorrencia ocorrencia) {
		this.ocorrencia = ocorrencia;
	}

	public List<Ocorrencia> getOcorrencias() {
		return ocorrencias;
	}

	public void setOcorrencias(List<Ocorrencia> ocorrencias) {
		this.ocorrencias = ocorrencias;
	}
	
	
	 
	 
}
