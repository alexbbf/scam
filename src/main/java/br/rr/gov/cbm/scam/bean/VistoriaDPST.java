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
public class VistoriaDPST {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@ManyToOne
	private ProcessoDPST processo;
	
	@Temporal(TemporalType.DATE)
	private Date data;
	
	@ManyToOne
	private DeslocamentoVistoria deslocamento;
	
	@OneToMany(mappedBy = "vistoria")
	private List<VistoriaMilitar> vistoriantes;
	
	private String relatorio;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public ProcessoDPST getProcesso() {
		return processo;
	}

	public void setProcesso(ProcessoDPST processo) {
		this.processo = processo;
	}

	public DeslocamentoVistoria getDeslocamento() {
		return deslocamento;
	}

	public void setDeslocamento(DeslocamentoVistoria deslocamento) {
		this.deslocamento = deslocamento;
	}

	public List<VistoriaMilitar> getVistoriantes() {
		return vistoriantes;
	}

	public void setVistoriantes(List<VistoriaMilitar> vistoriantes) {
		this.vistoriantes = vistoriantes;
	}

	public String getRelatorio() {
		return relatorio;
	}

	public void setRelatorio(String relatorio) {
		this.relatorio = relatorio;
	}
	

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
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
		VistoriaDPST other = (VistoriaDPST) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}
