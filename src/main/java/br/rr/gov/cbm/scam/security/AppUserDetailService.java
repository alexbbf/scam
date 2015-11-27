package br.rr.gov.cbm.scam.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.ejb.EJB;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import br.rr.gov.cbm.scam.bean.Militar;
import br.rr.gov.cbm.scam.bean.Permissao;
import br.rr.gov.cbm.scam.business.MilitarBusiness;

public class AppUserDetailService implements UserDetailsService {

	@EJB(mappedName = "java:global/scam/MilitarBusiness")
	private MilitarBusiness business;

	@Override
	public UserDetails loadUserByUsername(String cpf)
			throws UsernameNotFoundException {
		Militar militar = business.selecionaPorCpf(cpf);
		UsuarioSistema user = null;
		
		if (militar != null) {
			user = new UsuarioSistema(militar, getGrupos(militar));
			
			
		}
		
		return user;
	}

	private Collection<? extends GrantedAuthority> getGrupos(Militar militar) {
		List<SimpleGrantedAuthority> grupos = new ArrayList<SimpleGrantedAuthority>();
		for(Permissao perm : militar.getPermissoes()){
			grupos.add( new SimpleGrantedAuthority(perm.getGrupo().name()));
		}
			
			
		return grupos;
	}

}
