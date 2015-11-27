package br.rr.gov.cbm.scam.bean;

public enum ChavePesquisaDocumento {
	
	ASSUNTO("Assunto"),ASSINADO_POR("Quem Assinou"), ORIGEM("Origem"), IDENTIFICACAO("Id. do Doc");
	
	private String label;

	private ChavePesquisaDocumento(String label) {
		this.label = label;
	}
	
	public String getLabel() {
		return label;
	}

}
