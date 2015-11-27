package br.rr.gov.cbm.scam.bean;

public enum Escolaridade {
	
	SUPERIOR_INC("Superior Incompleto"), SUPERIOR_COMP("Superior Completo"), ENSINO_MEDIO_INC(
			"Ensino Médio Incompleto"), ENSINO_MEDIO_COMP("Ensino Médio "), FUNDAMENTAL(
			"Ensino Fundamental");

	private String label;

	private Escolaridade(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

}
