package br.rr.gov.cbm.scam.bean;

public enum TipoCurso {
	BACHARELADO("Bacharelado"), LICENCIATURA("Licenciatura"), TECNOLOGO(
			"Tecnólogo"), TECNICO("Técnico"), ESPECIALIZACAO("Especialização");

	private String label;

	private TipoCurso(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

}
