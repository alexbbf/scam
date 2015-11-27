package br.rr.gov.cbm.scam.bean;

public enum Grupo {
	
	ROLE_DPL("DPL"),ROLE_DGOF("DGOF"),ROLE_DPST("DPST"),ROLE_CEPH("CEPH"),ROLE_CINFOR("CINFOR");
	
	private String label;
	
	private Grupo(String label) {
		this.label = label;
	}
	
	public String getLabel() {
		return label;
	}
	
	@Override
	public String toString() {
		return name();
	}

}
