package br.rr.gov.cbm.scam.bean;

public enum Comportamento {

	BOM("Bom"), OTIMO("Ótimo"), EXCEPCIONAL("Excepcional"), RUIM("Ruim"), INSUFICIENTE(
			"Insuficiente");

	private String label;

	private Comportamento(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}
}
