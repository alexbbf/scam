package br.rr.gov.cbm.scam.bean;

public enum GrupoOcorrencia {

	INCENDIO("Incêndio"), APH("Pré-Hospitalar"), SALVAMENTO("Salvamento"), SERVICOS_TECNICOS(
			"Serviços Técnicos"), ATIVIDADE("Atividade"), ACIDENTE("Acidentes"),SERVICOS("Serviços"),GERAL("Geral");
	
	private String label;

	private GrupoOcorrencia(String label) {
		this.label = label;
	}
	
	public String getLabel() {
		return label;
	}

}
