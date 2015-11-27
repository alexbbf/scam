package br.rr.gov.cbm.scam.bean;

import java.util.Date;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Dependente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToOne 
	private Militar militar;
	
	private String nome;
	
	@Embedded
	private Rg rg;
	
	private String cpf;
	
	private String pisPasep;
	
	@Temporal(TemporalType.DATE)
	private Date dataNascimento;
	
	@Enumerated(EnumType.STRING)
	private Parentesco parentesco;
	
	@Enumerated(EnumType.STRING)
	private TipoDependente tipoDependente;
	
	private String nomePai;
	
	private String nomeMae;
	
	private String naturalidade;
	
	@Embedded
	private TituloEleitor tituloEleitor;
	
	@Enumerated(EnumType.STRING)
	private TipoSanguineo tipoSanguineo;
	
	@Enumerated(EnumType.STRING)
	private FatorRH fatorRh;
	
	

	public Militar getMilitar() {
		return militar;
	}

	public void setMilitar(Militar militar) {
		this.militar = militar;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Rg getRg() {
		return rg;
	}

	public void setRg(Rg rg) {
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

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Parentesco getParentesco() {
		return parentesco;
	}

	public void setParentesco(Parentesco parentesco) {
		this.parentesco = parentesco;
	}

	public TipoDependente getTipoDependente() {
		return tipoDependente;
	}

	public void setTipoDependente(TipoDependente tipoDependente) {
		this.tipoDependente = tipoDependente;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getNaturalidade() {
		return naturalidade;
	}

	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}

	public TituloEleitor getTituloEleitor() {
		return tituloEleitor;
	}

	public void setTituloEleitor(TituloEleitor tituloEleitor) {
		this.tituloEleitor = tituloEleitor;
	}

	public TipoSanguineo getTipoSanguineo() {
		return tipoSanguineo;
	}

	public void setTipoSanguineo(TipoSanguineo tipoSanguineo) {
		this.tipoSanguineo = tipoSanguineo;
	}

	public FatorRH getFatorRh() {
		return fatorRh;
	}

	public void setFatorRh(FatorRH fatorRh) {
		this.fatorRh = fatorRh;
	}
	
	public Dependente() {
		rg = new Rg();
		tituloEleitor = new TituloEleitor();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dependente other = (Dependente) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	

}
