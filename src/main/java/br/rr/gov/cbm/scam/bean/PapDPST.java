package br.rr.gov.cbm.scam.bean;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class PapDPST {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@ManyToOne
	private ProcessoDPST processo;

	private String numPAP;

	@Temporal(TemporalType.DATE)
	private Date dataPAP;

	@Temporal(TemporalType.DATE)
	private Date entrega;

	private String retirante;

	@OneToMany(mappedBy = "pap")
	private List<PapMilitar> analistas;

	@ManyToOne
	private Militar responsavelEntrega;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumPAP() {
		return numPAP;
	}

	public void setNumPAP(String numPAP) {
		this.numPAP = numPAP;
	}

	public Date getDataPAP() {
		return dataPAP;
	}

	public void setDataPAP(Date dataPAP) {
		this.dataPAP = dataPAP;
	}

	public Date getEntrega() {
		return entrega;
	}

	public void setEntrega(Date entrega) {
		this.entrega = entrega;
	}

	public String getRetirante() {
		return retirante;
	}

	public void setRetirante(String retirante) {
		this.retirante = retirante;
	}

	public ProcessoDPST getProcesso() {
		return processo;
	}

	public void setProcesso(ProcessoDPST processo) {
		this.processo = processo;
	}

	public List<PapMilitar> getAnalistas() {
		return analistas;
	}

	public void setAnalistas(List<PapMilitar> analistas) {
		this.analistas = analistas;
	}

	public Militar getResponsavelEntrega() {
		return responsavelEntrega;
	}

	public void setResponsavelEntrega(Militar responsavelEntrega) {
		this.responsavelEntrega = responsavelEntrega;
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
		PapDPST other = (PapDPST) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
