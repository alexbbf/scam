package br.rr.gov.cbm.scam.bean;

public enum AreaCurso {
	
	HUMANAS("Ciências Humanas") , BIOLOGICAS("Ciências Biológicas") , EXATAS("Ciências Exatas") , BOMBEIRO("Bombeiro/Militar");
	
	private String label;
	
	private AreaCurso(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

}
