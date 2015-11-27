package br.rr.gov.cbm.scam.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Documento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private Date dataDoDocumento;
	
	private Date dataDoRecebimento;
	
	private String identificacaoDoDocumento;
	
	private String origem;
	
	private String assinadoPor;
	
	private String recebidoPor;
	
	private String destino;
	
	private String assunto;
	
	private String descricao;
	
	private boolean status;
	
	

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDataDoDocumento() {
		return dataDoDocumento;
	}

	public void setDataDoDocumento(Date dataDoDocumento) {
		this.dataDoDocumento = dataDoDocumento;
	}

	public Date getDataDoRecebimento() {
		return dataDoRecebimento;
	}

	public void setDataDoRecebimento(Date dataDoRecebimento) {
		this.dataDoRecebimento = dataDoRecebimento;
	}

	public String getIdentificacaoDoDocumento() {
		return identificacaoDoDocumento;
	}

	public void setIdentificacaoDoDocumento(String identificacaoDoDocumento) {
		this.identificacaoDoDocumento = identificacaoDoDocumento;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getAssinadoPor() {
		return assinadoPor;
	}

	public void setAssinadoPor(String assinadoPor) {
		this.assinadoPor = assinadoPor;
	}

	public String getRecebidoPor() {
		return recebidoPor;
	}

	public void setRecebidoPor(String recebidoPor) {
		this.recebidoPor = recebidoPor;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
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
		Documento other = (Documento) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
	

}
