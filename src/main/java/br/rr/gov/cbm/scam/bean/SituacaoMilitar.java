package br.rr.gov.cbm.scam.bean;

public enum SituacaoMilitar {
	
	ATIVA("Ativa"), RESERVA_REMUNERADA("Reserva Remunerada"), RESERVA("Reserva"), REFORMA_REMUNERADA(
			"Reforma Remunerada"), REFORMA("Reforma");

	private String label;

	private SituacaoMilitar(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}


}
