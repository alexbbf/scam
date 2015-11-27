package br.rr.gov.cbm.scam.bean;

public enum TipoLogradouro {

	RUA("Rua"), AVENIDA("Avenida"), ALAMEDA("Alameda"), VIA("Via"), TRAVESSA(
			"Travessa"), BECO("Beco"), CAMINHO("Caminho"), PARQUE("Parque"), MORRO(
			"Morro"), LOTEAMENTO("Loteamento"), VIELA("Viela"),BR("BR");

	private String label;

	private TipoLogradouro(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}
}
