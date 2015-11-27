package br.rr.gov.cbm.scam.bean;

public enum TipoElogio {
	COLETIVO("Coletivo"), INDIVIDUAL("Individual");

	private String label;

	private TipoElogio(String label) {
		this.label = label;
	}
	
	public String getLabel() {
		return label;
	}

}
