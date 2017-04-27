package br.rr.gov.cbm.scam.bean;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;

@Embeddable
public class Endereco {


	@ManyToOne
	private Logradouro logradouro;
	
	@Column(name = "end_numero")
	private String numero;

	@ManyToOne(cascade = CascadeType.ALL)
	private Bairro bairro;
	
	@Column(name = "end_cep")
	private String cep;
	
	@Column(name = "end_complemento")
	private String complemento;
	
	@Column(name = "end_referencia")
	private String referencia;
	
	@ManyToOne
	private Municipio municipio;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "end_tipomoradia")
	private TipoMoradia tipoMoradia;
	

	
	
	

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public Municipio getMunicipio() {
		return municipio;
	}

	public void setMunicipio(Municipio municipio) {
		this.municipio = municipio;
	}

	public TipoMoradia getTipoMoradia() {
		return tipoMoradia;
	}

	public void setTipoMoradia(TipoMoradia tipoMoradia) {
		this.tipoMoradia = tipoMoradia;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public Logradouro getLogradouro() {
	
		return logradouro;
	}

	public void setLogradouro(Logradouro logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Bairro getBairro() {
		
		return bairro;
	}

	public void setBairro(Bairro bairro) {
		this.bairro = bairro;
	}



}
