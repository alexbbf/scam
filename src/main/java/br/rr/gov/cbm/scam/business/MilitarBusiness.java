package br.rr.gov.cbm.scam.business;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.rr.gov.cbm.scam.bean.Militar;
import br.rr.gov.cbm.scam.dao.MilitarDao;
import br.rr.gov.cbm.scam.dto.MilitarDTO;

@LocalBean
@Stateless
public class MilitarBusiness {

	@PersistenceContext
	private EntityManager em;

	private MilitarDao dao;

	@PostConstruct
	private void init() {
		dao = new MilitarDao(em);

	}

	public Militar selecionar(Integer id) {
		return dao.selecionar(id);
	}

	public Militar selecionaPorCpf(String cpf) {
		return dao.selecionaPorCpf(cpf);
	}

	public List<MilitarDTO> pesquisarNome(String s) {
		return dao.pesquisarNome(s);
	}

	public Militar salvar(Militar militar) {
		return dao.salvar(militar);
	}

	public List<MilitarDTO> pesquisarRg(String rg) {
		return dao.pesquisarRg(rg);
	}

	public List<MilitarDTO> pesquisarCpf(String cpf) {
		return dao.pesquisarCpf(cpf);
	}

	public List<MilitarDTO> pesquisarNomeGuerra(String nome) {
		return dao.pesquisarNomeGuerra(nome);
	}

	public List<MilitarDTO> pesquisarMatriculaE(String mat) {
		return dao.pesquisarMatriculaE(mat);
	}

	public List<MilitarDTO> pesquisarMatriculaF(String mat) {
		return dao.pesquisarMatriculaF(mat);
	}

}
