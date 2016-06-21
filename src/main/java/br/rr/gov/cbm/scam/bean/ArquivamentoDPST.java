package br.rr.gov.cbm.scam.bean;

public enum ArquivamentoDPST {
	
	POSSUI_AVCB("Possui AVCB"),PROCESSO_ANDAMENTO("Processo em andamento");
	
	private String label;

	private ArquivamentoDPST(String label) {
		this.label = label;
	}
	
	public String getLabel() {
		return label;
	}
	
	

}
