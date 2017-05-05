package br.rr.gov.cbm.scam.bean;

public enum OBMAtuacao {
	
	BBM("BBM"),PEL1("1ºPEL"),PEL2("2ºPEL"),PEL3("3ºPEL"),BPABM("BPABM"),CIA1("1ªCIA"),CIA2("2ªCIA"),CIA3("3ªCIA");

	private String label;

	private OBMAtuacao(String label) {
		this.label = label;
	}
	
	public String getLabel() {
		return label;
	}
	
}
