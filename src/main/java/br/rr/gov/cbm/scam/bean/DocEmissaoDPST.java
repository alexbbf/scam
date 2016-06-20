package br.rr.gov.cbm.scam.bean;

public enum DocEmissaoDPST {

	AVCB("AVCB", "Auto de Vistoria do Corpo de Bombeiros"), CAP("CAP",
			"Certificado de Análise do Projeto de Prevenção Contra Incêndio"),
			TLI_AVECB("TLI/AVECB", "Termo de Liberação de Ingresso/Auto de Vistoria de Eventos do Corpo de Bombeiros"), CRB("CRB",
			"Certificado de Reconhecimento de Brigada de Incêndio"),PTCB("PTCB","Processo Técnico do Corpo de Bombeiros");
	
	private String label;
	
	private String descricao;

	private DocEmissaoDPST(String label, String descricao) {
		this.label = label;
		this.descricao = descricao;
	}
	
	public String getLabel() {
		return label;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	
	
	

}
