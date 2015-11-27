package br.rr.gov.cbm.scam.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Conjuge {

	
	@Column(name = "conjuge_nome")
	private String nome;// CAIXA ALTA

	@Column(name = "conjuge_rg")
	private String rg;
	
	@Column(name = "conjuge_cpf")
	private String cpf;

	@Column(name = "conjuge_pispasep")
	private String pisPasep;
	
	@Column(name = "conjuge_dataUniao")
	private Date dataUniao;

	@Column(name = "conjuge_certidao")
	private String numeroCertidao;

	@Column(name = "conjuge_livro")
	private String numeroLivro;

	@Column(name = "conjuge_folha")
	private String numeroFolha;
	
	@Column(name = "conjuge_cartorio")
	private String nomeCartorio; //CAIXA ALTA

	@Column(name = "conjuge_comarca")
	private String comarca;


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getPisPasep() {
		return pisPasep;
	}

	public void setPisPasep(String pisPasep) {
		this.pisPasep = pisPasep;
	}

	public Date getDataUniao() {
		return dataUniao;
	}

	public void setDataUniao(Date dataUniao) {
		this.dataUniao = dataUniao;
	}

	public String getNumeroCertidao() {
		return numeroCertidao;
	}

	public void setNumeroCertidao(String numeroCertidao) {
		this.numeroCertidao = numeroCertidao;
	}

	public String getNumeroLivro() {
		return numeroLivro;
	}

	public void setNumeroLivro(String numeroLivro) {
		this.numeroLivro = numeroLivro;
	}

	public String getNumeroFolha() {
		return numeroFolha;
	}

	public void setNumeroFolha(String numeroFolha) {
		this.numeroFolha = numeroFolha;
	}

	public String getNomeCartorio() {
		return nomeCartorio;
	}

	public void setNomeCartorio(String nomeCartorio) {
		this.nomeCartorio = nomeCartorio;
	}

	public String getComarca() {
		return comarca;
	}

	public void setComarca(String comarca) {
		this.comarca = comarca;
	}

	
}
