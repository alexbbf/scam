package br.rr.gov.cbm.scam.bean;

public enum TipoDependente {
	
IPER("IPER"),IR("IR"),IPER_IR("IPER e IR"),NENHUM("Nenhum");
	
	private String label;
	private TipoDependente(String label) {
		this.label = label;
	}
	public String getLabel() {
		return label;
	}

}
