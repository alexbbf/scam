package br.rr.gov.cbm.scam.bean;

import java.util.Date;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Empresa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String razaoSocial;
	
	private String nomeFantasia;
	
	private String cnpj;
	
	private String cpf;
	
	@Embedded
	private Endereco endereco;
	
	private Double area;
	
	private Double altura;
	
	private Integer qtdPavimentos;
	
	private String ramoAtividade;
	
	private String numeroCAP;
	
	private Double kgGPL;
	
	private String classeGLP;
	
	private String telefone1;
	
	private String telefone2;
	
	private String email;
	
	@Temporal(TemporalType.TIME)
	private Date horaAbreManha;
	
	@Temporal(TemporalType.TIME)
	private Date horaFechaManha;
	
	@Temporal(TemporalType.TIME)
	private Date horaAbreTarde;
	
	@Temporal(TemporalType.TIME)
	private Date horaFechaTarde;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Double getArea() {
		return area;
	}

	public void setArea(Double area) {
		this.area = area;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public Integer getQtdPavimentos() {
		return qtdPavimentos;
	}

	public void setQtdPavimentos(Integer qtdPavimentos) {
		this.qtdPavimentos = qtdPavimentos;
	}

	public String getRamoAtividade() {
		return ramoAtividade;
	}

	public void setRamoAtividade(String ramoAtividade) {
		this.ramoAtividade = ramoAtividade;
	}

	public String getNumeroCAP() {
		return numeroCAP;
	}

	public void setNumeroCAP(String numeroCAP) {
		this.numeroCAP = numeroCAP;
	}

	public Double getKgGPL() {
		return kgGPL;
	}

	public void setKgGPL(Double kgGPL) {
		this.kgGPL = kgGPL;
	}

	public String getClasseGLP() {
		return classeGLP;
	}

	public void setClasseGLP(String classeGLP) {
		this.classeGLP = classeGLP;
	}

	public String getTelefone1() {
		return telefone1;
	}

	public void setTelefone1(String telefone1) {
		this.telefone1 = telefone1;
	}

	public String getTelefone2() {
		return telefone2;
	}

	public void setTelefone2(String telefone2) {
		this.telefone2 = telefone2;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getHoraAbreManha() {
		return horaAbreManha;
	}

	public void setHoraAbreManha(Date horaAbreManha) {
		this.horaAbreManha = horaAbreManha;
	}

	public Date getHoraFechaManha() {
		return horaFechaManha;
	}

	public void setHoraFechaManha(Date horaFechaManha) {
		this.horaFechaManha = horaFechaManha;
	}

	public Date getHoraAbreTarde() {
		return horaAbreTarde;
	}

	public void setHoraAbreTarde(Date horaAbreTarde) {
		this.horaAbreTarde = horaAbreTarde;
	}

	public Date getHoraFechaTarde() {
		return horaFechaTarde;
	}

	public void setHoraFechaTarde(Date horaFechaTarde) {
		this.horaFechaTarde = horaFechaTarde;
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
		Empresa other = (Empresa) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
}
