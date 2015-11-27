package br.rr.gov.cbm.scam.bean;

import java.util.Date;

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
public class Pensionista {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@ManyToOne
	private Militar militar;

	private String nome;

	private String docRefencia;

	private String decisao;

	private String nomeBeneficiario;

	private String pisPasep;

	private String cpfDependente;

	private String rgDependente;

	private String telefoneDependente;

	private String cpfBeneficiario;

	private String rgBeneficiario;

	private String tipoParentesco;

	private String tipoParentescoComDependente;

	private String telefoneBeneficiario;

	@Enumerated(EnumType.STRING)
	private TipoPensionista tipoPensionista;

	private String ruaDependente;

	private String bairroDependente;

	private String numeroCasaDependente;

	private String cidadeDependente;

	private String cidadeBeneficiario;

	private String estadoDependente;

	private String estadoBeneficiario;

	private String ruaBeneficiario;

	private String bairroBeneficiario;

	private String numeroBeneficiario;

	private String numeroAgencia;

	private String numeroConta;

	@Enumerated(EnumType.STRING)
	private Banco banco;

	@Temporal(TemporalType.DATE)
	private Date dataNascimentoDependente;

	@Temporal(TemporalType.DATE)
	private Date dataNascimentoBeneficiario;

	@Temporal(TemporalType.DATE)
	private Date dataInclusao;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Militar getMilitar() {
		return militar;
	}

	public void setMilitar(Militar militar) {
		this.militar = militar;
	}

	public String getEstadoDependente() {
		return estadoDependente;
	}

	public void setEstadoDependente(String estadoDependente) {
		this.estadoDependente = estadoDependente;
	}

	public String getEstadoBeneficiario() {
		return estadoBeneficiario;
	}

	public void setEstadoBeneficiario(String estadoBeneficiario) {
		this.estadoBeneficiario = estadoBeneficiario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDocRefencia() {
		return docRefencia;
	}

	public void setDocRefencia(String docRefencia) {
		this.docRefencia = docRefencia;
	}

	public String getDecisao() {
		return decisao;
	}

	public void setDecisao(String decisao) {
		this.decisao = decisao;
	}

	public String getCidadeDependente() {
		return cidadeDependente;
	}

	public void setCidadeDependente(String cidadeDependente) {
		this.cidadeDependente = cidadeDependente;
	}

	public String getCidadeBeneficiario() {
		return cidadeBeneficiario;
	}

	public void setCidadeBeneficiario(String cidadeBeneficiario) {
		this.cidadeBeneficiario = cidadeBeneficiario;
	}

	public String getNomeBeneficiario() {
		return nomeBeneficiario;
	}

	public void setNomeBeneficiario(String nomeBeneficiario) {
		this.nomeBeneficiario = nomeBeneficiario;
	}

	public String getPisPasep() {
		return pisPasep;
	}

	public void setPisPasep(String pisPasep) {
		this.pisPasep = pisPasep;
	}

	public String getCpfDependente() {
		return cpfDependente;
	}

	public void setCpfDependente(String cpfDependente) {
		this.cpfDependente = cpfDependente;
	}

	public String getRgDependente() {
		return rgDependente;
	}

	public void setRgDependente(String rgDependente) {
		this.rgDependente = rgDependente;
	}

	public String getTelefoneDependente() {
		return telefoneDependente;
	}

	public void setTelefoneDependente(String telefoneDependente) {
		this.telefoneDependente = telefoneDependente;
	}

	public String getCpfBeneficiario() {
		return cpfBeneficiario;
	}

	public void setCpfBeneficiario(String cpfBeneficiario) {
		this.cpfBeneficiario = cpfBeneficiario;
	}

	public String getRgBeneficiario() {
		return rgBeneficiario;
	}

	public void setRgBeneficiario(String rgBeneficiario) {
		this.rgBeneficiario = rgBeneficiario;
	}

	public String getTipoParentesco() {
		return tipoParentesco;
	}

	public void setTipoParentesco(String tipoParentesco) {
		this.tipoParentesco = tipoParentesco;
	}

	public String getTipoParentescoComDependente() {
		return tipoParentescoComDependente;
	}

	public void setTipoParentescoComDependente(
			String tipoParentescoComDependente) {
		this.tipoParentescoComDependente = tipoParentescoComDependente;
	}

	public String getTelefoneBeneficiario() {
		return telefoneBeneficiario;
	}

	public void setTelefoneBeneficiario(String telefoneBeneficiario) {
		this.telefoneBeneficiario = telefoneBeneficiario;
	}

	public TipoPensionista getTipoPensionista() {
		return tipoPensionista;
	}

	public void setTipoPensionista(TipoPensionista tipoPensionista) {
		this.tipoPensionista = tipoPensionista;
	}

	public String getRuaDependente() {
		return ruaDependente;
	}

	public void setRuaDependente(String ruaDependente) {
		this.ruaDependente = ruaDependente;
	}

	public String getBairroDependente() {
		return bairroDependente;
	}

	public void setBairroDependente(String bairroDependente) {
		this.bairroDependente = bairroDependente;
	}

	public String getNumeroCasaDependente() {
		return numeroCasaDependente;
	}

	public void setNumeroCasaDependente(String numeroCasaDependente) {
		this.numeroCasaDependente = numeroCasaDependente;
	}

	public String getRuaBeneficiario() {
		return ruaBeneficiario;
	}

	public void setRuaBeneficiario(String ruaBeneficiario) {
		this.ruaBeneficiario = ruaBeneficiario;
	}

	public String getBairroBeneficiario() {
		return bairroBeneficiario;
	}

	public void setBairroBeneficiario(String bairroBeneficiario) {
		this.bairroBeneficiario = bairroBeneficiario;
	}

	public String getNumeroBeneficiario() {
		return numeroBeneficiario;
	}

	public void setNumeroBeneficiario(String numeroBeneficiario) {
		this.numeroBeneficiario = numeroBeneficiario;
	}

	public String getNumeroAgencia() {
		return numeroAgencia;
	}

	public void setNumeroAgencia(String numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	public Banco getBanco() {
		return banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}

	public Date getDataNascimentoDependente() {
		return dataNascimentoDependente;
	}

	public void setDataNascimentoDependente(Date dataNascimentoDependente) {
		this.dataNascimentoDependente = dataNascimentoDependente;
	}

	public Date getDataNascimentoBeneficiario() {
		return dataNascimentoBeneficiario;
	}

	public void setDataNascimentoBeneficiario(Date dataNascimentoBeneficiario) {
		this.dataNascimentoBeneficiario = dataNascimentoBeneficiario;
	}

	public Date getDataInclusao() {
		return dataInclusao;
	}

	public void setDataInclusao(Date dataInclusao) {
		this.dataInclusao = dataInclusao;
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
		Pensionista other = (Pensionista) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
