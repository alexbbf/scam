package br.rr.gov.cbm.scam.bean;

import java.util.Date;

public class CursosFormacao {

	private Integer id;

	private TipoCursoFormacao tipoCurso;

	private Double cargaHoraria;

	private Double nota;

	private Date dataInicio;

	private Date dataFim;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public TipoCursoFormacao getTipoCurso() {
		return tipoCurso;
	}

	public void setTipoCurso(TipoCursoFormacao tipoCurso) {
		this.tipoCurso = tipoCurso;
	}

	public Double getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(Double cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public Double getNota() {
		return nota;
	}

	public void setNota(Double nota) {
		this.nota = nota;
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
	
	

}
