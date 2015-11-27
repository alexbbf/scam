package br.rr.gov.cbm.scam.view;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.rr.gov.cbm.scam.bean.Logradouro;
import br.rr.gov.cbm.scam.bean.TipoLogradouro;
import br.rr.gov.cbm.scam.business.LogradouroBusiness;

@ManagedBean
@ViewScoped
public class LogradouroMB {

	@EJB
	private LogradouroBusiness business;

	private List<Logradouro> logradouros;

	private TipoLogradouro tipoLogradouro;

	private TipoLogradouro tipoLogradouroParaSalvar;

	private String logradouroSalvar;
	

	private Logradouro logradouroParaSalvar;
	
	public void salvar(){
		logradouroParaSalvar = new Logradouro();
		logradouroParaSalvar.setDescricao(logradouroSalvar);
		logradouroParaSalvar.setTipoLogradouro(tipoLogradouroParaSalvar);
		business.salvar(logradouroParaSalvar);
	}

	public List<Logradouro> autoCompleteLogra(String s) {
		logradouros = business.autoCompleteLogra(s, tipoLogradouro);
		return logradouros;
	}

	public TipoLogradouro getTipoLogradouroParaSalvar() {
		return tipoLogradouroParaSalvar;
	}

	
	public String getLogradouroSalvar() {
		return logradouroSalvar;
	}

	public void setLogradouroSalvar(String logradouroSalvar) {
		this.logradouroSalvar = logradouroSalvar;
	}

	public void setTipoLogradouroParaSalvar(
			TipoLogradouro tipoLogradouroParaSalvar) {
		this.tipoLogradouroParaSalvar = tipoLogradouroParaSalvar;
	}

	public Logradouro getLogradouroParaSalvar() {
		return logradouroParaSalvar;
	}

	public void setLogradouroParaSalvar(Logradouro logradouroParaSalvar) {
		this.logradouroParaSalvar = logradouroParaSalvar;
	}

	

	public List<Logradouro> getLogradouros() {
		return logradouros;
	}

	public TipoLogradouro getTipoLogradouro() {
		return tipoLogradouro;
	}

	public void setTipoLogradouro(TipoLogradouro tipoLogradouro) {
		this.tipoLogradouro = tipoLogradouro;
	}

	public void setLogradouros(List<Logradouro> logradouros) {
		this.logradouros = logradouros;
	}

}
