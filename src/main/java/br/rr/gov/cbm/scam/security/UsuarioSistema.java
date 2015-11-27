package br.rr.gov.cbm.scam.security;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import br.rr.gov.cbm.scam.bean.Militar;


public class UsuarioSistema extends User{

	

	private static final long serialVersionUID = -3738762746335137875L;
	private Militar militar;
	
	public UsuarioSistema(Militar militar,
			Collection<? extends GrantedAuthority> authorities) {
		super(militar.getCpf(),militar.getSenha(), authorities);
		this.militar = militar;
	}
	
	public Militar getMilitar() {
		return militar;
	}

}
