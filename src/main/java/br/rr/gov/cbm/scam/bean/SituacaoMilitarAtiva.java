package br.rr.gov.cbm.scam.bean;

public enum SituacaoMilitarAtiva {
	
	ATIVIDADE("Atividade"), AGREGADO("Agregado");

	private String label;

	private SituacaoMilitarAtiva(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}
}
