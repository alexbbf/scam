package br.rr.gov.cbm.scam.bean;

public enum TipoCursoFormacao {
	
	
	CFSDBM("CFSD BM","CURSO DE FORMAÇÃO DE SOLDADOS BOMBEIRO MILITAR"),
	CFCBM("CFC BM","CURSO DE FORMAÇÃO DE CABOS BOMBEIRO MILITAR"),
	CFSBM("CFS BM","CURSO DE FORMAÇÃO DE SARGENTOS BOMBEIRO MILITAR"),
	CASBM("CAS BM","CURSO DE APERFEIÇOAMENTO DE SARGENTOS BOMBEIRO MILITAR"),
	CHOBM("CHO BM","CURSO DE HABILITAÇÃO DE OFICIAIS COMPLEMENTARES BOMBEIRO MILITAR"),
	CFOBM("CFO BM","CURSO DE FORMAÇÃO DE OFICIAIS BOMBEIRO MILITAR");
	
	private String label;
	
	private String descricao;

	private TipoCursoFormacao(String label, String descricao) {
		this.label = label;
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public String getLabel() {
		return label;
	}
	
	
	

}
