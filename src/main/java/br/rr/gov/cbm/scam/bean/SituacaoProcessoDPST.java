package br.rr.gov.cbm.scam.bean;

public enum SituacaoProcessoDPST {
	
	APROVADO("Aprovado"),ARQUIVADO("Arquivado"),PENDENCIA("Pendência");
	
	private String label;

	private SituacaoProcessoDPST(String label) {
		this.label = label;
	}
	
	public String getLabel() {
		return label;
	}
	
	

}
