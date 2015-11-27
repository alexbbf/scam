package br.rr.gov.cbm.scam.view;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.rr.gov.cbm.scam.bean.Permissao;

@ManagedBean
@ViewScoped
public class PermissaoMB {
	
	
	private Permissao permissao = new Permissao();

	public Permissao getPermissao() {
		return permissao;
	}

	public void setPermissao(Permissao permissao) {
		this.permissao = permissao;
	}
	
	public Permissao getPermissaoNew() {
		Permissao p = permissao;
		permissao = new Permissao();
		return p;
	}
	
	
	

}
