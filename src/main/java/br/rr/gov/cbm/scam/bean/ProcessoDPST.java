package br.rr.gov.cbm.scam.bean;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class ProcessoDPST {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private Integer numeroProcesso;

	@ManyToOne
	private CodigoOcorrencia codigoServico;

	@ManyToOne
	private Empresa empresa;

	private String solicitante;

	@Enumerated(EnumType.STRING)
	private SituacaoProcessoDPST situacao;

	private String observacoes;

	@Enumerated(EnumType.STRING)
	private DocEmissaoDPST docEmitir;

	private String numDocumento;

	@Temporal(TemporalType.DATE)
	private Date dataEmissao;

	@Temporal(TemporalType.DATE)
	private Date dataValidade;

	@OneToMany(mappedBy = "processo", cascade = CascadeType.ALL)
	private List<PapDPST> paps;

	@OneToMany(mappedBy = "processo", cascade = CascadeType.ALL)
	private List<VistoriaDPST> vistorias;

	@Enumerated(EnumType.STRING)
	private ArquivamentoDPST arquivamento;

	@Enumerated(EnumType.STRING)
	private SituacaoProcessoDPSTHoje situacaoHoje;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNumeroProcesso() {
		return numeroProcesso;
	}

	public void setNumeroProcesso(Integer numeroProcesso) {
		this.numeroProcesso = numeroProcesso;
	}

	public CodigoOcorrencia getCodigoServico() {
		return codigoServico;
	}

	public void setCodigoServico(CodigoOcorrencia codigoServico) {
		this.codigoServico = codigoServico;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public String getSolicitante() {
		return solicitante;
	}

	public void setSolicitante(String solicitante) {
		this.solicitante = solicitante;
	}

	public SituacaoProcessoDPST getSituacao() {
		return situacao;
	}

	public void setSituacao(SituacaoProcessoDPST situacao) {
		this.situacao = situacao;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public DocEmissaoDPST getDocEmitir() {
		return docEmitir;
	}

	public void setDocEmitir(DocEmissaoDPST docEmitir) {
		this.docEmitir = docEmitir;
	}

	public String getNumDocumento() {
		return numDocumento;
	}

	public void setNumDocumento(String numDocumento) {
		this.numDocumento = numDocumento;
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

	public List<PapDPST> getPaps() {
		return paps;
	}

	public void setPaps(List<PapDPST> paps) {
		this.paps = paps;
	}

	public List<VistoriaDPST> getVistorias() {
		return vistorias;
	}

	public void setVistorias(List<VistoriaDPST> vistorias) {
		this.vistorias = vistorias;
	}

	public ArquivamentoDPST getArquivamento() {
		return arquivamento;
	}

	public void setArquivamento(ArquivamentoDPST arquivamento) {
		this.arquivamento = arquivamento;
	}

	public SituacaoProcessoDPSTHoje getSituacaoHoje() {
		return situacaoHoje;
	}

	public void setSituacaoHoje(SituacaoProcessoDPSTHoje situacaoHoje) {
		this.situacaoHoje = situacaoHoje;
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
		ProcessoDPST other = (ProcessoDPST) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	

}
