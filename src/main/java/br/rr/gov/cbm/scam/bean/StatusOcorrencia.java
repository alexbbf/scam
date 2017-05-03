package br.rr.gov.cbm.scam.bean;

public enum StatusOcorrencia {

AGUARDANDO("Aguardando"),EM_ATENDIMENTO("Em atendimento"), FINALIZADA("Finalizada");
	
	private String label;

	private StatusOcorrencia(String label) {
		this.label = label;
	}
	
	public String getLabel() {
		return label;
	}
}
