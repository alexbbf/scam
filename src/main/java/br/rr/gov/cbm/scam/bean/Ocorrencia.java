package br.rr.gov.cbm.scam.bean;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class Ocorrencia {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Temporal(TemporalType.DATE)
	private Date data;
	
	@OneToMany(mappedBy = "ocorrencia", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<DeslocamentoVTR> deslocamentoVTR;
	
	@ManyToOne
	private CodigoOcorrencia codOcorrencia;
	
	@ManyToOne
	private FormaAcionamento formaAcionamento;
	
	@Enumerated(EnumType.STRING)
	private SituacaoOcorrencia situacaoOcorrencia;
	
	@ManyToOne
	private MotivoNaoAtendida motivoNaoAtendida;
	
	@Embedded
	private Endereco endereco;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Solicitante solicitante;
	
	@ManyToOne
	private Militar atendente;
	
	private String dadosInformados;
	
	@Temporal(TemporalType.TIME)
	private Date horaSaida;
	
	
	@Enumerated(EnumType.STRING)
	private AreaAtuacao areaAtuacao;
	
	@Enumerated(EnumType.STRING)
	private OBMAtuacao obmAtuacao;
	
	

	


	public AreaAtuacao getAreaAtuacao() {
		return areaAtuacao;
	}

	public void setAreaAtuacao(AreaAtuacao areaAtuacao) {
		this.areaAtuacao = areaAtuacao;
	}

	public OBMAtuacao getObmAtuacao() {
		return obmAtuacao;
	}

	public void setObmAtuacao(OBMAtuacao obmAtuacao) {
		this.obmAtuacao = obmAtuacao;
	}

	public Date getHoraSaida() {
		return horaSaida;
	}

	public void setHoraSaida(Date horaSaida) {
		this.horaSaida = horaSaida;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public CodigoOcorrencia getCodOcorrencia() {
		return codOcorrencia;
	}

	public void setCodOcorrencia(CodigoOcorrencia codOcorrencia) {
		this.codOcorrencia = codOcorrencia;
	}

	public FormaAcionamento getFormaAcionamento() {
		return formaAcionamento;
	}

	public void setFormaAcionamento(FormaAcionamento formaAcionamento) {
		this.formaAcionamento = formaAcionamento;
	}

	public SituacaoOcorrencia getSituacaoOcorrencia() {
		return situacaoOcorrencia;
	}

	public void setSituacaoOcorrencia(SituacaoOcorrencia situacaoOcorrencia) {
		this.situacaoOcorrencia = situacaoOcorrencia;
	}

	public MotivoNaoAtendida getMotivoNaoAtendida() {
		return motivoNaoAtendida;
	}

	public void setMotivoNaoAtendida(MotivoNaoAtendida motivoNaoAtendida) {
		this.motivoNaoAtendida = motivoNaoAtendida;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Solicitante getSolicitante() {
		return solicitante;
	}

	public void setSolicitante(Solicitante solicitante) {
		this.solicitante = solicitante;
	}

	public Militar getAtendente() {
		return atendente;
	}

	public void setAtendente(Militar atendente) {
		this.atendente = atendente;
	}

	public String getDadosInformados() {
		return dadosInformados;
	}

	public void setDadosInformados(String dadosInformados) {
		this.dadosInformados = dadosInformados;
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
		Ocorrencia other = (Ocorrencia) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
	
	
	
	

	
}
