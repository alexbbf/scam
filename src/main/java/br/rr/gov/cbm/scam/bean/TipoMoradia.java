package br.rr.gov.cbm.scam.bean;

public enum TipoMoradia {

	PROPRIA("Própria"), ALUGADA("Alugada"), FINANCIADA("Financiada"), CEDIDA(
			"Cedida");

	private String label;

	private TipoMoradia(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}
}
