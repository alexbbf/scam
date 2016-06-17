package br.rr.gov.cbm.scam.bean;

public enum SubGrupo {

	TRAUMA("Trauma"), TERRESTRE("Terrestre"), ALTURA("Altura"), AQUATICO(
			"Aquático"), DIVERSOS("Diversos"), AREA_ABERTA("Área Aberta"), EDIFICACAO(
			"Edificação"), VEGETACAO("Vegetação"), TRANSPORTES("Transportes"), ANALISE_VISTORIA_PERICIA(
			"Análise/Vistoria/Perícia"), CAPACITACAO("Capacitação"), PRODUTOS_PERIGOSOS(
			"Produtos Perigosos"), CLINICO("Clínico"), ATIVIDADES_APOIO(
			"Atividade em apoio");
	
	private String label;

	private SubGrupo(String label) {
		this.label = label;
	}
	
	public String getLabel() {
		return label;
	}

}
