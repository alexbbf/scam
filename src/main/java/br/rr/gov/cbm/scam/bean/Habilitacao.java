package br.rr.gov.cbm.scam.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Embeddable
public class Habilitacao {

	@Column(name = "cnh_registro")
	private String numRegistro;

	@Column(name = "cnh_categoria")
	@Enumerated(EnumType.STRING)
	private CategoriaCNH categoria;

	@Column(name = "cnh_emissao")
	@Temporal(TemporalType.DATE)
	private Date dataEmissao;
	
	@Column(name = "cnh_validade")
	@Temporal(TemporalType.DATE)
	private Date dataValidade;

	public String getNumRegistro() {
		return numRegistro;
	}

	public void setNumRegistro(String numRegistro) {
		this.numRegistro = numRegistro;
	}

	public CategoriaCNH getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriaCNH categoria) {
		this.categoria = categoria;
	}

	public Date getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(Date dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	public Date getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(Date dataValidade) {
		this.dataValidade = dataValidade;
	}

}
