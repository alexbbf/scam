package br.rr.gov.cbm.scam.view;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.rr.gov.cbm.scam.bean.Pensionista;
import br.rr.gov.cbm.scam.bean.TipoPensionista;

@ManagedBean
@ViewScoped
public class PensionistaMB {

	private Pensionista pensionista = new Pensionista();

	public boolean isBeneficiario() {
		try {
			if (pensionista.getTipoPensionista().equals(
					TipoPensionista.MENOR_NAO_EMANCIPADO)) {
				return true;
			} else if (pensionista.getTipoPensionista().equals(
					TipoPensionista.MAIOR_18_NECESSIDADE)) {
				return true;
			} else{
			return false;
			}
		} catch (NullPointerException npe) {
			return true;
		}
	}

	public Pensionista getPensionista() {
		return pensionista;
	}

	public void setPensionista(Pensionista pensionista) {
		this.pensionista = pensionista;
	}

	public Pensionista getPensionistaNew() {
		Pensionista p = pensionista;
		pensionista = new Pensionista();
		return p;
	}
}
