package br.rr.gov.cbm.scam.view;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.rr.gov.cbm.scam.bean.Curso;
import br.rr.gov.cbm.scam.business.CursoBusiness;

@ManagedBean
@ViewScoped
public class CursoMB {

	private Curso curso = new Curso();

	@EJB
	private CursoBusiness business;

	private boolean novo = false;

	public Curso pegaCurso() {
		Curso c = curso;
		curso = new Curso();
		System.out.println(curso.getNomeCurso());
		return c;
	}

	public boolean isNovo() {
		return novo;
	}

	public void setNovo(boolean novo) {
		this.novo = novo;
	}

	public List<String> autoCompleteInstituicao(String s) {
		return business.autoCompleteInstituicao(s);
	}

	public List<String> autoCompleteNomeCurso(String s) {
		return business.autoCompleteNomeCurso(s);
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

}
