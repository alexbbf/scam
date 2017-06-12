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
public class DeslocamentoVTR {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToOne
	private Ocorrencia ocorrencia;
	
	@ManyToOne
	private Viatura viatura;

	@Temporal(TemporalType.TIME)
	private Date horaAviso;

	@Temporal(TemporalType.TIME)
	private Date horaNoLocal;

	@Temporal(TemporalType.TIME)
	private Date horaSaidaLocal;

	@Temporal(TemporalType.TIME)
	private Date horaNoDestino;

	@Temporal(TemporalType.TIME)
	private Date horaNaOBM;

	private Double kmi;

	private Double kmf;

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

	public Date getHoraAviso() {
		return horaAviso;
	}

	public void setHoraAviso(Date horaAviso) {
		this.horaAviso = horaAviso;
	}

	public Date getHoraNoLocal() {
		return horaNoLocal;
	}

	public void setHoraNoLocal(Date horaNoLocal) {
		this.horaNoLocal = horaNoLocal;
	}

	public Date getHoraSaidaLocal() {
		return horaSaidaLocal;
	}

	public void setHoraSaidaLocal(Date horaSaidaLocal) {
		this.horaSaidaLocal = horaSaidaLocal;
	}

	public Date getHoraNoDestino() {
		return horaNoDestino;
	}

	public void setHoraNoDestino(Date horaNoDestino) {
		this.horaNoDestino = horaNoDestino;
	}

	public Date getHoraNaOBM() {
		return horaNaOBM;
	}

	public void setHoraNaOBM(Date horaNaOBM) {
		this.horaNaOBM = horaNaOBM;
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
	
		public Ocorrencia getOcorrencia() {
		return ocorrencia;
	}

	public void setOcorrencia(Ocorrencia ocorrencia) {
		this.ocorrencia = ocorrencia;
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
		DeslocamentoVTR other = (DeslocamentoVTR) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	

}
