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
	
	
	
	
	
	
	

}
