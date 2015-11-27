package br.rr.gov.cbm.scam.view;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.rr.gov.cbm.scam.bean.Estado;
import br.rr.gov.cbm.scam.bean.Municipio;
import br.rr.gov.cbm.scam.bean.Pais;
import br.rr.gov.cbm.scam.business.EstadoBusiness;
import br.rr.gov.cbm.scam.business.MunicipioBusiness;
import br.rr.gov.cbm.scam.business.PaisBusiness;

@ManagedBean
@ViewScoped
public class PesquisaMunicipioMB {

	@EJB
	private PaisBusiness paisBusiness;

	@EJB
	private MunicipioBusiness municipioBusiness;

	@EJB
	private EstadoBusiness estadoBusiness;

	private Pais pais;

	private Estado estado;

	private List<Pais> paises;

	private List<Estado> estados;

	private List<Municipio> municipios;
	
	public List<Municipio> autoCompleteMunicipio(String s){
		s= s.trim();
		return municipioBusiness.autoCompleteMunicipio(s);
	}

	public void listaEstadoPeloPais() {
		estados = estadoBusiness.listarPorPais(pais);
	}

	public void listaMunicipioPeloEstado() {
		municipios = municipioBusiness.listarPorEstado(estado);

	}

	public List<Estado> getEstados() {
		return estados;
	}

	public void setEstados(List<Estado> estados) {
		this.estados = estados;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public List<Municipio> getMunicipios() {
		return municipios;
	}

	public void setMunicipios(List<Municipio> municipios) {
		this.municipios = municipios;
	}

	public List<Pais> getPaises() {
		paises =  paisBusiness.listar();
		return paises;
	}

	public void setPaises(List<Pais> paises) {
		this.paises = paises;
	}

}
