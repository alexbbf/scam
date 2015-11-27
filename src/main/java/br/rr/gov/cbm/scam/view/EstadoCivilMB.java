package br.rr.gov.cbm.scam.view;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.rr.gov.cbm.scam.bean.EstadoCivil;

@ManagedBean
@ViewScoped
public class EstadoCivilMB {

	EstadoCivil estadoCivilSelecionado = EstadoCivil.SOLTEIRO;

	public EstadoCivil getEstadoCivilSelecionado() {
		return estadoCivilSelecionado;
	}

	public void setEstadoCivilSelecionado(EstadoCivil estadoCivilSelecionado) {
		this.estadoCivilSelecionado = estadoCivilSelecionado;
	}

	public void definirEstadoCivilSelecionado(EstadoCivil estadoCivilSelecionado) {
		this.estadoCivilSelecionado = estadoCivilSelecionado;
	}

	public boolean isCasado() {
		return estadoCivilSelecionado.equals(EstadoCivil.CASADO)
				|| estadoCivilSelecionado.equals(EstadoCivil.UNIAO_ESTAVEL);
	}

}
