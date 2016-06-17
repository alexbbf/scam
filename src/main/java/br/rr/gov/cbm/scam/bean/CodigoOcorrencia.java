package br.rr.gov.cbm.scam.bean;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CodigoOcorrencia {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String codigo;

	private String descricao;

	@Enumerated(EnumType.STRING)
	private GrupoOcorrencia grupo;
	
	@Enumerated(EnumType.STRING)
	private SubGrupo subGrupo;
}
