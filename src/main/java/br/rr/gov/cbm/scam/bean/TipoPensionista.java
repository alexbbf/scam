package br.rr.gov.cbm.scam.bean;

public enum TipoPensionista {
	MENOR_NAO_EMANCIPADO("Menor de 18 não emancipado"), MENOR_EMANCIPADO(
			"Menor de 18 emancipado"), MAIOR_18_NECESSIDADE("Maior de 18 PNE"), MAIOR_18(
			"Maior de 18");

	private String label;

	private TipoPensionista(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}
}
