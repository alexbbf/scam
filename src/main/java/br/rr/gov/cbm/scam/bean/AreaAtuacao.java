package br.rr.gov.cbm.scam.bean;

public enum AreaAtuacao {
	
	LESTE("Leste"),OESTE("Oeste"),CENTRO("Centro"), NORTE("Norte"), SUL("Sul"), RURAL("Rural");
	
	private String label;

	private AreaAtuacao(String label) {
		this.label = label;
	}
	
	public String getLabel() {
		return label;
	}
	
	
	

}
