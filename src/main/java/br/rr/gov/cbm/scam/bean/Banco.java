package br.rr.gov.cbm.scam.bean;

public enum Banco {
	
	BANCO_BRASIL("Banco do Brasil"), ITAU("Itaú"), HSBC("HSBC"), SANTANDER(
			"Santander"), CAIXA("Caixa"), BRADESCO("Bradesco");
	
	private String label;
	
	private Banco(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

}
