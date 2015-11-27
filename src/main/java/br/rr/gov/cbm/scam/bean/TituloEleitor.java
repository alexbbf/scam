package br.rr.gov.cbm.scam.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class TituloEleitor {
	
	@Column(name = "tit_numero")
	private String numero;
	
	@Column(name = "tit_zona")
	private String zona;
	
	@Column(name = "tit_secao")
	private String secao;
	
	@Column(name = "tit_dataemissao")
	private Date dataEmissao;

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getZona() {
		return zona;
	}

	public void setZona(String zona) {
		this.zona = zona;
	}

	public String getSecao() {
		return secao;
	}

	public void setSecao(String secao) {
		this.secao = secao;
	}

	public Date getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(Date dataEmissao) {
		this.dataEmissao = dataEmissao;
	}
	
	

}
