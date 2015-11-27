package br.rr.gov.cbm.scam.bean;

import java.util.Date;

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
public class Curso {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToOne
	private Militar militar;

	@Enumerated(EnumType.STRING)
	private AreaCurso areaCurso;

	private String nomeCurso;

	@Enumerated(EnumType.STRING)
	private TipoCurso tipoCurso;

	private String instituicao;

	@Temporal(TemporalType.DATE)
	private Date dataInicio;
	
	@Temporal(TemporalType.DATE)
	private Date dataFim;
	
	private Double cargaHoraria;
	
	@Enumerated(EnumType.STRING)
	private SituacaoCurso situacao;
	
	

	public Militar getMilitar() {
		return militar;
	}

	public void setMilitar(Militar militar) {
		this.militar = militar;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public AreaCurso getAreaCurso() {
		return areaCurso;
	}

	public void setAreaCurso(AreaCurso areaCurso) {
		this.areaCurso = areaCurso;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public TipoCurso getTipoCurso() {
		return tipoCurso;
	}

	public void setTipoCurso(TipoCurso tipoCurso) {
		this.tipoCurso = tipoCurso;
	}

	public String getInstituicao() {
		return instituicao;
	}

	public void setInstituicao(String instituicao) {
		this.instituicao = instituicao;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataFim() {
		return dataFim;
	}

	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}

	public Double getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(Double cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public SituacaoCurso getSituacao() {
		return situacao;
	}

	public void setSituacao(SituacaoCurso situacao) {
		this.situacao = situacao;
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
		Curso other = (Curso) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	

}
