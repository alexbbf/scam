package br.rr.gov.cbm.scam.view;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.rr.gov.cbm.scam.bean.ChavePesquisaMilitar;
import br.rr.gov.cbm.scam.bean.Militar;
import br.rr.gov.cbm.scam.business.MilitarBusiness;
import br.rr.gov.cbm.scam.dto.MilitarDTO;
import br.rr.gov.cbm.scam.util.FrameWork;
import br.rr.gov.cbm.scam.util.JsfUtil;

@ManagedBean
@ViewScoped
public class MilitarMB {
	@EJB
	private MilitarBusiness business;

	private String nomePesquisa;

	private Militar militar = new Militar();

	private List<MilitarDTO> militaresDto = new ArrayList<MilitarDTO>();

	private List<MilitarDTO> militaresDTOPesquisa = new ArrayList<MilitarDTO>();

	private Integer idMilitarSelecionado = null;

	private MilitarDTO militarDtoSelecionado;

	private ChavePesquisaMilitar chavePesquisa;

	private String palavraPesquisa;

	public void pesquisar() {
		if (chavePesquisa.equals(ChavePesquisaMilitar.CPF)) {
			militaresDTOPesquisa = business.pesquisarCpf(palavraPesquisa);
		} else if (chavePesquisa.equals(ChavePesquisaMilitar.RG)) {
			militaresDTOPesquisa = business.pesquisarRg(palavraPesquisa);
		} else if (chavePesquisa.equals(ChavePesquisaMilitar.NOME_GUERRA)) {
			militaresDTOPesquisa = business
					.pesquisarNomeGuerra(palavraPesquisa);
		} else if (chavePesquisa.equals(ChavePesquisaMilitar.MATRICULA_E)) {
			militaresDTOPesquisa = business
					.pesquisarMatriculaE(palavraPesquisa);
		} else if (chavePesquisa.equals(ChavePesquisaMilitar.MATRICULA_F)) {
			militaresDTOPesquisa = business
					.pesquisarMatriculaF(palavraPesquisa);
		}
	}

	public void salvar() {
		camposUppercase();
		militar = business.salvar(militar);
		JsfUtil.showInfoMessage("Dados Salvos");
	}
	
	public void salvarSenha() {
		militar.setSenha(FrameWork.criptografar(militar.getSenha()));
		militar = new Militar();
		JsfUtil.showInfoMessage("Dados Salvos");
	}


	public void pesquisarNome() {
		militaresDto = business.pesquisarNome(nomePesquisa);
	}

	public void selecionar() {
		militar = business.selecionar(idMilitarSelecionado);
	}

	public void selecionarDto() {
		try {
			if (militarDtoSelecionado.getId() != null) {
				militar = business.selecionar(militarDtoSelecionado.getId());
			}
		} catch (NullPointerException npe) {

		}
	}

	public MilitarDTO getMilitarDtoSelecionado() {
		return militarDtoSelecionado;
	}

	public void setMilitarDtoSelecionado(MilitarDTO militarDtoSelecionado) {
		this.militarDtoSelecionado = militarDtoSelecionado;
	}

	public List<MilitarDTO> getMilitaresDTOPesquisa() {
		return militaresDTOPesquisa;
	}

	public void setMilitaresDTOPesquisa(List<MilitarDTO> militaresDTOPesquisa) {
		this.militaresDTOPesquisa = militaresDTOPesquisa;
	}

	public ChavePesquisaMilitar getChavePesquisa() {
		return chavePesquisa;
	}

	public void setChavePesquisa(ChavePesquisaMilitar chavePesquisa) {
		this.chavePesquisa = chavePesquisa;
	}

	public String getPalavraPesquisa() {
		return palavraPesquisa;
	}

	public void setPalavraPesquisa(String palavraPesquisa) {
		this.palavraPesquisa = palavraPesquisa;
	}

	public Integer getIdMilitarSelecionado() {
		return idMilitarSelecionado;
	}

	public void setIdMilitarSelecionado(Integer idMilitarSelecionado) {
		this.idMilitarSelecionado = idMilitarSelecionado;
	}

	public List<MilitarDTO> getMilitaresDto() {
		return militaresDto;
	}

	public void setMilitaresDto(List<MilitarDTO> militaresDto) {
		this.militaresDto = militaresDto;
	}

	public String getNomePesquisa() {
		return nomePesquisa;
	}

	public void setNomePesquisa(String nomePesquisa) {
		this.nomePesquisa = nomePesquisa;
	}

	public Militar getMilitar() {
		return militar;
	}

	public void setMilitar(Militar militar) {
		this.militar = militar;
	}

	public void camposUppercase() {
		try {
			militar.setNomeCompleto(militar.getNomeCompleto().toUpperCase());
			militar.setNomeMae(militar.getNomeMae().toUpperCase());
			militar.setNomePai(militar.getNomePai().toUpperCase());
			militar.setNomeGuerra(militar.getNomeGuerra().toUpperCase());
			militar.getConjuge().setNome(
					militar.getConjuge().getNome().toUpperCase());
			militar.setContatoEmergencia(militar.getContatoEmergencia().trim()
					.toUpperCase());

		} catch (NullPointerException npe) {

		}
	}

}
