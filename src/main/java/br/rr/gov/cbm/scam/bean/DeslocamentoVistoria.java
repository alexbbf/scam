package br.rr.gov.cbm.scam.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class DeslocamentoVistoria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToOne
	private Viatura viatura;
	
	private Double kmi;
	
	private Double kmf;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date saida;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date retorno;
	
	@ManyToOne
	private Militar motorista;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Viatura getViatura() {
		return viatura;
	}

	public void setViatura(Viatura viatura) {
		this.viatura = viatura;
	}

	public Double getKmi() {
		return kmi;
	}

	public void setKmi(Double kmi) {
		this.kmi = kmi;
	}

	public Double getKmf() {
		return kmf;
	}

	public void setKmf(Double kmf) {
		this.kmf = kmf;
	}

	public Date getSaida() {
		return saida;
	}

	public void setSaida(Date saida) {
		this.saida = saida;
	}

	public Date getRetorno() {
		return retorno;
	}

	public void setRetorno(Date retorno) {
		this.retorno = retorno;
	}

	public Militar getMotorista() {
		return motorista;
	}

	public void setMotorista(Militar motorista) {
		this.motorista = motorista;
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
		DeslocamentoVistoria other = (DeslocamentoVistoria) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
	
}
