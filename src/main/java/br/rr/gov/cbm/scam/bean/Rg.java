package br.rr.gov.cbm.scam.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Embeddable
public class Rg {
	
	@Column(name = "rg_numero")
	private String numero;
	
	@Column(name = "rg_expedicao")
	@Temporal(TemporalType.DATE)
	private Date dataExpedicao;

	@Column(name = "rg_orgao")
	private String orgaoExpeditor;

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Date getDataExpedicao() {
		return dataExpedicao;
	}

	public void setDataExpedicao(Date dataExpedicao) {
		this.dataExpedicao = dataExpedicao;
	}

	public String getOrgaoExpeditor() {
		return orgaoExpeditor;
	}

	public void setOrgaoExpeditor(String orgaoExpeditor) {
		this.orgaoExpeditor = orgaoExpeditor;
	}
	
	


}
