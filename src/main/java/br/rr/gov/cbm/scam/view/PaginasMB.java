package br.rr.gov.cbm.scam.view;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import br.rr.gov.cbm.scam.bean.Paginas;

@ManagedBean
@ApplicationScoped
public class PaginasMB {

	private String militar = Paginas.CADASTRO_MILITAR;

	private String editarMilitar = Paginas.EDITAR_MILITAR;
	
	private String cadastroDependente = Paginas.CADASTRO_DEPENDENTE;
	
	private String cadastroPensionista = Paginas.CADASTRO_PENSIONISTA;
	
	private String permissoes = Paginas.PERMISSOES;
	
	private String novaSenha = Paginas.NOVA_SENHA;
	
	public String getNovaSenha() {
		return novaSenha;
	}
	
	public String getPermissoes() {
		return permissoes;
	}
	
	public String getCadastroPensionista() {
		return cadastroPensionista;
	}
	
	public String getCadastroDependente() {
		return cadastroDependente;
	}

	public String getMilitar() {
		return militar;
	}

	public String getEditarMilitar() {
		return editarMilitar;
	}

}
