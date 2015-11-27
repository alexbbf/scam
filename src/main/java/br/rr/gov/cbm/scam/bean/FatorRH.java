package br.rr.gov.cbm.scam.bean;

public enum FatorRH {
	POSITIVO("+"),NEGATIVO("-");
	
	private String label;
	
	private FatorRH(String label) {
		this.label = label;
	}
	
	public String getLabel() {
		return label;
	}

}
