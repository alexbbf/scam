package br.rr.gov.cbm.scam.bean;

public enum SituacaoOcorrencia {

	ATENDIDA("Atendida"),NAO_ATENDIDA("Não atendida");
	
	private String label;

	private SituacaoOcorrencia(String label) {
		this.label = label;
	}
	
	public String getLabel() {
		return label;
	}
	
	
}
