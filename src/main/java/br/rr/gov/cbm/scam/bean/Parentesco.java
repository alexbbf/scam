package br.rr.gov.cbm.scam.bean;

public enum Parentesco {
	PAI("Pai"), MAE("Mãe"), IRMAO("Irmão(ã)"), AVO("Avó"), VOVO("Avô"), AMIGO(
			"Amigo(a)"), TIO("Tio(a)"), PRIMO("Primo(a)"), CONJUGE("Conjugê"), FILHO(
			"Filho(a)"), NETO("Neto(a)"), OUTRO("Outro");

	private String label;

	private Parentesco(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

}
