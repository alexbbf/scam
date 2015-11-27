package br.rr.gov.cbm.scam.bean;

public enum SituacaoCurso {
	
	CONCLUIDO("Concluído"),CURSANDO("Cursando");
	
	private String label;

	private SituacaoCurso(String label) {
		this.label = label;
	}
	
	public String getLabel() {
		return label;
	}
	
	

}
