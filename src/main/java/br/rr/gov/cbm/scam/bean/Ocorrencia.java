package br.rr.gov.cbm.scam.bean;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
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
public class Ocorrencia {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Temporal(TemporalType.DATE)
	private Date data;
	
	@Temporal(TemporalType.TIME)
	private Date horaAviso;
	
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
	
	
	
	
	

	
}
