package br.rr.gov.cbm.scam.bean;

public enum SituacaoProcessoDPSTHoje {

	ARQUIVADO_VIGENTE("Arquivado vigente"), EM_ANALISE("Em análise"), ARQUIVADO(
			"Arquivado"), AVCB_VENCIDO("AVCB vencido"), ARQUIVAR_PAP1(
			"Arquivar 1ºPAP");
	
	private String label;

	private SituacaoProcessoDPSTHoje(String label) {
		this.label = label;
	}
	
	public String getLabel() {
		return label;
	}

}
